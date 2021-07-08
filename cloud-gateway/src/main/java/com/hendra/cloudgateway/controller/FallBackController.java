package com.hendra.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackMethod() {
		return "Error User";
	}
	
	@GetMapping("/departmentsServiceFallBack")
	public String departmentsServiceFallBackMethod() {
		return "Error Department";
	}
}
