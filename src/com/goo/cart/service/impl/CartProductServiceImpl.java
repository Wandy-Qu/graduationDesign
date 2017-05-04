package com.goo.cart.service.impl;

import com.goo.cart.dao.CartProductManageDao;
import com.goo.cart.entity.CartProduct;
import com.goo.cart.service.CartProductService;

import java.util.List;

public class CartProductServiceImpl implements CartProductService {
	private CartProductManageDao cartProductManageDaoImpl;

	public CartProductManageDao getCartProductManageDaoImpl() {
		return cartProductManageDaoImpl;
	}

	public void setCartProductManageDaoImpl(CartProductManageDao cartProductManageDaoImpl) {
		this.cartProductManageDaoImpl = cartProductManageDaoImpl;
	}

	@Override
	public boolean addProductToCart(CartProduct cartProduct) throws Exception {
		boolean isAddedToCart = cartProductManageDaoImpl.insertToCart(cartProduct);
		return isAddedToCart;
	}

	@Override
	public List<CartProduct> displayProductsInCart() throws Exception {
		List<CartProduct> cartProductList = cartProductManageDaoImpl.findAllProductsInCart();
		return cartProductList;
	}


}
