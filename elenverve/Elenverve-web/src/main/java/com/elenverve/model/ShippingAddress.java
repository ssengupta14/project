package com.elenverve.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.elenverve.dvo.ShippingAddressDvo;

public class ShippingAddress {
	
	private List<String> addressIds = new ArrayList<String>();
	private Set<ShippingAddressDvo> shippingAddressDvos  = new HashSet<ShippingAddressDvo>() ;		
	
	
	public ShippingAddress(Set<ShippingAddressDvo> shippingAddressDvoList){		
		this.shippingAddressDvos = shippingAddressDvoList ; 		
	}	
	
	public List<String> getAddressIds() {
		return addressIds;
	}

	public Set<ShippingAddressDvo> getShippingAddressDvos() {
		return shippingAddressDvos;
	}

	public ShippingAddressDvo getDefaultShippingAddressDvo(String addressId) throws Exception{
		for(ShippingAddressDvo shippingAddressDvo : shippingAddressDvos){
			if (addressId.equalsIgnoreCase(shippingAddressDvo.getId()))
				return shippingAddressDvo;
		}
		throw new Exception("Shipping address not foud");
	}
	
	public void setAddressIds(List<String> addressIds) {
		this.addressIds = addressIds;
	}

	public void setShippingAddressDvos(Set<ShippingAddressDvo> shippingAddressDvos) {
		this.shippingAddressDvos = shippingAddressDvos;
	}
}
