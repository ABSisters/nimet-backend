package absisters.nimet.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@ResponseStatus(HttpStatus.CONFLICT)
public class EmailTokenExpirado extends RuntimeException{
    private final String identificador;

    public EmailTokenExpirado(String identificador) {
        this.identificador = identificador;
    }
}
