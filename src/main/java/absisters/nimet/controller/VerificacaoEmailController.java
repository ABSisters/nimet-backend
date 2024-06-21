package absisters.nimet.controller;

import absisters.nimet.dto.Request.VerificacaoEmailRequest;
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
    public ResponseEntity put(@RequestBody @Valid @NotNull VerificacaoEmailRequest token) {
        return verificacaoEmailService.validarEmail(token);
    }
}
