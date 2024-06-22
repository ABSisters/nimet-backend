package absisters.nimet.dto.Request;

import absisters.nimet.domain.Curso;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record UsuarioPutRequest(
        @NotNull String usuarioId,
        @NotNull @Size(max = 100) String nome,
        @NotNull @Size(max = 20) String username,
        @NotNull @Size(max = 256) String email,
        @NotNull LocalDate dataNascimento,
        @NotNull Curso curso
) {}
