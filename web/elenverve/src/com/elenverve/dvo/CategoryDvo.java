package com.elenverve.dvo;

import java.util.List;

public class CategoryDvo {
	private String categoryId;
	private String categoryName;
	// Category can have products or subcategories which contain products. 
	// This way we can achieve any level of categories
	private List<CategoryDvo> subcategories;
	private List<ProductDvo> products;
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public List<CategoryDvo> getSubcategories() {
		return subcategories;
	}
	public void setSubcategories(List<CategoryDvo> subcategories) {
		this.subcategories = subcategories;
	}
	public List<ProductDvo> getProducts() {
		return products;
	}
	public void setProducts(List<ProductDvo> products) {
		this.products = products;
	}
	
}
