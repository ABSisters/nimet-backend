package absisters.nimet.repository;

import absisters.nimet.domain.Curso;
import absisters.nimet.domain.Nivel;
import absisters.nimet.domain.Questao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestaoRepository extends JpaRepository<Questao, String> {
    Questao findByCursoAndNivelAndQuestaoId(Curso curso, Nivel nivel, String questaoId);
}
