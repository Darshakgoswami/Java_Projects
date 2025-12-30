package com.example.java_spring_jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	@GetMapping("/")
	public String hello()
	{
		return "Hello from AWS EC2 Java App !";
	}
	
	@GetMapping("/health")
	public String health()
	{
		return "Application is running fine !";
	}
}