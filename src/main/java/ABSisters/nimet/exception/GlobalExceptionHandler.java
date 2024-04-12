package ABSisters.nimet.exception;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.HandlerMethodValidationException;

@ControllerAdvice
@Log4j2
@RequiredArgsConstructor
public class GlobalExceptionHandler {
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ProblemDetail> erroEnum(HttpMessageNotReadableException ex) {
        HttpStatus status = HttpStatus.BAD_REQUEST;
        String title = ex.getLocalizedMessage() + ". Exception " + ex.getClass();;
        String detail = "Não é um dos valores aceitos para a classe Enum";

        ProblemDetail problem = ProblemDetail.forStatus(status);
        problem.setTitle(title);
        problem.setDetail(detail);

        log.warn(status + " " + detail);
        return new ResponseEntity<>(problem, status);
    }

    @ExceptionHandler(HandlerMethodValidationException.class)
    public ResponseEntity<ProblemDetail> validacaoAtributos(HandlerMethodValidationException ex) {
        HttpStatus status = HttpStatus.BAD_REQUEST;
        String title = ex.getReason() + ". Exception " + ex.getClass();
        String detail = "Atributo não cumpre com todos os requisitos de validação";

        ProblemDetail problem = ProblemDetail.forStatus(status);
        problem.setTitle(title);
        problem.setDetail(detail);

        log.warn(status + " " + detail);
        return new ResponseEntity<>(problem, status);
    }

    @ExceptionHandler(UsuarioJaExiste.class)
    public ResponseEntity<ProblemDetail> usuarioExiste(UsuarioJaExiste ex) {
        HttpStatus status = HttpStatus.CONFLICT;
        String title = "User already exists. Exception: " + ex.getClass();
        String detail = "Usuario com %s %s já existe".formatted(ex.getDetalhes(), ex.getIdentificador());

        ProblemDetail problem = ProblemDetail.forStatus(status);
        problem.setTitle(title);
        problem.setDetail(detail);

        log.warn(status + " " + detail);
        return new ResponseEntity<>(problem, status);
    }
}
