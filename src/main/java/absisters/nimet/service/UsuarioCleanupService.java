package absisters.nimet.service;

import java.time.LocalDateTime;
import java.util.List;

import absisters.nimet.domain.EmailToken;
import absisters.nimet.exception.ObjetoNaoExiste;
import absisters.nimet.repository.EmailTokenRepository;
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
public class UsuarioCleanupService {
	@Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private EmailTokenRepository emailTokenRepository;

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
                    //log.info("Token com id " + emailToken.getTokenId() + " foi deletado em conjunto com o usuario com id " + usuario.getUsuarioId());
                }

                usuarioRepository.delete(usuario);
                //log.info("Usuario com id " + usuario.getUsuarioId() + " foi deletado após passar uma semana sem validar seu email");
            }
        }

        usuarioEmailNaoFoiValidado.clear();
    }
}
