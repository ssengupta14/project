package com.elenverve.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.RememberMeServices;
import org.springframework.security.web.context.SecurityContextRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
// @RequestMapping("/login")
public class LoginController {
	@Autowired
	@Qualifier("authenticationManager")
	AuthenticationManager authenticationManager;

	/*@Autowired
	SecurityContextRepository repository;*/

	/*@Autowired
	RememberMeServices rememberMeServices;*/

	/*@RequestMapping(method = RequestMethod.GET)
	public void login() {
	}*/

	/*@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public String performLogin(
			@RequestParam("j_username") String username,	@RequestParam("j_password") String password,
			HttpServletRequest request, HttpServletResponse response) {

		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username, password);
		System.out.println("hi");
		try {
			Authentication auth = authenticationManager.authenticate(token);
			SecurityContextHolder.getContext().setAuthentication(auth);
			repository.saveContext(SecurityContextHolder.getContext(), request,	response);
			rememberMeServices.loginSuccess(request, response, auth);
			return "{\"status\": true}";
		} catch (BadCredentialsException ex) {
			return "{\"status\": false, \"error\": \"Bad Credentials\"}";
		}
	}*/
   
	@RequestMapping(value = { "/evlogin" }, method = RequestMethod.GET)
	public String checkoutLogin(ModelMap model, HttpServletRequest request) {
		model.addAttribute("page", "evlogin");
		// return "evlogin";
		return "logintemplate";
	}
	
	@RequestMapping(value = "/fail2login", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {
		model.addAttribute("error", "true");
		model.addAttribute("page", "evlogin");
		return "logintemplate";

	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(ModelMap model) {
		model.addAttribute("page", "evlogin");
		return "logintemplate";

	}
}
