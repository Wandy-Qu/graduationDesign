package com.goo.uam.service;

import java.util.List;
import java.util.Map;
import com.goo.uam.entity.User;

public interface UserLoginService {

	public boolean login(User user) throws Exception;
	public boolean regist(User user);

	public List<User> searchUser(Map queryCondition) throws Exception;

	public int searchUserTotal(Map queryCondition);
	
}
