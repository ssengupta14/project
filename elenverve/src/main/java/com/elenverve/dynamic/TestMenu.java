package com.elenverve.dynamic;

import java.util.LinkedList;
import java.util.List;

import com.elenverve.dpo.MenuDpo;



public class TestMenu {
	
	public List<MenuDpo> getMenus(){
		
		List<MenuDpo> menus = new LinkedList<MenuDpo>();
		
		MenuDpo menu = new MenuDpo();
		menu.setDisplayName("Home");
		
		
		MenuDpo menu1 = new MenuDpo();
		menu1.setDisplayName("Home Page 1");
		menu1.setHref("index.html");
		menu.addSubMenu(menu1);
		
		menu1 = new MenuDpo();
		menu1.setDisplayName("Home Page 2");
		menu1.setHref("index.html");
		menu.addSubMenu(menu1);
		
		menu1 = new MenuDpo();
		menu1.setDisplayName("Home Page 3");
		menu1.setHref("index.html");
		menu.addSubMenu(menu1);
		
		menu1 = new MenuDpo();
		menu1.setDisplayName("Home Page 4");
		menu1.setHref("index.html");
		menu.addSubMenu(menu1);
		
		menu1 = new MenuDpo();
		menu1.setDisplayName("Home Page 5");
		menu1.setHref("index.html");
		menu.addSubMenu(menu1);
		
		menu1 = new MenuDpo();
		menu1.setDisplayName("Home Page 6");
		menu1.setHref("index.html");
		menu.addSubMenu(menu1);
		
		menus.add(menu);
		
		
		
		menu = new MenuDpo();
		menu.setDisplayName("Features");
				
		menu1 = new MenuDpo();
		menu1.setDisplayName("Header Style 1");
		menu1.setHref("index.html");
		menu.addSubMenu(menu1);
		
		menu1 = new MenuDpo();
		menu1.setDisplayName("Header Style 2");
		menu1.setHref("index.html");
		menu.addSubMenu(menu1);
		
		menu1 = new MenuDpo();
		menu1.setDisplayName("Header Style 3");
		menu1.setHref("index.html");
		menu.addSubMenu(menu1);
		
		menu1 = new MenuDpo();
		menu1.setDisplayName("Header Style 4");
		menu1.setHref("index.html");
		menu.addSubMenu(menu1);
		
		menu1 = new MenuDpo();
		menu1.setDisplayName("Header Style 5");
		menu1.setHref("index.html");
		menu.addSubMenu(menu1);
		
		menu1 = new MenuDpo();
		menu1.setDisplayName("Header Style 6");
		menu1.setHref("index.html");
		menu.addSubMenu(menu1);
		
		menus.add(menu);
		
		return menus;
		
	}

}
