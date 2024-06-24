package absisters.nimet.controller;

import absisters.nimet.dto.Request.RespostaPostRequest;
import absisters.nimet.dto.Response.RespostaResponse;
import absisters.nimet.service.RespostaService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/respostas")
@AllArgsConstructor
public class RespostaController {

    @Autowired
    private RespostaService respostaService;

    @PostMapping("/adicionar")
    public RespostaResponse post(@RequestBody @Valid @NotNull RespostaPostRequest resposta) {
        return respostaService.create(resposta);
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<RespostaResponse> getRespostasDoUsuario(@PathVariable String usuarioId) {
        return respostaService.getRespostasDoUsuario(usuarioId);
    }

    @GetMapping("/perguntas/{perguntaId}")
    public List<RespostaResponse> getRespostasDeUmaPergunta(@PathVariable String perguntaId) {
        return respostaService.getRespostasDeUmaPergunta(perguntaId);
    }
}
