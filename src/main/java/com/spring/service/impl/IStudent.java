package com.spring.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.datajpa.StudentJpa;
import com.spring.exception.ResourceNotFoundException;
import com.spring.model.Student;


@Service
public class IStudent implements IStudentService {

	@Autowired
	StudentJpa studentJpa;

	@Override
	public Student addStudent(Student student) {
		
		return studentJpa.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		
		return studentJpa.findAll();
	}



	@Override
	public void deleteStudent(int id) {
		studentJpa.findById(id);
		studentJpa.deleteById(id);
		
	}

	@Override
	public Student updateStudent(Student student, int id) {
		
		
		Student existingStudent=studentJpa.findById(id).orElseThrow(() -> 
																		new ResourceNotFoundException("Student", "Id", id));
		
		existingStudent.setName(student.getName());
		existingStudent.setAddress(student.getAddress());
		existingStudent.setPincode(student.getPincode());
		
		studentJpa.save(existingStudent);
		
		
		return existingStudent;
		
	}

	@Override
	public Student getStudentById(int id) {
		return studentJpa.findById(id).orElseThrow(() -> 
												new ResourceNotFoundException("Employee", "Id", id));
	}


	


	
	
	

}
