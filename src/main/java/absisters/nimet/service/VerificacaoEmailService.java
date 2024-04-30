package absisters.nimet.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import absisters.nimet.domain.Usuario;
import absisters.nimet.exception.EmailExpirado;
import absisters.nimet.exception.EmailJaValidado;
import absisters.nimet.exception.ObjetoNaoExiste;
import absisters.nimet.repository.UsuarioRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class VerificacaoEmailService {

	@Autowired
    private UsuarioRepository usuarioRepository;

    @SuppressWarnings("rawtypes")
	public ResponseEntity validarEmail(String emailUsuario) {
        Usuario usuario = usuarioRepository.findByEmail(emailUsuario);

        if (usuario == null) {
            throw new ObjetoNaoExiste("Usuário", "email", emailUsuario);
        }

        if (usuario.getEmailValido() == true) {
            throw new EmailJaValidado(emailUsuario);
        }

        LocalDateTime emailVerificacaoExpirouAposUmDia = usuario.getDataCriado().plusDays(1);

        if (emailVerificacaoExpirouAposUmDia.isBefore(LocalDateTime.now())) {
            throw new EmailExpirado(emailUsuario);
        }

        usuario.setEmailValido(true);
        usuarioRepository.save(usuario);

        //log.info("Email " + emailUsuario + " foi validado");

        return ResponseEntity.ok().body(usuario.getEmailValido());
    }
}
