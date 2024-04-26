package exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@ResponseStatus(HttpStatus.CONFLICT)
public class EmailExpirado extends RuntimeException{
    private final String identificador;

    public EmailExpirado(String identificador) {
        this.identificador = identificador;
    }
}
