package com.elenverve.service;

import java.util.List;
import java.util.Map;

import com.elenverve.db.beans.ProductDetailBean;

public interface CartService {
	
ShoppingCart getShoppingCart();
	
	List<ProductDetailBean> getProducts();
	
	void setProducts(Map<String, ProductDetailBean> products);
	
	ProductDetailBean getProduct(String productId);
	
	List<String> getShippingOptions();
	
	void submitOrderForPayment();
}
