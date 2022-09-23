package com.gl.studentDebate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.studentDebate.entity.Student;
import com.gl.studentDebate.service.StudentDebateService;

@Controller
@RequestMapping("/students")
public class StudentDebateController {

	@Autowired
	private StudentDebateService studentService;

	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		 
		List<Student> theStudents = studentService.findAll();

		 
		theModel.addAttribute("Students", theStudents);

		return "list-Students";
	}

	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		Student theStudent = new Student();

		theModel.addAttribute("Student", theStudent);

		return "Student-form";
	}

	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("studentId") int theId, Model theModel) {

		 
		Student objectStudent = studentService.findById(theId);

		 
		theModel.addAttribute("Student", objectStudent);

		return "Student-form";
	}

	@PostMapping("/save")
	public String saveCustomer(@RequestParam("id") int id, @RequestParam("student_name") String studentName,
	@RequestParam("student_department") String studentDepartment, @RequestParam("country") String country) {

		System.out.println(id + "Student Name" + studentName +"Student Department" + studentDepartment);
	
		Student objectStudent;
		if (id != 0) {
			objectStudent = studentService.findById(id);
			objectStudent.setStudentName(studentName);
			objectStudent.setStudentDepartment(studentDepartment);
			objectStudent.setCountry(country);
		} else {
			objectStudent = new Student(studentName, studentDepartment, country);
		}
		 
		studentService.save(objectStudent);

		 
		return "redirect:/students/list";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam("studentId") int theId) {
		 
		studentService.deleteById(theId);

		 

		return "redirect:/students/list";
		 
	}
}
