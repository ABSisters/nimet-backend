package absisters.nimet.dto.Request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record RespostaPostRequest(
        @NotNull String usuarioId,
        @NotNull String perguntaId,
        @NotNull @Size(max = 600) String resposta
) {}
