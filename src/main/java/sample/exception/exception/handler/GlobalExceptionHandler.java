package sample.exception.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import sample.exception.exception.ExceptionCode;
import sample.exception.exception.SampleException;
import sample.exception.exception.errorDto.SampleErrorResult;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = SampleException.class)
	public ResponseEntity<SampleErrorResult> runtimeException(SampleException e) {
		ExceptionCode code = e.getCode();

		SampleErrorResult result = SampleErrorResult.builder()
			.code(code.name())
			.message(code.getMessage())
			.build();
		return new ResponseEntity(result, code.getHttpStatus());
	}
}
