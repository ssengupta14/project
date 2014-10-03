package com.elenverve.model;

import org.apache.log4j.Logger;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.elenverve.common.IConstants;
import com.elenverve.common.Parameters;
import com.elenverve.dvo.CredentialsDvo;
import com.elenverve.dvo.UserDvo;
import com.elenverve.service.LoginService;

public class Login {
	 private String message;
	 public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	private static final Logger logger = Logger.getLogger(LoginService.class);
	 public Login(Parameters parameters){
		 try{
		 	String email = (String)parameters.getParameter(IConstants.EMAIL_ID);
		 	String firstName = (String)parameters.getParameter(IConstants.FIRST_NAME);
		 	String lastName = (String)parameters.getParameter(IConstants.LAST_NAME);
		 	String password = (String)parameters.getParameter(IConstants.PASSWORD);
		 	Object service = parameters.getParameter("login_service");
		 	LoginService loginService = null;
		 	try{
				loginService = (LoginService) service;
				if(service==null){
					logger.debug("service is null");
				}
			}catch(Exception e){
				logger.debug("Exception in getting service"+service.toString());
			}
			logger.debug("user dao here is "+loginService.toString());
			
			
		 	UserDetails user =null;
			try{
				//user = loginService.loadUserByUsername(email);
			}catch(UsernameNotFoundException e){
				user=null;
			}
			if(user != null && user.getUsername().equalsIgnoreCase(email)){
				this.setMessage("{\"status\": false, \"error\": \"  User already exists \"}");
			}
			else{
				UserDvo dvo = new UserDvo();
				dvo.setEmailId(email);
				dvo.setFirstName(firstName);
				dvo.setLastName(lastName);
				CredentialsDvo credentials = new CredentialsDvo();
				credentials.setAuthority("ROLE_USER");
				credentials.setPassword(password);
				dvo.setCredentials(credentials);
				logger.debug("user dao here is "+loginService.toString());
				((LoginService)loginService).registerUser(dvo);
				this.setMessage("{\"status\": true}");
			}
		 }catch(Exception e){
			 logger.debug("Exception occured while registering user "+e.getMessage());
				this.setMessage("{\"status\": false, \"error\": \"  User creation failed. \"}");
		 }
		 	
		 
		 
		 
		 
	 }
	
}
