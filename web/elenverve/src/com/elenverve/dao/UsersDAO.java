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
  
@SuppressWarnings("deprecation")
@Repository
public class UsersDAO implements  UserDetailsService  {
 
	private JdbcTemplate jdbcTemplate;
	
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException
    {
        System.out.println("Getting access details from employee dao !!");
        List<GrantedAuthority> list = new ArrayList<GrantedAuthority> ();
        GrantedAuthority grantedAuthority = new GrantedAuthorityImpl("ROLE_USER");
        list.add(grantedAuthority);
        // Ideally it should be fetched from database and populated instance of
        // #org.springframework.security.core.userdetails.User should be returned from this method
        UserDetails user = new User(username, "password", true, true, true, true, list);
        return user;
    }
	
	public void setDataSource(DataSource dataSource){
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
}