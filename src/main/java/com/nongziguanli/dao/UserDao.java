package com.nongziguanli.dao;

import com.nongziguanli.entity.User;

/**
 * 用户信息Dao
 * @author Administrator
 *
 */
public interface UserDao {
	
	public User selectById(int userId);
	
}
