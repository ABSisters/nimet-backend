package ABSisters.nimet.cadastro;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record UsuarioResponse(
        String usuarioId,
        String nome,
        String username,
        String email,
        boolean emailValido,
        LocalDate dataNascimento,
        Curso curso,
        TipoUsuario tipoUsuario,
        LocalDateTime dataCriado) {}
