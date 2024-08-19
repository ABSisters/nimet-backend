package absisters.nimet.dto.Request;

import absisters.nimet.domain.Tags;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public record PerguntaPostRequest(
        @NotNull String usuarioId,
        @NotNull @Size(max = 300) String titulo,
        @NotNull @Size(max = 600) String detalhes,
        @NotNull List<Tags> tags
) {}
