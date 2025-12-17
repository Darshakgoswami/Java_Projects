package com.example.student_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "SCHOOL-SERVICE")
public interface SchoolClient {
	 @GetMapping("/schools/{id}")
	 School getSchoolById(@PathVariable Long id);
}

