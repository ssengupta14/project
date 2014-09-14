package com.elenverve.dvo;

public class OfferDvo {
	
	//Add more types
	public static int DISCOUNT=0;
	public static int SALE=1;
	public static int PROMO=2;
	public static int BAG=3; //Buy and get
	
	
	// shipping offers, will be moved to application configuration file
	public static int FREE_SHIPPING=0;	
	public static int ONE_DAY_SHIPPING=1;
	public static int TWO_DAY_SHIPPING=2;
	public static int FREE_STANDARD_SHIPPING=-9;
	public static int MIN_QTY_SHIPPING=10;
	public static int MIN_QTY_ONE_DAY_SHIPPING=11;
	
	public static int MIN_ORD_AMT_SHIPPING=20;
	public static int MIN_ORD_AMT_ONE_DAY_SHIPPING=21;
	
	private long offerId;
	private String templateId;
	private int offerType;
	private int qualifiedShippingType;
	private int amount;
	
	
	// discount
	private String discountName;
	private String description;
	private double discountPercentage;
	
	private String lineSeparator="";
	private int lineBreak=0;
	
	
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
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
	// BAG
	private double buyQty;
	private long getProductId;
	private String getProductName;
	public String getGetProductName() {
		return getProductName;
	}
	public void setGetProductName(String getProductName) {
		this.getProductName = getProductName;
	}
	private double getQty;
	
	private String endWord;
	
	private String productId;
	private String productName;
	
	private String collectionId;
	private String collectionName;
	
	private String categoryId;
	private String categoryName;
	
	public long getOfferId() {
		return offerId;
	}
	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}
	public int getOfferType() {
		return offerType;
	}
	public void setOfferType(int offerType) {
		this.offerType = offerType;
	}
	public int getQualifiedShippingType() {
		return qualifiedShippingType;
	}
	public void setQualifiedShippingType(int qualifiedShippingType) {
		this.qualifiedShippingType = qualifiedShippingType;
	}
	public String getDiscountName() {
		return discountName;
	}
	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getBuyQty() {
		return buyQty;
	}
	public void setBuyQty(double buyQty) {
		this.buyQty = buyQty;
	}
	public long getGetProductId() {
		return getProductId;
	}
	public void setGetProductId(long getProductId) {
		this.getProductId = getProductId;
	}
	public double getGetQty() {
		return getQty;
	}
	public void setGetQty(double getQty) {
		this.getQty = getQty;
	}
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public String getEndWord() {
		return endWord;
	}
	public void setEndWord(String endWord) {
		this.endWord = endWord;
	}
	public String getTemplateId() {
		return templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getLineSeparator() {
		return lineSeparator;
	}
	public void setLineSeparator(String lineSeparator) {
		this.lineSeparator = lineSeparator;
	}
	public int getLineBreak() {
		return lineBreak;
	}
	public void setLineBreak(int lineBreak) {
		this.lineBreak = lineBreak;
	}
	
}
