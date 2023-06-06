package epicode.JAVASPRINGWEEK6DAY2;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import epicode.JAVASPRINGWEEK6DAY2.exception.ErrorPayload;
import epicode.JAVASPRINGWEEK6DAY2.exception.NotFoundException;

@RestControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(NotFoundException.class)
	public ResponseEntity<ErrorPayload> handleNotFound(NotFoundException e) {
		ErrorPayload payload = new ErrorPayload(e.getMessage(), new Date(), 404);
		return new ResponseEntity<ErrorPayload>(payload, HttpStatus.NOT_FOUND);
	}

	@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorPayload> handleGenericErrors(Exception e) {
		System.out.println(e);
		ErrorPayload payload = new ErrorPayload("GENERIC SERVER ERROR! WE GONNA FIX IT ASAP!", new Date(), 500);
		return new ResponseEntity<ErrorPayload>(payload, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
