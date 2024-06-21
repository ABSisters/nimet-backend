package absisters.nimet.dto.Mapper;

import absisters.nimet.dto.Response.UsuarioResponse;
import org.mapstruct.Mapper;

import absisters.nimet.domain.Usuario;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    UsuarioResponse to(Usuario usuario);
}
