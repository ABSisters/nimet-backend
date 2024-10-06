package absisters.nimet.service;

import java.time.LocalDateTime;

import absisters.nimet.domain.EmailToken;
import absisters.nimet.dto.Request.RemandarEmailRequest;
import absisters.nimet.repository.EmailTokenRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

    @Autowired
    private EmailService emailService;

    private static Logger logger = LogManager.getLogger();

    @SuppressWarnings("rawtypes")
    public ResponseEntity validarEmail(Integer request) {
        EmailToken emailToken = emailTokenRepository.findByToken(request);

        if (emailToken == null) {
            throw new ObjetoNaoExiste("EmailToken", "token", request.toString());
        }

        if (emailToken.getDataExpirado().isBefore(LocalDateTime.now())) {
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
        logger.info("Email " + usuario.getEmail() + " foi validado");

        emailTokenRepository.delete(emailToken);
        logger.info("Token com id " + emailToken.getTokenId() + " foi utilizado e deletado");

        return ResponseEntity.ok().body(usuario.getEmailValido());
    }

    public ResponseEntity remandarEmail(RemandarEmailRequest request) {
        Usuario usuario = new Usuario();

        if (usuarioRepository.existsByEmail(request.usuario())) {
            usuario = usuarioRepository.findByEmail(request.usuario());

        } else if (usuarioRepository.existsByUsername(request.usuario())) {
            usuario = usuarioRepository.findByUsername(request.usuario());

        } else {
            throw new ObjetoNaoExiste("Usuário", "id", request.usuario());
        }

        EmailToken emailToken = emailService.criarToken(usuario);

        emailService.mandarEmail(usuario, emailToken);
        logger.info("Email com token id " + emailToken.getTokenId() + " foi reenviado");

        return ResponseEntity.ok().body(usuario.getEmailValido());
    }
}
