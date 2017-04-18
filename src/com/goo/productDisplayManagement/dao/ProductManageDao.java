package com.goo.productDisplayManagement.dao;

import java.util.List;

import com.goo.productDisplayManagement.entity.Product;

public interface ProductManageDao {
	public List<Product> findProductsByCategory(String category);
	public Product findOneProduct(int producId);

}
