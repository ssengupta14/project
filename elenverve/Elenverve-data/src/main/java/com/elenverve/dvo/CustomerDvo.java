package com.elenverve.dvo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.elenverve.common.IConstants;

public class CustomerDvo extends UserDvo  implements Serializable{	
	
	private static final long serialVersionUID = -7694401950284081381L;
	private FraudCheckDvo fraudCheck= new FraudCheckDvo();
	//private Set<ShippingAddressDvo> shipingAddresses = new HashSet<ShippingAddressDvo>();
	//private BillingAddressDvo billingAddress;
	private String defaultShippingAddressId ;
	private String wishListId;
	
	private UserSettingsDvo settings = new UserSettingsDvo();
	
	@Override
	public boolean isAccountNonExpired(){
		return fraudCheck.isAccountActive();
	}
	@Override
	public boolean isAccountNonLocked(){
		return fraudCheck.isAccountNonLocked();
	}

	public void lockAccount(){
		fraudCheck.setAccountNonLocked();
	}
	
	public void inActivateAccount(){
		fraudCheck.setAccountActive();
	}
	public void fraudulentAccount(){
		fraudCheck.setIsfraudAccount();
	}
	public void disableAccount(){
		fraudCheck.setAccountEnabled();
	}
	@Override
	public boolean isEnabled() {
		return fraudCheck.isAccountEnabled();
	}
	public boolean isCredentialsNonExpired(){
		Date lastPasswordChangedDt = fraudCheck.getLastpasswordChangedDt();
		if(lastPasswordChangedDt==null){return true;}
		Date today = Calendar.getInstance().getTime();
		long daysDiff =(today.getTime()-lastPasswordChangedDt.getTime())/(24 * 60 * 60 * 1000);
		if(daysDiff<IConstants.PASSWORD_CHG_DAYS_POLICY){
			return true;
		}
		return false;
	}
	public FraudCheckDvo getFraudCheck() {
		return fraudCheck;
	}
	public void setFraudCheck(FraudCheckDvo fraudCheck) {
		this.fraudCheck = fraudCheck;
	}
	/*public Set<ShippingAddressDvo> getShipingAddresses() {
		return shipingAddresses;
	}
	public void addShipingAddress(ShippingAddressDvo shipingAddress) {		
		this.shipingAddresses.add(shipingAddress);
	}
	public BillingAddressDvo getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(BillingAddressDvo billingAddress) {
		this.billingAddress = billingAddress;
	}*/
	public String getDefaultShippingAddressId() {
		return defaultShippingAddressId;
	}
	public void setDefaultShippingAddressId(String defaultShippingAddressId) {
		this.defaultShippingAddressId = defaultShippingAddressId;
	}
	public UserSettingsDvo getSettings() {
		return settings;
	}
	public void setSettings(UserSettingsDvo settings) {
		this.settings = settings;
	}
	public String getWishListId() {
		return wishListId;
	}
	public void setWishListId(String wishListId) {
		this.wishListId = wishListId;
	}
}
