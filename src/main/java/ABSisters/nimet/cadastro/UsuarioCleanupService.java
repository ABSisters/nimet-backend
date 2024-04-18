package ABSisters.nimet.cadastro;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
@Log4j2
public class UsuarioCleanupService {
    private final UsuarioRepository usuarioRepository;

    //1000 = 1 segundo (300000 = 5 minutos)
    @Scheduled(fixedRate = 100000)
    public void usuarioCleanup (){
        List<Usuario> usuarioEmailNaoFoiValidado = usuarioRepository.findAllByEmailValidoIsFalse();

        for (Usuario usuario : usuarioEmailNaoFoiValidado){
            LocalDateTime UsuarioNaoValidadoPorUmaSemana = usuario.getDataCriado().plusDays(7);

            if(UsuarioNaoValidadoPorUmaSemana.isBefore(LocalDateTime.now())){
                usuarioRepository.delete(usuario);

                log.info("Usuario com id " + usuario.getUsuarioId() + " foi deletado após passar uma semana sem validar seu email");
            }
        }

        usuarioEmailNaoFoiValidado.clear();
    }
}
