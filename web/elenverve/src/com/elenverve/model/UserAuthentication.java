package com.elenverve.model;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.elenverve.common.Parameters;
import com.elenverve.dvo.CredentialsDvo;
import com.elenverve.dvo.UserDvo;
import com.elenverve.service.LoginService;

public class UserAuthentication  extends Default{
	
	@Autowired  
	LoginService loginService; 
	private String message;
	
	private static final Logger logger = Logger.getLogger(UserAuthentication.class);
	public UserAuthentication(Parameters parameters){
		//this.dbService = dbService;
		this.parameters= parameters;
		this.message = registerUser();
	}
	
	private String registerUser(){
		logger.debug("Inside UserAuthentication , registerUser method, Registering user");
		String fName = (String)this.parameters.getParameter(FIRST_NAME);
		String lName = (String)this.parameters.getParameter(LAST_NAME);
		String email = (String)this.parameters.getParameter(EMAIL_ID);
		String password =(String)this.parameters.getParameter(PASSWORD);
		logger.debug("Inside UserAuthentication , registerUser method, Registering user ["+fName+"] ["+lName+"] ["+email+"] ["+password+"]");
		UserDvo user = new UserDvo();
		user.setFirstName(fName);
		user.setLastName(lName);
		user.setEmailId(email);
		CredentialsDvo credentials = new CredentialsDvo();
		credentials.setPassword(password);
		credentials.setAuthority("ROLE_USER");
		user.setCredentials(credentials);
		if(loginService == null){
			logger.debug("login service is null ...");
		}
		logger.debug("Inside UserAuthentication , loginService is "+loginService.toString()+" checking user exists or not..");
		if(loginService.isExistingUser(email)){
			return "{\"status\": false, \"error\": \"  User already exists \"}";
		}
		logger.debug("Inside UserAuthentication , loginService is "+loginService.toString()+" now registering user");
		loginService.registerUser(user);
		return "{\"status\": true}";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}