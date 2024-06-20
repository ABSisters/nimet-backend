package absisters.nimet.dto;

import absisters.nimet.domain.Pergunta;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PerguntaMapper {
    PerguntaResponse to(Pergunta pergunta);
    List<PerguntaResponse> to (List<Pergunta> perguntas);
}
