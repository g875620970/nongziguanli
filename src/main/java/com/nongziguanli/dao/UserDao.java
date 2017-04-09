package com.nongziguanli.dao;

import org.mybatis.spring.annotation.MapperScan;

import com.nongziguanli.entity.User;

/**
 * 用户信息Dao
 * @author Administrator
 *
 */
@MapperScan
public interface UserDao {
	
	public User selectById(int userId);
	
}
