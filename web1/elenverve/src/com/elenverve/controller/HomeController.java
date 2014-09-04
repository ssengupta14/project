package com.elenverve.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.elenverve.dvo.CollectionDvo;
import com.elenverve.model.Home;
 
@Controller
@RequestMapping("/")
public class HomeController extends DefaultController{
	private static final Logger logger = Logger.getLogger(HomeController.class);
	// Initialize the dbAccess layer & remove the below line
	
	@RequestMapping(value={ "/", "/welcome**" }, method = RequestMethod.GET)
	public String landing(ModelMap model,HttpServletRequest request) {
		logger.debug("Invoking method [landing] from controller [HomeController] for context [/]");
		
		/*
		ProductParser parser = new ProductParser();
		List<Product> prodList = parser.getProductList();
		model.addAttribute("prodList", prodList);
		*/
		
		// call data access layer & get list of collections & categories
		Home home = new Home(dbAccess);
		model.addAttribute("model", home);
		model.addAttribute("page", "landing");
		return "template";
 
	}
 
	@RequestMapping(value="/welcome/{name}", method = RequestMethod.GET)
	public String welcomeName(@PathVariable String name, ModelMap model) {
 
		model.addAttribute("message", "Maven Web Project + Spring 3 MVC - " + name);
		return "index1";
 
	}
	
	
	@RequestMapping(value={ "/home8", "/welcome**" }, method = RequestMethod.GET)
	public String index2(ModelMap model,HttpServletRequest request) {
		
		
		/*
		ProductParser parser = new ProductParser();
		List<Product> prodList = parser.getProductList();
		model.addAttribute("prodList", prodList);
		*/
		
		List<CollectionDvo> dvo= dbAccess.getCollections();
		Home home = new Home(dbAccess);
		model.addAttribute("home", home);
		
		return "index8";
 
	}
	
	@RequestMapping(value="/links", method=RequestMethod.GET)
	public void links() {}
	
	@RequestMapping(value="/links1", method=RequestMethod.GET)
	public void links1() {}
 
}