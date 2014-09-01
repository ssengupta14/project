package com.elenverve.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.elenverve.db.beans.ProductDetailBean;
import com.elenverve.service.CartService;
import com.elenverve.service.ProductService;

@Controller
@RequestMapping("/")
public class ProductController extends DefaultController{
	
	private static final Logger logger = Logger.getLogger(ProductController.class);
	
	@Autowired
	private ProductService productService ;
	
	@Autowired
	private CartService cartService;
	
	public void setCartService(CartService cartService) {
		this.cartService = cartService;
	}
	
	@RequestMapping(value={ "/products*" }, method = RequestMethod.GET)
	public String products(ModelMap model,HttpServletRequest request) {
		
		Map<String,String> parameters = new HashMap<String,String>();
		
		logger.debug("Invoking method [products] from controller [ProductController] for context [/products*]");
		//Category name
		String catName=request.getParameter("cat");
		//sub category name	
		String subCat=request.getParameter("sc");
		String col=request.getParameter("col");
		String ipp=request.getParameter("mipp");
		String pageId = request.getParameter("page");
		List<ProductDetailBean> obj =  cartService.getProducts();//request.getSession().getAttribute("pagination_products");
		//
				
		if(catName!=null && subCat!=null){ 
			//String catId = dbAccess.getCategoryId(catName, subCat);
			String catId = productService.getCategoryId(catName, subCat );
			logger.debug("Retrieved category id= "+catId+" based on catName= "+catName+" subCat= "+subCat);
			parameters.put("CAT", catId);
		}
		
		ipp = (( StringUtils.isBlank(ipp)) ? "10": ipp);
		
		ipp = (( ipp.equals("ALL")) ? "0": ipp);
				
		int mipp = Integer.parseInt(ipp);
		//decypher coll id here		
		if(col!=null){
			parameters.put("COL", col);
		}		
		//decypher page id here
		
		logger.debug("from controller - col="+col+" cat="+catName+" Sub cat="+subCat+" page="+pageId);
		PagedListHolder<ProductDetailBean> productListHolder =null;
	
		
		if(CollectionUtils.isEmpty(obj)){
			logger.debug("Fetching products as per request params ...");
			Map<String, ProductDetailBean> products = productService.getProducts(catName, subCat);		
			cartService.setProducts(products);
			productListHolder= new PagedListHolder<ProductDetailBean>(cartService.getProducts());
			//request.getSession().setAttribute("pagination_products", productListHolder);			
			
		}else{
			productListHolder = new PagedListHolder<ProductDetailBean>(cartService.getProducts());//((PagedListHolder<ProductDetailBean>)obj);
			if ("next".equals(pageId)) {
	            productListHolder.nextPage();
	        }
	        else if ("previous".equals(pageId)) {
	            productListHolder.previousPage();
	        }
			
		}
		if(mipp==0){
			mipp = productListHolder.getPageList().size();
		}
		logger.debug("Setting page size to "+mipp);
		productListHolder.setPageSize(mipp);
		//logger.debug("**************** prod list ="+productList.getPage());
		/*List<ProductDvo> ds = (List<ProductDetailBean>) productListHolder.getPageList();
		for(ProductDvo d:ds){
			logger.debug(d.getDetails().getProductName());
		}*/
		List<ProductDetailBean> pageProducts = (List<ProductDetailBean>) productListHolder.getPageList();
		model.addAttribute("max_item",mipp/3);
		model.addAttribute("products", pageProducts);
		model.addAttribute("page", "products");
		return "template";
		
		
 
	}
	
}
