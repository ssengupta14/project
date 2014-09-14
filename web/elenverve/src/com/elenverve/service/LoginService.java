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
import org.springframework.stereotype.Repository;

import com.elenverve.dvo.UserDvo;
@Repository
public class LoginService implements  UserDetailsService{
	private static final Logger logger = Logger.getLogger(LoginService.class);
	 @Autowired
	 private MongoTemplate mongoTemplate;
	 
	@Override
    public UserDetails loadUserByUsername(String emailId) throws UsernameNotFoundException, DataAccessException
    {
    	try{
	        logger.debug("Getting access details from user db !!"); 
	        
	        Query userquery = new Query();
	       
	        userquery.addCriteria(Criteria.where("emailId").is(emailId));
			UserDvo userDvo = mongoTemplate.findOne(userquery, UserDvo.class);
			 
	        //String sql = "SELECT * FROM USER_AUTH WHERE EMAIL_ID ='" + username + "'";        
	       //UserAuthenticationBean userAuthenticationBean = jdbcTemplate.queryForObject(sql,userAuthenticationBeanMapper  ) ;
	        List<GrantedAuthority> list = new ArrayList<GrantedAuthority> ();
	        UserDetails user = null;
	        
	        if(userDvo != null){        	 
	             GrantedAuthority grantedAuthority = new GrantedAuthorityImpl(userDvo.getCredentials().getAuthority());
	             list.add(grantedAuthority);
	             user = new User(userDvo.getEmailId(), userDvo.getCredentials().getPassword(), true, true, true, true, list);
	             return user;
	        }     
	        // Ideally it should be fetched from database and populated instance of
	        // #org.springframework.security.core.userdetails.User should be returned from this method       
	        throw new UsernameNotFoundException("User Not found");
    	}catch(Exception ex){
    		throw new UsernameNotFoundException(" Request is failed") ;
    	}
    }
	/**
	 * Checks if the user is an existing user
	 * @param emailId
	 * @return
	 */
	public boolean isExistingUser(String user){
		//TODO: add 1st level householding keys in search
		logger.debug("Checking if user already exists in db !!"); 
		Query userquery = new Query();
		 userquery.addCriteria(Criteria.where("emailId").is(user));
			UserDvo tmpUserDvo = mongoTemplate.findOne(userquery, UserDvo.class);
			if(tmpUserDvo!=null){
				return true;
			}
			return false;
	}
	
    public String registerUser(UserDvo userDvo) throws DataAccessException
    {
    	logger.debug("Creating new user in db !!");
        mongoTemplate.save(userDvo);
        /*
        String sql = "INSERT INTO USER_DTL (EMAIL_ID,F_NAME,L_NAME,USER_TYPE) "
        		+ "VALUES('"+userDetailBean.getEmailId()+"','"+userDetailBean.getFirstName()+"','"+userDetailBean.getLastName()+"',1)" ;
        jdbcTemplate.update(sql);
        
        sql = "INSERT INTO USER_AUTH (EMAIL_ID,PASSWORD,AUTHORITY) "
        		+ "VALUES('"+userAuthenticationBean.getEmailId()+"','"+userAuthenticationBean.getPassword()+"','ROLE_USER')" ;
        jdbcTemplate.update(sql);
        */
        return "SUCCESS";
    }
	/*
	public void setDataSource(DataSource dataSource){
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	*/
}
