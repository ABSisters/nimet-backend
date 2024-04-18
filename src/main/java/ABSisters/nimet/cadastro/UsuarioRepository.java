package ABSisters.nimet.cadastro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {

    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    Usuario findByEmail(String email);
    List<Usuario> findAllByEmailValidoIsFalse();
}
