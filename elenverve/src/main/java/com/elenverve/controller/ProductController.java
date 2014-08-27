package com.elenverve.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.elenverve.dvo.ProductDvo;
import com.elenverve.model.Products;

@Controller
@RequestMapping("/")
public class ProductController extends DefaultController{
	
	private static final Logger logger = Logger.getLogger(ProductController.class);
	
	@RequestMapping(value={ "/products*" }, method = RequestMethod.GET)
	public String products(ModelMap model,HttpServletRequest request) {
		logger.debug("Invoking method [products] from controller [ProductController] for context [/products*]");
		
		/*
		ProductParser parser = new ProductParser();
		List<Product> prodList = parser.getProductList();
		model.addAttribute("prodList", prodList);
		*/
		
		Products products = new Products(dbAccess);
		model.addAttribute("model", products);
		
		Map<String,String> parameters = new HashMap<String,String>();
		
		String catName=request.getParameter("cat");
		//decypher cat id here
		
		String subCat=request.getParameter("sc");
		//decypher cat id here
		if(catName!=null && subCat!=null){ 
			String catId = dbAccess.getCategoryId(catName, subCat);
			logger.debug("Retrieved category id= "+catId+" based on catName= "+catName+" subCat= "+subCat);
			parameters.put("CAT", catId);
		}
		
		String col=request.getParameter("col");
		String ipp=request.getParameter("mipp");
		if(ipp==null){
			ipp="10";
		}
		if(ipp.equals("ALL")){
			ipp="0";
		}
		int mipp = Integer.parseInt(ipp);
		//decypher coll id here		
		if(col!=null){
			parameters.put("COL", col);
		}
		String pageId = request.getParameter("page");
		//decypher page id here
		/*
		if(pageId!=null){ 
			parameters.put("PAGE", pageId);
		}*/
		logger.debug("from controller - col="+col+" cat="+catName+" Sub cat="+subCat+" page="+pageId);
		PagedListHolder productList =null;
	
		Object obj = request.getSession().getAttribute("pagination_products");
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
		return "template";
		
		
 
	}
	
}
