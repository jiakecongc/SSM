package com.jiakecongc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jiakecongc.mapper.UserMapper;
import com.jiakecongc.pojo.User;
import com.jiakecongc.service.IUserService;
@Service
@Transactional
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper usermapper;//通过@autowired向spring容器注入UserMapers
	
	/**
	 * 通过用户名和密码来查询用户
	 */
	public User selectUserByUsernameAndPassword(User user) {

		User u = usermapper.selectUserByUsernameAndPassword(user);
		return u;
	}

	
	
}
