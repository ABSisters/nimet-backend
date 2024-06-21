package absisters.nimet.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@ResponseStatus(HttpStatus.CONFLICT)
public class PerguntaFechada extends RuntimeException{
    private final String identificador;

    public PerguntaFechada(String identificador) {
        this.identificador = identificador;
    }
}
