package com.elenverve.dpo;

import java.util.ArrayList;
import java.util.List;
/**
 * Shipping offers
 * @author ssengupta
 *
 */
class ShippingOffer extends Offer{

	
	private String shippingType; // Express, priority or standard
	private boolean isFreeShipping;
	private double amount;
	
	private int noOfShippingDays;
	
	private List<String> buy = new ArrayList<String>();
	private List<String> get = new ArrayList<String>();
	
	public String getShippingType() {
		return shippingType;
	}
	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
	}
	public boolean isFreeShipping() {
		return isFreeShipping;
	}
	public void setFreeShipping(boolean isFreeShipping) {
		this.isFreeShipping = isFreeShipping;
	}
	public List<String> getBuy() {
		return buy;
	}
	public void addBuy(String productId) {
		this.buy.add(productId);
	}
	public List<String> getOffers() {
		return get;
	}
	public void addGetOffer(String productId) {
		this.get.add(productId);
	}
	public int getNoOfShippingDays() {
		return noOfShippingDays;
	}
	public void setNoOfShippingDays(int noOfShippingDays) {
		this.noOfShippingDays = noOfShippingDays;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	

}
