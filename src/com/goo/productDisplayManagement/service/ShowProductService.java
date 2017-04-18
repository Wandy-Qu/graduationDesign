package com.goo.productDisplayManagement.service;

import java.util.List;

import com.goo.productDisplayManagement.entity.Product;

public interface ShowProductService {
	public List<Product> displayProductByCategory(String category) throws Exception;
	public Product displayProductDetail(int productId) throws Exception;

}
