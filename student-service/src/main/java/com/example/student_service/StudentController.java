package com.example.student_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/student")
public class StudentController {
    
    @Autowired
    private StudentService studentService;

    // 1. POST Mapping: Naya Student banane ke liye
    @PostMapping
    public ResponseEntity<?> createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }
    
    // 2. GET Mapping (All Data): Saare students ko fetch karne ke liye (Fixes 405 error on /student)
    @GetMapping 
    public ResponseEntity<?> fetchAllStudents() { 
        return studentService.fetchAllStudents();
    }

    // 3. GET Mapping (By ID): ID se student fetch karne ke liye (Expects Long ID - Fixes 500 error on String ID)
    @GetMapping("/{id}")
    public ResponseEntity<?> fetchStudentById(@PathVariable Long id)
    {
        return studentService.fetchStudentById(id);
    }
}