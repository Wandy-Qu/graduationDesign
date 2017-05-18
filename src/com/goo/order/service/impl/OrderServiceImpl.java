package com.goo.order.service.impl;

import com.goo.order.dao.OrderManageDao;
import com.goo.order.dao.impl.OrderManageDaoImpl;
import com.goo.order.entity.Order;
import com.goo.order.service.OrderService;

public class OrderServiceImpl implements OrderService {
	private OrderManageDao orderManageDaoImpl;

	public OrderManageDao getOrderManageDaoImpl() {
		return orderManageDaoImpl;
	}

	public void setOrderManageDaoImpl(OrderManageDao orderManageDaoImpl) {
		this.orderManageDaoImpl = orderManageDaoImpl;
	}

	@Override
	public boolean createOrder(Order order) throws Exception {
		boolean isAdded = orderManageDaoImpl.createOrder(order);
		return isAdded;
	}

//	@Override
//	public List<CartProduct> displayProductsInCart() throws Exception {
//		List<CartProduct> cartProductList = cartProductManageDaoImpl.findAllProductsInCart();
//		return cartProductList;
//	}
//
//	@Override
//	public boolean createOrder(Order order) throws Exception {
//
//		return false;
//	}
}
