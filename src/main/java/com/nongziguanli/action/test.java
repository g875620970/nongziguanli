package com.nongziguanli.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.nongziguanli.entity.User;
import com.nongziguanli.service.UserService;

@RestController
public class test {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/selectUserById")
	public User selectUserById(){
		User user = userService.selectUserById(1);
		System.out.println(JSONObject.toJSON(user));
		return user;
	}
	
}
