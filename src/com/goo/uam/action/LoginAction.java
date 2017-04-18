package com.goo.uam.action;

import com.goo.comtools.action.BaseAction;
import com.goo.uam.entity.User;
import com.goo.uam.service.UserLoginService;

public class LoginAction extends BaseAction{
	
	private UserDto userDto;
	private UserLoginService userLoginServiceImpl;
	
	public UserDto getUserDto() {
		return userDto;
	}
	public UserLoginService getUserLoginServiceImpl() {
		return userLoginServiceImpl;
	}
	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}
	public void setUserLoginServiceImpl(UserLoginService userLoginServiceImpl) {
		this.userLoginServiceImpl = userLoginServiceImpl;
	}
	
	public User getloginUser(UserDto userDto) {	
		return new User(userDto.getEmailAddress(),userDto.getPassword());
	}
	public User getregistUser(){
		return new User(userDto.getEmailAddress(),userDto.getPassword(),userDto.getLoginName());
	}
	//login
	public String locLogin(){
		return "success";
	}
	public String login(){
		try {
			if(userLoginServiceImpl.login(getloginUser(userDto))){
				return "success";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "error";
	}
	//register
	public String locRegist(){
		return "success";
	}
	public String regist(){
		try {
			if(userLoginServiceImpl.regist(getregistUser())){
				return "success";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "error";
	}
}
