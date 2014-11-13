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
	
	@RequestMapping(value={ "/viewcart" }, method = RequestMethod.GET)
	public String viewCart(ModelMap model,HttpServletRequest request) {		
		model.addAttribute("page", "cart");		
		return "template"; 
	}
	
	@RequestMapping(value={ "/shippingaddress" }, method = {RequestMethod.POST,RequestMethod.GET})
	public String shippingAddress(ModelMap model,HttpServletRequest request) {		
		
		CustomerDvo customerDvo = (CustomerDvo) request.getSession().getAttribute(IConstants.ANONYMOUS_USER);
		ShippingAddress shippingAddress = new ShippingAddress(customerDvo);
		model.addAttribute("modal", shippingAddress );		
		model.addAttribute("page", "shippingaddress");
		model.addAttribute("noFooter","true");
		model.addAttribute("noHeader","true");
		return "template"; 
	}
	
	@RequestMapping(value={ "/addnewaddress" }, method = RequestMethod.POST)
	public String addNewAddress(	@RequestParam("fullName") String fullName, 
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
		customerDvo.setDefaultShippingAddressId(generatedId);
		customerDvo.addShipingAddress(shippingAddressDvo);
		loginService.updateCustomer(customerDvo);
		logger.info("Updated shipping address");
		request.getSession().setAttribute(IConstants.ANONYMOUS_USER, customerDvo);
		ShippingAddress shippingAddress = new ShippingAddress(customerDvo);
		model.addAttribute("modal", shippingAddress );		
		model.addAttribute("page", "shippingaddress");
		model.addAttribute("noFooter","true");
		return "template"; 
	}
	
	@RequestMapping(value={ "/revieworder" }, method = RequestMethod.POST)
	public String reviewOrder(@RequestParam("addressId") String addressId, ModelMap model,HttpServletRequest request) {	
		CustomerDvo customerDvo = (CustomerDvo) request.getSession().getAttribute(IConstants.ANONYMOUS_USER);
		ShippingAddress shippingAddress = new ShippingAddress(customerDvo);
		try {
			model.addAttribute("modal", shippingAddress.getDefaultShippingAddressDvo(addressId));
		} catch (Exception e) {			
			e.printStackTrace();
		}		
		model.addAttribute("page", "revieworder");	
		model.addAttribute("noFooter","true");
		return "template"; 
	}
	
	@RequestMapping(value={ "/payment" }, method = RequestMethod.POST, params={"checkout", "!edit"})	
	public String payment(@RequestParam String checkout,ModelMap model,HttpServletRequest request) {	
		System.out.println("checkout  " + checkout);		
		model.addAttribute("page", "payment");	
		model.addAttribute("noFooter","true");
		return "template"; 
	}
	
	@RequestMapping(value={ "/payment" }, method = RequestMethod.POST, params={"!checkout", "edit"})
	public String editCart(@RequestParam String edit,ModelMap model,HttpServletRequest request) {	
		model.addAttribute("page", "cart");		
		return "template"; 
	}	

	@RequestMapping(value="/selectProduct", method=RequestMethod.GET)
	public String selectProduct(ModelMap model,HttpServletRequest request) {
		model.addAttribute("noHeader","true");
		model.addAttribute("noFooter","true");
		model.addAttribute("page", "selectProduct");		
		return "template"; 
	}

}
