package absisters.nimet.repository;

import absisters.nimet.domain.EmailToken;
import absisters.nimet.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailTokenRepository extends JpaRepository<EmailToken, String> {
    boolean existsByUsuario(Usuario usuario);
    EmailToken findByToken(Integer token);
    EmailToken findByUsuario(Usuario usuario);
}
