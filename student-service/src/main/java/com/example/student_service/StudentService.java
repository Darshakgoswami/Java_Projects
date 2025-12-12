package com.example.student_service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException; // <-- Ensure this is imported
import org.springframework.web.client.RestTemplate;

@Service
public class StudentService {

	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	// Consider using a dedicated logger instead of System.err.println for production code.
	// private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(StudentService.class);
	
	public ResponseEntity<?> createStudent(Student student) {
		try {
			return new ResponseEntity<Student>(studentRepository.saveAndFlush(student),HttpStatus.OK);
			} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<?> fetchStudentById(String id){
		Optional<Student> student = studentRepository.findById(id);
		
		if(student.isPresent()) {
            School school = null; // Initialize school object to null
            String schoolServiceUrl = "http://SCHOOL-SERVICE/schools/" + student.get().getSchoolId();

            // --- FIX: Wrap external service call in try-catch ---
            try {
                // The URL is likely incorrect (calling 8081, which is this service's port). 
                // Please verify the correct port for the School Microservice (e.g., 8082).
                // If it should be 8082, change the URL here:
                // String schoolServiceUrl = "http://localhost:8082/schools/" + student.get().getSchoolId();
                
                school = restTemplate.getForObject(schoolServiceUrl, School.class);
            } catch (HttpClientErrorException.NotFound e) {
                // Catch the specific 404 error from the external service.
                // The application will not crash, but the school details will be null.
                System.err.println("WARN: School (ID: " + student.get().getSchoolId() + 
                                   ") not found at: " + schoolServiceUrl + ". Proceeding without school details.");
                // Optionally log the stack trace: e.printStackTrace();
            } catch (Exception e) {
                // Catch connection issues (like Connection Refused if the service is down)
                System.err.println("ERROR: Connection failed to School Service at " + schoolServiceUrl + ": " + e.getMessage());
                // Optionally log the stack trace: e.printStackTrace();
            }
            // --- END FIX ---
            
            // Build the response with the student data and the school data (which may be null)
            StudentResponse studentResponse = new StudentResponse(
                student.get().getId(),
                student.get().getName(),
                student.get().getAge(),
                student.get().getGender(),
                school // This will be null if the external service call failed
            );
            
            return new ResponseEntity<StudentResponse>(studentResponse,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("Student not found",HttpStatus.NOT_FOUND);
		}
	}
}