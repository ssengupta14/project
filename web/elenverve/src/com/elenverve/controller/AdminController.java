package com.elenverve.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.elenverve.model.Admin;
import com.elenverve.service.LoginService;


@Controller
@RequestMapping("/")
public class AdminController {
	
	@Autowired  
	LoginService loginService;
	

	private static final Logger logger = Logger.getLogger(AdminController.class);
	 
	
	@RequestMapping(value={ "/admin"}, method = RequestMethod.GET)
	public String admin(ModelMap model,HttpServletRequest request) {
		
		Admin admin = new Admin();
		model.addAttribute("model", admin);
		model.addAttribute("page", "admin");
		return "template";
 
	}
	
	
}
