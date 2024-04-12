package ABSisters.nimet.cadastro;

import ABSisters.nimet.exception.UsuarioJaExiste;
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

    public UsuarioDTO create(UsuarioPostRequestBody request) {
        if(usuarioRepository.existsByUsername(request.username())){
            throw new UsuarioJaExiste("username", request.username());
        }

        if(usuarioRepository.existsByEmail(request.email())){
            throw new UsuarioJaExiste("email", request.email());
        }

        String senha = Hashing.sha256()
                .hashString(request.senha(), StandardCharsets.UTF_8)
                .toString();

        Usuario usuario = usuarioRepository.save(
                new Usuario(request.nome(), request.username(), request.email(), request.dataNascimento(), senha, request.curso()));

        log.info("Usuário com id " + usuario.getUsuarioId() + " realizou o cadastro.");

        return usuarioMapper.to(usuario);
    }
}
