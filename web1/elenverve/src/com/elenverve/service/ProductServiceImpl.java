package com.elenverve.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.elenverve.dao.ProductDao;
import com.elenverve.db.beans.ProductDetailBean;

public class ProductServiceImpl implements ProductService {
	
	/*@Autowired
	private ProductDao productDao ;*/

	public List<ProductDetailBean> getProducts() {
		
		return null;
	}

	public List<ProductDetailBean> getProducts(String cat) {
		
		return null;
	}

	public Map<String, ProductDetailBean> getProducts(String cat, String sc) {
		//List<ProductDetailBean> productsDetail = new ArrayList<ProductDetailBean>();
		Map<String, ProductDetailBean> products = new HashMap<String, ProductDetailBean>();
		for (int i = 0; i <= 35; i++) {
			ProductDetailBean details =new ProductDetailBean();

			details.setProductId("P00"+i);
			details.setProductName("Product "+i);
			details.setCollectionId("COL001");
			details.setCurrencyCd(0);
			details.setDescription("This is a sample product "+i);
			details.setFinalPrice(250.00+i);
			details.addImageUrl("/resources/images/products/prods/"+(i+1)+".jpg");
			details.setInitialPrice(300.00+i);
			details.setInStock(true);
			details.setNewInd(false);
			details.setCategoryId("CAT001");
			products.put("P00"+i,details);
			
		}
		return products;
	}
	
	public String getCategoryId(String categoryName,String subCatId){
		//TODO  revisit code
		/*
		List<CategoryDvo> categories = getCategories();
		for(CategoryDvo category:categories){
			if(category.getCategoryName().equals(categoryName)){
				List<CategoryDvo> subcategories= category.getSubcategories();
				for(CategoryDvo cat:subcategories){
					if(category.getCategoryId().equals(subCatId)){
						return category.getCategoryId();						
						
					}					
				}				
			}			
		}
		return null;
		*/
		return "CAT001";
	}

}
