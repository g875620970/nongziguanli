package com.nongziguanli.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.nongziguanli.dao.UserDao;
import com.nongziguanli.entity.User;

@RestController
public class test {

	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/test")
	public void test(){
		User user = userDao.selectById(1);
		System.out.println(JSONObject.toJSON(user));
	}
	
}
