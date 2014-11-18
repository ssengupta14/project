package com.elenverve.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.elenverve.dvo.PurchaseDvo;

public class OrderService {

	private static final Logger logger = Logger.getLogger(OrderService.class);
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public List<PurchaseDvo> getOrderHistory(String emailId){
		logger.debug("Getting order history for "+ emailId); 
		List<PurchaseDvo> purchaseDvos = null ; 
		return purchaseDvos;
	}
	
}
