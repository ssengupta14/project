package com.elenverve.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
 

 
@Repository
public class UsersDAO implements  UserDetailsService  {
 

    @SuppressWarnings("deprecation")
    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException, DataAccessException
    {
        System.out.println("Getting access details from employee dao !!");
        List<GrantedAuthority> list = new ArrayList<GrantedAuthority> ();
        GrantedAuthority grantedAuthority = new GrantedAuthorityImpl("ROLE_USER");
        list.add(grantedAuthority);
        // Ideally it should be fetched from database and populated instance of
        // #org.springframework.security.core.userdetails.User should be returned from this method
        UserDetails user = new User(username, "password,", true, true, true, true, list);
        return user;
    }
}