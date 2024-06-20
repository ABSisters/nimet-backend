package absisters.nimet.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record RespostaPostRequest(
        @NotNull @Size(max = 200) String resposta
) {}
