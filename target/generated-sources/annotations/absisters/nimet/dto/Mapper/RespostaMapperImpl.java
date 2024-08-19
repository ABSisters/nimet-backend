package absisters.nimet.dto.Mapper;

import absisters.nimet.domain.Curso;
import absisters.nimet.domain.Pergunta;
import absisters.nimet.domain.Resposta;
import absisters.nimet.domain.Tags;
import absisters.nimet.domain.TipoUsuario;
import absisters.nimet.domain.Usuario;
import absisters.nimet.dto.Response.PerguntaResponse;
import absisters.nimet.dto.Response.RespostaResponse;
import absisters.nimet.dto.Response.UsuarioResponse;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-19T16:21:24-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class RespostaMapperImpl implements RespostaMapper {

    @Override
    public RespostaResponse to(Resposta resposta) {
        if ( resposta == null ) {
            return null;
        }

        String respostaId = null;
        UsuarioResponse usuario = null;
        PerguntaResponse pergunta = null;
        String resposta1 = null;
        LocalDateTime dataCriado = null;

        respostaId = resposta.getRespostaId();
        usuario = usuarioToUsuarioResponse( resposta.getUsuario() );
        pergunta = perguntaToPerguntaResponse( resposta.getPergunta() );
        resposta1 = resposta.getResposta();
        dataCriado = resposta.getDataCriado();

        RespostaResponse respostaResponse = new RespostaResponse( respostaId, usuario, pergunta, resposta1, dataCriado );

        return respostaResponse;
    }

    @Override
    public List<RespostaResponse> to(List<Resposta> respostas) {
        if ( respostas == null ) {
            return null;
        }

        List<RespostaResponse> list = new ArrayList<RespostaResponse>( respostas.size() );
        for ( Resposta resposta : respostas ) {
            list.add( to( resposta ) );
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

    protected PerguntaResponse perguntaToPerguntaResponse(Pergunta pergunta) {
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
}
