package com.elenverve.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.elenverve.dvo.CollectionDvo;
import com.elenverve.dvo.OfferDvo;
import com.elenverve.dvo.ProductDvo;

public class Collection implements ITestConstants {
	
	
	public static CollectionDvo createCollection(Map<String,String> parameters){
		CollectionDvo dvo = new CollectionDvo();
		String collId = parameters.get(COLL_ID);
		String collNm = parameters.get(COLL_NAME);
		String collImg = parameters.get(COLL_IMG);
		dvo.setCollectionId(collId);
		dvo.setCollectionName(collNm);
		dvo.setDescription("This is "+collNm+" collection");
		dvo.setImage(collImg);
		return dvo;
	}
	/*
	public static List<CollectionDvo>  createCollections(){
		List<CollectionDvo> collections = new ArrayList<CollectionDvo>();
		//TODO mocking up the db call to fetch collections, will remove later
		CollectionDvo dvo = new CollectionDvo();
		dvo.setCollectionId("001");
		dvo.setCollectionName("ELEMENTS");
		dvo.setDescription("This is elements collection");
		dvo.setImage("DSC_1336.jpg");
		
		OfferDvo offer = new OfferDvo();
		offer.setOfferId(100);
		offer.setOfferType(OfferDvo.DISCOUNT);
		offer.setDiscountName("SUMMER");
		offer.setDiscountPercentage(30.00);
		offer.setEndWord("Discount");
		offer.setTemplateId("SeasonSalePercCol001");
		offer.setCollectionId(dvo.getCollectionId());
		offer.setCollectionName(dvo.getCollectionName());		
		dvo.addOffer(""+offer.getOfferId());
		
		// adding 10 products
		List<ProductDvo> products = new ArrayList<ProductDvo>();
			for(int i = 0;i<10;i++){
			ProductDvo prod = new ProductDvo();
			products.add(prod);
		}
		
		
		collections.add(dvo);
		
		dvo = new CollectionDvo();
		dvo.setCollectionId("002");
		dvo.setCollectionName("CONTINENTS");
		dvo.setDescription("This is continents collection");
		dvo.setImage("DSC_1335.jpg");
		
		offer = new OfferDvo();
		offer.setOfferType(OfferDvo.DISCOUNT);
		offer.setDiscountName("GENERAL");
		offer.setDiscountPercentage(20.00);
		offer.setEndWord("Discount");
		offer.setTemplateId("SeasonSalePercCol001");
		offer.setCollectionId(dvo.getCollectionId());
		offer.setCollectionName(dvo.getCollectionName());		
		dvo.addOffer(offer);
		
		// adding 20 products
			products = new ArrayList<ProductDvo>();
			for(int i = 0;i<20;i++){
			ProductDvo prod = new ProductDvo();
			products.add(prod);
			}
		dvo.setProducts(products);
		
		collections.add(dvo);
		
		dvo = new CollectionDvo();
		dvo.setCollectionId("003");
		dvo.setCollectionName("SPECTRUM");
		dvo.setDescription("This is spectrum collection");
		dvo.setImage("DSC_1337.jpg");
		
		offer = new OfferDvo();
		offer.setOfferType(OfferDvo.DISCOUNT);
		offer.setDiscountName("WINTER");
		offer.setDiscountPercentage(20.00);
		offer.setEndWord("Discount");
		offer.setTemplateId("SeasonSalePercCol001");
		offer.setCollectionId(dvo.getCollectionId());
		offer.setCollectionName(dvo.getCollectionName());		
		dvo.addOffer(offer);
		// adding 20 products
			products = new ArrayList<ProductDvo>();
			for(int i = 0;i<20;i++){
			ProductDvo prod = new ProductDvo();
			products.add(prod);
			}
		dvo.setProducts(products);
		
		collections.add(dvo);
		
		
		
		
		return collections;
	}
*/
}
