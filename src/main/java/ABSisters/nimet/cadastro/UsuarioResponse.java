package ABSisters.nimet.cadastro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public record UsuarioResponse(
        UUID usuarioId,
        String nome,
        String username,
        String email,
        boolean emailValido,
        LocalDate dataNascimento,
        Curso curso,
        TipoUsuario tipoUsuario,
        LocalDateTime dataCriado) {}
