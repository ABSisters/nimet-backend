package absisters.nimet.service;

import absisters.nimet.domain.Quiz;
import absisters.nimet.domain.Usuario;
import absisters.nimet.dto.Mapper.QuizMapper;
import absisters.nimet.dto.Request.QuizPostRequest;
import absisters.nimet.dto.Response.QuizResponse;
import absisters.nimet.exception.ObjetoNaoExiste;
import absisters.nimet.repository.QuizRepository;
import absisters.nimet.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class QuizService {
    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private QuizMapper quizMapper;

    @Autowired
    private UsuarioRepository usuarioRepository;

    private static Logger logger = LogManager.getLogger();

    public QuizResponse create(QuizPostRequest request) {
        Usuario usuario = usuarioRepository.findByUsuarioId(request.usuarioId());

        if(usuario == null){
            throw new ObjetoNaoExiste("Usuário", "id", request.usuarioId());
        }

        Quiz quiz = quizRepository.save(
                new Quiz(usuario, request.curso(), request.nivel(), request.acertos(), request.erros()));
        logger.info("Usuário com id " + usuario.getUsuarioId() + " respondeu o quiz de " + quiz.getCurso() + " " + quiz.getNivel());

        return quizMapper.to(quiz);
    }

    public List<QuizResponse> getQuizDoUsuario(String usuarioId) {
        Usuario usuario = usuarioRepository.findByUsuarioId(usuarioId);

        if(usuario == null){
            throw new ObjetoNaoExiste("Usuário", "id", usuarioId);
        }

        List<Quiz> quiz = quizRepository.findAllByUsuario(usuario);
        logger.info("Usuário com id " + usuario.getUsuarioId() + " solicitou as suas respostas do quiz");

        return quizMapper.to(quiz);
    }
}
