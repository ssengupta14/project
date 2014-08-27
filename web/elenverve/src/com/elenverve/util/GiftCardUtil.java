package com.elenverve.util;

import java.util.List;

import com.elenverve.dvo.GiftCardDvo;

public class GiftCardUtil {
	public static double redeemGiftCardAmount(List<GiftCardDvo> giftCards){
		double amount=0.0;
		for(GiftCardDvo card: giftCards){
			if(card.isAuthorized()){
				
			}
		}
		return amount;
	}

}
