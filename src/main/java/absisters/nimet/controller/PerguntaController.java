package absisters.nimet.controller;

import absisters.nimet.domain.Curso;
import absisters.nimet.dto.PerguntaPostRequest;
import absisters.nimet.dto.PerguntaResponse;
import absisters.nimet.service.PerguntaService;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PerguntaController {

    @Autowired
    private PerguntaService perguntaService;

    @PostMapping("api/usuarios/{usuarioId}/perguntas/adicionar")
    public PerguntaResponse post(@PathVariable String usuarioId, @RequestBody @NotNull PerguntaPostRequest pergunta) {
        return perguntaService.create(usuarioId, pergunta);
    }

    @GetMapping("api/perguntas/curso/{curso}")
    public List<PerguntaResponse> getPerguntasDoCurso(@PathVariable Curso curso) {
        return perguntaService.getPerguntasDoCurso(curso);
    }

}
