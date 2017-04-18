package com.goo.productDisplayManagement.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.goo.productDisplayManagement.dao.ProductManageDao;
import com.goo.productDisplayManagement.entity.Product;

public class ProductManageDaoImpl extends SqlMapClientDaoSupport implements ProductManageDao {

	public Product findOneProduct(int productId) {
		// TODO Auto-generated method stub
		Product singleProduct = (Product) this.getSqlMapClientTemplate()
				.queryForObject("sql.productDisplayManagement.selectOneProduct", productId);
		if(singleProduct!=null){
			return singleProduct;
		}
		return null;
	}

	public List<Product> findProductsByCategory(String category) {
		List list = this.getSqlMapClientTemplate()
				.queryForList("sql.productDisplayManagement.selectProducts", category);
		if (list != null && list.size() > 0)
			return list;
		else
			return null;
	}
}
