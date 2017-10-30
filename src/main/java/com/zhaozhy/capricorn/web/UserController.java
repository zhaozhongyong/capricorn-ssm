package com.zhaozhy.capricorn.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhaozhy.capricorn.entity.User;
import com.zhaozhy.capricorn.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/list")
	private String list(Model model){
		model.addAttribute("users",this.userService.queryAllUsers());
		return "list";
	}
	
	@RequestMapping(value="/add")
	private String addUser(){
		User user=new User();
		user.setUsername("zzz");
		user.setPwd("111");
		this.userService.inserUser(user);
		return "redirect:/user/list";
	}
}
