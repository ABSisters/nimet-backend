package ABSisters.nimet.cadastro;

import org.mapstruct.Mapper;

import util.Usuario;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    UsuarioResponse to(Usuario usuario);
}
