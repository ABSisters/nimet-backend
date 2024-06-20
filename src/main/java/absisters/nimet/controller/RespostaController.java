package absisters.nimet.controller;

import absisters.nimet.dto.RespostaPostRequest;
import absisters.nimet.dto.RespostaResponse;
import absisters.nimet.service.RespostaService;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class RespostaController {

    @Autowired
    private RespostaService respostaService;

    @PostMapping("api/usuarios/{usuarioId}/perguntas/{perguntaId}/respostas/adicionar")
    public RespostaResponse post(@PathVariable String usuarioId, @PathVariable String perguntaId, @RequestBody @NotNull RespostaPostRequest resposta) {
        return respostaService.create(usuarioId, perguntaId, resposta);
    }
}
