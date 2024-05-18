package absisters.nimet.dto;

import absisters.nimet.domain.Curso;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record UsuarioPutRequest(
        @NotNull @Size(max = 100) String nome,
        @NotNull @Size(max = 20) String username,
        @NotNull @Size(max = 256) String email,
        @NotNull LocalDate dataNascimento,
        //números(?=.*\d), letras minusculas(?=.*[a-z]), letras maiusculas(?=.*[A-Z]), caracteres especiais(?=.*[#$@!%&*?]), espaço([^\\s]), min e max de characteres{8,16}
        @NotNull @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[#$@!%&*?])([^\\s]){8,16}$") String senha,
        @NotNull Curso curso
) {}
