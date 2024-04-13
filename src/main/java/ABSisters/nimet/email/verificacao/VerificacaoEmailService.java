package ABSisters.nimet.email.verificacao;

import ABSisters.nimet.cadastro.Usuario;
import ABSisters.nimet.cadastro.UsuarioRepository;
import ABSisters.nimet.exception.EmailJaValidado;
import ABSisters.nimet.exception.UsuarioNaoExiste;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Log4j2
public class VerificacaoEmailService {
    private final UsuarioRepository usuarioRepository;

    public ResponseEntity validarEmail(String emailUsuario) {
        Usuario usuario = usuarioRepository.findByEmail(emailUsuario);

        if (usuario == null) {
            throw new UsuarioNaoExiste("email", emailUsuario);
        }

        if (usuario.isEmailValido() == true) {
            throw new EmailJaValidado(emailUsuario);
        }

        usuario.setEmailValido(true);
        usuarioRepository.save(usuario);

        return ResponseEntity.ok().body(usuario.isEmailValido());
    }
}
