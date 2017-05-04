package com.goo.uam.entity;

import java.util.Date;

public class User {

	private int userId;
	private String userName;
	private String password;
	private String userEmail;
	private Date createTime;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getEmailAddress() {
		return userEmail;
	}
	public void setEmailAddress(String emailAddress) {
		this.userEmail = emailAddress;
	}
	public String getLoginName() {
		return userName;
	}
	public void setLoginName(String loginName) {
		this.userName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
