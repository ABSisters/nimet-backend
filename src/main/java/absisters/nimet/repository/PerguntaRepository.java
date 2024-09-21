package absisters.nimet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import absisters.nimet.domain.Curso;
import absisters.nimet.domain.Pergunta;
import absisters.nimet.domain.Tags;
import absisters.nimet.domain.Usuario;

@Repository
public interface PerguntaRepository extends JpaRepository<Pergunta, String> {
    Pergunta findByPerguntaId(String id);
    List<Pergunta> findAllByCurso(Curso curso);
    List<Pergunta> findAllByUsuario(Usuario usuario);
    ///List<Pergunta> findByTagOrderByCreatedAtDesc(String tag);
    List<Pergunta> findAllByTags(Tags tag);
}