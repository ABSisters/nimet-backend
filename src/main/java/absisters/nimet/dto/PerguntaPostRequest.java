package absisters.nimet.dto;

import absisters.nimet.domain.Tags;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public record PerguntaPostRequest(
        @NotNull @Size(max = 20) String titulo,
        @NotNull @Size(max = 200) String detalhes,
        @NotNull List<Tags> tags
) {}
