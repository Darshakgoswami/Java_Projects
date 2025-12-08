package com.example.school_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolService 
{
	@Autowired
	private SchoolRepository schoolRepository;
	public School addSchool(School school)
	{
		return schoolRepository.saveAndFlush(school);
	}
}