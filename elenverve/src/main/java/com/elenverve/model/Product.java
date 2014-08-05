package com.elenverve.model;

import java.util.HashMap;
import java.util.Map;

public class Product {
	private static Map<String,String> currencies = new HashMap<String,String>();
	private String name;
	private String imgUrl;
	private int originalPrice;
	private int finalPrice;
	private String currInd;
	private int cartInd;
	private int favInd;
	private int giftInd;
	private int detailLinkInd;
	private int imageSizeType;
	private int isNew;
	static{
		currencies.put("USD", "$");
		currencies.put("EURO", "€");
	}
	public int getIsNew() {
		return isNew;
	}
	public void setIsNew(int isNew) {
		this.isNew = isNew;
	}
	public int getImageSizeType() {
		return imageSizeType;
	}
	public void setImageSizeType(int imageSizeType) {
		this.imageSizeType = imageSizeType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImgUrl() {
		return "/resources/images/"+imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public int getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(int originalPrice) {
		this.originalPrice = originalPrice;
	}
	public int getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(int finalPrice) {
		this.finalPrice = finalPrice;
	}
	public String getCurrInd() {
		return currInd;
	}
	public void setCurrInd(String currInd) {
		currInd = currInd;
	}
	public int getCartInd() {
		return cartInd;
	}
	public void setCartInd(int cartInd) {
		this.cartInd = cartInd;
	}
	public int getFavInd() {
		return favInd;
	}
	public void setFavInd(int favInd) {
		this.favInd = favInd;
	}
	public int getGiftInd() {
		return giftInd;
	}
	public void setGiftInd(int giftInd) {
		this.giftInd = giftInd;
	}
	public int getDetailLinkInd() {
		return detailLinkInd;
	}
	public void setDetailLinkInd(int detailLinkInd) {
		this.detailLinkInd = detailLinkInd;
	}
}
