package absisters.nimet.dto.Mapper;

import absisters.nimet.domain.Curso;
import absisters.nimet.domain.TipoUsuario;
import absisters.nimet.domain.Usuario;
import absisters.nimet.dto.Response.UsuarioResponse;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-21T13:08:11-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
    public UsuarioResponse to(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        String usuarioId = null;
        String nome = null;
        String username = null;
        String email = null;
        boolean emailValido = false;
        LocalDate dataNascimento = null;
        Curso curso = null;
        TipoUsuario tipoUsuario = null;
        LocalDateTime dataCriado = null;

        usuarioId = usuario.getUsuarioId();
        nome = usuario.getNome();
        username = usuario.getUsername();
        email = usuario.getEmail();
        if ( usuario.getEmailValido() != null ) {
            emailValido = usuario.getEmailValido();
        }
        dataNascimento = usuario.getDataNascimento();
        curso = usuario.getCurso();
        tipoUsuario = usuario.getTipoUsuario();
        dataCriado = usuario.getDataCriado();

        UsuarioResponse usuarioResponse = new UsuarioResponse( usuarioId, nome, username, email, emailValido, dataNascimento, curso, tipoUsuario, dataCriado );

        return usuarioResponse;
    }
}
