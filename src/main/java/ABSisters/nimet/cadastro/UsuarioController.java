package ABSisters.nimet.cadastro;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/usuarios")
@AllArgsConstructor
public class UsuarioController {
    private final UsuarioService usuarioService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public UsuarioResponse post(@RequestBody @Valid @NotNull UsuarioPostRequest usuario) {
        return usuarioService.create(usuario);
    }
}
