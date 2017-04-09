package com.nongziguanli.service;

import com.nongziguanli.entity.User;

/**
 * 用户service
 * @author Administrator
 *
 */
public interface UserService {

	public User selectUserById(int userId);
	
}
