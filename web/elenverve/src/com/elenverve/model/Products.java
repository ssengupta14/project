package com.elenverve.model;

import java.util.List;

import com.elenverve.parser.ProductParser;

public class Products extends Default{
	
	private ProductParser parser = new ProductParser();
	
	public List<Product> getProducts(){
		// Filter based on category/collection selected & other criteria
		List<Product> prodList = parser.getProductList();
		// returning complete list here
		return prodList;	
	}
}
