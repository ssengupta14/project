package com.elenverve.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.elenverve.common.IConstants;
import com.elenverve.dvo.BillingAddressDvo;
import com.elenverve.dvo.CustomerDvo;
import com.elenverve.dvo.PurchaseDvo;
import com.elenverve.dvo.ShippingAddressDvo;
import com.elenverve.model.Admin;
import com.elenverve.model.ShippingAddress;
import com.elenverve.service.LoginService;
import com.elenverve.service.OrderService;

@Controller
@RequestMapping("/")
public class AdminController {	
	
	@Autowired  
	LoginService loginService;	

	@Autowired
	OrderService orderService;
	
	private static final Logger logger = Logger.getLogger(AdminController.class);	 
	
	@RequestMapping(value={ "/admin"}, method = RequestMethod.GET)
	public String admin(ModelMap model,HttpServletRequest request) {
		
		Admin admin = new Admin();
		model.addAttribute("model", admin);
		model.addAttribute("page", "admin");
		return "template"; 
	}
	
	@RequestMapping(value={ "/orderhistory"}, method = RequestMethod.GET)
	public String orderhistory(ModelMap model,HttpServletRequest request) {
		String emailId = (String)request.getSession().getAttribute(IConstants.EMAIL_ID);
		List<PurchaseDvo> purchaseDvos = orderService.getOrderHistory(emailId);
		model.addAttribute("purchaseDvos",purchaseDvos);
		model.addAttribute("noFooter","true");
		model.addAttribute("page", "orderhistory");
		return "template"; 
	}
	
	@RequestMapping(value="/myevaccount", method=RequestMethod.GET)
	public String myevaccount(ModelMap model,HttpServletRequest request) {
		logger.info("In My account: ");		
		CustomerDvo customerDvo = (CustomerDvo) request.getSession().getAttribute(IConstants.ANONYMOUS_USER);
		customerDvo = validateCustomerDVO(request, customerDvo);

		model.addAttribute("customerDvo", customerDvo);
		model.addAttribute("page", "myevaccount");
		model.addAttribute("noHeader","true");
		model.addAttribute("noFooter","true");
		return "template"; 
	}


	@RequestMapping(value={ "/addbillingaddress" }, method = RequestMethod.POST)
	public String addBillingAddress(	@RequestParam("fullName") String fullName, 
								@RequestParam("streetNo") String streetNo,
								@RequestParam("streetName") String streetName,
								@RequestParam("aptNo") String aptNo,
								@RequestParam("city") String city,
								@RequestParam("state") String state,
								@RequestParam("zip") String zip,
								@RequestParam("country") String country,
								ModelMap model,HttpServletRequest request) {	
		//ShippingAddressDvo  shippingAddressDvo = new ShippingAddressDvo() ;
		BillingAddressDvo billingAddressDvo = new BillingAddressDvo();
		String generatedId = (streetNo+"_"+ streetName).replaceAll(" ", "") ;
		
		billingAddressDvo.setId(generatedId);
		billingAddressDvo.setFullName(fullName);
		billingAddressDvo.setStreetNo(streetNo);
		billingAddressDvo.setStreetName(streetName);
		billingAddressDvo.setUnitName(aptNo);
		billingAddressDvo.setCity(city);
		billingAddressDvo.setState(state);
		billingAddressDvo.setZip(zip);
		billingAddressDvo.setCountry(country);
		CustomerDvo customerDvo = (CustomerDvo) request.getSession().getAttribute(IConstants.ANONYMOUS_USER);
		customerDvo = validateCustomerDVO(request, customerDvo);
		customerDvo.setDefaultShippingAddressId(generatedId);
		customerDvo.setBillingAddress(billingAddressDvo);
		loginService.updateCustomer(customerDvo);
		logger.info("Updated billing address");
		request.getSession().setAttribute(IConstants.ANONYMOUS_USER, customerDvo);		
		model.addAttribute("customerDvo", customerDvo);
		model.addAttribute("page", "myevaccount");
		model.addAttribute("noHeader","true");
		model.addAttribute("noFooter","true");
		return "template"; 
	}
	
	@RequestMapping(value={ "/editbillingaddress" }, method = RequestMethod.POST)
	public String editBillingAddress(	@RequestParam("editFullName") String fullName, 
								@RequestParam("editStreetNo") String streetNo,
								@RequestParam("editStreetName") String streetName,
								@RequestParam("editAptNo") String aptNo,
								@RequestParam("editCity") String city,
								@RequestParam("editState") String state,
								@RequestParam("editZip") String zip,
								@RequestParam("editCountry") String country,
								ModelMap model,HttpServletRequest request) {	
		//ShippingAddressDvo  shippingAddressDvo = new ShippingAddressDvo() ;
		BillingAddressDvo billingAddressDvo = new BillingAddressDvo();
		String generatedId = (streetNo+"_"+ streetName).replaceAll(" ", "") ;
		
		billingAddressDvo.setId(generatedId);
		billingAddressDvo.setFullName(fullName);
		billingAddressDvo.setStreetNo(streetNo);
		billingAddressDvo.setStreetName(streetName);
		billingAddressDvo.setUnitName(aptNo);
		billingAddressDvo.setCity(city);
		billingAddressDvo.setState(state);
		billingAddressDvo.setZip(zip);
		billingAddressDvo.setCountry(country);
		CustomerDvo customerDvo = (CustomerDvo) request.getSession().getAttribute(IConstants.ANONYMOUS_USER);
		customerDvo = validateCustomerDVO(request, customerDvo);
		customerDvo.setDefaultShippingAddressId(generatedId);
		customerDvo.setBillingAddress(billingAddressDvo);
		loginService.updateCustomer(customerDvo);
		logger.info("Updated billing address");
		request.getSession().setAttribute(IConstants.ANONYMOUS_USER, customerDvo);		
		model.addAttribute("customerDvo", customerDvo);
		model.addAttribute("page", "myevaccount");
		model.addAttribute("noHeader","true");
		model.addAttribute("noFooter","true");
		return "template"; 
	}
	
	
	@RequestMapping(value={ "/addshippingaddress" }, method = RequestMethod.POST)
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
	
	private CustomerDvo validateCustomerDVO(HttpServletRequest request,	CustomerDvo customerDvo) {
		if(customerDvo != null){
			if(customerDvo.getFirstName() == null || customerDvo.getLastName() == null){
				String emailId = (String)request.getSession().getAttribute(IConstants.EMAIL_ID);
				customerDvo = loginService.getUserByEmailId(emailId);
			}			
		}
		return customerDvo;
	}
}
