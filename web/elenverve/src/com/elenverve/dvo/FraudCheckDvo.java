package com.elenverve.dvo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class FraudCheckDvo {
	
	private String ipAddress;
	private String longitude;
	private String latitude;
	private String country;
	private Date lastLoggedInDt;
	private Date lastPurchaseDt;
	private Date lastpasswordChangedDt;
	private int highestTransaction;
	private List<String> browserIds = new ArrayList<String>();
	private boolean isfraudAccount=false;
	private boolean isAccountActive=true;
	private boolean isAccountNonLocked=true;
	private boolean isAccountEnabled = true;
	
	private Date fraudFlaggedDt;
	private Date fraudUnFlaggedDt;
	private Date accountInactivateDt;
	private Date accountActivateDt;
	private Date accountLockDt;
	private Date accountUnLockDt;
	private Date accountDisableDt;
	private Date accountEnableDt;
	private Date today = Calendar.getInstance().getTime();
	
	public Date getFraudFlaggedDt() {
		return fraudFlaggedDt;
	}
	public void setFraudFlaggedDt(Date fraudFlaggedDt) {
		this.fraudFlaggedDt = fraudFlaggedDt;
	}
	public Date getFraudUnFlaggedDt() {
		return fraudUnFlaggedDt;
	}
	public void setFraudUnFlaggedDt(Date fraudUnFlaggedDt) {
		this.fraudUnFlaggedDt = fraudUnFlaggedDt;
	}
	public Date getAccountInactivateDt() {
		return accountInactivateDt;
	}
	public void setAccountInactivateDt(Date accountInactivateDt) {
		this.accountInactivateDt = accountInactivateDt;
	}
	public Date getAccountActivateDt() {
		return accountActivateDt;
	}
	public void setAccountActivateDt(Date accountActivateDt) {
		this.accountActivateDt = accountActivateDt;
	}
	public Date getAccountLockDt() {
		return accountLockDt;
	}
	public void setAccountLockDt(Date accountLockDt) {
		this.accountLockDt = accountLockDt;
	}
	public Date getAccountUnLockDt() {
		return accountUnLockDt;
	}
	public void setAccountUnLockDt(Date accountUnLockDt) {
		this.accountUnLockDt = accountUnLockDt;
	}
	public Date getAccountDisableDt() {
		return accountDisableDt;
	}
	public void setAccountDisableDt(Date accountDisableDt) {
		this.accountDisableDt = accountDisableDt;
	}
	public Date getAccountEnableDt() {
		return accountEnableDt;
	}
	public void setAccountEnableDt(Date accountEnableDt) {
		this.accountEnableDt = accountEnableDt;
	}
	
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
	public void setIsfraudAccount() {
		this.isfraudAccount = true;
		this.setFraudFlaggedDt(today);
	}
	public boolean isAccountActive() {
		return isAccountActive;
	}
	public void setAccountActive() {
		this.isAccountActive = false;
		this.setAccountInactivateDt(today);	
	}
	public List<String> getBrowserInfo() {
		return browserIds;
	}
	public void addBrowserInfo(String browserId) {
		this.browserIds.add(browserId);
	}
	public boolean isAccountNonLocked() {
		return isAccountNonLocked;
	}
	public void setAccountNonLocked() {
		this.isAccountNonLocked = false;
		this.setAccountLockDt(today);
	}
	public boolean isAccountEnabled() {
		return isAccountEnabled;
	}
	public void setAccountEnabled() {
		this.isAccountEnabled = false;
		this.setAccountDisableDt(today);
	}
	
	
}
