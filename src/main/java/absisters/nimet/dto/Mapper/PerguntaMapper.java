package absisters.nimet.dto.Mapper;

import absisters.nimet.domain.Pergunta;
import absisters.nimet.dto.Response.PerguntaResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PerguntaMapper {
    PerguntaResponse to(Pergunta pergunta);
    List<PerguntaResponse> to (List<Pergunta> perguntas);
}
