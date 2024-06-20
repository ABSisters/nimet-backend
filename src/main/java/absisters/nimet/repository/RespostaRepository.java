package absisters.nimet.repository;

import absisters.nimet.domain.Pergunta;
import absisters.nimet.domain.Resposta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RespostaRepository extends JpaRepository<Resposta, String> {
    List<Resposta> findByPergunta(Pergunta pergunta);
}
