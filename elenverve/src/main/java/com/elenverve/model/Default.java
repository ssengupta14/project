package com.elenverve.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.elenverve.common.IConstants;
import com.elenverve.dpo.MenuDpo;
import com.elenverve.handler.XmlPropertiesHandler;

public class Default implements IConstants{
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
		return menus;
	}
}
