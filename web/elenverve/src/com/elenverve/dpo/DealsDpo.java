package com.elenverve.dpo;

import java.util.ArrayList;
import java.util.List;

public class DealsDpo {
	/*
	 * Constants needed
	 */
	
	
	
	// Sale options
	public static int PRODUCT_SALE=200;
	public static int CATEGORY_SALE=201;
	public static int COLLECTION_SALE=202;
	
	//Shipping options
	public static String EXPRESS_SHIPPING = "EXPRESS SHIPPING";
	public static String PRIORIY_SHIPPING ="PRIORITY SHIPPING";  
	public static String STANDARD_SHIPPING ="STANDARD SHIPPING"; 
	
	/*
	 * Variables
	 */
	private String dealName;
	private String dealHeadline;
	private List<Offer> offers= new ArrayList<Offer>();	
	
	public List<Offer> getOffers() {
		return offers;
	}

	public void addOffer(Offer offer) {
		this.offers.add(offer);
	}

	public String getDealName() {
		return dealName;
	}

	public void setDealName(String dealName) {
		this.dealName = dealName;
	}

	public String getDealHeadline() {
		return dealHeadline;
	}

	public void setDealHeadline(String dealHeadline) {
		this.dealHeadline = dealHeadline;
	}


	
	public static void main(String arg[]){
		DealsDpo deals = new DealsDpo();
		deals.setDealName("END OF SUMMER SALE EVENT !!!");
		deals.setDealHeadline("2014 End of Summer Sale event is here, you cannot afford to miss it. ");
		
		SaleOffer offer = new SaleOffer();
		offer.setName("DoorBuster");		
		offer.setType(CATEGORY_SALE);
		
		offer.setPercent(20);
		offer.setSaleWord(" Reduction");
		List<String> products = new ArrayList<String>();
		products.add("Home Decor");
		products.add("Fashion Accessories");
		
		offer.setProducts(products);
		
		deals.addOffer(offer);
		
		BagOffer offer1 = new BagOffer();
		BagOffer.Buy buy1= offer1.new Buy();
		buy1.setProductId("Red Lampshade");
		offer1.addBuy(buy1);	
		
		offer1.addGetOfferByQuantity("Green Lanten", 1);	
		offer1.addGetOfferByPercentage("Yellowstone", 30);
		deals.addOffer(offer1);
		deals.print(deals);
	}
	public void print(DealsDpo deal){
		StringBuilder str = new StringBuilder();
		str.append(deal.dealName+"\n");
		str.append(deal.dealHeadline+"\n");
		for(Offer offer:offers){
			
		if(offer instanceof SaleOffer){
			SaleOffer saleOffer = (SaleOffer)offer;
			str.append(offer.getName().toUpperCase()+"\n");
			str.append(saleOffer.getPercent()+" % "+ saleOffer.getSaleWord()+" on ");
			int type = saleOffer.getType();
			if(type == PRODUCT_SALE){
				List<String> ids = saleOffer.getProducts();
				for(String id: ids){
					str.append(id +" , ");
				}
				str.append("\n");
			}
			if(type == CATEGORY_SALE){
				List<String> ids = saleOffer.getProducts();
				str.append(" our ");
				for(String id: ids){
					str.append(id +" , ");
				}
				
				if(ids.size()>1){
					str.append(" categories");
				}
				if(ids.size()==1){
					str.append(" Category");
				}
				str.append("\n");
			}
			if(type == COLLECTION_SALE){
				List<String> ids = saleOffer.getProducts();
				str.append(" Our Exclusive");
				for(String id: ids){
					str.append(id +" , ");
				}
				if(ids.size()>1){
					str.append(" Collections");
				}
				if(ids.size()==1){
					str.append(" Collection");
				}
				str.append("\n");
			}
		}
		if(offer instanceof BagOffer){
			BagOffer bagOffer = (BagOffer) offer;
			str.append(bagOffer.getName().toUpperCase()+"\n");
			
			str.append("\n Buy ");
			for(BagOffer.Buy buy: bagOffer.getBuy()){
				int qty = buy.getQty();
				if(qty>0){
					str.append( qty+" "+buy.getProductId() +" + ");
				}else{
					str.append(buy.getProductId() +" + ");
				}
			}
			str.append("and get ");
			for(BagOffer.Get get:bagOffer.getOffers()){
				if(get.isPercent()){
					str.append(get.getPercent()+" %  OFF on "+get.getProductId() +" and ");
				}else{
					int qty = get.getQty();
					if(qty>0){
						str.append(get.getQty()+" "+get.getProductId() +" and ");
					}else{
						str.append(get.getProductId() +" and ");
					}
				}
				
			}
			str.append("Free \n");
		}
		
		if(offer instanceof ShippingOffer){
			ShippingOffer shippingOffer = (ShippingOffer) offer;
			str.append(offer.getName().toUpperCase()+"\n");
			if(shippingOffer.getBuy().size()>0){
				str.append(" BUY ");
			}
			for(String productId: shippingOffer.getBuy()){
				str.append(productId +"+");
			}
			if(shippingOffer.isFreeShipping()){
				str.append(" get FREE "+shippingOffer.getShippingType());
				int days =shippingOffer.getNoOfShippingDays(); 
				if(days>0){
					str.append(" get FREE "+days+" Day Shipping");
				}
				if(shippingOffer.getOffers().size()>0){
					str.append(" on ");
				}
				for(String productId: shippingOffer.getOffers()){
					str.append(productId +",");
				}
			}else{
				int amt = (int) shippingOffer.getAmount();
				if(amt>0){
					str.append(" get "+amt+"$ Shipping on");
					for(String productId: shippingOffer.getOffers()){
						str.append(productId +",");
					}
				}
				
			}
			
		}
		
	}
		//System.out.println(str.toString());
	}
	
	
	
	

	
	
}
