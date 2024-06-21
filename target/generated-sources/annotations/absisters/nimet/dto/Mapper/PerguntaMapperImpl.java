package absisters.nimet.dto.Mapper;

import absisters.nimet.domain.Curso;
import absisters.nimet.domain.Pergunta;
import absisters.nimet.domain.Tags;
import absisters.nimet.domain.TipoUsuario;
import absisters.nimet.domain.Usuario;
import absisters.nimet.dto.Response.PerguntaResponse;
import absisters.nimet.dto.Response.UsuarioResponse;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-21T01:55:58-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class PerguntaMapperImpl implements PerguntaMapper {

    @Override
    public PerguntaResponse to(Pergunta pergunta) {
        if ( pergunta == null ) {
            return null;
        }

        String perguntaId = null;
        Curso curso = null;
        UsuarioResponse usuario = null;
        String titulo = null;
        String detalhes = null;
        List<Tags> tags = null;
        Boolean status = null;
        LocalDateTime dataCriado = null;

        perguntaId = pergunta.getPerguntaId();
        curso = pergunta.getCurso();
        usuario = usuarioToUsuarioResponse( pergunta.getUsuario() );
        titulo = pergunta.getTitulo();
        detalhes = pergunta.getDetalhes();
        List<Tags> list = pergunta.getTags();
        if ( list != null ) {
            tags = new ArrayList<Tags>( list );
        }
        status = pergunta.getStatus();
        dataCriado = pergunta.getDataCriado();

        PerguntaResponse perguntaResponse = new PerguntaResponse( perguntaId, curso, usuario, titulo, detalhes, tags, status, dataCriado );

        return perguntaResponse;
    }

    @Override
    public List<PerguntaResponse> to(List<Pergunta> perguntas) {
        if ( perguntas == null ) {
            return null;
        }

        List<PerguntaResponse> list = new ArrayList<PerguntaResponse>( perguntas.size() );
        for ( Pergunta pergunta : perguntas ) {
            list.add( to( pergunta ) );
        }

        return list;
    }

    protected UsuarioResponse usuarioToUsuarioResponse(Usuario usuario) {
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
