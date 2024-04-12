package ABSisters.nimet.cadastro;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final UsuarioMapper usuarioMapper;

    public UsuarioDTO create(UsuarioPostRequestBody request) {
        Usuario usuario = usuarioRepository.save(
                new Usuario(request.nome(), request.username(), request.email(), request.dataNascimento(), request.senha(), request.curso()));

        return usuarioMapper.to(usuario);
    }
}
