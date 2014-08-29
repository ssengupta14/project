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
	private List<ProductDvo> products;
	private List<CategoryDvo> categories;
	private List<DesignerDvo> designers;
	private List<OfferDvo> offers = new ArrayList<OfferDvo>();
	
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
	public List<ProductDvo> getProducts() {
		return products;
	}
	public void setProducts(List<ProductDvo> products) {
		this.products = products;
	}
	public List<CategoryDvo> getCategories() {
		return categories;
	}
	public void setCategories(List<CategoryDvo> categories) {
		this.categories = categories;
	}
	public List<DesignerDvo> getDesigners() {
		return designers;
	}
	public void setDesigners(List<DesignerDvo> designers) {
		this.designers = designers;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = IConstants.COLLECTION_IMAGES_URL+image;
	}
	public List<OfferDvo> getOffers() {
		return offers;
	}
	
	public void addOffer(OfferDvo offer) {
		this.offers.add(offer);
	}
	

}
