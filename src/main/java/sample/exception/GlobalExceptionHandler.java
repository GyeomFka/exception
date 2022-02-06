package sample.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import sample.exception.exception.ExceptionType;
import sample.exception.exception.SampleException;
import sample.exception.response.SampleErrorResult;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = SampleException.class)
	public ResponseEntity<SampleErrorResult> runtimeException(SampleException e) {

		ExceptionType code = e.getCode();

		SampleErrorResult result = SampleErrorResult.builder()
			.code(code.name())
			.message(code.getMessage())
			.build();

		return new ResponseEntity(result, code.getStatus());
	}
}
