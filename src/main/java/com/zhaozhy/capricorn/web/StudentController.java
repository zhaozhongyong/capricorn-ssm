package com.zhaozhy.capricorn.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhaozhy.capricorn.entity.Student;
import com.zhaozhy.capricorn.service.StudentService;

@Controller
@RequestMapping("/user")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/list")
	private String list(Model model){
		model.addAttribute("students",this.studentService.queryAllUsers());
		return "list";
	}
	
	@RequestMapping(value="/add")
	private String addUser(){
		Student user=new Student();
		user.setStuName("zzz");
		user.setStuAge(23);
		this.studentService.inserUser(user);
		return "redirect:/user/list";
	}
}
