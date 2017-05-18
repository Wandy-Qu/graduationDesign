package com.goo.uam.action;

import com.goo.comtools.action.BaseAction;
import com.goo.uam.entity.User;
import com.goo.uam.service.UserLoginService;

import java.util.Date;

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
	
	public User getLoginUser(UserDto userDto) {
		User user = new User();
		user.setUserEmail(userDto.getUserEmail());
		user.setPassword(userDto.getPassword());
		return user;
	}
	public User getRegistUser(){
		User user = new User();
		user.setUserEmail(userDto.getUserEmail());
		user.setPassword(userDto.getPassword());
		user.setUserName(userDto.getUserName());
		user.setCreateTime(new Date());
		return user;
	}
	//login
	public String locLogin(){
		return "success";
	}
	public String login(){
		try {
			User user = userLoginServiceImpl.login(getLoginUser(userDto));
			if(user!=null){
				getSession().setAttribute("userInfo", user);
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
			if(userLoginServiceImpl.regist(getRegistUser())){
				return "success";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "error";
	}
}
