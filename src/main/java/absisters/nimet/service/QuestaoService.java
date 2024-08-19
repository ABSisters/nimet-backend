package absisters.nimet.service;

import absisters.nimet.domain.*;
import absisters.nimet.dto.Mapper.QuestaoMapper;
import absisters.nimet.dto.Response.QuestaoResponse;
import absisters.nimet.exception.ObjetoNaoExiste;
import absisters.nimet.repository.QuestaoRepository;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
@AllArgsConstructor
public class QuestaoService {
    @Autowired
    private QuestaoRepository questaoRepository;

    @Autowired
    private QuestaoMapper questaoMapper;

    private static Logger logger = LogManager.getLogger();

    public List<QuestaoResponse> getQuestoesDoCursoENivel(Curso curso, Nivel nivel) {
        Questao questao;
        List<Questao> questoes = new ArrayList<>();
        Random random = new Random();
        List<Integer> numero = new ArrayList<>();

        if(curso==Curso.ELETRONICA){
            if(nivel==Nivel.BASICO){
                numero = random.ints(1, 15)
                        .distinct().limit(5).boxed().toList();
            }
            if(nivel==Nivel.INTERMEDIARIO){
                numero = random.ints(16, 30)
                        .distinct().limit(5).boxed().toList();
            }
            if(nivel==Nivel.AVANCADO){
                numero = random.ints(31, 45)
                        .distinct().limit(5).boxed().toList();
            }
        }

        if(curso==Curso.INFORMATICA){
            if(nivel==Nivel.BASICO){
                numero = random.ints(46, 60)
                        .distinct().limit(5).boxed().toList();
            }
            if(nivel==Nivel.INTERMEDIARIO){
                numero = random.ints(61, 75)
                        .distinct().limit(5).boxed().toList();
            }
            if(nivel==Nivel.AVANCADO){
                numero = random.ints(76, 90)
                        .distinct().limit(5).boxed().toList();
            }
        }

        if(curso==Curso.MECANICA){
            if(nivel==Nivel.BASICO){
                numero = random.ints(91, 105)
                        .distinct().limit(5).boxed().toList();
            }
            if(nivel==Nivel.INTERMEDIARIO){
                numero = random.ints(106, 120)
                        .distinct().limit(5).boxed().toList();
            }
            if(nivel==Nivel.AVANCADO){
                numero = random.ints(121, 135)
                        .distinct().limit(5).boxed().toList();
            }
        }

        for (int i=0; i<5; i++){
            questao = questaoRepository.findByCursoAndNivelAndQuestaoId(curso, nivel, numero.get(i).toString());
            if(questao.getOpcoes().isEmpty()){
                throw new ObjetoNaoExiste("Opcoes", "id", questao.getQuestaoId());
            }
            questoes.add(questao);
        }

        if(questoes.contains(null)){
            throw new ObjetoNaoExiste("Questoes", "id", curso.toString());
        }

        logger.info("Usuário solicitou as questoes do curso " + curso + " nivel " + nivel);

        return questaoMapper.to(questoes);
    }

}
