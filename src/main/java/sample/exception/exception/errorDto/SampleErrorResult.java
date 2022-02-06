package sample.exception.exception.errorDto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class SampleErrorResult {
	private String code;
	private String message;
}
