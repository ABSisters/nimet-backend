package exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ObjetoNaoExiste extends RuntimeException{
    private final String objeto;
    private final String detalhes;
    private final String identificador;

    public ObjetoNaoExiste(String objeto, String detalhes, String identificador) {
        this.objeto = objeto;
        this.detalhes = detalhes;
        this.identificador = identificador;
    }
}
