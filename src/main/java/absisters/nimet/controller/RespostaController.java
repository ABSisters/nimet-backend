package absisters.nimet.controller;

import absisters.nimet.dto.PerguntaResponse;
import absisters.nimet.dto.RespostaPostRequest;
import absisters.nimet.dto.RespostaResponse;
import absisters.nimet.service.RespostaService;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class RespostaController {

    @Autowired
    private RespostaService respostaService;

    @PostMapping("api/usuarios/{usuarioId}/perguntas/{perguntaId}/respostas/adicionar")
    public RespostaResponse post(@PathVariable String usuarioId, @PathVariable String perguntaId, @RequestBody @NotNull RespostaPostRequest resposta) {
        return respostaService.create(usuarioId, perguntaId, resposta);
    }

    @GetMapping("api/perguntas/{perguntaId}/respostas")
    public List<RespostaResponse> getRespostasDeUmaPergunta(@PathVariable String perguntaId) {
        return respostaService.getRespostasDeUmaPergunta(perguntaId);
    }
}
