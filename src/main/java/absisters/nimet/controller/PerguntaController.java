package absisters.nimet.controller;

import absisters.nimet.domain.Curso;
import absisters.nimet.dto.Request.PerguntaPostRequest;
import absisters.nimet.dto.Response.PerguntaResponse;
import absisters.nimet.service.PerguntaService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/perguntas")
@AllArgsConstructor
public class PerguntaController {

    @Autowired
    private PerguntaService perguntaService;

    @PostMapping("/adicionar")
    public PerguntaResponse post(@RequestBody @Valid @NotNull PerguntaPostRequest pergunta) {
        return perguntaService.create(pergunta);
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<PerguntaResponse> getPerguntasDoUsuario(@PathVariable String usuarioId) {
        return perguntaService.getPerguntasDoUsuario(usuarioId);
    }

    @GetMapping("/curso/{curso}")
    public List<PerguntaResponse> getPerguntasDoCurso(@PathVariable Curso curso) {
        return perguntaService.getPerguntasDoCurso(curso);
    }

    @GetMapping("/{perguntaId}")
    public PerguntaResponse getPergunta(@PathVariable String perguntaId) {
        return perguntaService.getPergunta(perguntaId);
    }

}
