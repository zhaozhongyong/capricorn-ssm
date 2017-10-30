package com.zhaozhy.capricorn;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhaozhy.capricorn.dao.UserDao;
import com.zhaozhy.capricorn.entity.User;
import com.zhaozhy.capricorn.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class UserServiceTest {
	@Autowired
	private UserDao userDao;
	@Autowired
	private UserService userService;

	@Test
	public void testUserDao(){
		System.out.println("111");
		List<User> us=this.userDao.queryAll();
		for(User u:us){
			System.out.println(u);
		}
	}
}
