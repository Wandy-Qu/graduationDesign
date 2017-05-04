package com.goo.uam.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.goo.uam.dao.UserLoginDao;
import com.goo.uam.entity.User;

public class UserLoginDaoImpl extends SqlMapClientDaoSupport implements UserLoginDao {

	private static final String SQL_UAM_SELECT_ONE_USER = "sql.uam.selectOneUser";
	private static final String SQL_UAM_CHECK_USER = "sql.uam.checkUser";

	public User userExist(User user) {
		User userDto = (User)this.getSqlMapClientTemplate().queryForObject(
				SQL_UAM_SELECT_ONE_USER, user);
		return  userDto;
	}
	public boolean userInsert(User user){
		this.getSqlMapClientTemplate().insert(SQL_UAM_CHECK_USER, user);
		return true;
	}
	public List<User> searchUser(Map queryCondition) {
		return null;
	}
	public int searchUserTotal(Map queryCondition) {
		return 0;
	}

}
