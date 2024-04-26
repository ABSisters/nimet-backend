package exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@ResponseStatus(HttpStatus.CONFLICT)
public class ObjetoJaExiste extends RuntimeException{
    private final String objeto;
    private final String detalhes;
    private final String identificador;

    public ObjetoJaExiste(String objeto, String detalhes, String identificador) {
        this.objeto = objeto;
        this.detalhes = detalhes;
        this.identificador = identificador;
    }
}
