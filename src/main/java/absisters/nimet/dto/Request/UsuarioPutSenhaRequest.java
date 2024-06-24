package absisters.nimet.dto.Request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record UsuarioPutSenhaRequest(
        @NotNull String usuarioId,
        @NotNull String senhaAtual,
        //números(?=.*\d), letras minusculas(?=.*[a-z]), letras maiusculas(?=.*[A-Z]), caracteres especiais(?=.*[#$@!%&*?]), espaço([^\\s]), min e max de characteres{8,16}
        @NotNull @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[#$@!%&*?])([^\\s]){8,16}$") String senhaNova
) {}
