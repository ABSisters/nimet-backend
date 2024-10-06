package absisters.nimet.controller;

import absisters.nimet.dto.Request.RemandarEmailRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import absisters.nimet.service.VerificacaoEmailService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/email/verificacao")
@AllArgsConstructor
public class VerificacaoEmailController {
    @Autowired
    VerificacaoEmailService verificacaoEmailService;

    @PutMapping
    public ResponseEntity put(@RequestParam @NotNull String token) {
        return verificacaoEmailService.validarEmail(Integer.parseInt(token));
    }

    @PutMapping("/token")
    public ResponseEntity remandarToken(@RequestBody @Valid @NotNull RemandarEmailRequest token) {
        return verificacaoEmailService.remandarEmail(token);
    }
}
