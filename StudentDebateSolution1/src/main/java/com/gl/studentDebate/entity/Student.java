package com.gl.studentDebate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "student_name")
	private String studentName;

	@Column(name = "student_department")
	private String studentDepartment;

	@Column(name = "country")
	private String country;

	public Student() {

	}

	public Student(String studentName, String studentDepartment, String country) {

		this.studentName = studentName;
		this.studentDepartment = studentDepartment;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentDepartment() {
		return studentDepartment;
	}

	public void setStudentDepartment(String studentDepartment) {
		this.studentDepartment = studentDepartment;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Student id = " + id + ", StudentName= " + studentName + ", studentDepartment = " + studentDepartment + ", country = " + country ;
	}

}