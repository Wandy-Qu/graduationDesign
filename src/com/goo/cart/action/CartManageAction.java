package com.goo.cart.action;

import com.goo.cart.entity.CartProduct;
import com.goo.cart.service.CartProductService;
import com.goo.comtools.action.BaseAction;
import com.goo.productDisplayManagement.entity.Product;
import com.goo.productDisplayManagement.service.ShowProductService;
import com.goo.uam.entity.User;

import java.util.List;

public class CartManageAction extends BaseAction{
	
	private CartProduct cartProductDto;
	private Product productDto;
	private CartProductService cartProductServiceImpl;
	List<CartProduct> cartProducts;
	private Integer pid;
	private ShowProductService showProductServiceImpl;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Product getProductDto() {
		return productDto;
	}

	public void setProductDto(Product productDto) {
		this.productDto = productDto;
	}

	public CartProduct getCartProductDto() {
		return cartProductDto;
	}

	public void setCartProductDto(CartProduct cartProductDto) {
		this.cartProductDto = cartProductDto;
	}

	public CartProductService getCartProductServiceImpl() {
		return cartProductServiceImpl;
	}

	public void setCartProductServiceImpl(CartProductService cartProductServiceImpl) {
		this.cartProductServiceImpl = cartProductServiceImpl;
	}

	public List<CartProduct> getCartProducts() {
		return cartProducts;
	}

	public void setCartProducts(List<CartProduct> cartProducts) {
		this.cartProducts = cartProducts;
	}

	public String addToCart(){
		try {
			User user = (User)getSession().getAttribute("userInfo");
			cartProductDto = new CartProductDto();
			cartProductDto.setCartUserId(user.getUserId());
			cartProductDto.setCartProId(productDto.getProductId());
			System.out.print(pid);
			boolean addProductToCart = cartProductServiceImpl.addProductToCart(cartProductDto);
		} catch (Exception e) {
			// TODO: handle exception
			return "error";
		}
		return "success";
	}
}
