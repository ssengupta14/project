package com.elenverve.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.elenverve.common.IConstants;
import com.elenverve.common.Parameters;
import com.elenverve.dvo.CategoryDvo;
import com.elenverve.dvo.CollectionDvo;
import com.elenverve.dvo.OfferDvo;
import com.elenverve.dvo.ProductDvo;
import com.elenverve.model.Products;
import com.elenverve.service.ProductService;

@Controller
@RequestMapping("/")
public class ProductController extends DefaultController{
	
	private static final Logger logger = Logger.getLogger(ProductController.class);
	
	  @Autowired
	  private ProductService productService;
	  
	@RequestMapping(value={ "/products*" }, method = RequestMethod.GET)
	public String products(ModelMap model,HttpServletRequest request) {
		logger.debug("Invoking method [products] from controller [ProductController] for context [/products*]");
		
		//categories
		List<CategoryDvo> categoryDvos = productService.getCategories();//(List<CategoryDvo>)request.getAttribute(IConstants.CATEGORIES);
				//productService.getCategories();
		//collections
		List<CollectionDvo> collectionDvos = productService.getCollections();//(List<CollectionDvo>)request.getAttribute(IConstants.COLLECTIONS);
		//offers
		List<OfferDvo> offerDvos = productService.getOffers();//(List<OfferDvo>)request.getAttribute(IConstants.OFFERS);
		// products
		List<ProductDvo> productDvos = productService.getProducts();//(List<ProductDvo>)request.getAttribute(IConstants.PRODUCTS);//
		
		logger.debug("Retrieved ["+productDvos.size()+"] Products, ["+categoryDvos.size()+"] Categories, ["+collectionDvos.size()+"] Collections. ");
		Parameters parameters = new Parameters();
		parameters.addParameter(IConstants.CATEGORIES, categoryDvos);
		parameters.addParameter(IConstants.COLLECTIONS, collectionDvos);
		parameters.addParameter(IConstants.OFFERS, offerDvos);
		parameters.addParameter(IConstants.PRODUCTS, productDvos);
		
		
		String ipp=request.getParameter("mipp");
		if(ipp==null){
			ipp="15";
		}
		if(ipp.equals("ALL")){
			ipp="0";
		}
		int mipp = Integer.parseInt(ipp);
		parameters.addParameter("MIPP", mipp);
		
		//decypher coll id here		
		String col=request.getParameter("col");
		if(col!=null){
			parameters.addParameter("COL", col);
		}
		
		String catName=request.getParameter("cat");
		if(catName!=null){
			parameters.addParameter("CAT", catName);
		}
		
		//decypher cat id here
		
		String subCat=request.getParameter("sc");
		if(subCat!=null){
			parameters.addParameter("SC", subCat);
		}
		
		//decypher cat id here
		if(catName!=null && subCat!=null){ 
			//String catId = dbAccess.getCategoryId(catName, subCat);
			//logger.debug("Retrieved category id= "+catId+" based on catName= "+catName+" subCat= "+subCat);
			//parameters.put("CAT", catId);
		}
		
		String pageId = request.getParameter("page");
		parameters.addParameter("PAGE", pageId);
		
		Object obj = request.getSession().getAttribute("pagination_products");
		parameters.addParameter("PAGEINATION_PRODUCTS", obj);
		
		logger.debug("from controller - col="+col+" cat="+catName+" Sub cat="+subCat+" page="+pageId);
		
		Products products = new Products(parameters);
		request.setAttribute("pagination_products", products.getPageListHolder());
		model.addAttribute("model", products);
		model.addAttribute("page", "products");

		
		
/*		Map<String,String> parameters = new HashMap<String,String>();
		
		
		
		
		
		//decypher page id here
		/*
		if(pageId!=null){ 
			parameters.put("PAGE", pageId);
		}*/
/*		
		PagedListHolder productList =null;
	
		
		if(obj==null){
			logger.debug("Fetching products as per request params ...");
			List<ProductDvo> prods= products.getProducts(parameters);
			logger.debug("Fetched "+prods.size()+" products as per request params ...");
			productList= new PagedListHolder(prods);
			
			request.getSession().setAttribute("pagination_products", productList);
			
		}else{
			productList = (PagedListHolder)obj;
			if ("next".equals(pageId)) {
	            productList.nextPage();
	        }
	        else if ("previous".equals(pageId)) {
	            productList.previousPage();
	        }
			
		}
		if(mipp==0){
			mipp = productList.getPageList().size();
		}
		logger.debug("Setting page size to "+mipp);
		productList.setPageSize(mipp);
		//logger.debug("**************** prod list ="+productList.getPage());
		List<ProductDvo> ds = (List<ProductDvo>) productList.getPageList();
		for(ProductDvo d:ds){
			logger.debug(d.getDetails().getProductName());
		}
		
		model.addAttribute("max_item",mipp/3);
		model.addAttribute("products",(List<ProductDvo>) productList.getPageList());
		model.addAttribute("page", "products");
*/
		return "template";
		
		
 
	}
	
}
