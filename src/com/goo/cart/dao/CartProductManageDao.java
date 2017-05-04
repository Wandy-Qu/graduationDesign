package com.goo.cart.dao;

import com.goo.cart.entity.CartProduct;
import com.goo.productDisplayManagement.entity.Product;

import java.util.List;

public interface CartProductManageDao {
	public boolean insertToCart(CartProduct cartProduct);
	public List<CartProduct> findAllProductsInCart();
}
