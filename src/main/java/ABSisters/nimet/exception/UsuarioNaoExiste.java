package ABSisters.nimet.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UsuarioNaoExiste extends RuntimeException{
    private final String detalhes;
    private final String identificador;

    public UsuarioNaoExiste(String detalhes, String identificador) {
        this.detalhes = detalhes;
        this.identificador = identificador;
    }
}
