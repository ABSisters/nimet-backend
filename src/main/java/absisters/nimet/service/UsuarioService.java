package absisters.nimet.service;

//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.nio.charset.StandardCharsets;

import absisters.nimet.domain.EmailToken;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.hash.Hashing;

import absisters.nimet.domain.Usuario;
import absisters.nimet.dto.UsuarioMapper;
import absisters.nimet.dto.UsuarioPostRequest;
import absisters.nimet.dto.UsuarioResponse;
import absisters.nimet.exception.ObjetoJaExiste;
import absisters.nimet.repository.UsuarioRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private UsuarioMapper usuarioMapper;

	@Autowired
	private EmailService emailService;

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
		// log.info("Usuário com id " + usuario.getUsuarioId() + " realizou o cadastro.");
		logger.info("Usuário com id " + usuario.getUsuarioId() + " realizou o cadastro.");

		EmailToken emailToken = emailService.criarToken(usuario);

		emailService.mandarEmail(usuario, emailToken);

		return usuarioMapper.to(usuario);
	}


	public UsuarioResponse login(String login, String senha) throws Exception {

		Usuario usuario = new Usuario();

		if (usuarioRepository.existsByEmail(login)) {
			usuario = usuarioRepository.loginByEmail(login, senha);
			// log.info("Usuário logado com email");	        
		} else if (usuarioRepository.existsByUsername(login)) {
			usuario = usuarioRepository.loginByUsername(login, senha);
			// log.info("Usuário logado com username");
		} else {
			throw new Exception("Usuário não encontrado");
		}

		return usuarioMapper.to(usuario);
	}


}
