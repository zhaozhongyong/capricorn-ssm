package com.zhaozhy.capricorn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhaozhy.capricorn.entity.User;

public interface UserDao {

	List<User> queryAll();
	int insertUser(@Param("username") String username,@Param("pwd") String pwd);
}
