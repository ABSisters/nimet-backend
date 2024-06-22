package absisters.nimet.service;

//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;

import absisters.nimet.domain.EmailToken;
import absisters.nimet.domain.Pergunta;
import absisters.nimet.domain.Resposta;
import absisters.nimet.dto.Mapper.UsuarioMapper;
import absisters.nimet.dto.Request.UsuarioPostRequest;
import absisters.nimet.dto.Request.UsuarioPutRequest;
import absisters.nimet.dto.Request.UsuarioPutSenhaRequest;
import absisters.nimet.dto.Response.UsuarioResponse;
import absisters.nimet.exception.ObjetoNaoExiste;
import absisters.nimet.repository.EmailTokenRepository;
import absisters.nimet.repository.PerguntaRepository;
import absisters.nimet.repository.RespostaRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.hash.Hashing;

import absisters.nimet.domain.Usuario;
import absisters.nimet.exception.ObjetoJaExiste;
import absisters.nimet.repository.UsuarioRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Transactional
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private UsuarioMapper usuarioMapper;

	@Autowired
	private EmailService emailService;

	@Autowired
	private EmailTokenRepository emailTokenRepository;

	@Autowired
	private PerguntaRepository perguntaRepository;

	@Autowired
	private RespostaRepository respostaRepository;

	private EntityManager entityManager;

	//	@Autowired
	//    private UsuarioResponse userResponse;

	private static Logger logger = LogManager.getLogger();

	public UsuarioResponse create(UsuarioPostRequest request) {
		if(usuarioRepository.existsByUsername(request.username())){
			throw new ObjetoJaExiste("Usuário", "username", request.username());
		}

		if(usuarioRepository.existsByEmail(request.email())){
			throw new ObjetoJaExiste("Usuário", "email", request.email());
		}

		String senha = Hashing.sha256()
				.hashString(request.senha(), StandardCharsets.UTF_8)
				.toString();

		Usuario usuario = usuarioRepository.save(
				new Usuario(request.nome(), request.username(), request.email(), request.dataNascimento(), senha, request.curso()));
		logger.info("Usuário com id " + usuario.getUsuarioId() + " realizou o cadastro.");

		EmailToken emailToken = emailService.criarToken(usuario);

		emailService.mandarEmail(usuario, emailToken);

		return usuarioMapper.to(usuario);
	}


	public UsuarioResponse login(String login, String senha) throws Exception {

		Usuario usuario = new Usuario();

        String senhaCriptografada = Hashing.sha256()
                .hashString(senha, StandardCharsets.UTF_8)
                .toString();

		if (usuarioRepository.existsByEmail(login)) {
			usuario = usuarioRepository.loginByEmail(login, senhaCriptografada);
			if(usuario != null){
				logger.info("Usuário logado com email");
			} else {
				throw new Exception("Usuário não encontrado");
			}
		} else if (usuarioRepository.existsByUsername(login)) {
			usuario = usuarioRepository.loginByUsername(login, senhaCriptografada);
			if(usuario != null){
				logger.info("Usuário logado com username");
			} else {
				throw new Exception("Usuário não encontrado");
			}
		} else {
			throw new Exception("Usuário não encontrado");
		}

		return usuarioMapper.to(usuario);
	}


	public UsuarioResponse update(UsuarioPutRequest request) {
		Usuario mudarUsuario = usuarioRepository.findByUsuarioId(request.usuarioId());

		if(mudarUsuario == null){
			throw new ObjetoNaoExiste("Usuário", "id", request.usuarioId());
		}

		if(!Objects.equals(mudarUsuario.getUsername(), request.username())){
			if(usuarioRepository.existsByUsernameAndUsuarioIdNot(request.username(), request.usuarioId())){
				throw new ObjetoJaExiste("Usuário", "username", request.username());
			}

            mudarUsuario.setUsername(request.username());
		}

        if(!Objects.equals(mudarUsuario.getEmail(), request.email())){
			if(usuarioRepository.existsByEmailAndUsuarioIdNot(request.email(), request.usuarioId())){
				throw new ObjetoJaExiste("Usuário", "email", request.email());
			}

            mudarUsuario.setEmailValido(false);
            mudarUsuario.setEmail(request.email());

            EmailToken emailToken = emailService.criarToken(mudarUsuario);
            emailService.mandarEmail(mudarUsuario, emailToken);
        }

		mudarUsuario.setNome(request.nome());
		mudarUsuario.setDataNascimento(request.dataNascimento());
		mudarUsuario.setCurso(request.curso());

		Usuario usuario = usuarioRepository.save(mudarUsuario);
		logger.info("Usuário com id " + usuario.getUsuarioId() + " foi mudado.");

		return usuarioMapper.to(usuario);
	}


	public UsuarioResponse updateSenha(UsuarioPutSenhaRequest request) {
		Usuario mudarUsuario = usuarioRepository.findByUsuarioId(request.usuarioId());

		if(mudarUsuario == null){
			throw new ObjetoNaoExiste("Usuário", "id", request.usuarioId());
		}

		String senha = Hashing.sha256()
				.hashString(request.senha(), StandardCharsets.UTF_8)
				.toString();

		mudarUsuario.setSenha(senha);

		Usuario usuario = usuarioRepository.save(mudarUsuario);
		logger.info("Usuário com id " + usuario.getUsuarioId() + " foi mudado.");

		return usuarioMapper.to(usuario);
	}


	public void delete(String usuarioId) {
		Usuario usuario = usuarioRepository.findByUsuarioId(usuarioId);

		if(usuario == null){
			throw new ObjetoNaoExiste("Usuário", "id", usuarioId);
		}

		EmailToken emailToken= emailTokenRepository.findByUsuario(usuario);
		if (emailToken != null) {
			emailTokenRepository.delete(emailToken);
			logger.info("Token com id " + emailToken.getTokenId() + " foi deletado em conjunto com o usuario com id " + usuario.getUsuarioId());
		}

		List<Resposta> respostas = respostaRepository.findAllByUsuario(usuario);
		if (!respostas.isEmpty()) {
			for (Resposta resposta : respostas){
				respostaRepository.delete(resposta);
				logger.info("Resposta com id " + resposta.getRespostaId() + " foi deletado em conjunto com o usuario com id " + usuario.getUsuarioId());
			}
		}

		List<Pergunta> perguntas = perguntaRepository.findAllByUsuario(usuario);
		if (!perguntas.isEmpty()) {
			for (Pergunta pergunta : perguntas){
				perguntaRepository.delete(pergunta);
				logger.info("Pergunta com id " + pergunta.getPerguntaId() + " foi deletado em conjunto com o usuario com id " + usuario.getUsuarioId());
			}
		}

		usuarioRepository.delete(usuario);
		logger.info("Usuario com id " + usuario.getUsuarioId() + " foi deletado");
	}
}
