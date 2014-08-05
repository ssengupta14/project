package com.elenverve.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.elenverve.dpo.MenuDpo;
import com.elenverve.handler.XmlPropertiesHandler;

public class Admin extends Default{
	
	@Override
	public List<MenuDpo> getMenus() {
		//TestMenu men = new TestMenu();
		menus= (List<MenuDpo>)handler.getProperties().get(MENUS);
		return menus;
	}	
	
	
}
