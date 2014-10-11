package com.elenverve.controller;




import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.mobile.device.Device;
import org.springframework.mobile.device.site.SitePreference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import com.elenverve.common.IConstants;
import com.elenverve.common.Parameters;
import com.elenverve.dao.DbAccessService;
import com.elenverve.dao.Person;
import com.elenverve.dvo.BrowserInfoDvo;
import com.elenverve.dvo.CategoryDvo;
import com.elenverve.dvo.CollectionDvo;
import com.elenverve.dvo.OfferDvo;
import com.elenverve.dvo.ProductDvo;
import com.elenverve.dvo.UserDvo;
import com.elenverve.model.Home;
import com.elenverve.model.Products;
import com.elenverve.service.PersonService;
import com.elenverve.service.ProductService;



 
@Controller
@RequestMapping("/")
public class HomeController{
	private static final Logger logger = Logger.getLogger(HomeController.class);
	// Initialize the dbAccess layer & remove the below line
	
    @Autowired
    private PersonService personService;
    
    @Autowired
    private ProductService productService;
    
    
	@RequestMapping(value={ "/", "/welcome**" }, method = RequestMethod.GET)
	public String landing(ModelMap model,
			HttpServletRequest request,
			 String id, Device device) {
		
		logger.debug("Invoking method [landing] from controller [HomeController] for context [/]");
		
		
	    /*
		ProductParser parser = new ProductParser();
		List<Product> prodList = parser.getProductList();
		model.addAttribute("prodList", prodList);
		*/
		List<CategoryDvo> categories = productService.getCategories();//(List<CategoryDvo>)request.getAttribute(IConstants.CATEGORIES);
				//productService.getCategories();
		List<CollectionDvo> collections = productService.getCollections();//(List<CollectionDvo>)request.getAttribute(IConstants.COLLECTIONS);
		List<OfferDvo> offers = productService.getOffers();//(List<OfferDvo>)request.getAttribute(IConstants.OFFERS);
		
		logger.debug("["+categories.size()+"] Categories retrieved ["+collections.size()+"] collection retrieved from request");
		Parameters parameters = new Parameters();
		parameters.addParameter(IConstants.CATEGORIES, categories);
		parameters.addParameter(IConstants.COLLECTIONS, collections);
		parameters.addParameter(IConstants.OFFERS, offers);
		
		// call data access layer & get list of collections & categories
		Home home = new Home(parameters);
		model.addAttribute("model", home);
		model.addAttribute("page", "landing");
		return "template";
 
	}
	
    
    @RequestMapping(value = "/person", method = RequestMethod.GET)  
    public String getPersonList(ModelMap model) {  
        model.addAttribute("personList", personService.listPerson());  
        return "output";  
    }  
     
    @RequestMapping(value = "/person/save", method = RequestMethod.POST)  
    public View createPerson(@ModelAttribute Person person, ModelMap model) {
        if(StringUtils.hasText(person.getId())) {
            personService.updatePerson(person);
        } else {
            personService.addPerson(person);
        }
        return new RedirectView("/elenverve/person");  
    }
         
    @RequestMapping(value = "/person/delete", method = RequestMethod.GET)  
    public View deletePerson(@ModelAttribute Person person, ModelMap model) {  
        personService.deletePerson(person);  
        return new RedirectView("/elenverve/person");  
    } 

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
		
		//List<CollectionDvo> dvo= dbAccess.getCollections();
		//Home home = new Home(dbAccess);
		//model.addAttribute("home", home);
		
		return "index8";
 
	}
	
	@RequestMapping(value="/links", method=RequestMethod.GET)
	 public void links() {}
	
	@RequestMapping("/home")
	public @ResponseBody String detectDevice(String id, Device device) {
	    String deviceType = "unknown";
	    if (device.isNormal()) {
	        deviceType = "normal";
	    } else if (device.isMobile()) {
	        deviceType = "mobile";
	    } else if (device.isTablet()) {
	        deviceType = "tablet";
	    }
	    return "Hello " + deviceType + " browser! Id:"+id;
	}

	  private Map<String, String> getHeadersInfo() {
		  
			Map<String, String> map = new HashMap<String, String>();
		 
			
			
		 
			return map;
		  }
	  

 
	@RequestMapping(value="/welcome/{name}", method = RequestMethod.GET)
	public String welcomeName(@PathVariable String name, ModelMap model) {
 
		model.addAttribute("message", "Maven Web Project + Spring 3 MVC - " + name);
		return "index1";
 
	}
 
}