package com.microservice.demo.cloudGateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {
	
	@RequestMapping("/userServiceFallback")
	public String userServiceFallbackMethod() {
		
		return "User service is talking longer than expected.";
	}
	
	@RequestMapping("/attemptsServiceFallback")
	public String attempsServiceFallbackMethod() {
		
		return "Attemps service is talking longer than expected.";
	}

}
