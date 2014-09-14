package com.elenverve.dao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class DbAccessService {//extends BaseDao{
	private static final Logger logger = Logger.getLogger(DbAccessService.class);
	private DbAccessService dbAccess;
	public void initialize(){
		dbAccess = new DbAccessService();
	}
	/*
	public List<CollectionDvo> getCollections(){
		List<CollectionDvo> collections = new ArrayList<CollectionDvo>();
		//TODO mocking up the db call to fetch collections, will remove later
		CollectionDvo dvo = new CollectionDvo();
		dvo.setCollectionId("001");
		dvo.setCollectionName("ELEMENTS");
		dvo.setDescription("This is elements collection");
		dvo.setImage("DSC_1336.jpg");
		
		OfferDvo offer = new OfferDvo();
		offer.setOfferType(OfferDvo.DISCOUNT);
		offer.setDiscountName("SUMMER");
		offer.setDiscountPercentage(30.00);
		offer.setEndWord("Discount");
		offer.setTemplateId("SeasonSalePercCol001");
		offer.setCollectionId(dvo.getCollectionId());
		offer.setCollectionName(dvo.getCollectionName());		
		dvo.addOffer(offer);
		
		// adding 10 products
		List<ProductDvo> products = new ArrayList<ProductDvo>();
			for(int i = 0;i<10;i++){
			ProductDvo prod = new ProductDvo();
			products.add(prod);
			}
		dvo.setProducts(products);
		
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
	// need to revisit the logic
	public String getCategoryId(String categoryName,String subCatId){
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
/*	
		return "CAT001";
	}
	public List<CategoryDvo> getCategories(){
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
	}
	public List<ProductDvo> getProducts(){
		List<ProductDvo> dvos = new ArrayList<ProductDvo>();
		
		// adding a product
		logger.debug("Fetching product list from DB");
		for (int i = 0; i <= 35; i++) {
			ProductDvo dvo = new ProductDvo();
			ProductDetails details = dvo.new ProductDetails();

			dvo.setProductId("P00"+i);
			details.setProductName("Product "+i);
			details.setCollectionId("COL001");
			details.setCurrencyCd(0);
			details.setDescription("This is a sample product "+i);
			details.setFinalPrice(250.00+i);
			details.addImageUrl("/prods/"+(i+1)+".jpg");
			details.setInitialPrice(300.00+i);
			details.setInStock(true);
			details.setNewInd(false);
			details.setCategoryId("CAT001");
			dvo.setDetails(details);
			
			ProductAnalytics analytics = dvo.new ProductAnalytics();

			analytics.setHotSelling(true);
			analytics.setMostLiked(false);
			analytics.setMostRecommended(false);
			analytics.setMostShared(false);
			analytics.setProdRatingStars(3.5);
	
			
			SocialProductDvo socialProdDvo = new SocialProductDvo();
			socialProdDvo.setDislikeCtr(4);
			socialProdDvo.setFbLikesCtr(200);
			socialProdDvo.setFbShareCtr(35000);
			socialProdDvo.setRecomendationCtr(35);
			socialProdDvo.setSocialProductId("SP00"+i);
			socialProdDvo.setTweetsCtr(2000);

			TestimonialDvo testimonialDvo = new TestimonialDvo();
			testimonialDvo
					.setComments("This is a sample testimonial comment ..");
			testimonialDvo.setReviewStars(3.0);
			testimonialDvo.setTestimonialId("T00"+i);
			testimonialDvo.setUsername("testUser"+i);
			testimonialDvo.setDate(Calendar.getInstance().getTime());
			socialProdDvo.addReview(testimonialDvo);
			analytics.setSocialStats(socialProdDvo);
			dvo.setAnalytics(analytics);
			
			ProductPromotions promotions = dvo.new ProductPromotions();
			promotions.setRewardPoints(300);
			dvo.setPromotions(promotions);
			
			dvos.add(dvo);
		}
			return dvos;
	}
*/

}
