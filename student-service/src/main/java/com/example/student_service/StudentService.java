package com.example.student_service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class StudentService {

    private static final Logger logger = LoggerFactory.getLogger(StudentService.class);

    @Autowired
    private StudentRepository studentRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    
    public ResponseEntity<?> createStudent(Student student) {
        try {
            return new ResponseEntity<Student>(studentRepository.saveAndFlush(student), HttpStatus.CREATED);
        } catch (Exception e) {
            logger.error("Error creating student: {}", e.getMessage(), e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    public ResponseEntity<?> fetchStudentById(Long id){ 
        Optional<Student> student = studentRepository.findById(id);
        
        if(student.isPresent()) {
            School school = null;
            String schoolServiceUrl = "http://SCHOOL-SERVICE/schools/" + student.get().getSchoolId();

            try {
                school = restTemplate.getForObject(schoolServiceUrl, School.class);
                logger.info("Successfully fetched School ID {} from {}", student.get().getSchoolId(), schoolServiceUrl);
            } catch (HttpClientErrorException.NotFound e) {
                logger.warn("School (ID: {}) not found at: {}. Proceeding without school details.", 
                            student.get().getSchoolId(), schoolServiceUrl);
            } catch (Exception e) {
                logger.error("ERROR: Connection failed to School Service at {}: {}", schoolServiceUrl, e.getMessage());
            }
            
            StudentResponse studentResponse = new StudentResponse(
                student.get().getId(),
                student.get().getName(),
                student.get().getAge(),
                student.get().getGender(),
                school
            );
            
            return new ResponseEntity<StudentResponse>(studentResponse, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>("Student not found", HttpStatus.NOT_FOUND);
        }
    } // <--- FIX: Missing closing brace yahan add kiya gaya hai
    
    
    public ResponseEntity<?> fetchAllStudents() {
        try
        {
        	return new ResponseEntity<>(studentRepository.findAll(), HttpStatus.OK); 
        }
        catch(Exception e)
        {
        	return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    public ResponseEntity<?> deleteStudentById(Long id){
		if (studentRepository.existsById(id)) {
			studentRepository.deleteById(id);
			return new ResponseEntity<>("Student deleted Successfully",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("Student not found",HttpStatus.NOT_FOUND);
		}
    }
		public Student updateStudent(Long id, Student updatedStudentData) 
		{
	        Optional<Student> existingStudentOptional = studentRepository.findById(id);
	        if (existingStudentOptional.isPresent()) 
	        {
	            Student existingStudent = existingStudentOptional.get();
	            existingStudent.setName(updatedStudentData.getName());
	            existingStudent.setAge(updatedStudentData.getAge());
	            existingStudent.setGender(updatedStudentData.getGender());
	            existingStudent.setSchoolId(updatedStudentData.getSchoolId());
	            return studentRepository.save(existingStudent);
	        } 
	        else 
	        {
	            throw new RuntimeException("Student not found with ID: " + id);
	        }
		}
}