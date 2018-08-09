package com.jiakecongc.service;

import com.jiakecongc.pojo.User;

public interface IUserService {

	User selectUserByUsernameAndPassword(User user);

}
