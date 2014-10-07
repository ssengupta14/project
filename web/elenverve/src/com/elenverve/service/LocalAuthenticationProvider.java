package com.elenverve.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.elenverve.dvo.UserDvo;


/*
 Extend AbstractUserDetailsAuthenticationProvider when you want to
 prehandle authentication, as in throwing custom exception messages,
 checking status, etc. 
 */
@Component
public class LocalAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	//@Autowired UserService userService;
	@Autowired LoginService loginService;
	
    @Autowired private PasswordEncoder encoder;

	@Override
	protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken authentication)
			throws AuthenticationException {
	}

	@Override
	public UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        String password = (String) authentication.getCredentials();
        if (!StringUtils.hasText(password)) {
        	logger.warn("Username {}: no password provided", username);
            throw new BadCredentialsException("Please enter password");
        }

        UserDvo user = loginService.getUserByEmailId(username);
        if (user == null) {
        	logger.warn("Username {} password {}: user not found", username, password);
            throw new UsernameNotFoundException("Invalid Login");
        }
        
        if (!encoder.matches(password, user.getCredentials().getPassword())) {
        	logger.warn("Username {} password {}: invalid password", username, password);
            throw new BadCredentialsException("Invalid Login");
        }
        /*
        if (!(UserAccountStatus.STATUS_APPROVED.name().equals(user.getStatus()))) {
        	logger.warn("Username {}: not approved", username);
            throw new BadCredentialsException("User has not been approved");
        }
        if (!user.getEnabled()) {
        	logger.warn("Username {}: disabled", username);
            throw new BadCredentialsException("User disabled");
        }*/

        //final List<GrantedAuthority> auths;
        List<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();
        if (!user.getCredentials().getAuthority().isEmpty()) {
        	GrantedAuthority grantedAuthority = new GrantedAuthorityImpl(user.getCredentials().getAuthority());
	    	auths.add(grantedAuthority) ; //AuthorityUtils.commaSeparatedStringToAuthorityList(user.getRolesCSV());
        } else {
        	//auths = AuthorityUtils.NO_AUTHORITIES;
        }

        return new User(username, user.getCredentials().getPassword(), 
        		true, // enabled
                true, // account not expired
                true, // credentials not expired
                true, // account not locked
                auths);
	}

}
