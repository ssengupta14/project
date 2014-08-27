package com.elenverve.controller;




import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.elenverve.dao.DbAccessService;
import com.elenverve.dvo.CollectionDvo;
import com.elenverve.dvo.ProductDvo;
import com.elenverve.model.Home;
import com.elenverve.model.Products;



 
@Controller
@RequestMapping("/")
public class HomeController extends DefaultController{
	private static final Logger logger = Logger.getLogger(HomeController.class);
	// Initialize the dbAccess layer & remove the below line
	

/*		
	@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
	public ModelAndView defaultPage() {
 
	  ModelAndView model = new ModelAndView();
	  model.addObject("title", "Spring Security Login Form - Database Authentication");
	  model.addObject("message", "This is default page!");
	  model.setViewName("hello");
	  return model;
 
	}
 
*/
	/*
	@RequestMapping(value={ "/", "/welcome**" }, method = RequestMethod.GET)
	public String index(ModelMap model,HttpServletRequest request) {
		return "index";
 
	}*/
	/*
	@RequestMapping(value={ "/upload"}, method = RequestMethod.GET)
	public String fakeFileUpload(ModelMap model,HttpServletRequest request) {
		return "test";
 
	}
	
	 @RequestMapping(value={"/upload"}, method=RequestMethod.POST)
	    public String handleFileUpload(ModelMap model ,HttpServletRequest request){
	 	//@RequestParam("name") String name, 
	           // @RequestParam("file") fileUpload file){
		 	//logger.debug("Inside home controller for upload");
	    	String name =request.getParameter("name");
	    	fileUpload file = (fileUpload) request.getAttribute("file");
		 
		 	
	    	MultipartFile multipartFile = file.getFile();
	    	 
			String fileName="";
	 
			if(multipartFile!=null){
				fileName = multipartFile.getOriginalFilename();
				//do whatever you want
			}
			//logger.debug("uploaded file "+ fileName+", returning to jsp");
			model.addAttribute("fileName",fileName);
			return "FileUploadSuccess";
	    	
	    }
	
	*/
	@RequestMapping(value={ "/test"}, method = RequestMethod.GET)
	public String twest(ModelMap model,HttpServletRequest request) {
		
		return "test1";
 
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
 
}