package com.nongziguanli.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nongziguanli.dao.UserDao;
import com.nongziguanli.entity.User;
import com.nongziguanli.service.UserService;

/**
 * 用户serviceImpl
 * @author Administrator
 *
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	@Override
	public User selectUserById(int userId) {
		return userDao.selectById(userId);
	}

}
