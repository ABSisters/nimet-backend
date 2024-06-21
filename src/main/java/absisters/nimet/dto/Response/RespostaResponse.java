package absisters.nimet.dto.Response;

import java.time.LocalDateTime;

public record RespostaResponse(
        String respostaId,
        UsuarioResponse usuario,
        PerguntaResponse pergunta,

        String resposta,
        LocalDateTime dataCriado
) {}
