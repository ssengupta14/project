package com.elenverve.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import com.elenverve.db.beans.UserAuthenticationBean;
import com.elenverve.db.beans.UserDetailBean;
  
@SuppressWarnings("deprecation")
@Repository
public class UsersDAO extends BaseDao implements  UserDetailsService  {
 
	
	
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException
    {
    	try{
	        System.out.println("Getting access details from employee dao !!");        
	        String sql = "SELECT * FROM USER_AUTH WHERE EMAIL_ID ='" + username + "'";        
	        UserAuthenticationBean userAuthenticationBean = jdbcTemplate.queryForObject(sql,userAuthenticationBeanMapper  ) ;
	        List<GrantedAuthority> list = new ArrayList<GrantedAuthority> ();
	        UserDetails user = null;
	        
	        if(userAuthenticationBean != null){        	 
	             GrantedAuthority grantedAuthority = new GrantedAuthorityImpl(userAuthenticationBean.getAuthority());
	             list.add(grantedAuthority);
	             user = new User(username, userAuthenticationBean.getPassword(), true, true, true, true, list);
	             return user;
	        }     
	        // Ideally it should be fetched from database and populated instance of
	        // #org.springframework.security.core.userdetails.User should be returned from this method       
	        throw new UsernameNotFoundException("User Not found");
    	}catch(Exception ex){
    		throw new UsernameNotFoundException(" Request is failed") ;
    	}
    }
        
    public String registerUser(UserDetailBean userDetailBean, UserAuthenticationBean userAuthenticationBean) throws DataAccessException
    {
        System.out.println("Request to create user !!");
        String sql = "INSERT INTO USER_DTL (EMAIL_ID,F_NAME,L_NAME,USER_TYPE) "
        		+ "VALUES('"+userDetailBean.getEmailId()+"','"+userDetailBean.getFirstName()+"','"+userDetailBean.getLastName()+"',1)" ;
        jdbcTemplate.update(sql);
        
        sql = "INSERT INTO USER_AUTH (EMAIL_ID,PASSWORD,AUTHORITY) "
        		+ "VALUES('"+userAuthenticationBean.getEmailId()+"','"+userAuthenticationBean.getPassword()+"','ROLE_USER')" ;
        jdbcTemplate.update(sql);
        
        return "SUCCESS";
    }
	

}