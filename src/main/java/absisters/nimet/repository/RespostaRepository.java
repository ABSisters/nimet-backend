package absisters.nimet.repository;

import absisters.nimet.domain.Pergunta;
import absisters.nimet.domain.Resposta;
import absisters.nimet.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RespostaRepository extends JpaRepository<Resposta, String> {
    List<Resposta> findAllByPergunta(Pergunta pergunta);
    List<Resposta> findAllByUsuario(Usuario usuario);
}
