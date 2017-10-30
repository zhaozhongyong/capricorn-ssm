package com.zhaozhy.capricorn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhaozhy.capricorn.dao.StudentDao;
import com.zhaozhy.capricorn.entity.Student;
import com.zhaozhy.capricorn.service.StudentService;
@Service(value="studentService")
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao userDao;
	
	public List<Student> queryAllUsers() {
		return userDao.queryAll();
	}

	@Transactional
	public int inserUser(Student user) {
		return this.userDao.insertUser(user.getStuName(),user.getStuAge());
	}

	
}
