package absisters.nimet.dto;

import absisters.nimet.domain.Resposta;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RespostaMapper {
    RespostaResponse to(Resposta resposta);
    List<RespostaResponse> to(List<Resposta> respostas);
}
