package ABSisters.nimet.cadastro;

import java.util.Date;
import java.util.UUID;

public record UsuarioDTO (
        UUID usuarioId,
        String nome,
        String username,
        String email,
        Date dataNascimento,
        Curso curso,
        TipoUsuario tipoUsuario) {}
