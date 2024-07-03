package absisters.nimet.dto.Mapper;

import absisters.nimet.domain.Questao;
import absisters.nimet.dto.Response.QuestaoResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface QuestaoMapper {
    List<QuestaoResponse> to(List<Questao> questoes);
}
