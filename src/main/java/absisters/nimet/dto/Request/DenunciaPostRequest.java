package absisters.nimet.dto.Request;

import jakarta.validation.constraints.NotNull;

public record DenunciaPostRequest(
        @NotNull String usuarioId,
        @NotNull String conteudo,
        @NotNull String motivo
) {}
