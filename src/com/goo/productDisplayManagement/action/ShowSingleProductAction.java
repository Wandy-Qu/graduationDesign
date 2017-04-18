package com.goo.productDisplayManagement.action;

import java.util.List;

import com.goo.comtools.action.BaseAction;
import com.goo.productDisplayManagement.entity.Product;
import com.goo.productDisplayManagement.service.ShowProductService;

public class ShowSingleProductAction extends BaseAction{
	
	private Product productDto;
	private ShowProductService showProductServiceImpl;
	List<Product> categoryProducts;
	
	public List<Product> getCategoryProducts() {
		return categoryProducts;
	}
	public void setCategoryProducts(List<Product> categoryProducts) {
		this.categoryProducts = categoryProducts;
	}
	public Product getProductDto() {
		return productDto;
	}
	public void setProductDto(Product productDto) {
		this.productDto = productDto;
	}
	public ShowProductService getShowProductServiceImpl() {
		return showProductServiceImpl;
	}
	public void setShowProductServiceImpl(ShowProductService showProductServiceImpl) {
		this.showProductServiceImpl = showProductServiceImpl;
	}
	
	public String displayProducts(){
		try {
			categoryProducts = showProductServiceImpl.displayProductByCategory(productDto.getCategory());
			System.out.println(categoryProducts);
		} catch (Exception e) {
			// TODO: handle exception
			return "error";
		}
		return "success";
	}
	
	public String showSingleProduct(){
		try {
			productDto = showProductServiceImpl.displayProductDetail(productDto.getProductId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}
		return "success";
	}
	
}
