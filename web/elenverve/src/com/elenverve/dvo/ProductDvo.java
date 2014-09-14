package com.elenverve.dvo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.elenverve.common.IConstants;

@Document
public class ProductDvo {
	@Id
	private String productId;
	private ProductDetails details;
	private ProductFeatures features;
	private ProductAnalytics analytics;
	private ProductPromotions promotions;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public ProductDetails getDetails() {
		return details;
	}


	public void setDetails(ProductDetails details) {
		this.details = details;
	}


	public ProductFeatures getFeatures() {
		return features;
	}


	public void setFeatures(ProductFeatures features) {
		this.features = features;
	}


	public ProductAnalytics getAnalytics() {
		return analytics;
	}


	public void setAnalytics(ProductAnalytics analytics) {
		this.analytics = analytics;
	}


	public ProductPromotions getPromotions() {
		return promotions;
	}


	public void setPromotions(ProductPromotions promotions) {
		this.promotions = promotions;
	}


	// product details
	public class ProductDetails{
		
		private String categoryId;
		private String collectionId;
		private String designerId;
		private String productName;
		private String modelNo;
		private String skuNo;
		private boolean newInd;
		private boolean inStock;
		private String description;
		private String features;
		private Dimension dimension;
		private String color;
		private String material;
		private double initialPrice;
		private double finalPrice;
		private int currencyCd;	
		private List<String> imageUrls = new ArrayList<String>();
		private List<String> videoUrls = new ArrayList<String>();
		
		public void addImageUrl(String imageUrl) {
			this.imageUrls.add("/product/"+imageUrl);
		}
		public List<String> getImageUrls() {
			return imageUrls;
		}
		public void addVideoUrl(String videoUrl) {
			this.videoUrls.add("/product/"+videoUrl);
		}
		public List<String> getVideoUrls() {
			return videoUrls;
		}
		
		public String getCategoryId() {
			return categoryId;
		}
		public void setCategoryId(String categoryId) {
			this.categoryId = categoryId;
		}
		public String getCollectionId() {
			return collectionId;
		}
		public void setCollectionId(String collectionId) {
			this.collectionId = collectionId;
		}
		public String getDesignerId() {
			return designerId;
		}
		public void setDesignerId(String designerId) {
			this.designerId = designerId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public String getModelNo() {
			return modelNo;
		}
		public void setModelNo(String modelNo) {
			this.modelNo = modelNo;
		}
		public String getSkuNo() {
			return skuNo;
		}
		public void setSkuNo(String skuNo) {
			this.skuNo = skuNo;
		}
		public boolean isNewInd() {
			return newInd;
		}
		public void setNewInd(boolean newInd) {
			this.newInd = newInd;
		}
		public boolean isInStock() {
			return inStock;
		}
		public void setInStock(boolean inStock) {
			this.inStock = inStock;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getFeatures() {
			return features;
		}
		public void setFeatures(String features) {
			this.features = features;
		}
		public Dimension getDimension() {
			return dimension;
		}
		public void setDimension(Dimension dimension) {
			this.dimension = dimension;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getMaterial() {
			return material;
		}
		public void setMaterial(String material) {
			this.material = material;
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
		
		

		
		
	}
	
		
	// product features
	public class ProductFeatures{
		private List<String> prodFeatures = new ArrayList<String>();
		private List<String> availableColors = new ArrayList<String>();
		private String estimatedShipping;
		private String whatsIncluded;
		
		public List<String> getProdFeatures() {
			return prodFeatures;
		}
		public void addProdFeature(String prodFeature) {
			this.prodFeatures.add(prodFeature);
		}
		public List<String> getAvailableColors() {
			return availableColors;
		}
		public void addAvailableColor(String availableColor) {
			this.availableColors.add(availableColor);
		}
		public String getWhatsIncluded() {
			return whatsIncluded;
		}
		public void setWhatsIncluded(String whatsIncluded) {
			this.whatsIncluded = whatsIncluded;
		}
		public String getEstimatedShipping() {
			return estimatedShipping;
		}
		public void setEstimatedShipping(String estimatedShipping) {
			this.estimatedShipping = estimatedShipping;
		}
		
		
		
	}
	// product analytics & feedback
	public class ProductAnalytics{
		private boolean hotSelling;
		private boolean mostRecommended;
		private boolean mostTweeted;
		private boolean mostLiked;
		private boolean mostShared;
		private double prodRatingStars;
		private SocialProductDvo socialStats;
		
		public boolean isHotSelling() {
			return hotSelling;
		}
		public void setHotSelling(boolean hotSelling) {
			this.hotSelling = hotSelling;
		}
		public boolean isMostRecommended() {
			return mostRecommended;
		}
		public void setMostRecommended(boolean mostRecommended) {
			this.mostRecommended = mostRecommended;
		}
		public boolean isMostTweeted() {
			return mostTweeted;
		}
		public void setMostTweeted(boolean mostTweeted) {
			this.mostTweeted = mostTweeted;
		}
		public boolean isMostLiked() {
			return mostLiked;
		}
		public void setMostLiked(boolean mostLiked) {
			this.mostLiked = mostLiked;
		}
		public boolean isMostShared() {
			return mostShared;
		}
		public void setMostShared(boolean mostShared) {
			this.mostShared = mostShared;
		}
		public double getProdRatingStars() {
			return prodRatingStars;
		}
		public void setProdRatingStars(double prodRatingStars) {
			this.prodRatingStars = prodRatingStars;
		}
		public SocialProductDvo getSocialStats() {
			return socialStats;
		}
		public void setSocialStats(SocialProductDvo socialStats) {
			this.socialStats = socialStats;
		}	
		
		
		
	}
	// product promotions
	public class ProductPromotions{
		private int rewardPoints;
		private List<OfferDvo> offers = new ArrayList<OfferDvo>();
		
		public List<OfferDvo> getOffers() {
			return offers;
		}
		public void addOffer(OfferDvo offer) {
			this.offers.add(offer);
		}
		public int getRewardPoints() {
			return rewardPoints;
		}
		public void setRewardPoints(int rewardPoints) {
			this.rewardPoints = rewardPoints;
		}
		
		
	}
	

	public class Dimension{
		private int length;
		private int width;
		private int height;
		private String weight;
		public Dimension(int length,int width, int height, String weight){
			this.length= length;
			this.width = width;
			this.height = height;
			this.weight = weight;			
		}
		public int getLength() {
			return length;
		}
		public void setLength(int length) {
			this.length = length;
		}
		public int getWidth() {
			return width;
		}
		public void setWidth(int width) {
			this.width = width;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public String getWeight() {
			return weight;
		}
		public void setWeight(String weight) {
			this.weight = weight;
		}
		
		
	}
}
