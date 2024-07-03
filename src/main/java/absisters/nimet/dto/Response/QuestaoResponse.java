package absisters.nimet.dto.Response;

import absisters.nimet.domain.Curso;
import absisters.nimet.domain.Nivel;
import absisters.nimet.domain.Opcao;

import java.util.List;

public record QuestaoResponse(
        String questaoId,
        Curso curso,
        Nivel nivel,
        String questao,
        List<Opcao> opcoes
) {}
