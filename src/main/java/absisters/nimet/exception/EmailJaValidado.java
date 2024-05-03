package absisters.nimet.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Getter;

@SuppressWarnings("serial")
@Getter
@ResponseStatus(HttpStatus.CONFLICT)
public class EmailJaValidado extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private final String identificador;

    public EmailJaValidado(String identificador) {
        this.identificador = identificador;
    }

	public String getIdentificador() {
		return identificador;
	}
}
