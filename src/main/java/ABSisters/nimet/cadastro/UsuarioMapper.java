package ABSisters.nimet.cadastro;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    UsuarioDTO to(Usuario usuario);
}
