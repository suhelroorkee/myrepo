package com.ecom.dao;

import java.util.List;

import ecom.entity.Product;



public interface ProductDao {

	Product getProduct(Integer id);
	List<Product> getProducts(Integer start,Integer count);
}
