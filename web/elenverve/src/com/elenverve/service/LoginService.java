package com.elenverve.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.elenverve.common.IConstants;
import com.elenverve.common.Parameters;
import com.elenverve.dvo.CredentialsDvo;
import com.elenverve.dvo.UserDvo;
  
@SuppressWarnings("deprecation")
@Service
public class LoginService {//implements  UserDetailsService  {
 
	//private JdbcTemplate jdbcTemplate;
	 @Autowired
	private MongoTemplate mongoTemplate;
	
	private static final Logger logger = Logger.getLogger(LoginService.class);
	
	public UserDvo getUserByEmailId(String emailId){
		logger.debug("Getting access details from user db !!"); 
        Query userquery = new Query();	       
        userquery.addCriteria(Criteria.where("emailId").is(emailId));
		UserDvo userDvo = mongoTemplate.findOne(userquery, UserDvo.class);
		return userDvo;
	}
	
    /*@Override
    public UserDetails loadUserByUsername(String emailId) throws UsernameNotFoundException, DataAccessException
    {
    	try{
	        logger.debug("Getting access details from user db !!"); 
	        
	        if(mongoTemplate == null){
	        	logger.debug("mongoTemplate is null !!"); 
	        }else{
	        	logger.debug("mongoTemplate is not null !!"); 
	        }
	        Query userquery = new Query();
	       
	        userquery.addCriteria(Criteria.where("emailId").is(emailId));
			UserDvo userDvo = mongoTemplate.findOne(userquery, UserDvo.class);
			 logger.debug("Current User is ....["+userDvo.getEmailId()+"]"); 
	        //String sql = "SELECT * FROM USER_AUTH WHERE EMAIL_ID ='" + username + "'";        
	       //UserAuthenticationBean userAuthenticationBean = jdbcTemplate.queryForObject(sql,userAuthenticationBeanMapper  ) ;
	        List<GrantedAuthority> list = new ArrayList<GrantedAuthority> ();
	        UserDetails user = null;
	        
	        if(userDvo != null){        	 
	             GrantedAuthority grantedAuthority = new GrantedAuthorityImpl(userDvo.getCredentials().getAuthority());
	             list.add(grantedAuthority);
	             user = new User(userDvo.getFirstName(), userDvo.getCredentials().getPassword(), true, true, true, true, list);
	             logger.debug("user found .."); 
	             return user;
	        }     
	        // Ideally it should be fetched from database and populated instance of
	        // #org.springframework.security.core.userdetails.User should be returned from this method       
	        logger.debug("User not found ...."); 
	        throw new UsernameNotFoundException("User Not found");
    	}catch(Exception ex){
    		throw new UsernameNotFoundException(" Request is failed") ;
    	}
    }*/
    
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
        
    public String registerUser(UserDvo userDvo) throws DataAccessException {
    	logger.debug("Creating new user ["+userDvo.getEmailId()+"] in db !!");
		
    	if(!(userDvo==null) && !isExistingUser(userDvo.getEmailId())){
    		mongoTemplate.save(userDvo);
    	}
        
        return "SUCCESS";
    }

	
}