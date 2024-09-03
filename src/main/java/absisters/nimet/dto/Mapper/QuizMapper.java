package absisters.nimet.dto.Mapper;

import absisters.nimet.domain.Quiz;
import absisters.nimet.dto.Response.QuizResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface QuizMapper {
    QuizResponse to(Quiz quiz);
}
