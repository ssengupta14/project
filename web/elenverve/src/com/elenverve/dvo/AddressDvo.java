package com.elenverve.dvo;

public abstract class AddressDvo{
	
	public static int SHIPPING=0;
	public static int BILLING=1;
	public static int Res=3;
	public static int Offi=4;
	
	private String comments;
	private int addressType;
	private String streetNo;
	private String streetName;
	private int unitType;
	private String unitName;
	private String city;
	private String state;
	private String zip;
	
	public int getAddressType() {
		return addressType;
	}
	public void setAddressType(int addressType) {
		this.addressType = addressType;
	}
	public String getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getUnitType() {
		return unitType;
	}
	public void setUnitType(int unitType) {
		this.unitType = unitType;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
	
	
}

