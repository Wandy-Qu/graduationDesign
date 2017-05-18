package com.goo.order.action;

import com.goo.comtools.action.BaseAction;
import com.goo.order.entity.Order;
import com.goo.order.service.OrderService;

public class OrderManageAction extends BaseAction{
	
	private Order orderDto;
	private OrderService orderServiceImpl;

	public Order getOrderDto() {
		return orderDto;
	}

	public void setOrderDto(Order orderDto) {
		this.orderDto = orderDto;
	}

	public OrderService getOrderServiceImpl() {
		return orderServiceImpl;
	}

	public void setOrderServiceImpl(OrderService orderServiceImpl) {
		this.orderServiceImpl = orderServiceImpl;
	}

	public String saveNewOrder(){
		try {
			Order order = (Order)getSession().getAttribute("orderInfo");
			orderDto = new OrderDto();
			orderDto.setProId(order.getProId());
			orderDto.setUserId(order.getUserId());
			boolean isCreated = orderServiceImpl.createOrder(orderDto);
		} catch (Exception e) {
			// TODO: handle exception
			return "error";
		}
		return "success";
	}
}
