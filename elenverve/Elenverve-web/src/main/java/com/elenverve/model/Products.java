package com.elenverve.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.support.PagedListHolder;

import com.elenverve.common.IConstants;
import com.elenverve.common.Parameters;
import com.elenverve.dpo.ProductsDpo;
import com.elenverve.dvo.CategoryDvo;
import com.elenverve.dvo.CollectionDvo;
import com.elenverve.dvo.ProductDvo;

public class Products extends Default{
	private static final Logger logger = Logger.getLogger(Products.class);

	//private DbAccessService dbService;
	//private List<ProductsDpo> products = new ArrayList<ProductsDpo>();
	
	private PagedListHolder pageListHolder=null;
	private Parameters parameters;
	private List<ProductDvo> productDvos = new ArrayList<ProductDvo>();
	private List<ProductDvo> productPerCollection;
	private List<ProductDvo> productPerCategory;
	private List<ProductDvo> productPerCatCol;
	//private int MaxItemsPerPage = 15;
	//private int maxColumns = 3;
	private int maxItems =15;
	
	public Products(Parameters parameters){
		//this.dbService = dbService;
		this.parameters= parameters;
		//(List<ProductDvo>) dbService.getProducts();
		this.productDvos = (List<ProductDvo>) this.getPagedProducts().getPageList();
	}
	
	public PagedListHolder getPageListHolder(){
		return this.pageListHolder;
	}
	
	private List<ProductDvo> fetchProducts() {
		productDvos = (List<ProductDvo>)parameters.getParameter(IConstants.PRODUCTS);
		List<CollectionDvo> collectionDvos = (List<CollectionDvo>)parameters.getParameter(IConstants.COLLECTIONS);
		
		
		List<CategoryDvo> categoryDvos = (List<CategoryDvo>)parameters.getParameter(IConstants.CATEGORIES);
		String col =(String)parameters.getParameter("COL");
		String catId = (String)parameters.getParameter("CAT");
		
		if(catId!=null){
			for(CategoryDvo dvo:categoryDvos){
				if(dvo.getCategoryName().equalsIgnoreCase(catId)){
					catId =dvo.getCategoryId();
				}
			}
		}
		if(col!=null){
			for(CollectionDvo dvo:collectionDvos){
				if(dvo.getCollectionName().equalsIgnoreCase(col)){
					col =dvo.getCollectionId();
				}
			}
		}

		int cse=0;
		logger.debug("Computing products list based on col ["+col+"] catId ["+catId+"]");
		// possible cases
		if(col!=null && catId!=null){cse=1;} // as per collection & category
		if(col!=null && catId==null){cse=2;} // as per collection
		if(col==null && catId!=null){cse=3;} // as per category
		if(col==null && catId==null){cse=4;} // only page
		//logger.debug("choice is "+cse);
		switch(cse){
		
		case 1:{
			productPerCatCol= new ArrayList<ProductDvo>();
			for (ProductDvo prod : productDvos) {
				//logger.debug("comparing category "+prod.getDetails().getCategoryId()+" with "+cat);
				//logger.debug("comparing collection "+prod.getDetails().getCollectionId()+" with "+col);
				
				if (prod.getDetails().getCategoryId().equals(catId) && prod.getDetails().getCollectionId().equals(col)) {
					productPerCatCol.add(prod);
				}
			}
			return productPerCatCol;
		}
		case 2:{
			for (ProductDvo prod : productDvos) {
				if (prod.getDetails().getCollectionId().equals(col)) {
					productPerCollection.add(prod);
				}
			}
			return productPerCollection;
		}
		case 3:{
			productPerCategory= new ArrayList<ProductDvo>();
			for (ProductDvo prod : productDvos) {
				if (prod.getDetails().getCategoryId().equals(catId)) {
					productPerCategory.add(prod);
				}
			}
			
			return productPerCategory;
			
		}
		case 4:{
			return productDvos;
			//return getProducts(page, productDvos);
		}
		
		
		}
		return null;
	}
	/**
	 * For getting list of products based on request type
	 * @param categoryId
	 * @param collectionId
	 * @param page
	 * @return
	 */
	private PagedListHolder getPagedProducts() {
		logger.debug("Inside getPagedProducts method ..");
		Object obj = parameters.getParameter("PAGEINATION_PRODUCTS");
		String pageId = (String)parameters.getParameter("PAGE");
		int mipp = (Integer)parameters.getParameter("MIPP");
		int max =(int)Math.ceil(((double)mipp)/3.0);
		this.setMaxItems(max);
		
		// If no pagination products are available
		if(obj==null){
			logger.debug("Pagination not available, fetching products as per request params ...");
			List<ProductDvo> prods= fetchProducts();
			logger.debug("Fetched "+prods.size()+" products as per request params ...");
			pageListHolder= new PagedListHolder(prods);			
			
		}else{
			logger.debug("Paginating products as per pageId ["+pageId+"]");
			pageListHolder = (PagedListHolder)obj;
			if ("next".equals(pageId)) {
				pageListHolder.nextPage();
	        }
	        else if ("previous".equals(pageId)) {
	        	pageListHolder.previousPage();
	        }
			
		}
		int size = pageListHolder.getPageList().size();
		if(mipp==0){
			mipp = size;
		}
		
		logger.debug("mipp ["+mipp+"] max ["+max+"]");
		
		logger.debug("Setting page size to "+mipp);
		pageListHolder.setPageSize(mipp);
		List<ProductDvo> xyz = (List<ProductDvo>) pageListHolder.getPageList();
		logger.debug("Product retrieved ...");
		for(ProductDvo dvo:xyz){
			logger.debug("["+dvo.getProductId()+"]");
		}
		return pageListHolder;
	}
	
	
	
	
	
