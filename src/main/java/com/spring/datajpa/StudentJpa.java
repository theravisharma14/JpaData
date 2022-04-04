package com.spring.datajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.Student;

public interface StudentJpa extends JpaRepository<Student, Integer> {

}
