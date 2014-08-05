package com.elenverve.dpo;

import java.util.ArrayList;
import java.util.List;

/**
 * Buy and Get offers
 * @author ssengupta
 *
 */
class BagOffer extends Offer{

	
	private boolean isPercent;
	private List<Buy> buy = new ArrayList<Buy>();
	private List<Get> getOffer = new ArrayList<Get>();
	
	
	public boolean isPercent() {
		return isPercent;
	}
	public void setPercent(boolean isPercent) {
		this.isPercent = isPercent;
	}
	public List<Buy> getBuy() {
		return buy;
	}
	public void addBuy(Buy buy) {
		this.buy.add(buy);
	}
	public List<Get> getOffers() {
		return getOffer;
	}
	public void addGetOfferByQuantity(String productId,int qty){
		Get get = new Get();
		get.setProductId(productId);
		get.setQty(qty);
		getOffer.add(get);
	}
	public void addGetOfferByPercentage(String productId,int percent){
		Get get = new Get();
		get.setProductId(productId);
		get.setPercent(percent);
		getOffer.add(get);
	}
	
	protected class Buy{
		private String productId;
		private int qty;
		public String getProductId() {
			return productId;
		}
		public void setProductId(String productId) {
			this.productId = productId;
		}
		public int getQty() {
			return qty;
		}
		public void setQty(int qty) {
			this.qty = qty;
		}
		
		
	}
	protected class Get{
		
		private String productid;
		private int qty;
		private int percent;
		private boolean isPercent;
		
		protected String getProductId() {
			return productid;
		}
		protected void setProductId(String productid) {
			this.productid = productid;
		}
		protected int getQty() {
			return qty;
		}
		protected void setQty(int qty) {
			this.qty = qty;
		}
		protected int getPercent() {
			return percent;
		}
		protected void setPercent(int percent) {
			this.percent = percent;
		}
		protected boolean isPercent() {
			return isPercent;
		}
		protected void isPercent(boolean isPercent) {
			this.isPercent = isPercent;
		}
		
		
	}

	

}
