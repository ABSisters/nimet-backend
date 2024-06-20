package absisters.nimet.repository;

import absisters.nimet.domain.EmailToken;
import absisters.nimet.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface EmailTokenRepository extends JpaRepository<EmailToken, String> {
    EmailToken findByToken(Integer token);
    EmailToken findByUsuario(Usuario usuario);
    List<EmailToken> findAllByDataExpiradoIsBefore(LocalDateTime localDateTime);
}
