package com.elenverve.service;

import java.util.List;
import java.util.Map;

import com.elenverve.db.beans.ProductDetailBean;

public interface ProductService {
	
	List<ProductDetailBean> getProducts();
	
	List<ProductDetailBean> getProducts(String cat);
	
	Map<String, ProductDetailBean> getProducts(String cat,String sc);
	
	String getCategoryId(String categoryName,String subCatId);

}
