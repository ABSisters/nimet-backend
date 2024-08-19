package absisters.nimet.controller;

import absisters.nimet.domain.Curso;
import absisters.nimet.domain.Nivel;
import absisters.nimet.dto.Response.QuestaoResponse;
import absisters.nimet.service.QuestaoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/questoes")
@AllArgsConstructor
public class QuestaoController {

    @Autowired
    private QuestaoService questaoService;

    @GetMapping("/curso/{curso}/nivel/{nivel}")
    public List<QuestaoResponse> getQuestoesDoCursoENivel(@PathVariable Curso curso, @PathVariable Nivel nivel) {
        return questaoService.getQuestoesDoCursoENivel(curso, nivel);
    }

}
