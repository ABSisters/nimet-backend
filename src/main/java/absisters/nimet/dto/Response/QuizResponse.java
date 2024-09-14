package absisters.nimet.dto.Response;

import absisters.nimet.domain.Curso;
import absisters.nimet.domain.Nivel;

import java.time.LocalDateTime;

public record QuizResponse(
        String quizId,
        UsuarioResponse usuario,
        Curso curso,
        Nivel nivel,
        Integer acertos,
        Integer erros,
        LocalDateTime dataCriado
) {}
