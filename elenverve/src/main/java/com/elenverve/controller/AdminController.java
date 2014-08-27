package com.elenverve.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.elenverve.dao.UsersDAO;
import com.elenverve.db.beans.UserAuthenticationBean;
import com.elenverve.db.beans.UserDetailBean;
import com.elenverve.model.Admin;
import com.elenverve.model.Home;
import com.elenverve.model.UploadForm;
import com.elenverve.validator.FileUploadValidator;


@Controller
@RequestMapping("/")
public class AdminController {
	//@Autowired  
	//FileUploadValidator fileValidator;  
	
	@Autowired  
	UsersDAO usersDAO;  
	
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
		
		UserDetailBean userDetailBean = new UserDetailBean();
		UserAuthenticationBean userAuthenticationBean = new UserAuthenticationBean();
		userDetailBean.setFirstName(regFirstfName);
		userDetailBean.setLastName(regLastfName);
		userDetailBean.setEmailId(regEmail);
		userDetailBean.setUserType(1);
		
		userAuthenticationBean.setEmailId(regEmail);
		userAuthenticationBean.setPassword(regPassword);
		userAuthenticationBean.setAuthority("ROLE_USER");
		try{
			UserDetails user = usersDAO.loadUserByUsername(regEmail);
			if(user != null && user.getUsername().equalsIgnoreCase(regEmail)){
				return "{\"status\": false, \"error\": \"  User already exists \"}";
			}
			usersDAO.registerUser(userDetailBean, userAuthenticationBean);
			return "{\"status\": true}";
		}catch(Exception ex){
			ex.printStackTrace();
			return "{\"status\": false, \"error\": \"  User creation failed. \"}";
		}		
	}	
}
