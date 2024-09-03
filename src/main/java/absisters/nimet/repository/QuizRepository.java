package absisters.nimet.repository;

import absisters.nimet.domain.Quiz;
import absisters.nimet.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, String> {
    List<Quiz> findAllByUsuario(Usuario usuario);
}
