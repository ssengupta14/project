package com.elenverve.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.elenverve.common.IConstants;
import com.elenverve.common.Parameters;
import com.elenverve.controller.HomeController;
import com.elenverve.dpo.MenuDpo;
import com.elenverve.handler.XmlPropertiesHandler;

public class Default implements IConstants{
	protected Parameters parameters;
	protected Map<String,Object> values = new HashMap<String,Object>();
	private static final Logger logger = Logger.getLogger(Default.class);
	protected XmlPropertiesHandler handler = XmlPropertiesHandler.getInstance();
	protected List<MenuDpo> menus = new LinkedList<MenuDpo>();
	public Default(){
		List<Integer> types = new ArrayList<Integer>();
		types.add(0);		
		handler.initialize(types);
	}
	public List<MenuDpo> getMenus() {
		//TestMenu men = new TestMenu();
		menus= (List<MenuDpo>)handler.getProperties().get(MENUS);
		for(MenuDpo m:menus){
			logger.debug("name: "+m.getDisplayName()+" url: "+m.getHref());
		}
		return menus;
	}
	
	public Map<String, Object> getValues() {
		return values;
	}
	public void addValues(String key, Object value) {
		this.values.put(key, value);
	}
	public Object getValue(String key) {
		return this.values.get(key);
	}
}
