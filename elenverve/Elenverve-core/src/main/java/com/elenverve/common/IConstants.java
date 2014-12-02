package com.elenverve.common;

public interface IConstants {
	
	/**
	 * These are constants related to XML resources file
	 * 
	 */
	//Image constants
	
	public static String RESOURCES_URL ="/resources/";
	public static String IMAGES_URL ="/images/";//RESOURCES_URL+"/images";
	public static String CATEGORY_IMAGES_URL ="/category/";//IMAGES_URL+"/Category/";
	public static String COLLECTION_IMAGES_URL ="/collection/";//IMAGES_URL+"/Collection/";
	public static String PRODUCT_IMAGES_URL =IMAGES_URL+"/Product/";
	
	public static String BASE_CONTEXT_URL="base-context-url";
	public static String HEADER="header";
	public static String MENUS ="menus";
	public static String MENU ="menu";
	public static String SUB_MENUS ="sub-menus";
	public static String TOP_BANNER ="top-banner";
	public static String SLIDES ="slides";
	public static String SLIDE ="slide";
	public static String OVERLAYS ="overlays";
	public static String OVERLAY ="overlay";
	public static String CAPTIONS ="captions";
	public static String TEXT ="text";
	public static String DAILY_DEAL ="daily-deal";
	public static String WEEKLY_DEAL ="weekly-deal";
	
	//dvos
	public static String ADDRESS ="address";
	public static String PRODUCTS ="products";
	public static String CATEGORIES="categories";
	public static String COLLECTIONS="collections";
	public static String DESIGNERS="designers";
	public static String OFFERS ="offers";
	public static String REQUEST ="request";
	public static String CUSTOMER ="customer";
	public static String WISHLIST ="wishlist";
	public static String ORDERHISTORY ="orderHistory";
	public static String DISCOUNTS ="discounts";
	public static String GIFTS ="gifts";
	
	
	//user
	public static String FIRST_NAME ="firstName";
	public static String LAST_NAME ="lastName";
	public static String PASSWORD ="password";
	public static String EMAIL_ID ="emailId";
	
	//member status
	
	public static String NEWBIE="new"; //0-6 mnts
	public static String PRO="pro"; // 6 mnth -1 yr
	public static String BRONZE="bronze"; // 2-3 yrs
	public static String SILVER="silver"; // 3-5 yrs
	public static String GOLD="gold"; // 5-7 yrs
	public static String PLATINUM="platinum"; // 7+ yrs
	
	public static long PASSWORD_CHG_DAYS_POLICY = 30;
	public static String ANONYMOUS_USER ="anonymousUser";
	
	/**
	 * These are constants related to shipping options
	 */	
}
