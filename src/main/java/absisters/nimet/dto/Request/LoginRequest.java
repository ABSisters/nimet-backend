package absisters.nimet.dto.Request;

import absisters.nimet.domain.Curso;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record LoginRequest(
        @NotNull String login,
        @NotNull String senha
) {}
