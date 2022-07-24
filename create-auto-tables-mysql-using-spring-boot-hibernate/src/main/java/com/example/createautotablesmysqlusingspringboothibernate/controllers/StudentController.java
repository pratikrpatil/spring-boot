package com.example.createautotablesmysqlusingspringboothibernate.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.createautotablesmysqlusingspringboothibernate.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	private StudentService studentService;
	
	@GetMapping("/getAllStudents")
	public String getAllStudents()
	{
		
		return "all Students details";
	}

}