	public int getMaxItems() {
		return maxItems;
	}

	public void setMaxItems(int maxItems) {
		this.maxItems = maxItems;
	}

	public List<ProductDvo> getProductDvos() {
		return productDvos;
	}

	/*--------------------------------------------------------------------------------*/
	/**
	 * getting product list based on pagination 
	 * @param page
	 * @param prodList
	 * @return
	 */
	/*public List<ProductDvo> getProducts(int page,List<ProductDvo> prodList) {
		//logger.debug("page #"+page);
		if(page==0){
			return productDvos;
		}
		List<ProductDvo> finalProds = new ArrayList<ProductDvo>();
		int from =(MAX_ITEMS_PER_PAGE*(page-1));
		int to =(MAX_ITEMS_PER_PAGE*page)-1;
		//logger.debug("from ="+from+" to ="+to);
		if(prodList==null){
			prodList =productDvos;
		}
		int size =prodList.size();
		if(to>size){
			to=size-1;			
		}
		finalProds = prodList.subList(from, to+1);
		for(ProductDvo p:finalProds){
			//logger.debug(p.getDetails().getProductId());
		}
		return finalProds;
	}
	*/
	
	/**
	 * for getting product list based on collection id
	 * @param collectionId
	 * @param page
	 * @return
	 */
	/*
	public List<ProductDvo> getProductsAsPerCollection(String collectionId,int page) {
		List<ProductDvo> finalProds = new ArrayList<ProductDvo>();
		if (page == 1 || productPerCollection==null) {
			//logger.debug("Initializing productPerCollection ...");
			productPerCollection= new ArrayList<ProductDvo>();
			for (ProductDvo prod : productDvos) {
				if (prod.getDetails().getCollectionId().equals(collectionId)) {
					productPerCollection.add(prod);
				}
			}
		}
		if(productPerCollection!=null){
			//logger.debug("retrieving productPerCollection from buffer...");
			finalProds = getProducts(page, productPerCollection);
		}
		
		return finalProds;
	}
	/**
	 * for getting product list as per categogy id
	 * @param categoryId
	 * @param page
	 * @return
	 */
	/*
	public List<ProductDvo> getProductsAsPerCategory(String categoryId,int page) {
		List<ProductDvo> finalProds = new ArrayList<ProductDvo>();
		if (page == 1 || productPerCategory==null) {
			//logger.debug("Initializing productPerCategory ...");
			productPerCategory= new ArrayList<ProductDvo>();
			for (ProductDvo prod : productDvos) {
				if (prod.getDetails().getCategoryId().equals(categoryId)) {
					productPerCategory.add(prod);
				}
			}
		}
		if(productPerCategory!=null){
			//logger.debug("retrieving productPerCategory from buffer...");
			finalProds = getProducts(page, productPerCategory);
		}
		
		return finalProds;
	}
	/*
	public List<ProductDvo> getProductList(String categoryId,String collectionId,int page){
		List<ProductDvo> finalProds = new ArrayList<ProductDvo>();
		if (page == 1 || productPerCatCol==null) {
			//logger.debug("Initializing productPerCatCol ...");
			productPerCatCol= new ArrayList<ProductDvo>();
			for (ProductDvo prod : productDvos) {
				if (prod.getDetails().getCategoryId().equals(categoryId) && prod.getDetails().getCollectionId().equals(collectionId)) {
					productPerCatCol.add(prod);
				}
			}
		}
		if(productPerCatCol!=null){
			//logger.debug("retrieving productPerCatCol from buffer...");
			finalProds = getProducts(page, productPerCatCol);
		}
		
		return finalProds;
	}
	*/
	
	//TODO: Map productDvo to productDpo
	public List<ProductDvo> getProducts() {
		
		//logger.debug("products retrieved ... "+productDvos.size());
		//List<ProductsDpo> productsDpos  = new ArrayList<ProductsDpo>(); 
		/*
		for(ProductDvo productDvo: productDvos){
			
			
			
		}*/
		
		//productDvos=(List<ProductDvo>) dbService.getProducts();
		return productDvos;
	}

	public void setProducts(List<ProductsDpo> products) {
		//this.products = products;
	}

	
}
