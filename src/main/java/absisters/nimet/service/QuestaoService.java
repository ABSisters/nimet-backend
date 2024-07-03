package absisters.nimet.service;

import absisters.nimet.domain.*;
import absisters.nimet.dto.Mapper.PerguntaMapper;
import absisters.nimet.dto.Mapper.QuestaoMapper;
import absisters.nimet.dto.Request.PerguntaPostRequest;
import absisters.nimet.dto.Response.PerguntaResponse;
import absisters.nimet.dto.Response.QuestaoResponse;
import absisters.nimet.exception.ObjetoNaoExiste;
import absisters.nimet.repository.PerguntaRepository;
import absisters.nimet.repository.QuestaoRepository;
import absisters.nimet.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class QuestaoService {
    @Autowired
    private QuestaoRepository questaoRepository;

    @Autowired
    private QuestaoMapper questaoMapper;

    private static Logger logger = LogManager.getLogger();

    public List<QuestaoResponse> getQuestoesDoCursoENivel(Curso curso, Nivel nivel) {
        List<Questao> questoes = questaoRepository.findAllByCursoAndNivel(curso, nivel);

        if(questoes.isEmpty()){
            throw new ObjetoNaoExiste("Questoes", "id", curso.toString());
        }

        logger.info("Usuário solicitou as questoes do curso " + curso + " nivel " + nivel);

        return questaoMapper.to(questoes);
    }

}
