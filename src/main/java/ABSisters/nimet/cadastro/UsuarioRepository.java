package ABSisters.nimet.cadastro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import domain.Usuario;

import java.util.List;
import java.util.UUID;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {

    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    Usuario findByEmail(String email);
    List<Usuario> findAllByEmailValidoIsFalse();
    
	@Query ( "select i from Usuario where i.email = :email and i.senha= :senha" )
	public Usuario loginByEmail ( String email, String senha);

	@Query ( "select i from Usuario where i.username = :username and i.senha= :senha" )
	public Usuario loginByUsername ( String username, String senha);
}
