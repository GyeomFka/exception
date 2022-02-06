package sample.exception.exception;

import lombok.Getter;

@Getter
public class SampleException extends RuntimeException {
	private final ExceptionCode code;

	public SampleException(ExceptionCode code) {
		this.code = code;
	}

	public SampleException(String message, ExceptionCode code) {
		super(message);
		this.code = code;
	}

	public SampleException(String message, Throwable cause, ExceptionCode code) {
		super(message, cause);
		this.code = code;
	}

	public SampleException(Throwable cause, ExceptionCode code) {
		super(cause);
		this.code = code;
	}

	public SampleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace,
		ExceptionCode code) {
		super(message, cause, enableSuppression, writableStackTrace);
		this.code = code;
	}
}
