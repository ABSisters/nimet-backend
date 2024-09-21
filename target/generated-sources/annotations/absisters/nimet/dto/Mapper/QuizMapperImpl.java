package absisters.nimet.dto.Mapper;

import absisters.nimet.domain.Curso;
import absisters.nimet.domain.Nivel;
import absisters.nimet.domain.Quiz;
import absisters.nimet.domain.TipoUsuario;
import absisters.nimet.domain.Usuario;
import absisters.nimet.dto.Response.QuizResponse;
import absisters.nimet.dto.Response.UsuarioResponse;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-21T09:32:55-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class QuizMapperImpl implements QuizMapper {

    @Override
    public QuizResponse to(Quiz quiz) {
        if ( quiz == null ) {
            return null;
        }

        String quizId = null;
        UsuarioResponse usuario = null;
        Curso curso = null;
        Nivel nivel = null;
        Integer acertos = null;
        Integer erros = null;
        LocalDateTime dataCriado = null;

        quizId = quiz.getQuizId();
        usuario = usuarioToUsuarioResponse( quiz.getUsuario() );
        curso = quiz.getCurso();
        nivel = quiz.getNivel();
        acertos = quiz.getAcertos();
        erros = quiz.getErros();
        dataCriado = quiz.getDataCriado();

        QuizResponse quizResponse = new QuizResponse( quizId, usuario, curso, nivel, acertos, erros, dataCriado );

        return quizResponse;
    }

    @Override
    public List<QuizResponse> to(List<Quiz> quiz) {
        if ( quiz == null ) {
            return null;
        }

        List<QuizResponse> list = new ArrayList<QuizResponse>( quiz.size() );
        for ( Quiz quiz1 : quiz ) {
            list.add( to( quiz1 ) );
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
        curso = usuario.getCurso();
        tipoUsuario = usuario.getTipoUsuario();
        dataCriado = usuario.getDataCriado();

        UsuarioResponse usuarioResponse = new UsuarioResponse( usuarioId, nome, username, email, emailValido, curso, tipoUsuario, dataCriado );

        return usuarioResponse;
    }
}
