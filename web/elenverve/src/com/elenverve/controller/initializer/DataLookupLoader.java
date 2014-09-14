package com.elenverve.controller.initializer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;


import com.elenverve.dvo.CategoryDvo;
import com.elenverve.dvo.CollectionDvo;
import com.elenverve.dvo.OfferDvo;
import com.elenverve.dvo.ProductDvo;
import com.elenverve.service.ProductService;

public class DataLookupLoader implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    ProductService productService;

    private List<ProductDvo> products = new ArrayList<ProductDvo>();
    private List<CollectionDvo> collections = new ArrayList<CollectionDvo>();
    private List<CategoryDvo> categories=new ArrayList<CategoryDvo>();
    private List<OfferDvo> offers= new ArrayList<OfferDvo>();
    
    public List<ProductDvo> getAllProducts() {
        return products;
    }

    public void setAllProducts(List<ProductDvo> products) {
            this.products = products;           
    }
    
    public List<CollectionDvo> getCollections() {
		return collections;
	}

	public void setCollections(List<CollectionDvo> collections) {
		this.collections = collections;
	}

	
	public List<CategoryDvo> getCategories() {
		return categories;
	}

	public void setCategories(List<CategoryDvo> categories) {
		this.categories = categories;
	}

	public List<OfferDvo> getOffers() {
		return offers;
	}

	public void setOffers(List<OfferDvo> offers) {
		this.offers = offers;
	}

	@Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if(this.products == null){
            this.setAllProducts(productService.getProducts());               
        }
        if(this.collections == null){
            this.setCollections(productService.getCollections());               
        }
        if(this.categories == null){
            this.setCategories(productService.getCategories());               
        }
        if(this.offers == null){
            this.setOffers(productService.getOffers());               
        }
        
    }
}
