package com.elenverve.service;

import com.elenverve.dvo.ProductDvo;

public interface CartService {
	
	ShoppingCart getShoppingCart();		
	ProductDvo getProduct(String productId);
	
}
