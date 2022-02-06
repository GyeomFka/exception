package sample.exception.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import sample.exception.exception.ExceptionCode;
import sample.exception.exception.SampleException;

@RestController
public class SampleController {

	@GetMapping("/ping")
	public String ping() {
		return "pong";
	}

	@GetMapping("/exception")
	public void error() {
		// throw new SampleException(" ::: call exception in controller ?:: ", "ERROR1");
		throw new SampleException(ExceptionCode.INTERNAL_ERROR);
	}
}
