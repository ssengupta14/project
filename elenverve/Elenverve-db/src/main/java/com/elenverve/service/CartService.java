package com.elenverve.service;

import java.io.Serializable;

import com.elenverve.dvo.ProductDvo;

public interface CartService extends Serializable{
	
	ShoppingCart getShoppingCart();		
	ProductDvo getProduct(String productId);
	
}
