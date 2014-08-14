package com.elenverve.dvo;

import java.util.List;


public class ProductDvo {
	private String productId;
	private String productCategoryId;
	private String description;
	private String highlights;
	private double initialPrice;
	private double finalPrice;
	private int currencyCd;
	private String imageUrl1;
	private String imageUrl2;
	private String imageUrl3;
	private String imageUrl4;
	private String imageUrl5;
	private String videoUrl;
	private double ratingScore;
	private boolean isNew;
	private boolean inStock;
	
	//Analytics
	private boolean isHotSelling;
	private boolean isMostRecommended;
	private boolean isMostTweeted;
	private boolean isMostLiked;
	private boolean isMostShared;
	
	private List<OfferDvo> offers;
	
	private int rewardPoints;
	
	private List<TestimonialDvo> testimonials;	
	private SocialProductDvo socialStats;
	
	
	public int getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductCategoryId() {
		return productCategoryId;
	}
	public void setProductCategoryId(String productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getHighlights() {
		return highlights;
	}
	public void setHighlights(String highlights) {
		this.highlights = highlights;
	}
	public double getInitialPrice() {
		return initialPrice;
	}
	public void setInitialPrice(double initialPrice) {
		this.initialPrice = initialPrice;
	}
	public double getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	public int getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(int currencyCd) {
		this.currencyCd = currencyCd;
	}
	public String getImageUrl1() {
		return imageUrl1;
	}
	public void setImageUrl1(String imageUrl1) {
		this.imageUrl1 = imageUrl1;
	}
	public String getImageUrl2() {
		return imageUrl2;
	}
	public void setImageUrl2(String imageUrl2) {
		this.imageUrl2 = imageUrl2;
	}
	public String getImageUrl3() {
		return imageUrl3;
	}
	public void setImageUrl3(String imageUrl3) {
		this.imageUrl3 = imageUrl3;
	}
	public String getImageUrl4() {
		return imageUrl4;
	}
	public void setImageUrl4(String imageUrl4) {
		this.imageUrl4 = imageUrl4;
	}
	public String getImageUrl5() {
		return imageUrl5;
	}
	public void setImageUrl5(String imageUrl5) {
		this.imageUrl5 = imageUrl5;
	}
	public String getVideoUrl() {
		return videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	public double getRatingScore() {
		return ratingScore;
	}
	public void setRatingScore(double ratingScore) {
		this.ratingScore = ratingScore;
	}
	public boolean isNew() {
		return isNew;
	}
	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}
	public boolean isInStock() {
		return inStock;
	}
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
	public boolean isHotSelling() {
		return isHotSelling;
	}
	public void setHotSelling(boolean isHotSelling) {
		this.isHotSelling = isHotSelling;
	}
	public boolean isMostRecommended() {
		return isMostRecommended;
	}
	public void setMostRecommended(boolean isMostRecommended) {
		this.isMostRecommended = isMostRecommended;
	}
	public boolean isMostTweeted() {
		return isMostTweeted;
	}
	public void setMostTweeted(boolean isMostTweeted) {
		this.isMostTweeted = isMostTweeted;
	}
	public boolean isMostLiked() {
		return isMostLiked;
	}
	public void setMostLiked(boolean isMostLiked) {
		this.isMostLiked = isMostLiked;
	}
	public boolean isMostShared() {
		return isMostShared;
	}
	public void setMostShared(boolean isMostShared) {
		this.isMostShared = isMostShared;
	}
	public List<TestimonialDvo> getTestimonials() {
		return testimonials;
	}
	public void setTestimonials(List<TestimonialDvo> testimonials) {
		this.testimonials = testimonials;
	}
	public List<OfferDvo> getOffers() {
		return offers;
	}
	public void addOffer(OfferDvo offer) {
		this.offers.add(offer);
	}
	public SocialProductDvo getSocialStats() {
		return socialStats;
	}
	public void setSocialStats(SocialProductDvo socialStats) {
		this.socialStats = socialStats;
	}
	
	
}
