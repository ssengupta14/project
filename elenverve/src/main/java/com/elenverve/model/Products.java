package com.elenverve.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.support.PagedListHolder;

import com.elenverve.common.IConstants;
import com.elenverve.dao.DbAccessService;
import com.elenverve.dpo.CategoryDpo;
import com.elenverve.dpo.ProductsDpo;
import com.elenverve.dvo.CollectionDvo;
import com.elenverve.dvo.ProductCategory;
import com.elenverve.dvo.ProductDvo;
import com.elenverve.parser.ProductParser;

public class Products extends Default{
	
	private ProductParser parser = new ProductParser();
	private DbAccessService dbService;
	private List<ProductsDpo> products = new ArrayList<ProductsDpo>();
	private List<ProductDvo> productDvos;
	private List<ProductDvo> productPerCollection;
	private List<ProductDvo> productPerCategory;
	private List<ProductDvo> productPerCatCol;
	private int MAX_ITEMS_PER_PAGE = 14;
	public Products(DbAccessService dbService){
		this.dbService = dbService;
		productDvos= (List<ProductDvo>) dbService.getProducts();
		
	} 
	/**
	 * getting product list based on pagination 
	 * @param page
	 * @param prodList
	 * @return
	 */
	public List<ProductDvo> getProducts(int page,List<ProductDvo> prodList) {
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
	
	
	/**
	 * for getting product list based on collection id
	 * @param collectionId
	 * @param page
	 * @return
	 */
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
	/**
	 * For getting list of products based on request type
	 * @param categoryId
	 * @param collectionId
	 * @param page
	 * @return
	 */
	public List<ProductDvo> getProducts(Map<String,String> params) {
		
		String col =params.get("COL");
		String catId = params.get("CAT");
		
		List<ProductDvo> finalProds = new ArrayList<ProductDvo>();
		
		int cse=0;
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
		
		/*
		//logger.debug("Category id ="+categoryId+" collectionId ="+collectionId+" page ="+page);
		if(categoryId==null){
			return getProductsAsPerCollection(collectionId, page);
		}
		if(collectionId==null){
			return getProductsAsPerCollection(categoryId, page);
		}
		if(categoryId==null && collectionId==null && page>0){
			return getProducts(page, null);
		}
		if(categoryId!=null && collectionId!=null && page>0){
			return getProductList(categoryId,collectionId,page);
		}
		return getProducts();
		*/
		return null;
	}
	
	//TODO: Map productDvo to productDpo
	public List<ProductDvo> getProducts() {
		
		//logger.debug("products retrieved ... "+productDvos.size());
		//List<ProductsDpo> productsDpos  = new ArrayList<ProductsDpo>(); 
		/*
		for(ProductDvo productDvo: productDvos){
			
			
			
		}*/
		
		productDvos=(List<ProductDvo>) dbService.getProducts();
		return productDvos;
	}

	public void setProducts(List<ProductsDpo> products) {
		this.products = products;
	}

	public List<Product> getOldProducts(){
		// Filter based on category/collection selected & other criteria
		List<Product> prodList = parser.getProductList();
		// returning complete list here
		return prodList;	
	}
}
