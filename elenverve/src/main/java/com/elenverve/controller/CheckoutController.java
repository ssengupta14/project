package com.elenverve.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.elenverve.service.CartService;
import com.elenverve.service.ProductService;

@Controller
@RequestMapping("/")
public class CheckoutController extends DefaultController{
	
	private static final Logger logger = Logger.getLogger(CheckoutController.class);
	
	@Autowired
	private ProductService productService ;
	
	@Autowired
	private CartService cartService;
	
	public void setCartService(CartService cartService) {
		this.cartService = cartService;
	}
	
	@RequestMapping(value={ "/checkout" }, method = RequestMethod.GET)
	public String products(ModelMap model,HttpServletRequest request) {		
		model.addAttribute("page", "cart");		
		return "template"; 
	}
	
	@RequestMapping(value={ "/viewcart" }, method = RequestMethod.GET)
	public String viewCart(ModelMap model,HttpServletRequest request) {		
		model.addAttribute("page", "cart");		
		return "template"; 
	}
	
}
