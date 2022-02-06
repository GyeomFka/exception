package sample.exception.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ExceptionType {
	CUSTOM_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "in enum class message");

	private final HttpStatus status;
	private final String message;
}
