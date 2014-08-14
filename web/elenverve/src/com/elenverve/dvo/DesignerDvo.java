package com.elenverve.dvo;

import java.util.List;

public class DesignerDvo {
	private String designerId;
	private String designerName;
	private String description;
	// Designer can have collections, categories or products 	
	private List<CollectionDvo> collections;
	private List<CategoryDvo> categories;
	private List<ProductDvo> products;
	public String getDesignerId() {
		return designerId;
	}
	public void setDesignerId(String designerId) {
		this.designerId = designerId;
	}
	public String getDesignerName() {
		return designerName;
	}
	public void setDesignerName(String designerName) {
		this.designerName = designerName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<CollectionDvo> getCollections() {
		return collections;
	}
	public void setCollections(List<CollectionDvo> collections) {
		this.collections = collections;
	}
	public List<CategoryDvo> getCategories() {
		return categories;
	}
	public void setCategories(List<CategoryDvo> categories) {
		this.categories = categories;
	}
	public List<ProductDvo> getProducts() {
		return products;
	}
	public void setProducts(List<ProductDvo> products) {
		this.products = products;
	}
	
	
}
