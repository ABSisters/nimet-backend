package absisters.nimet.dto;

import java.time.LocalDateTime;

public record RespostaResponse(
        String respostaId,
        UsuarioResponse usuario,
        PerguntaResponse pergunta,

        String resposta,
        LocalDateTime dataCriado
) {}
