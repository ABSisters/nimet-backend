package ABSisters.nimet.cadastro;

import ABSisters.nimet.email.EmailService;
import ABSisters.nimet.exception.ObjetoJaExiste;
import com.google.common.hash.Hashing;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

@Service
@AllArgsConstructor
@Log4j2
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final UsuarioMapper usuarioMapper;
    private final EmailService emailService;

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

        log.info("Usuário com id " + usuario.getUsuarioId() + " realizou o cadastro.");

        emailService.mandarEmail(usuario.getEmail(), usuario.getNome(), "http://localhost:4200/email/verificacao/" + usuario.getEmail());

        return usuarioMapper.to(usuario);
    }
}
