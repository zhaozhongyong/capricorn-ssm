package com.zhaozhy.capricorn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhaozhy.capricorn.dao.UserDao;
import com.zhaozhy.capricorn.entity.User;
import com.zhaozhy.capricorn.service.UserService;
@Service(value="userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	public List<User> queryAllUsers() {
		return userDao.queryAll();
	}

	@Transactional
	public int inserUser(User user) {
		return this.userDao.insertUser(user.getUsername(),user.getPwd());
	}

	
}
