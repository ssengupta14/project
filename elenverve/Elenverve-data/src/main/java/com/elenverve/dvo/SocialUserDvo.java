package com.elenverve.dvo;

public abstract class SocialUserDvo extends CustomerDvo{

	
	private String username;
	private String displayName;
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getProfileUrl() {
		return profileUrl;
	}
	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	private String profileUrl;
	private String imageUrl;
	
	
	private int type = Integer.MIN_VALUE;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public int getType() {
		return type;
	}

	protected void setType(int type) {
		this.type = type;
	}
	
}
