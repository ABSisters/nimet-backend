package absisters.nimet.service;

import java.time.LocalDateTime;

import absisters.nimet.domain.EmailToken;
import absisters.nimet.dto.VerificacaoEmailRequest;
import absisters.nimet.repository.EmailTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import absisters.nimet.domain.Usuario;
import absisters.nimet.exception.EmailTokenExpirado;
import absisters.nimet.exception.EmailJaValidado;
import absisters.nimet.exception.ObjetoNaoExiste;
import absisters.nimet.repository.UsuarioRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class VerificacaoEmailService {

	@Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private EmailTokenRepository emailTokenRepository;

    @SuppressWarnings("rawtypes")
	public ResponseEntity validarEmail(VerificacaoEmailRequest request) {
        EmailToken emailToken = emailTokenRepository.findByToken(request.token());

        if (emailToken == null) {
            throw new ObjetoNaoExiste("EmailToken", "token", request.token().toString());
        }

        LocalDateTime emailTokenExpirouAposUmDia = emailToken.getDataCriado().plusDays(1);

        if (emailTokenExpirouAposUmDia.isBefore(LocalDateTime.now())) {
            throw new EmailTokenExpirado(emailToken.getTokenId());
        }

        Usuario usuario = usuarioRepository.findByEmail(emailToken.getUsuario().getEmail());

        if (usuario == null) {
            throw new ObjetoNaoExiste("Usuário", "email", emailToken.getUsuario().getEmail());
        }

        if (usuario.getEmailValido() == true) {
            throw new EmailJaValidado(usuario.getEmail());
        }

        usuario.setEmailValido(true);
        usuarioRepository.save(usuario);

        //log.info("Email " + emailUsuario + " foi validado");

        return ResponseEntity.ok().body(usuario.getEmailValido());
    }
}
