package com.elenverve.dvo;

import java.util.ArrayList;
import java.util.List;

public class CustomerDvo extends UserDvo{
	
	
	private FraudCheckDvo fraudCheck;
	private List<ShippingAddressDvo> shipingAddresses = new ArrayList<ShippingAddressDvo>();
	private BillingAddressDvo billingAddress;
	
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
