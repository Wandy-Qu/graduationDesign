package com.goo.uam.service.impl;

import java.util.List;
import java.util.Map;

import com.goo.uam.dao.UserLoginDao;
import com.goo.uam.entity.User;
import com.goo.uam.service.UserLoginService;

public class UserLoginServiceImpl implements UserLoginService{

	private UserLoginDao userLoginDaoImpl;
	
	public UserLoginDao getUserLoginDaoImpl() {
		return userLoginDaoImpl;  
	}

	public void setUserLoginDaoImpl(UserLoginDao userLoginDaoImpl) {
		this.userLoginDaoImpl = userLoginDaoImpl;
	}

	public User login(User user) throws Exception {
		User loginUser= userLoginDaoImpl.userExist(user);
		return loginUser;
	}
	
	public boolean regist(User user) {
		boolean registSuccess = userLoginDaoImpl.userInsert(user);
		return registSuccess;
	}
	
	public List<User> searchUser(Map queryCondition) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public int searchUserTotal(Map queryCondition) {
		// TODO Auto-generated method stub
		return 0;
	}

}
