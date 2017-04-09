package com.nongziguanli.entity;

import java.io.Serializable;

/**
 * 用户信息
 * @author Administrator
 *
 */
public class User implements Serializable {

	private static final long serialVersionUID = 8575439727342386848L;
	/**
	 * 用户ID
	 */
	private Integer userId;
	/**
	 * 用户名称
	 */
	private String userName;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
