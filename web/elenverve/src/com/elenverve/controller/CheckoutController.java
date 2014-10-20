package com.elenverve.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.elenverve.common.IConstants;
import com.elenverve.dvo.CustomerDvo;
import com.elenverve.dvo.ShippingAddressDvo;
import com.elenverve.model.ShippingAddress;
import com.elenverve.service.CartService;
import com.elenverve.service.LoginService;
import com.elenverve.service.ProductService;

@Controller
@RequestMapping("/")
public class CheckoutController extends DefaultController{
	
	private static final Logger logger = Logger.getLogger(CheckoutController.class);
	
	@Autowired
	private ProductService productService ;
	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private LoginService loginService;
	
	public void setCartService(CartService cartService) {
		this.cartService = cartService;
	}
	
	@RequestMapping(value={ "/chaddress" }, method = RequestMethod.GET)
	public String chAddress(ModelMap model,HttpServletRequest request) {		
		model.addAttribute("page", "shippingaddress");		
		CustomerDvo customerDvo = (CustomerDvo) request.getSession().getAttribute(IConstants.ANONYMOUS_USER);
		ShippingAddress shippingAddress = new ShippingAddress(customerDvo).setShippingAddress();
		model.addAttribute("modal", shippingAddress );		
		model.addAttribute("page", "shippingaddress");
		model.addAttribute("noFooter","true");
		return "template"; 
	}
	
	@RequestMapping(value={ "/viewcart" }, method = RequestMethod.GET)
	public String viewCart(ModelMap model,HttpServletRequest request) {		
		model.addAttribute("page", "cart");		
		return "template"; 
	}
	
	@RequestMapping(value={ "/addshaddress" }, method = RequestMethod.POST)
	public String addshaddress(	@RequestParam("fullName") String fullName, 
								@RequestParam("streetNo") String streetNo,
								@RequestParam("streetName") String streetName,
								@RequestParam("aptNo") String aptNo,
								@RequestParam("city") String city,
								@RequestParam("state") String state,
								@RequestParam("zip") String zip,
								@RequestParam("country") String country,
								ModelMap model,HttpServletRequest request) {	
		ShippingAddressDvo  shippingAddressDvo = new ShippingAddressDvo() ;
		String generatedId = (streetNo+"_"+ streetName).replaceAll(" ", "") ;
		
		shippingAddressDvo.setId(generatedId);
		shippingAddressDvo.setFullName(fullName);
		shippingAddressDvo.setStreetNo(streetNo);
		shippingAddressDvo.setStreetName(streetName);
		shippingAddressDvo.setUnitName(aptNo);
		shippingAddressDvo.setCity(city);
		shippingAddressDvo.setState(state);
		shippingAddressDvo.setZip(zip);
		shippingAddressDvo.setCountry(country);
		CustomerDvo customerDvo = (CustomerDvo) request.getSession().getAttribute(IConstants.ANONYMOUS_USER);
		customerDvo.setShippingAddressId(generatedId);
		customerDvo.addShipingAddress(shippingAddressDvo);
		loginService.updateCustomer(customerDvo);
		logger.info("Updated shipping address");
		model.addAttribute("page", "payment");		
		return "template"; 
	}

}
