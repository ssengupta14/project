package com.elenverve.util;

import java.util.List;

import com.elenverve.dvo.OfferDvo;

public class ConversionPolicyUtil {

	public static double convertOffers2Amount(List<OfferDvo> offers){
		double amount=0.0;
		for(OfferDvo offer:offers){
			// apply offer policy here
			//DISCOUNT
			//SALE
			//PROMO
			//BAG
		}
		
		return amount;
	}
	public static double convertRewards2Amount(int totalRewards){
		double amount=0.0;
		// Apply reward policy
		return amount;
	}
}
