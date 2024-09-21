package absisters.nimet.dto.Mapper;

import absisters.nimet.domain.Curso;
import absisters.nimet.domain.Nivel;
import absisters.nimet.domain.Opcao;
import absisters.nimet.domain.Questao;
import absisters.nimet.dto.Response.QuestaoResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-21T09:32:55-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class QuestaoMapperImpl implements QuestaoMapper {

    @Override
    public List<QuestaoResponse> to(List<Questao> questoes) {
        if ( questoes == null ) {
            return null;
        }

        List<QuestaoResponse> list = new ArrayList<QuestaoResponse>( questoes.size() );
        for ( Questao questao : questoes ) {
            list.add( questaoToQuestaoResponse( questao ) );
        }

        return list;
    }

    protected QuestaoResponse questaoToQuestaoResponse(Questao questao) {
        if ( questao == null ) {
            return null;
        }

        String questaoId = null;
        Curso curso = null;
        Nivel nivel = null;
        String questao1 = null;
        List<Opcao> opcoes = null;

        questaoId = questao.getQuestaoId();
        curso = questao.getCurso();
        nivel = questao.getNivel();
        questao1 = questao.getQuestao();
        List<Opcao> list = questao.getOpcoes();
        if ( list != null ) {
            opcoes = new ArrayList<Opcao>( list );
        }

        QuestaoResponse questaoResponse = new QuestaoResponse( questaoId, curso, nivel, questao1, opcoes );

        return questaoResponse;
    }
}
