package ABSisters.nimet.cadastro;

//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.nio.charset.StandardCharsets;

import org.springframework.stereotype.Service;

import com.google.common.hash.Hashing;

import ABSisters.nimet.email.EmailService;
import ABSisters.nimet.exception.ObjetoJaExiste;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@AllArgsConstructor
@Log4j2
public class UsuarioService {
    private UsuarioRepository usuarioRepository;
    private UsuarioMapper usuarioMapper;
    private EmailService emailService;
    private UsuarioResponse userResponse;

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

        emailService.mandarEmail(usuario.getEmail(), usuario.getNome(), "http://localhost:4200/email/verificacao/" + usuario.getEmail());

        return usuarioMapper.to(usuario);
    }
    

	public Usuario login(String email, String senha, UsuarioPostRequest request) {

		Usuario usuario;
    	if(!usuarioRepository.existsByEmail(request.email()) || !usuarioRepository.existsByUsername(request.username())){
    	//	log.info("Usuário não encontrado.");
    	}
    	Usuario usuarioLog = usuarioRepository.loginByEmail(email, senha);
    	//log.info("Usuário logado.");

    	
		return usuarioLog;
	}
}
