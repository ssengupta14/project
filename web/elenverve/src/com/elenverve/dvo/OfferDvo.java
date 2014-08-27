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
	private int offerType;
	private int qualifiedShippingType;
	
	// discount
	private String discountName;
	private String description;
	private double discountPercentage;
	
	
	// BAG
	private double buyQty;
	private long getProductId;
	private double getQty;
	
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
	
}
