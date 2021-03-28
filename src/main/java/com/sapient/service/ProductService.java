package com.sapient.service;

import java.util.List;

import com.sapient.entity.Product;

public interface ProductService {
	List<Product> findAll();
	List<Product> getProducts(String groupbyvalue, String actualvalue);
}
