package com.elenverve.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.elenverve.service.CartService;
import com.elenverve.service.ShoppingCart;

@Controller
@RequestMapping("/")
public class ShoppingCartController {

	private final Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	ShoppingCart shoppingCart;
	
	@Autowired
	CartService cartService;
	
	@RequestMapping(value="/addProduct", method=RequestMethod.GET)
	@ResponseBody
    public String addProduct(	@RequestParam("productId") String productId,
    							ModelMap model,HttpServletRequest request) {
		try{			
			shoppingCart.addItem(cartService.getProduct(productId));
			return "{\"status\": true}";
		} catch (Exception ex) {
			return "{\"status\": false, \"error\": \"Error in adding product\"}";
		}       
    }
	
	@RequestMapping(value="/removeProduct", method=RequestMethod.GET)
	@ResponseBody
    public String removeProduct(	@RequestParam("productId") String productId,
    								ModelMap model,HttpServletRequest request) {
		try{			
			shoppingCart.removeItem(productId);
			return "{\"status\": true}";
		} catch (Exception ex) {
			return "{\"status\": false, \"error\": \"Error in adding product\"}";
		}       
    }
}
