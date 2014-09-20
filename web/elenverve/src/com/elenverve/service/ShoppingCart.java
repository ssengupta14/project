package com.elenverve.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.elenverve.dvo.ProductDvo;
//@Service
public class ShoppingCart implements Serializable {
	private static final long serialVersionUID = -4461143736086272397L;
	
	private Map<String, ShoppingCartItem> items = new HashMap<String, ShoppingCartItem>();
	
	/*	
	 public ShoppingCart() {
	}*/
	
	public List<ShoppingCartItem> getItems() {
		List<ShoppingCartItem> list = new ArrayList<ShoppingCartItem>(items.values());
		//Collections.sort(list);
		return list;
	}
	
	public void addItem(ProductDvo product) {
		System.out.println("test " + product.getProductId());
		String productId = product.getProductId();
		ShoppingCartItem item = items.get(productId);
		if (item != null) {
			item.incrementQuantity();
		} else {		
			items.put(productId, new ShoppingCartItem(product, 1));
		}
	}
	
	public int getItemCount() {		
		return items.size();
	}
	
	public List<ShoppingCartItem> getShoppingCartProducts() {
		List<ShoppingCartItem> list = new ArrayList<ShoppingCartItem>(items.values());
		//Collections.sort(list);
		return list;
	}
	
	public int getTotalPriceInDollars() {
		int total = 0;
		for (ShoppingCartItem item : items.values()) {
			total += item.getProduct().getDetails().getInitialPrice();
		}
		return total;
	}
	
	public void clear() {
		items.clear();
	}
}
