package com.zhaozhy.capricorn.service;

import java.util.List;

import com.zhaozhy.capricorn.entity.User;

public interface UserService {

	List<User> queryAllUsers();
	int inserUser(User user);
}
