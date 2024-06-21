package absisters.nimet.service;

import absisters.nimet.domain.EmailToken;
import absisters.nimet.domain.Usuario;
import absisters.nimet.repository.EmailTokenRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Random;

@Service
public class EmailService {
    @Autowired
    private EmailTokenRepository emailTokenRepository;

	@Autowired
    private JavaMailSender mailSender;

    private static Logger logger = LogManager.getLogger();

    public EmailToken criarToken(Usuario usuario) {
        Random random = new Random();
        Integer token = random.nextInt(100000, 999999);

        EmailToken atualizarToken = emailTokenRepository.findByUsuario(usuario);
        EmailToken emailToken = new EmailToken();

        if(atualizarToken != null){
            atualizarToken.setToken(token);
            atualizarToken.setDataExpirado(LocalDateTime.now().plusDays(1));
            emailToken = emailTokenRepository.save(atualizarToken);
            logger.info("EmailToken com id " + emailToken.getTokenId() + " foi atualizado para um novo token");
        } else {
            emailToken = emailTokenRepository.save(new EmailToken(usuario, token));
            logger.info("EmailToken com id " + emailToken.getTokenId() + " foi criado para o usuario com id " + usuario.getUsuarioId());
        }

        return emailToken;
    }


    public void mandarEmail(Usuario usuario, EmailToken emailToken) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("absisters.dev@gmail.com");
        message.setTo(usuario.getEmail());
        message.setSubject("nimet - Verifique o seu endereço de email com o token " + emailToken.getToken());
        message.setText("Olá " + usuario.getNome() +
                "\n\nPara confirmar o seu endereço de email e concluir o seu cadastro na nimet use o token: "
                + "\n\n" + emailToken.getToken()
                + "\n\nO token irá expirar em 1 dia.");

        mailSender.send(message);

        logger.info("Usuário com email " + usuario.getEmail() + " recebeu o email de validação.");
    }
}