package ABSisters.nimet.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@ResponseStatus(HttpStatus.CONFLICT)
public class EmailJaValidado extends RuntimeException{
    private final String identificador;

    public EmailJaValidado(String identificador) {
        this.identificador = identificador;
    }
}
