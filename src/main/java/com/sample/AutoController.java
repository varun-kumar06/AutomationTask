package com.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoController {
	
	@GetMapping(value="/getAuto")
	public String getAuto() {
		return "Hello Automation";
	}

}
