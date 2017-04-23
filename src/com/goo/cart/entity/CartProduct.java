package com.goo.cart.entity;

import java.sql.Time;

public class CartProduct {
	private int cartProId;
	private int cartUserId;
	private String cartProName;
	private String cartProType;
	private String cartProPrice;
	private String cartProNumber;
	private Time cartProAddTime;

	public int getCartProId() {
		return cartProId;
	}

	public void setCartProId(int cartProId) {
		this.cartProId = cartProId;
	}

	public int getCartUserId() {
		return cartUserId;
	}

	public void setCartUserId(int cartUserId) {
		this.cartUserId = cartUserId;
	}

	public String getCartProName() {
		return cartProName;
	}

	public void setCartProName(String cartProName) {
		this.cartProName = cartProName;
	}

	public String getCartProType() {
		return cartProType;
	}

	public void setCartProType(String cartProType) {
		this.cartProType = cartProType;
	}

	public String getCartProPrice() {
		return cartProPrice;
	}

	public void setCartProPrice(String cartProPrice) {
		this.cartProPrice = cartProPrice;
	}

	public String getCartProNumber() {
		return cartProNumber;
	}

	public void setCartProNumber(String cartProNumber) {
		this.cartProNumber = cartProNumber;
	}

	public Time getCartProAddTime() {
		return cartProAddTime;
	}

	public void setCartProAddTime(Time cartProAddTime) {
		this.cartProAddTime = cartProAddTime;
	}
}
