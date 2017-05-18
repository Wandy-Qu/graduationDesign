package com.goo.order.dao.impl;

import com.goo.order.dao.OrderManageDao;
import com.goo.order.entity.Order;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.util.List;

public class OrderManageDaoImpl extends SqlMapClientDaoSupport implements OrderManageDao {
    private static final String SQL_CART_MANAGEMENT_CREATE_ORDER = "sql.orderManagement.createOrder";

	@Override
	public boolean createOrder(Order order) {
		Object newOrder = this.getSqlMapClientTemplate()
				.insert(SQL_CART_MANAGEMENT_CREATE_ORDER,order);
		if(newOrder!=null){
			return true;
		}
		return false;
	}

}
