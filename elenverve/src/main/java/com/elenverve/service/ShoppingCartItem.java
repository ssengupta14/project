package com.elenverve.service;

import java.io.Serializable;

import com.elenverve.dvo.ProductDvo;

public class ShoppingCartItem implements Comparable<ShoppingCartItem>, Serializable {

	private static final long serialVersionUID = 4134652647253355430L;
	
	private ProductDvo productDvo;
	private int quantity =1;
	
	public ShoppingCartItem(ProductDvo product, int quantity) {
		this.productDvo = product;
		this.quantity = quantity;
	}

	public ProductDvo getProduct() {
		return productDvo;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void incrementQuantity() {
		quantity++;
	}

/*	public int getUnitPriceInCents() {
		return product.getPriceInCents();
	}
	
	public String getUnitPriceInDollars() {
		return product.getPriceInDollars();
	}
	
	public int getTotalPriceInCents() {
		return (quantity * getUnitPriceInCents());
	}
	
	public String getTotalPriceInDollars() {
		return Util.getPriceInDollars(getTotalPriceInCents());
	}*/
	
	@Override
	public boolean equals(Object o) {
		return o instanceof ShoppingCartItem &&
			productDvo.equals(((ShoppingCartItem) o).productDvo);
	}
	
	@Override
	public int hashCode() {
		return productDvo.hashCode();
	}
	
	//@Override
	public int compareTo(ShoppingCartItem item) {
		return productDvo.compareTo(item.productDvo);
	}
}
