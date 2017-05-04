package com.goo.cart.dao.impl;

import com.goo.cart.dao.CartProductManageDao;
import com.goo.cart.entity.CartProduct;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import java.util.List;

public class CartProductManageDaoImpl extends SqlMapClientDaoSupport implements CartProductManageDao {
    private static final String SQL_CART_MANAGEMENT_ADD_TO_CART = "sql.cartManagement.addToCart";
	private static final String SQL_CART_MANAGEMENT_SELECT_ALL_PRODUCTS_IN_CART = "sql.cartManagement.selectAllProductsInCart";

	@Override
	public boolean insertToCart(CartProduct cartProduct) {
		Object insertInCart = this.getSqlMapClientTemplate()
				.insert(SQL_CART_MANAGEMENT_ADD_TO_CART,cartProduct);
		System.out.print(insertInCart);
		if(insertInCart!=null){
			return true;
		}
		return false;
	}

	@Override
	public List<CartProduct> findAllProductsInCart() {
		List<CartProduct> cartProductList = this.getSqlMapClientTemplate()
				.queryForList(SQL_CART_MANAGEMENT_SELECT_ALL_PRODUCTS_IN_CART);
		return cartProductList;
	}

}
