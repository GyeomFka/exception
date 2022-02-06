package sample.exception.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
public class SampleException extends RuntimeException {
	private final ExceptionType code;

	public SampleException(ExceptionType code) {
		this.code = code;
	}

	public SampleException(String message, ExceptionType code) {
		super(message);
		this.code = code;
	}

	public SampleException(String message, Throwable cause, ExceptionType code) {
		super(message, cause);
		this.code = code;
	}

	public SampleException(Throwable cause, ExceptionType code) {
		super(cause);
		this.code = code;
	}

	public SampleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace,
		ExceptionType code) {
		super(message, cause, enableSuppression, writableStackTrace);
		this.code = code;
	}

	public SampleException(ExceptionType code, String message) {
		super(message);
		this.code = code;
	}
}
