package com.zhaozhy.capricorn;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhaozhy.capricorn.dao.StudentDao;
import com.zhaozhy.capricorn.entity.Student;
import com.zhaozhy.capricorn.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class StudentServiceTest {
	@Autowired
	private StudentDao userDao;
	@Autowired
	private StudentService userService;

	@Test
	public void testStudentDao(){
		System.out.println("111");
		List<Student> us=this.userDao.queryAll();
		for(Student u:us){
			System.out.println(u);
		}
	}
}
