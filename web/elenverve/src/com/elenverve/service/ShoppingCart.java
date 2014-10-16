package com.elenverve.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.elenverve.dvo.ProductDvo;

public class ShoppingCart implements Serializable {
	private static final long serialVersionUID = -4461143736086272397L;	
	private Map<String, ShoppingCartItem> items = new HashMap<String, ShoppingCartItem>();
	
	/**
	 * 
	 * @param product
	 */
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
	/**
	 * 
	 * @param product
	 */
	public void removeItem(String productId) {
		System.out.println("Removing Product from cart " + productId);			
		items.remove(productId);;		
	}
	/**
	 * 
	 * @return
	 */
	public String getItemCount() {		
		if (items.size() != 0){
			return items.size() + "";
		}
		return "";
	}
	/**
	 * 
	 * @return
	 */
	public List<ShoppingCartItem> getShoppingCartProducts() {
		List<ShoppingCartItem> list = new ArrayList<ShoppingCartItem>(items.values());
		Collections.sort(list);
		return list;
	}
	/**
	 * 
	 * @return
	 */
	public int getTotalPriceInDollars() {
		int total = 0;
		for (ShoppingCartItem item : items.values()) {
			total += item.getProduct().getDetails().getInitialPrice();
		}
		return total;
	}
	/**
	 * 
	 */
	public void clear() {
		items.clear();
	}
}
