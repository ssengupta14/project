package com.elenverve.dpo;

import java.util.LinkedList;
import java.util.List;

public class MenuDpo {
	private String title;
	private String displayName;
	private String href;
	private boolean isContainer;
	List<MenuDpo> subMenu = new LinkedList<MenuDpo>();
	
	public MenuDpo(){
		subMenu = new LinkedList<MenuDpo>();
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public boolean isContainer() {
		return isContainer;
	}

	public void setContainer(boolean isContainer) {
		this.isContainer = isContainer;
	}

	public List<MenuDpo> getSubMenu() {
		return subMenu;
	}

	public void addSubMenu(MenuDpo subMenu) {
		this.subMenu.add(subMenu);
	}
	
}
