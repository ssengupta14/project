package com.elenverve.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.elenverve.common.Parameters;
import com.elenverve.dao.DbAccessService;
import com.elenverve.dpo.BannerDpo;
import com.elenverve.dpo.CategoryDpo;
import com.elenverve.dpo.CollectionDpo;
import com.elenverve.dvo.CategoryDvo;
import com.elenverve.dvo.CollectionDvo;
import com.elenverve.dvo.OfferDvo;
import com.elenverve.util.CommonUtils;

public class Home extends Default{
	private List<BannerDpo> topBanner = new LinkedList<BannerDpo>();
	private String banner;
	private String dailyDeal;
	private String weeklyDeal;
	private List<CollectionDpo> collections = new ArrayList<CollectionDpo>();
	private List<CategoryDpo> categories = new ArrayList<CategoryDpo>();
	private DbAccessService dbService;
	
	/*public Home(DbAccessService dbService){
		this.dbService = dbService;
	} */
	
	public Home(Parameters parameters){
		this.parameters = parameters;
	}
	
	public String getBanner(){
		return (String) handler.getProperties().get(TOP_BANNER);
	}
	
	public String getDailyDeal(){
		//logger.debug("-----------------------  Daily deals");
		return (String) handler.getProperties().get(DAILY_DEAL);
	}
	public String getWeeklyDeal(){
		//logger.debug("-----------------------  Weekly deals");
		return (String) handler.getProperties().get(WEEKLY_DEAL);
	}
	/**
	 * Retrieve collections list	
	 * @return
	 */
	public List<CollectionDpo> getCollections(){	
		//logger.debug("-----------------------  Collections");
		List<CollectionDvo> collectionDvos = (List<CollectionDvo>)parameters.getParameter(COLLECTIONS);//dbService.getCollections();
		List<OfferDvo> offerDvos = (List<OfferDvo>)parameters.getParameter(OFFERS);
		//logger.debug("dbService is not null, "+collectionDvos.size());
		for(CollectionDvo dvo: collectionDvos){
			CollectionDpo dpo = new CollectionDpo();
			dpo.setCollectionId(dvo.getCollectionId());
			dpo.setCollectionName(dvo.getCollectionName());
			dpo.setImage(dvo.getImage());
			//TODO: need to add offers
			/*
			List<String> offerIds = dvo.getOffers();
			List<OfferDvo> offers = new ArrayList<OfferDvo>();
			for(OfferDvo offerDvo:offerDvos){
				if(offerIds.contains(offerDvo.getOfferId())){
					offers.add(offerDvo);
				}
			}
			List<String> offerWords = CommonUtils.offerWordFormatter(offers);
			StringBuilder str = new StringBuilder();
			for(String offerWord:offerWords){
				str.append(offerWord + " AND ");
				
			}
			
			String finalWord = str.substring(0, str.length()-5);
			dpo.setOffer(finalWord);
			*/
			dpo.setItems(dvo.getProducts().size());
			collections.add(dpo);
			
		}
		
		//for(CollectionDpo dpo:collections){
			//logger.debug(dpo.getCollectionId()+" " + dpo.getCollectionName()+" "+dpo.getImage()+" "+ dpo.getItems()+" "+ dpo.getOffer());
		//}
		return collections;
	}
	
	/**
	 * Retrieve collections list	
	 * @return
	 */
	public List<CategoryDpo> getCategories(){	
		//logger.debug("-----------------------  Categories");
		List<CategoryDvo> categoryDvos = (List<CategoryDvo>)parameters.getParameter(CATEGORIES);
				//dbService.getCategories();
		List<OfferDvo> offerDvos = (List<OfferDvo>)parameters.getParameter(OFFERS);
		//logger.debug("dbService is not null, "+categoryDvos.size());
		for(CategoryDvo dvo: categoryDvos){
			CategoryDpo dpo = new CategoryDpo();
			dpo.setCategoryId(dvo.getCategoryId());
			dpo.setCategoryName(dvo.getCategoryName());
			dpo.setImage(dvo.getImage());
			//TODO need to add offers
			/*
			List<String> offerIds = dvo.getOffers();
			List<OfferDvo> offers = new ArrayList<OfferDvo>();
			for(OfferDvo offerDvo:offerDvos){
				if(offerIds.contains(offerDvo.getOfferId())){
					offers.add(offerDvo);
				}
			}
			List<String> offerWords = CommonUtils.offerWordFormatter(offers);
			StringBuilder str = new StringBuilder();
			for(String offerWord:offerWords){
				str.append(offerWord + " AND ");
				
			}
			
			String finalWord = str.substring(0, str.length()-5);
			dpo.setOffer(finalWord);
			*/
			dpo.setItems(dvo.getProducts().size());
			categories.add(dpo);
			
		}
		
		for(CategoryDpo dpo:categories){
			//logger.debug(dpo.getCategoryId()+" " + dpo.getCategoryName()+" "+dpo.getImage()+" "+ dpo.getItems()+" "+ dpo.getOffer());
			
		}
		return categories;
	}
	public static void main(String arg[]){
		DbAccessService dbAccess = new DbAccessService();
		Home home = new Home(null);
		List<CollectionDpo> coll = home.getCollections();
		for(CollectionDpo dpo:coll){
			//logger.debug(dpo.getCollectionName());
		}
	}

}
