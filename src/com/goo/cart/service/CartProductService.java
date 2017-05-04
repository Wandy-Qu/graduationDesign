package com.goo.cart.service;

import com.goo.cart.entity.CartProduct;

import java.util.List;

public interface CartProductService {
	public boolean addProductToCart(CartProduct cartProduct) throws Exception;
	public List<CartProduct> displayProductsInCart() throws Exception;

}
