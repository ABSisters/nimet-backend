package absisters.nimet.dto;

import jakarta.validation.constraints.NotNull;

public record VerificacaoEmailRequest(
        @NotNull Integer token
) {}
