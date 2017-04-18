package com.goo.uam.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.goo.uam.dao.UserLoginDao;
import com.goo.uam.entity.User;

public class UserLoginDaoImpl extends SqlMapClientDaoSupport implements UserLoginDao {

	public int userExist(User user) {
		List list = this.getSqlMapClientTemplate().queryForList(
				"sql.uam.selectOneUser", user);
		if (list != null && list.size() > 0)
			return Integer.parseInt(list.get(0).toString());
		else
			return 0;
	}
	public boolean userInsert(User user){
		this.getSqlMapClientTemplate().insert("sql.uam.checkUser", user);
		return true;
	}
	public List<User> searchUser(Map queryCondition) {
		return null;
	}
	public int searchUserTotal(Map queryCondition) {
		return 0;
	}

}
