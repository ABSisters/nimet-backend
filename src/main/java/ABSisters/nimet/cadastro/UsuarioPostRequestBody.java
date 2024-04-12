package ABSisters.nimet.cadastro;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.util.Date;

public record UsuarioPostRequestBody(
        @NotNull @Size(max = 100) String nome,
        @NotNull @Size(max = 100) String username,
        @NotNull @Size(max = 256) String email,
        @NotNull Date dataNascimento,
        //números(?=.*\d), letras(?=.*[a-zA-Z]), caracteres especiais(?=.*[#$@!%&*?]), espaço([^\s]), min e max de characteres{8,16}
        @NotNull @Pattern(regexp = "^(?=.*\\d)(?=.*[a-zA-Z])(?=.*[#$@!%&*?])([^\\s]){8,16}$") String senha,
        @NotNull Curso curso
) {}
