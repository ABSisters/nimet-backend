package absisters.nimet.controller;

import absisters.nimet.dto.Request.QuizPostRequest;
import absisters.nimet.dto.Response.QuizResponse;
import absisters.nimet.service.QuizService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/quiz")
@AllArgsConstructor
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping("/responder")
    public QuizResponse post(@RequestBody @Valid @NotNull QuizPostRequest quiz) {
        return quizService.create(quiz);
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<QuizResponse> getQuizDoUsuario(@PathVariable String usuarioId) {
        return quizService.getQuizDoUsuario(usuarioId);
    }

}
