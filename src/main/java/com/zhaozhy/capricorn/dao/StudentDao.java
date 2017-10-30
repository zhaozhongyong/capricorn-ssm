package com.zhaozhy.capricorn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhaozhy.capricorn.entity.Student;

public interface StudentDao {

	List<Student> queryAll();
	int insertUser(@Param("stuName") String stuName,@Param("stuAge") Integer stuAge);
}
