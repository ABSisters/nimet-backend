package absisters.nimet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import absisters.nimet.service.VerificacaoEmailService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/email/verificacao/{emailUsuario}")
@AllArgsConstructor
public class VerificacaoEmailController {
    @Autowired VerificacaoEmailService verificacaoEmailService;

    @PutMapping
    public ResponseEntity patch(@PathVariable String emailUsuario) {
        return verificacaoEmailService.validarEmail(emailUsuario);
    }
}
