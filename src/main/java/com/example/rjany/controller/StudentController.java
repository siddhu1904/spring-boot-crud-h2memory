package com.example.rjany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rjany.model.Student;
import com.example.rjany.service.StudentService;

import jakarta.validation.Valid;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/student")
	public Student saveStudent(@RequestBody @Valid Student student) {
		return studentService.saveStudent(student);
	}


	@GetMapping("/student/admin/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public Student getStudent(@PathVariable("id") Long id) {
		return studentService.getStudentById(id);
	}
	
	@GetMapping("/student/user")
//	@PreAuthorize("hasRole('USER')")  // Use hasRole for role-based access control
	public List<Student> getAllStudent(){
	 	return studentService.getAllStudent();
	}
	
	@PutMapping("/student/admin/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public Student updateStudent(@PathVariable("id") Long id, @RequestBody Student student) {
		return studentService.updateStudent(id, student);
	}
	
	@DeleteMapping("/student/user/{id}")
	public String deleteStudent(@PathVariable("id") Long id) {
		return studentService.deleteStudent(id);
	}

}
