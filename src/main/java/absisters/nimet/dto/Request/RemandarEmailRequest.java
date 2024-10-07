package absisters.nimet.dto.Request;

import jakarta.validation.constraints.NotNull;

public record RemandarEmailRequest(
        @NotNull String usuario
) {}
