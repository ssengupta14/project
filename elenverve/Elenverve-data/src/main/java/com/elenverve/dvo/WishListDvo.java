package com.elenverve.dvo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class WishListDvo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -700591984661467510L;
	private String emailId;
	private List<String> products= new ArrayList<String>();
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public List<String> getProducts() {
		return products;
	}
	public void addProducts(String productId) {
		this.products.add(productId);
	}

}
