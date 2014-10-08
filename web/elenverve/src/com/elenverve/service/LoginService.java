package com.elenverve.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.elenverve.dvo.CustomerDvo;
import com.elenverve.dvo.UserDvo;
import com.mongodb.WriteResult;

@Service
public class LoginService {
 
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	private static final Logger logger = Logger.getLogger(LoginService.class);
	
	public CustomerDvo getUserByEmailId(String emailId){
		logger.debug("Getting access details from user db !!"); 
        Query userquery = new Query();	       
        userquery.addCriteria(Criteria.where("emailId").is(emailId));
        CustomerDvo customerDvo = mongoTemplate.findOne(userquery, CustomerDvo.class);
		return customerDvo;
	}	
    
    /**
	 * Checks if the user is an existing user
	 * @param emailId
	 * @return
	 */
	public boolean isExistingUser(String emailId) {
		// TODO: add 1st level householding keys in search
		logger.debug("Checking if user already exists in db !!");
		Query userquery = new Query();
		userquery.addCriteria(Criteria.where("emailId").is(emailId));
		UserDvo tmpUserDvo = mongoTemplate.findOne(userquery, UserDvo.class);
		if (tmpUserDvo != null) {
			return true;
		}
		return false;
	}
	public boolean updateCustomer(CustomerDvo customerDvo){
		
		logger.debug("Updating user in db !!");
		Query userquery = new Query();
		Update update = new Update();
		update.addToSet("customerDvo", customerDvo);
		userquery.addCriteria(Criteria.where("emailId").is(customerDvo.getEmailId()));
		mongoTemplate.updateFirst(userquery, update, CustomerDvo.class);
		return true;
		
	}
	
    /**
     *     
     * @param userDvo
     * @return
     * @throws DataAccessException
     */
    public String registerUser(UserDvo userDvo) throws DataAccessException {
    	logger.debug("Creating new user ["+userDvo.getEmailId()+"] in db !!");
		
    	if(!(userDvo==null) && !isExistingUser(userDvo.getEmailId())){
    		mongoTemplate.save(userDvo);
    	}        
        return "SUCCESS";
    }
    /**
     * 
     * @param customerDvo
     * @return
     * @throws DataAccessException
     */
    public String registerUser(CustomerDvo customerDvo) throws DataAccessException {
    	logger.debug("Creating new customer ["+customerDvo.getEmailId()+"] in db !!");
		
    	if(!(customerDvo==null) && !isExistingUser(customerDvo.getEmailId())){
    		mongoTemplate.save(customerDvo);
    	}        
        return "SUCCESS";
    }

    public static void main(String arg[]){
    	LoginService serv = new LoginService();
    	CustomerDvo customerDvo = new CustomerDvo();
    	customerDvo.setEmailId("a@gmail.com");
    	customerDvo.setFirstName("s");
    	customerDvo.setLastName("sen");
    	
    	serv.updateCustomer(customerDvo);
    }
	
}