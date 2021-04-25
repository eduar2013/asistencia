package com.decj.asistencia.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicAuthenticationController {
	
	@GetMapping(path = "/basicauth")
	public AuthenticationBean basicAuth() {
		return new AuthenticationBean("You are authenticated");
	}
}
