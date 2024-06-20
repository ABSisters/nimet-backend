package absisters.nimet.dto;

import absisters.nimet.domain.Resposta;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RespostaMapper {
    RespostaResponse to(Resposta resposta);
}
