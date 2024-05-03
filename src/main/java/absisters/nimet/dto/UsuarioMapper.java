package absisters.nimet.dto;

import org.mapstruct.Mapper;

import absisters.nimet.domain.Usuario;


@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    UsuarioResponse to(Usuario usuario);
}
