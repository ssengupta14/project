package com.elenverve.dvo;

import java.util.Date;

public class FraudCheckDvo {
	
	private String ipAddress;
	private String longitude;
	private String latitude;
	private String country;
	private Date lastLoggedInDt;
	private Date lastPurchaseDt;
	private Date lastpasswordChangedDt;
	private int highestTransaction;
	private boolean isfraudAccount;
	private boolean isAccountActive;
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Date getLastLoggedInDt() {
		return lastLoggedInDt;
	}
	public void setLastLoggedInDt(Date lastLoggedInDt) {
		this.lastLoggedInDt = lastLoggedInDt;
	}
	public Date getLastPurchaseDt() {
		return lastPurchaseDt;
	}
	public void setLastPurchaseDt(Date lastPurchaseDt) {
		this.lastPurchaseDt = lastPurchaseDt;
	}
	public Date getLastpasswordChangedDt() {
		return lastpasswordChangedDt;
	}
	public void setLastpasswordChangedDt(Date lastpasswordChangedDt) {
		this.lastpasswordChangedDt = lastpasswordChangedDt;
	}
	public int getHighestTransaction() {
		return highestTransaction;
	}
	public void setHighestTransaction(int highestTransaction) {
		this.highestTransaction = highestTransaction;
	}
	public boolean isIsfraudAccount() {
		return isfraudAccount;
	}
	public void setIsfraudAccount(boolean isfraudAccount) {
		this.isfraudAccount = isfraudAccount;
	}
	public boolean isAccountActive() {
		return isAccountActive;
	}
	public void setAccountActive(boolean isAccountActive) {
		this.isAccountActive = isAccountActive;
	}
	
	
}
