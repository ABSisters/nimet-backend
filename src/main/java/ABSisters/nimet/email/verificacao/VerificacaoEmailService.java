package ABSisters.nimet.email.verificacao;

import ABSisters.nimet.cadastro.Usuario;
import ABSisters.nimet.cadastro.UsuarioRepository;
import ABSisters.nimet.exception.EmailExpirado;
import ABSisters.nimet.exception.EmailJaValidado;
import ABSisters.nimet.exception.ObjetoNaoExiste;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
@Log4j2
public class VerificacaoEmailService {
    private final UsuarioRepository usuarioRepository;

    public ResponseEntity validarEmail(String emailUsuario) {
        Usuario usuario = usuarioRepository.findByEmail(emailUsuario);

        if (usuario == null) {
            throw new ObjetoNaoExiste("Usuário", "email", emailUsuario);
        }

        if (usuario.isEmailValido() == true) {
            throw new EmailJaValidado(emailUsuario);
        }

        LocalDateTime emailVerificacaoExpirouAposUmDia = usuario.getDataCriado().plusDays(1);

        if (emailVerificacaoExpirouAposUmDia.isBefore(LocalDateTime.now())) {
            throw new EmailExpirado(emailUsuario);
        }

        usuario.setEmailValido(true);
        usuarioRepository.save(usuario);

        log.info("Email " + emailUsuario + " foi validado");

        return ResponseEntity.ok().body(usuario.isEmailValido());
    }
}
