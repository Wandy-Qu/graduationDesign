package com.goo.cart.action;

import com.goo.cart.entity.CartProduct;
import com.goo.comtools.action.BaseAction;
import com.goo.productDisplayManagement.entity.Product;
import com.goo.productDisplayManagement.service.ShowProductService;

import java.util.List;

public class CartManageAction extends BaseAction{
	
	private CartProduct cartProductDto;
	private ShowProductService showProductServiceImpl;
	List<Product> categoryProducts;
	
//	public List<Product> getCategoryProducts() {
//		return categoryProducts;
//	}
//	public void setCategoryProducts(List<Product> categoryProducts) {
//		this.categoryProducts = categoryProducts;
//	}
//	public Product getProductDto() {
//		return productDto;
//	}
//	public void setProductDto(Product productDto) {
//		this.productDto = productDto;
//	}
//	public ShowProductService getShowProductServiceImpl() {
//		return showProductServiceImpl;
//	}
//	public void setShowProductServiceImpl(ShowProductService showProductServiceImpl) {
//		this.showProductServiceImpl = showProductServiceImpl;
//	}
	
	public String addToCart(){
		try {
//			categoryProducts = showProductServiceImpl.displayProductByCategory(productDto.getCategory());
//			System.out.println(categoryProducts);
		} catch (Exception e) {
			// TODO: handle exception
			return "error";
		}
		return "success";
	}
	
//	public String showSingleProduct(){
//		try {
//			productDto = showProductServiceImpl.displayProductDetail(productDto.getProductId());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return "error";
//		}
//		return "success";
//	}
	
}
