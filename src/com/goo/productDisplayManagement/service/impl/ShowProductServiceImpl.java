package com.goo.productDisplayManagement.service.impl;

import java.util.List;

import com.goo.productDisplayManagement.dao.ProductManageDao;
import com.goo.productDisplayManagement.entity.Product;
import com.goo.productDisplayManagement.service.ShowProductService;

public class ShowProductServiceImpl implements ShowProductService {
	private ProductManageDao productManageDaoImpl;

	public ProductManageDao getProductManageDaoImpl() {
		return productManageDaoImpl;
	}

	public void setProductManageDaoImpl(ProductManageDao productManageDaoImpl) {
		this.productManageDaoImpl = productManageDaoImpl;
	}

	public Product displayProductDetail(int productId) throws Exception {
		// TODO Auto-generated method stub
		Product singleProduct = productManageDaoImpl.findOneProduct(productId); 
		return singleProduct;
	}

	public List<Product> displayProductByCategory(String category) throws Exception {
		// TODO Auto-generated method stub
		List<Product> categoryProducts = productManageDaoImpl.findProductsByCategory(category);
		return categoryProducts;
	}

}
