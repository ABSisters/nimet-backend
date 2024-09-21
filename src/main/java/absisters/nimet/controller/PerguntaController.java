package absisters.nimet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import absisters.nimet.domain.Curso;
import absisters.nimet.domain.Tags;
import absisters.nimet.dto.Request.PerguntaPostRequest;
import absisters.nimet.dto.Response.PerguntaResponse;
import absisters.nimet.service.PerguntaService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;

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
    
    @GetMapping("/tag/{tag}")
    public List<PerguntaResponse> getPerguntasPorTag(@PathVariable Tags tag) {
        return perguntaService.getPerguntaByTag(tag);
    }
    
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Void> deletePergunta(@PathVariable String perguntaId, @RequestParam String usuarioId) {
        perguntaService.delete(perguntaId, usuarioId);
        return ResponseEntity.noContent().build();
    }
    
    //@DeleteMapping("/deletar/{id}")
    //public PerguntaResponse delete(@PathVariable String perguntaId, @RequestParam String usuarioId) {
    //    return perguntaService.delete(perguntaId, usuarioId);
    //}
    
    @PutMapping("/fechar/{id}")
    public PerguntaResponse fecharPergunta(@PathVariable String perguntaId, @RequestParam String usuarioId) {
        return perguntaService.fecharPergunta(perguntaId, usuarioId);
    }

}