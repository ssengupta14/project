package com.elenverve.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.elenverve.dao.ElenVerveDao;
import com.elenverve.dao.SequenceDao;
import com.elenverve.dvo.PurchaseDvo;
import com.elenverve.dvo.ShippingAddressDvo;
import com.elenverve.dvo.UserDvo;
import com.elenverve.exception.SequenceException;

public class ElenVerveService {
	
	private static final Logger logger = Logger.getLogger(OrderService.class);
	
	@Autowired
	ElenVerveDao elenVerveDaoImpl;
	
	@Autowired
	SequenceDao sequenceDaoImpl;
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public List<PurchaseDvo> getOrderHistory(String emailId){
		logger.debug("Getting order history for "+ emailId); 
		List<PurchaseDvo> purchaseDvos = null ; 
		Query userquery = new Query();	       
	    userquery.addCriteria(Criteria.where("customerId").is(emailId));
	    purchaseDvos = mongoTemplate.find(userquery, PurchaseDvo.class);
		return purchaseDvos;
	}
	
	/**
     *     
     * @param userDvo
     * @return
     * @throws DataAccessException
     */
    public String addShippingAddress(ShippingAddressDvo shippingAddressDvo) throws DataAccessException {
    	logger.debug("Creating new shipping address ["+shippingAddressDvo.getCustomerId()+"] in db !!");
    	shippingAddressDvo.setId(""+sequenceDaoImpl.getNextSequenceId("SHIPPING_ADDRESS"));
    	mongoTemplate.save(shippingAddressDvo);    	       
        return "SUCCESS";
    }
    
	public Set<ShippingAddressDvo> getShippingAddress(String emailId){
		logger.debug("Getting Shipping address for "+ emailId); 
		List<ShippingAddressDvo> shippingAddressDvoList = null ; 
		Query userquery = new Query();	       
	    userquery.addCriteria(Criteria.where("customerId").is(emailId));
	    shippingAddressDvoList = mongoTemplate.find(userquery, ShippingAddressDvo.class);
	    Set<ShippingAddressDvo> shippingAddressDvos = new HashSet<ShippingAddressDvo>(shippingAddressDvoList);
		return shippingAddressDvos;
	}
	
	public long getNextSequenceId(String key) throws SequenceException{
		return sequenceDaoImpl.getNextSequenceId(key);
	}
	
	
}
