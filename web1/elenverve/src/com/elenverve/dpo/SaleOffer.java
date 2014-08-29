package com.elenverve.dpo;

import java.util.ArrayList;
import java.util.List;
/**
 * Sale or Discount offers
 * @author ssengupta
 *
 */
class SaleOffer extends Offer{

	
	
	private int percent;
	private String saleWord; // Off, Reduction, Discount - anything which can be added as a wording
	
	private int type;
	
	private List<String> categories = new ArrayList<String>();
	private List<String> collections = new ArrayList<String>();
	private List<String> products = new ArrayList<String>();
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getSaleWord() {
		return saleWord;
	}
	public void setSaleWord(String saleWord) {
		this.saleWord = saleWord;
	}
	
	
	public int getPercent() {
		return percent;
	}
	public void setPercent(int percent) {
		this.percent = percent;
	}
	public List<String> getCategories() {
		return categories;
	}
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}
	public List<String> getCollections() {
		return collections;
	}
	public void setCollections(List<String> collections) {
		this.collections = collections;
	}
	public List<String> getProducts() {
		return products;
	}
	public void setProducts(List<String> products) {
		this.products = products;
	}
	
	

}
