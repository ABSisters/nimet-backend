package ABSisters.nimet.email;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@AllArgsConstructor
public class EmailService {

    private final JavaMailSender mailSender;

    public void mandarEmail(String emailUsuario, String nomeUsuario, String link) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(emailUsuario);
        message.setSubject("nimet - Verifique o seu endereço de email");
        message.setText("Olá " + nomeUsuario +
                "\n\nClique no link abaixo para confirmar o seu endereço de email e concluir o seu cadastro na nimet.\n\n" +
                link);

        mailSender.send(message);

        log.info("Usuário com email " + emailUsuario + " recebeu o email de validação.");
    }
}