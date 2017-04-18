package com.goo.uam.dao;

import java.util.List;
import java.util.Map;

import com.goo.uam.entity.User;

public interface UserLoginDao {
	public int userExist(User user);
	public boolean userInsert(User user);
	public List<User> searchUser(Map queryCondition);

	public int searchUserTotal(Map queryCondition);
}
