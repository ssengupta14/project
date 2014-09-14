package com.elenverve.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.elenverve.common.IConstants;
import com.elenverve.common.Parameters;
import com.elenverve.model.Admin;
import com.elenverve.model.UserAuthentication;


@Controller
@RequestMapping("/")
public class AdminController {
	//@Autowired  
	//FileUploadValidator fileValidator;  
	private static final Logger logger = Logger.getLogger(AdminController.class);
	 
	
	@RequestMapping(value={ "/admin"}, method = RequestMethod.GET)
	public String admin(ModelMap model,HttpServletRequest request) {
		
		/*
		ProductParser parser = new ProductParser();
		List<Product> prodList = parser.getProductList();
		model.addAttribute("prodList", prodList);
		*/
		Admin admin = new Admin();
		model.addAttribute("model", admin);
		model.addAttribute("page", "admin");
		return "template";
 
	}
	
	@RequestMapping(value={ "/register"}, method = RequestMethod.POST)
	/*public String register(ModelMap model,HttpServletRequest request) {*/	
	@ResponseBody
	public String performLogin(
			@RequestParam("regFirstfName") String regFirstfName, 
			@RequestParam("regLastfName") String regLastfName,
			@RequestParam("regEmail") String regEmail,
			@RequestParam("regPassword") String regPassword,
			@RequestParam("regRePassword") String regRePassword,
			HttpServletRequest request, HttpServletResponse response) {
		
		try {
			if (!regPassword.toUpperCase().equals(regRePassword.toUpperCase())) {
				return "{\"status\": false, \"error\": \"  Both passwords should match \"}";
			}
			Parameters parameters = new Parameters();
			parameters.addParameter(IConstants.FIRST_NAME, regFirstfName);
			parameters.addParameter(IConstants.LAST_NAME, regLastfName);
			parameters.addParameter(IConstants.EMAIL_ID, regEmail);
			parameters.addParameter(IConstants.PASSWORD, regPassword);
			UserAuthentication userAuthentication = new UserAuthentication(parameters);
			return userAuthentication.getMessage();
		} catch (Exception ex) {
			logger.debug("Exception occured while registering user "+ex.getMessage());
			return "{\"status\": false, \"error\": \"  User creation failed. \"}";
		}	
	}	
}
