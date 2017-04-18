package com.goo.uam.action;

public class UserDto {
	private String loginName;
	private String emailAddress;
	private String password;
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
