package service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private JavaMailSender mailSender;
    //private static Logger logger = LogManager.getLogger(EmailService.class);

    public void mandarEmail(String emailUsuario, String nomeUsuario, String link) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(emailUsuario);
        message.setSubject("nimet - Verifique o seu endereço de email");
        message.setText("Olá " + nomeUsuario +
                "\n\nClique no link abaixo para confirmar o seu endereço de email e concluir o seu cadastro na nimet.\n\n" +
                link);

        mailSender.send(message);

       //log.info("Usuário com email " + emailUsuario + " recebeu o email de validação.");
    }
}