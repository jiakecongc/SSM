package com.jiakecongc.Junit;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jiakecongc.mapper.UserMapper;
import com.jiakecongc.pojo.User;

public class Demo {

	ApplicationContext context = null;
	
	
	@Before
	public void init(){
		context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext_dao.xml");
	}
	
	
	@Test
	public void testSelectByPrimaryKey(){
		UserMapper userMapper = (UserMapper) context.getBean("userMapper");
		User user = userMapper.selectByPrimaryKey(1);
		System.out.println(user.getUsername());
	}
	
/*	@Test
	public void testSelectByPrimaryKey2(){
		
		UserMapper userMapper = (UserMapper) context.getBean("userMapper");
		User user = userMapper.selectByPrimaryKey(1);
		System.out.println(user.getUsername());
	}*/
}
