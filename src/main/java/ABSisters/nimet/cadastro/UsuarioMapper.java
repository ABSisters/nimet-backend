package ABSisters.nimet.cadastro;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    UsuarioResponse to(Usuario usuario);
}
