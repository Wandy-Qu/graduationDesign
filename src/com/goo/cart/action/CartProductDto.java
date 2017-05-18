package com.goo.cart.action;

import com.goo.cart.entity.CartProduct;

import java.sql.Time;

public class CartProductDto extends CartProduct{
    private int cartProId;
    private int cartUserId;
    private String cartProName;
    private String cartProType;
    private String cartProPrice;
    private String cartProNumber;
    private Time cartProAddTime;

    @Override
    public int getCartProId() {
        return cartProId;
    }

    @Override
    public void setCartProId(int cartProId) {
        this.cartProId = cartProId;
    }

    @Override
    public int getCartUserId() {
        return cartUserId;
    }

    @Override
    public void setCartUserId(int cartUserId) {
        this.cartUserId = cartUserId;
    }

    @Override
    public String getCartProName() {
        return cartProName;
    }

    @Override
    public void setCartProName(String cartProName) {
        this.cartProName = cartProName;
    }

    @Override
    public String getCartProType() {
        return cartProType;
    }

    @Override
    public void setCartProType(String cartProType) {
        this.cartProType = cartProType;
    }

    @Override
    public String getCartProPrice() {
        return cartProPrice;
    }

    @Override
    public void setCartProPrice(String cartProPrice) {
        this.cartProPrice = cartProPrice;
    }

    @Override
    public String getCartProNumber() {
        return cartProNumber;
    }

    @Override
    public void setCartProNumber(String cartProNumber) {
        this.cartProNumber = cartProNumber;
    }

    @Override
    public Time getCartProAddTime() {
        return cartProAddTime;
    }

    @Override
    public void setCartProAddTime(Time cartProAddTime) {
        this.cartProAddTime = cartProAddTime;
    }
}
