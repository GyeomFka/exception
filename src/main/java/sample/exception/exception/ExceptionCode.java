package sample.exception.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ExceptionCode {
	INTERNAL_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "서버 에러 입니다.");

	private final HttpStatus httpStatus;
	private final String message;

}
