package com.basant.aop.advice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/throws-advice")
public class Controller {

	@GetMapping("/test/{age}")
	public String test(@PathVariable int age) throws IllegalAccessException {
		if (age > 18) {
			return "valid age";
		} else {
			throw new IllegalAccessException("Invalid Age");
		}
	}

}
