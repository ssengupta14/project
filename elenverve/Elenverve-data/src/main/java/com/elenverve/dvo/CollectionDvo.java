package com.elenverve.dvo;

import java.util.ArrayList;
import java.util.List;

import com.elenverve.common.IConstants;

public class CollectionDvo {
	private String collectionId;
	private String collectionName;
	private String description;
	private String image;
	
	// collections can have products or categories or designers
	private List<String> products = new ArrayList<String>();
	private List<String> categories = new ArrayList<String>();
	private List<String> designers = new ArrayList<String>();
	private List<String> offers = new ArrayList<String>();
	
	public String getCollectionId() {
		return collectionId;
	}
	public void setCollectionId(String collectionId) {
		this.collectionId = collectionId;
	}
	public String getCollectionName() {
		return collectionName;
	}
	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getProducts() {
		return products;
	}
	public void setProducts(List<String> products) {
		this.products = products;
	}
	public void addProduct(String product) {
		this.products.add(product);
	}
	
	public List<String> getCategories() {
		return categories;
	}
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}
	public void addCategory(String category) {
		this.categories.add(category);
	}
	
	public List<String> getDesigners() {
		return designers;
	}
	public void setDesigners(List<String> designers) {
		this.designers = designers;
	}
	public void addDesigner(String designer) {
		this.designers.add(designer);
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = IConstants.COLLECTION_IMAGES_URL+image;
	}
	public List<String> getOffers() {
		return offers;
	}
	
	public void addOffer(String offer) {
		this.offers.add(offer);
	}
	

}
