package absisters.nimet.service;

import java.time.LocalDateTime;
import java.util.List;

import absisters.nimet.domain.EmailToken;
import absisters.nimet.domain.Pergunta;
import absisters.nimet.domain.Resposta;
import absisters.nimet.repository.EmailTokenRepository;
import absisters.nimet.repository.PerguntaRepository;
import absisters.nimet.repository.RespostaRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import absisters.nimet.domain.Usuario;
import absisters.nimet.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@AllArgsConstructor
@Log4j2
public class CleanupService {
	@Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private EmailTokenRepository emailTokenRepository;

    @Autowired
    private PerguntaRepository perguntaRepository;

    @Autowired
    private RespostaRepository respostaRepository;

    private static Logger logger = LogManager.getLogger();

    //1000 = 1 segundo (300000 = 5 minutos)
    @Scheduled(fixedRate = 300000)
    public void usuarioCleanup (){
        List<Usuario> usuarioEmailNaoFoiValidado = usuarioRepository.findAllByEmailValidoIsFalse();

        for (Usuario usuario : usuarioEmailNaoFoiValidado){
            LocalDateTime UsuarioNaoValidadoPorUmaSemana = usuario.getDataCriado().plusDays(7);

            if(UsuarioNaoValidadoPorUmaSemana.isBefore(LocalDateTime.now())){
                EmailToken emailToken= emailTokenRepository.findByUsuario(usuario);
                if (emailToken != null) {
                    emailTokenRepository.delete(emailToken);
                    logger.info("Token com id " + emailToken.getTokenId() + " foi deletado em conjunto com o usuario com id " + usuario.getUsuarioId());
                }

                List<Pergunta> perguntas = perguntaRepository.findAllByUsuario(usuario);
                if (!perguntas.isEmpty()) {
                    for (Pergunta pergunta : perguntas){
                        perguntaRepository.delete(pergunta);
                        logger.info("Pergunta com id " + pergunta.getPerguntaId() + " foi deletado em conjunto com o usuario com id " + usuario.getUsuarioId());
                    }
                }

                List<Resposta> respostas = respostaRepository.findAllByUsuario(usuario);
                if (!respostas.isEmpty()) {
                    for (Resposta resposta : respostas){
                        respostaRepository.delete(resposta);
                        logger.info("Resposta com id " + resposta.getRespostaId() + " foi deletado em conjunto com o usuario com id " + usuario.getUsuarioId());
                    }
                }

                usuarioRepository.delete(usuario);
                logger.info("Usuario com id " + usuario.getUsuarioId() + " foi deletado após passar uma semana sem validar seu email");
            }
        }

        usuarioEmailNaoFoiValidado.clear();
    }

    @Scheduled(fixedRate = 300000)
    public void emailTokenCleanup (){
        List<EmailToken> emailTokenDataExpirado = emailTokenRepository.findAllByDataExpiradoIsBefore(LocalDateTime.now());

        for (EmailToken emailToken : emailTokenDataExpirado){
            emailTokenRepository.delete(emailToken);
            logger.info("Token com id " + emailToken.getTokenId() + " foi deletado após ser expirado");
        }

        emailTokenDataExpirado.clear();
    }
}
