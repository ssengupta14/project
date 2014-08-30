package com.elenverve.db.beans;

import java.util.ArrayList;
import java.util.List;

import com.elenverve.dvo.ProductDvo.Dimension;

public class ProductDetailBean {
	
	private String productId;
	private String categoryId;
	private String collectionId;
	private String designerId;
	private String productName;
	private String modelNo;
	private String skuNo;
	private boolean newInd;
	private boolean inStock;
	private String description;
	private String features;
	private Dimension dimension;
	private String color;
	private String material;
	private double initialPrice;
	private double finalPrice;
	private int currencyCd;	
	private List<String> imageUrls = new ArrayList<String>();
	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}
	/**
	 * @return the categoryId
	 */
	public String getCategoryId() {
		return categoryId;
	}
	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * @return the collectionId
	 */
	public String getCollectionId() {
		return collectionId;
	}
	/**
	 * @param collectionId the collectionId to set
	 */
	public void setCollectionId(String collectionId) {
		this.collectionId = collectionId;
	}
	/**
	 * @return the designerId
	 */
	public String getDesignerId() {
		return designerId;
	}
	/**
	 * @param designerId the designerId to set
	 */
	public void setDesignerId(String designerId) {
		this.designerId = designerId;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the modelNo
	 */
	public String getModelNo() {
		return modelNo;
	}
	/**
	 * @param modelNo the modelNo to set
	 */
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	/**
	 * @return the skuNo
	 */
	public String getSkuNo() {
		return skuNo;
	}
	/**
	 * @param skuNo the skuNo to set
	 */
	public void setSkuNo(String skuNo) {
		this.skuNo = skuNo;
	}
	/**
	 * @return the newInd
	 */
	public boolean isNewInd() {
		return newInd;
	}
	/**
	 * @param newInd the newInd to set
	 */
	public void setNewInd(boolean newInd) {
		this.newInd = newInd;
	}
	/**
	 * @return the inStock
	 */
	public boolean isInStock() {
		return inStock;
	}
	/**
	 * @param inStock the inStock to set
	 */
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the features
	 */
	public String getFeatures() {
		return features;
	}
	/**
	 * @param features the features to set
	 */
	public void setFeatures(String features) {
		this.features = features;
	}
	/**
	 * @return the dimension
	 */
	public Dimension getDimension() {
		return dimension;
	}
	/**
	 * @param dimension the dimension to set
	 */
	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}
	/**
	 * @param material the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}
	/**
	 * @return the initialPrice
	 */
	public double getInitialPrice() {
		return initialPrice;
	}
	/**
	 * @param initialPrice the initialPrice to set
	 */
	public void setInitialPrice(double initialPrice) {
		this.initialPrice = initialPrice;
	}
	/**
	 * @return the finalPrice
	 */
	public double getFinalPrice() {
		return finalPrice;
	}
	/**
	 * @param finalPrice the finalPrice to set
	 */
	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	/**
	 * @return the currencyCd
	 */
	public int getCurrencyCd() {
		return currencyCd;
	}
	/**
	 * @param currencyCd the currencyCd to set
	 */
	public void setCurrencyCd(int currencyCd) {
		this.currencyCd = currencyCd;
	}
	/**
	 * @return the imageUrls
	 */
	public List<String> getImageUrls() {
		return imageUrls;
	}
	/**
	 * @param imageUrls the imageUrls to set
	 */
	public void setImageUrls(List<String> imageUrls) {
		this.imageUrls = imageUrls;
	}
	public void addImageUrl(String string) {
		imageUrls.add(string);
		
	}

}
