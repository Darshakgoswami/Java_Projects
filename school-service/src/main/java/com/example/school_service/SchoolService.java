package com.example.school_service;

import java.util.List;
import java.util.Optional;

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
	public List<School> fetchSchools()
	{
		return schoolRepository.findAll();
	}
	public School fetchSchoolById(int id)
	{
		return schoolRepository.findById(id).orElse(null);
	}
	public void deleteSchoolById(Integer id) 
	{
		schoolRepository.deleteById(id);
	}
	public School updateSchool(Integer id, School updatedSchoolData) 
	{
		Optional<School> existingSchoolOptional = schoolRepository.findById(id);
        if (existingSchoolOptional.isPresent()) 
        {
            School existingSchool = existingSchoolOptional.get();
            existingSchool.setSchoolName(updatedSchoolData.getSchoolName());
            existingSchool.setPrincipalName(updatedSchoolData.getPrincipalName());
            existingSchool.setLocation(updatedSchoolData.getLocation());
            return schoolRepository.save(existingSchool);
        } 
        else 
        {
            throw new RuntimeException("School not found with ID: " + id); 
        }
    }
}