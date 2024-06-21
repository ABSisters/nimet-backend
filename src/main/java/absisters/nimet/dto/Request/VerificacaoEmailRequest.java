package absisters.nimet.dto.Request;

import jakarta.validation.constraints.NotNull;

public record VerificacaoEmailRequest(
        @NotNull Integer token
) {}
