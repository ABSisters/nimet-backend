package absisters.nimet.dto.Mapper;

import absisters.nimet.domain.Resposta;
import absisters.nimet.dto.Response.RespostaResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RespostaMapper {
    RespostaResponse to(Resposta resposta);
    List<RespostaResponse> to(List<Resposta> respostas);
}
