package com.elenverve.dvo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.elenverve.common.IConstants;

public class CustomerDvo extends UserDvo{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7694401950284081381L;
	private FraudCheckDvo fraudCheck= new FraudCheckDvo();
	private List<ShippingAddressDvo> shipingAddresses = new ArrayList<ShippingAddressDvo>();
	private BillingAddressDvo billingAddress;
	@Override
	public boolean isAccountNonExpired(){
		return fraudCheck.isAccountActive();
	}
	@Override
	public boolean isAccountNonLocked(){
		return fraudCheck.isAccountNonLocked();
	}
	/**
	 * Operations on the account
	 */
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
	public List<ShippingAddressDvo> getShipingAddresses() {
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
	}
}
