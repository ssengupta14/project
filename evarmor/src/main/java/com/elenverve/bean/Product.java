package com.elenverve.bean;

import java.util.Calendar;
import java.util.Map;
import java.util.Random;

import com.elenverve.dvo.ProductDvo;
import com.elenverve.dvo.SocialProductDvo;
import com.elenverve.dvo.TestimonialDvo;
import com.elenverve.dvo.ProductDvo.ProductAnalytics;
import com.elenverve.dvo.ProductDvo.ProductDetails;
import com.elenverve.dvo.ProductDvo.ProductPromotions;

public class Product implements ITestConstants{
	
	public static ProductDvo createProducts(Map<String,String> parameters){
		Random random = new Random();
		ProductDvo dvo = new ProductDvo();
		ProductDetails details = dvo.new ProductDetails();
		String prodId = parameters.get(PROD_ID);
		int counter = Integer.parseInt(parameters.get(COUNTER));
		dvo.setProductId(prodId);
		details.setProductName("Product "+counter);
		details.setCollectionId(parameters.get(COLL_ID));
		details.setCurrencyCd(0);
		details.setDescription("This is a sample product "+counter);
		details.setFinalPrice(25.00*random.nextInt(10));
		int imgCtr = counter+1;
		
		details.addImageUrl("/prods/"+((counter%MAX_IMG_CTR)+1)+".jpg");
		details.setInitialPrice(30.00*random.nextInt(10));
		details.setInStock(true);
		details.setNewInd(false);
		details.setCategoryId(parameters.get(CAT_ID));
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
		socialProdDvo.setSocialProductId("SP00"+counter);
		socialProdDvo.setTweetsCtr(2000);

		TestimonialDvo testimonialDvo = new TestimonialDvo();
		testimonialDvo
				.setComments("This is a sample testimonial comment ..");
		testimonialDvo.setReviewStars(3.0);
		testimonialDvo.setTestimonialId("T00"+counter);
		testimonialDvo.setUsername("testUser"+counter);
		testimonialDvo.setDate(Calendar.getInstance().getTime());
		socialProdDvo.addReview(testimonialDvo);
		analytics.setSocialStats(socialProdDvo);
		dvo.setAnalytics(analytics);
		
		ProductPromotions promotions = dvo.new ProductPromotions();
		promotions.setRewardPoints(300);
		dvo.setPromotions(promotions);
		
		return dvo;
}


}
