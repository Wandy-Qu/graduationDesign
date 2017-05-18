package com.goo.order.service;

import com.goo.order.entity.Order;

import java.util.List;

public interface OrderService {
	public boolean createOrder(Order order) throws Exception;
}
