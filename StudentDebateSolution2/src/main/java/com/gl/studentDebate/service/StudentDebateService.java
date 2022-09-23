package com.gl.studentDebate.service;

import java.util.List;

import com.gl.studentDebate.entity.Student;

public interface StudentDebateService {
	public List<Student> findAll();

	public void save(Student objectStudent);
	
	public Student findById(int theId);

	public void deleteById(int theId);
}