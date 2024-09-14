package absisters.nimet.dto.Mapper;

import absisters.nimet.domain.Quiz;
import absisters.nimet.dto.Response.QuizResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface QuizMapper {
    QuizResponse to(Quiz quiz);
    List<QuizResponse> to(List<Quiz> quiz);
}
