package com.elenverve.bean;

import java.util.Map;
import java.util.Random;

import com.elenverve.dvo.CategoryDvo;

public class Category implements ITestConstants {
	
	public static CategoryDvo createCategory(Map<String,String> parameters){
	
		CategoryDvo dvo = new CategoryDvo();
		String collId = parameters.get(CAT_ID);
		String catNm = parameters.get(CAT_NAME);
		String catImg = parameters.get(CAT_IMG);
		dvo.setCategoryId(collId);
		dvo.setCategoryName(catNm);
		dvo.setDescription("This is "+catNm+" category");
		dvo.setImage(catImg);
		return dvo;
	
	}
	/*
	public static List<CategoryDvo> createCategories(){
		List<CategoryDvo> categories = new ArrayList<CategoryDvo>();
		//TODO mocking up the db call to fetch collections, will remove later
		// sample categorydvo
		CategoryDvo dvo = new CategoryDvo();
		dvo.setCategoryId("001");
		dvo.setCategoryName("HOME DECOR");
		dvo.setDescription("This is home decor category");
		dvo.setImage("DSC_1334.jpg");
		
		OfferDvo offer = new OfferDvo();
		offer.setOfferType(OfferDvo.DISCOUNT);
		offer.setDiscountName("SUMMER");
		offer.setDiscountPercentage(30.00);
		offer.setEndWord("Discount");
		offer.setTemplateId("SeasonSalePercCat001");
		offer.setCategoryId(dvo.getCategoryId());
		offer.setCategoryName(dvo.getCategoryName());		
		dvo.addOffer(offer);
		
		// adding 10 products
		List<ProductDvo> products = new ArrayList<ProductDvo>();
			for(int i = 0;i<10;i++){
			ProductDvo prod = new ProductDvo();
			dvo.addProduct(prod);
			}
		
		categories.add(dvo);
			
		dvo = new CategoryDvo();
		dvo.setCategoryId("002");
		dvo.setCategoryName("ART AND PAINTINGS");
		dvo.setDescription("This is Art and paintings category");
		dvo.setImage("DSC_1335.jpg");
		
		offer = new OfferDvo();
		offer.setOfferType(OfferDvo.DISCOUNT);
		offer.setDiscountName("GENERAL");
		offer.setDiscountPercentage(20.00);
		offer.setEndWord("Discount");
		offer.setTemplateId("SeasonSalePercCat001");
		offer.setCategoryId(dvo.getCategoryId());
		offer.setCategoryName(dvo.getCategoryName());		
		dvo.addOffer(offer);
		
		// adding 20 products
			products = new ArrayList<ProductDvo>();
			for(int i = 0;i<20;i++){
			ProductDvo prod = new ProductDvo();
			dvo.addProduct(prod);
			}
		
		categories.add(dvo);
			
		dvo = new CategoryDvo();
		dvo.setCategoryId("003");
		dvo.setCategoryName("FASHION ACCESORIES");
		dvo.setDescription("This is Fashion accesories category");
		dvo.setImage("DSC_1336.jpg");
		
		offer = new OfferDvo();
		offer.setOfferType(OfferDvo.DISCOUNT);
		offer.setDiscountName("WINTER");
		offer.setDiscountPercentage(20.00);
		offer.setEndWord("Discount");
		offer.setTemplateId("SeasonSalePercCat001");
		offer.setCategoryId(dvo.getCategoryId());
		offer.setCategoryName(dvo.getCategoryName());		
		dvo.addOffer(offer);
		
		// adding 20 products
			products = new ArrayList<ProductDvo>();
			for(int i = 0;i<20;i++){
			ProductDvo prod = new ProductDvo();
			products.add(prod);
			dvo.addProduct(prod);
			}
		
		categories.add(dvo);
		
		dvo = new CategoryDvo();
		dvo.setCategoryId("004");
		dvo.setCategoryName("LAMP SHADES");
		dvo.setDescription("This is Lamp shades category");
		dvo.setImage("DSC_1337.jpg");
		
		offer = new OfferDvo();
		offer.setOfferType(OfferDvo.DISCOUNT);
		offer.setDiscountName("WINTER");
		offer.setDiscountPercentage(20.00);
		offer.setEndWord("Discount");
		offer.setTemplateId("SeasonSalePercCat001");
		offer.setCategoryId(dvo.getCategoryId());
		offer.setCategoryName(dvo.getCategoryName());		
		dvo.addOffer(offer);
		
		// adding 20 products
			products = new ArrayList<ProductDvo>();
			for(int i = 0;i<20;i++){
			ProductDvo prod = new ProductDvo();
			products.add(prod);
			dvo.addProduct(prod);
			}
		
		categories.add(dvo);
		
		dvo = new CategoryDvo();
		dvo.setCategoryId("005");
		dvo.setCategoryName("HAND CRAFTED");
		dvo.setDescription("This is Hand crafted category");
		dvo.setImage("DSC_1335.jpg");
		
		offer = new OfferDvo();
		offer.setOfferType(OfferDvo.DISCOUNT);
		offer.setDiscountName("WINTER");
		offer.setDiscountPercentage(20.00);
		offer.setEndWord("Discount");
		offer.setTemplateId("SeasonSalePercCat001");
		offer.setCategoryId(dvo.getCategoryId());
		offer.setCategoryName(dvo.getCategoryName());		
		dvo.addOffer(offer);
		
		// adding 20 products
			products = new ArrayList<ProductDvo>();
			for(int i = 0;i<20;i++){
			ProductDvo prod = new ProductDvo();
			products.add(prod);
			dvo.addProduct(prod);
			}
		
		categories.add(dvo);
		
		
		dvo = new CategoryDvo();
		dvo.setCategoryId("006");
		dvo.setCategoryName("LIFESTYLE");
		dvo.setDescription("This is Lifestyle category");
		dvo.setImage("DSC_1336.jpg");
		
		offer = new OfferDvo();
		offer.setOfferType(OfferDvo.DISCOUNT);
		offer.setDiscountName("GENERAL");
		offer.setDiscountPercentage(20.00);
		offer.setEndWord("Discount");
		offer.setTemplateId("SeasonSalePercCat001");
		offer.setCategoryId(dvo.getCategoryId());
		offer.setCategoryName(dvo.getCategoryName());		
		dvo.addOffer(offer);
		
		// adding 20 products
			products = new ArrayList<ProductDvo>();
			for(int i = 0;i<20;i++){
			ProductDvo prod = new ProductDvo();
			dvo.addProduct(prod);
			}
		
		categories.add(dvo);
		
		return categories;
	} */

}
