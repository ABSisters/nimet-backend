package ABSisters.nimet.email.verificacao;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/email/verificacao/{emailUsuario}")
@AllArgsConstructor
public class VerificacaoEmailController {
    private final VerificacaoEmailService verificacaoEmailService;

    @PutMapping
    public ResponseEntity patch(@PathVariable String emailUsuario) {
        return verificacaoEmailService.validarEmail(emailUsuario);
    }
}
