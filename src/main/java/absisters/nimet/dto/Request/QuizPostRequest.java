package absisters.nimet.dto.Request;

import absisters.nimet.domain.Curso;
import absisters.nimet.domain.Nivel;
import jakarta.validation.constraints.NotNull;

public record QuizPostRequest(
        @NotNull String usuarioId,
        @NotNull Curso curso,
        @NotNull Nivel nivel,
        @NotNull Integer acertos,
        @NotNull Integer erros
) {}
