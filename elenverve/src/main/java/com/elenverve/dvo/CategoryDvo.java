package com.elenverve.dvo;

import java.util.ArrayList;
import java.util.List;

import com.elenverve.common.IConstants;

public class CategoryDvo {
	private String categoryId;
	private String categoryName;
	private String image;
	private String description;
	// Category can have products or subcategories which contain products. 
	// This way we can achieve any level of categories
	private List<CategoryDvo> subcategories = new ArrayList<CategoryDvo>();
	
	private List<ProductDvo> products = new ArrayList<ProductDvo>();
	private List<CollectionDvo> collections = new ArrayList<CollectionDvo>();
	private List<DesignerDvo> designers = new ArrayList<DesignerDvo>();
	private List<OfferDvo> offers = new ArrayList<OfferDvo>();
	
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
	public void addSubcategory(CategoryDvo subcategory) {
		this.subcategories.add(subcategory);
	}
	public List<ProductDvo> getProducts() {
		return products;
	}
	public void addProduct(ProductDvo product) {
		this.products.add(product);
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = IConstants.CATEGORY_IMAGES_URL+image;
	}
	public List<CollectionDvo> getCollections() {
		return collections;
	}
	public void addCollections(CollectionDvo collection) {
		this.collections.add(collection);
	}
	public List<DesignerDvo> getDesigners() {
		return designers;
	}
	public void addDesigner(DesignerDvo designer) {
		this.designers.add(designer);
	}
	public List<OfferDvo> getOffers() {
		return offers;
	}
	public void addOffer(OfferDvo offer) {
		this.offers.add(offer);
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
