package com.example.SpringSocial_Auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String hello() {
		return "Unlogged: Open-source tool for Java ";
	}
	
	@GetMapping("/homepage")
	public String Hi() {
		return "Hello User";
	}
}