package absisters.nimet.dto.Response;

import java.time.LocalDate;
import java.time.LocalDateTime;

import absisters.nimet.domain.Curso;
import absisters.nimet.domain.TipoUsuario;

public record UsuarioResponse(
        String usuarioId,
        String nome,
        String username,
        String email,
        boolean emailValido,
        Curso curso,
        TipoUsuario tipoUsuario,
        LocalDateTime dataCriado) {}
