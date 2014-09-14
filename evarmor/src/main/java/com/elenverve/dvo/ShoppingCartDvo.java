package com.elenverve.dvo;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.elenverve.util.ConversionPolicyUtil;

public class ShoppingCartDvo {
	
	private Map<Integer,ProductDvo> products = new LinkedHashMap<Integer,ProductDvo>();
	private double originalCartPrice=0.0;
	private double totalOfferAmount;
	private double finalCartPrice;
	private int totalRewards;
	private int redeamableRewards;
	public Map<Integer,ProductDvo> getProducts() {
		return products;
	}
	public void addProduct(ProductDvo product) {
		int position=products.size()+1;
		this.totalRewards+=product.getPromotions().getRewardPoints();
		this.originalCartPrice+=product.getDetails().getFinalPrice();
		List<OfferDvo> offers= product.getPromotions().getOffers();
		this.totalOfferAmount+=ConversionPolicyUtil.convertOffers2Amount(offers);
		this.totalOfferAmount+=ConversionPolicyUtil.convertRewards2Amount(this.totalRewards);
		this.products.put(position,product);
	}
	public void removeProduct(int position) {
		ProductDvo product = products.get(position);
		this.totalRewards-=product.getPromotions().getRewardPoints();
		this.originalCartPrice-=product.getDetails().getFinalPrice();
		List<OfferDvo> offers= product.getPromotions().getOffers();
		this.totalOfferAmount-=ConversionPolicyUtil.convertOffers2Amount(offers);
		this.totalOfferAmount-=ConversionPolicyUtil.convertRewards2Amount(this.totalRewards);
		this.products.remove(position);
	}
	
	public double getOriginalCartPrice() {		
		return originalCartPrice;
	}
	public double getTotalOfferAmount() {
		return totalOfferAmount;
	}
	public double getFinalCartPrice() {
		
		return finalCartPrice;
	}	
	public int getTotalRewards() {
		return totalRewards;
	}	
	public int getRedeamableRewards() {
		return redeamableRewards;
	}
	public void setRedeamableRewards(int redeamableRewards) {
		this.redeamableRewards = redeamableRewards;
	}

}
