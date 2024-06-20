package absisters.nimet.repository;

import absisters.nimet.domain.Curso;
import absisters.nimet.domain.Pergunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerguntaRepository extends JpaRepository<Pergunta, String> {
    Pergunta findByPerguntaId(String id);
    List<Pergunta> findByCurso(Curso curso);
}
