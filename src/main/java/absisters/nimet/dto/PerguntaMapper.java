package absisters.nimet.dto;

import absisters.nimet.domain.Pergunta;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PerguntaMapper {
    PerguntaResponse to(Pergunta pergunta);
}
