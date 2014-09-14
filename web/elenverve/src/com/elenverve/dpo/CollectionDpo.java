package com.elenverve.dpo;

import java.util.List;

public class CollectionDpo {
	private String collectionId;
	private String collectionName;
	private String image;
	private String offer;
	private int items;
	// for future enhancement
	private List<CollectionDpo> subcollections;
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
	public List<CollectionDpo> getSubcollections() {
		return subcollections;
	}
	public void setSubcollections(List<CollectionDpo> subcollections) {
		this.subcollections = subcollections;
	}

}
