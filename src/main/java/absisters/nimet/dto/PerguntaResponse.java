package absisters.nimet.dto;

import absisters.nimet.domain.Curso;
import absisters.nimet.domain.Tags;

import java.time.LocalDateTime;
import java.util.List;

public record PerguntaResponse(
        String perguntaId,
        Curso curso,
        UsuarioResponse usuario,

        String titulo,
        String detalhes,
        List<Tags> tags,
        Boolean status,
        LocalDateTime dataCriado
) {}
