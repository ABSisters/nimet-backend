package absisters.nimet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import absisters.nimet.domain.Usuario;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {

    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    Usuario findByEmail(String email);
    List<Usuario> findAllByEmailValidoIsFalse();
    
	@Query ( "select u from Usuario u  where u.email = :email and u.senha= :senha" )
	public Usuario loginByEmail ( String email, String senha);

	@Query ( "select u from Usuario u where u.username = :username and u.senha= :senha" )
	public Usuario loginByUsername ( String username, String senha);
}
