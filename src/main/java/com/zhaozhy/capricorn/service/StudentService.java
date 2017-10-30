package com.zhaozhy.capricorn.service;

import java.util.List;

import com.zhaozhy.capricorn.entity.Student;

public interface StudentService {

	List<Student> queryAllUsers();
	int inserUser(Student user);
}
