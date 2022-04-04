package com.spring.service.impl;

import java.util.List;
import com.spring.model.Student;

public interface IStudentService {
	


	Student addStudent(Student student);
	
	List<Student> getAllStudent();
	Student getStudentById(int id);
	Student updateStudent(Student student, int id);
	void deleteStudent(int id);
	

	

}
