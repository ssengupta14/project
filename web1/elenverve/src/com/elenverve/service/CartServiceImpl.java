package com.elenverve.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.elenverve.db.beans.ProductDetailBean;

// Commented this out since I want to specify the shippingOptions property in
// the config file.
//@Service("cartService")
public class CartServiceImpl implements CartService {
	
	// This is session-scoped.  I don't like this because (1) I don't think
	// this service bean should be session-aware and (2) this seems like it ties
	// us to Spring.  But anyway.
	private ShoppingCart cart;
	
	private Map<String, ProductDetailBean> products = new HashMap<String, ProductDetailBean>();
		

	public ShoppingCart getShoppingCart() {
		return cart;
	}
	
	public void setShoppingCart(ShoppingCart cart) {
		this.cart = cart;
	}
	
	
	public List<ProductDetailBean> getProducts() {
		List<ProductDetailBean> list = new ArrayList<ProductDetailBean>(products.values());
		Collections.sort(list);
		return list;
	}
	
	
	public ProductDetailBean getProduct(String productId) {
		return products.get(productId);
	}
	
	public void setProducts(Map<String, ProductDetailBean> products) {
		this.products = products;
	}
	

	
	public void submitOrderForPayment() {
		cart.clear();
	}

	public List<String> getShippingOptions() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
