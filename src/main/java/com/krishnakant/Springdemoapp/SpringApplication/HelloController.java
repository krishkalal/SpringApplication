
package com.krishnakant.Springdemoapp.SpringApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping(path="/")
	public String hello() {
		return "Hello";
	}

}
