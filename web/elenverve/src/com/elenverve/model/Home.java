package com.elenverve.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.elenverve.dpo.BannerDpo;
import com.elenverve.dpo.MenuDpo;
import com.elenverve.handler.XmlPropertiesHandler;

public class Home extends Default{
	private List<BannerDpo> topBanner = new LinkedList<BannerDpo>();
	private String banner;
	
	public List<BannerDpo> getTopBanner(){
		topBanner = (List<BannerDpo>) handler.getProperties().get(TOP_BANNER);
		return topBanner;
	}
	public String getBanner(){
		return (String) handler.getProperties().get(TOP_BANNER);
	}
	
	public List<BannerDpo> getEveryDayDeal(){
		topBanner = (List<BannerDpo>) handler.getProperties().get(TOP_BANNER);
		return topBanner;
	}
	


}
