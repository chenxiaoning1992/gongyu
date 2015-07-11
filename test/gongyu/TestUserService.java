package gongyu;

import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.User;
import service.UserService;

public class TestUserService {
	public static  UserService us;
	@BeforeClass
	public static void init() throws SQLException{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		us = (UserService) applicationContext.getBean("userService");
	}
	@Test
	public void insertUser(){
		User user = new User();
		user.setName("xiaoning");
		user.setPassWord("123");
		us.saveEntity(user);
	}
}
