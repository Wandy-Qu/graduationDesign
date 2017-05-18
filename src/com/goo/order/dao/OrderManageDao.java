package com.goo.order.dao;

import com.goo.order.entity.Order;

import java.util.List;

public interface OrderManageDao {
	public boolean createOrder(Order order);
}
