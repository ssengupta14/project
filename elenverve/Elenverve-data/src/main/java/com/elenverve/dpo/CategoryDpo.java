package com.elenverve.dpo;

import java.util.List;

public class CategoryDpo {
	private String categoryId;
	private String categoryName;
	private String image;
	private String offer;
	private int items;
	// for future enhancement
	private List<CategoryDpo> subCategories;
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getOffer() {
		return offer;
	}
	public void setOffer(String offer) {
		this.offer = offer;
	}
	public int getItems() {
		return items;
	}
	public void setItems(int items) {
		this.items = items;
	}
	public List<CategoryDpo> getSubCategories() {
		return subCategories;
	}
	public void setSubCategories(List<CategoryDpo> subCategories) {
		this.subCategories = subCategories;
	}
	
	
}
