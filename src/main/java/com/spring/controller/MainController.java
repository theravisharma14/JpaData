package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Student;
import com.spring.service.impl.IStudentService;

@RestController
@RequestMapping("/restapi")
public class MainController {
	
	@Autowired
	IStudentService istudentService;
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student)
	{
		return istudentService.addStudent(student);
	}
	
	
	@GetMapping("/getall")
	public List<Student> getAllStudent()
	{
		return istudentService.getAllStudent();
	}
	
	@GetMapping("{id}")
	public Student getStudentById(@PathVariable("id") int id)
	{
		return istudentService.getStudentById(id);
	}
	
	
	@PutMapping("{id}")
	public Student updateStudent(@RequestBody Student student,@PathVariable("id") int id)
	{
		return istudentService.updateStudent(student, id);
	}
	
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteByid(@PathVariable("id") int id)
	{
		istudentService.deleteStudent(id);
	
		return new ResponseEntity<String>("Student deleted successfully!.", HttpStatus.OK);		
	}
	
}
