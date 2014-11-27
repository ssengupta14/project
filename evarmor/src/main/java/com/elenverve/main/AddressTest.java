package com.elenverve.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

import com.elenverve.dao.SequenceDao;
import com.elenverve.db.SpringMongoConfig;
import com.elenverve.dvo.ShippingAddressDvo;
import com.elenverve.dvo.UserDvo;
import com.elenverve.service.MockProductService;

public class AddressTest {

	/*@Autowired
	private SequenceDao sequenceDao;*/

	public static void main(String[] args) {
		AddressTest addressTest = new AddressTest() ;
		addressTest.setAddress();
		
	}

	private void setAddress() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
		MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
		SequenceDao sequenceDao = (SequenceDao) ctx.getBean("sequenceDao");
		ShippingAddressDvo shippingAddressDvo = new ShippingAddressDvo();
		shippingAddressDvo.setId("" + 2);
		shippingAddressDvo.setCustomerId("a@a.com");
		shippingAddressDvo.setAddressName("Office");
		shippingAddressDvo.setFullName("Vinod Shiv");
		shippingAddressDvo.setStreetNo("500");
		shippingAddressDvo.setStreetName("Stanton Christana Rd"); 
		shippingAddressDvo.setCity("Newark");
		shippingAddressDvo.setState("DE");
		shippingAddressDvo.setZip("19702");
		shippingAddressDvo.setCountry("USA");
		mongoOperation.save(shippingAddressDvo);
		
	}


}
