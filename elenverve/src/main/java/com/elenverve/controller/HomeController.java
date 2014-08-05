package com.elenverve.controller;




import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.elenverve.model.Home;
import com.elenverve.model.Products;
import com.elenverve.model.UploadForm;



 
@Controller
@RequestMapping("/")
public class HomeController {
	

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
		 	System.out.println("Inside home controller for upload");
	    	String name =request.getParameter("name");
	    	fileUpload file = (fileUpload) request.getAttribute("file");
		 
		 	
	    	MultipartFile multipartFile = file.getFile();
	    	 
			String fileName="";
	 
			if(multipartFile!=null){
				fileName = multipartFile.getOriginalFilename();
				//do whatever you want
			}
			System.out.println("uploaded file "+ fileName+", returning to jsp");
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
		Home home = new Home();
		model.addAttribute("home", home);
		
		return "index8";
 
	}
	@RequestMapping(value={ "/products*", "/welcome**" }, method = RequestMethod.GET)
	public String products(ModelMap model,HttpServletRequest request) {
		
		
		/*
		ProductParser parser = new ProductParser();
		List<Product> prodList = parser.getProductList();
		model.addAttribute("prodList", prodList);
		*/
		Products products = new Products();
		model.addAttribute("model", products);
		model.addAttribute("prodList", products.getProducts());
		model.addAttribute("page", "products");
		return "template";
 
	}
	@RequestMapping(value={ "/", "/welcome**" }, method = RequestMethod.GET)
	public String test(ModelMap model,HttpServletRequest request) {
		
		
		/*
		ProductParser parser = new ProductParser();
		List<Product> prodList = parser.getProductList();
		model.addAttribute("prodList", prodList);
		*/
		Home home = new Home();
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