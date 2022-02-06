package sample.exception.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ExceptionType {

	CUSTOM_ERROR(HttpStatus.NOT_IMPLEMENTED, "in enum class message");

	private final HttpStatus httpStatus;
	private final String message;
}
