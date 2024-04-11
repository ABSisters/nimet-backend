package ABSisters.nimet.cadastro;

import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record UsuarioPostRequestBody(
        @NotNull String nome,
        @NotNull String username,
        @NotNull String email,
        @NotNull Date dataNascimento,
        @NotNull String senha,
        @NotNull Curso curso
) {}
