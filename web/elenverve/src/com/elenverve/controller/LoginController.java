package com.elenverve.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.elenverve.dvo.CredentialsDvo;
import com.elenverve.dvo.UserDvo;
import com.elenverve.service.LoginService;

@Controller
// @RequestMapping("/login")
public class LoginController {
	@Autowired
	@Qualifier("authenticationManager")
	AuthenticationManager authenticationManager;
	
	@Autowired
	@Qualifier("loginService")
	LoginService loginService;
	   
	@RequestMapping(value = { "/evlogin" }, method = RequestMethod.GET)
	public String checkoutLogin(ModelMap model, HttpServletRequest request) {
		model.addAttribute("page", "evlogin");
		// return "evlogin";
		return "logintemplate";
	}
	
	@RequestMapping(value = "/fail2login", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {
		model.addAttribute("error", "true");
		model.addAttribute("pageName", "sign_in");
		model.addAttribute("reason", "Incorrect login or password.");
		model.addAttribute("page", "evlogin");
		return "logintemplate";

	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(ModelMap model) {
		model.addAttribute("page", "evlogin");
		return "logintemplate";

	}
	
	@RequestMapping(value={ "/register"}, method = RequestMethod.POST)	
	public String performLogin(
			@RequestParam("regFirstfName") String regFirstfName, 
			@RequestParam("regLastfName") String regLastfName,
			@RequestParam("regEmail") String regEmail,
			@RequestParam("regPassword") String regPassword,
			@RequestParam("regRePassword") String regRePassword,
			ModelMap model) {
		
		

		if(loginService.isExistingUser(regEmail)){
			model.addAttribute("error", "true");
			model.addAttribute("pageName", "sign_up");
			model.addAttribute("reason", "User already exists.");
			model.addAttribute("page", "evlogin");
			
			return "logintemplate";
		}else{
			UserDvo userDvo = new UserDvo();
			userDvo.setEmailId(regEmail);
			userDvo.setFirstName(regFirstfName);
			userDvo.setLastName(regLastfName);
			CredentialsDvo credentials = new CredentialsDvo();
			credentials.setAuthority("ROLE_USER");
			credentials.setPassword(regPassword);
			userDvo.setCredentials(credentials);
			loginService.registerUser(userDvo);	
			model.addAttribute("page", "evlogin");
			return "logintemplate";
			
		}	
	}	
}
