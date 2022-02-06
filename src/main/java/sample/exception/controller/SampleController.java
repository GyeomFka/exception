package sample.exception.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import sample.exception.exception.ExceptionType;
import sample.exception.exception.SampleException;

@RestController
public class SampleController {

	@GetMapping("/ping")
	public String ping() {
		return "pong";
	}

	@GetMapping("/exception")
	public String exception() {
		// throw new RuntimeException(" ::: exception in controller :: ");
		//throw new SampleException(" ::: exception in controller :: ", "ERROR_CODE in controller");
		throw new SampleException(ExceptionType.CUSTOM_ERROR);
	}

}
