package com.elenverve.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import com.elenverve.dvo.CustomerDvo;
import com.elenverve.dvo.ShippingAddressDvo;

public class ShippingAddress {
	
	private List<String> addressIds = new ArrayList<String>();
	private Set<ShippingAddressDvo> shippingAddressDvos  = new HashSet<ShippingAddressDvo>() ;
	//private ShippingAddressDvo defaultShippingAddressDvo ;
	private CustomerDvo customerDvo ;
	private String defaultShippingAddress ;	
	
	public ShippingAddress(CustomerDvo customerDvo){
		this.customerDvo =customerDvo;
	}
	
	public ShippingAddress setShippingAddress(){
		this.shippingAddressDvos = customerDvo.getShipingAddresses() ; 
		this.defaultShippingAddress = customerDvo.getShippingAddressId();
		/*for(ShippingAddressDvo shippingAddressDvo : customerDvo.getShipingAddresses()){			
			addressIds.add(shippingAddressDvo.getId());
			if(		StringUtils.isNotBlank(shippingAddressDvo.getId()) &&  
					shippingAddressDvo.getId().equalsIgnoreCase(customerDvo.getShippingAddressId())){
				defaultShippingAddressDvo = shippingAddressDvo ;
			}else{				
				shippingAddressDvos.add(shippingAddressDvo);
			}			
		}*/		
		return this;
	}

	public List<String> getAddressIds() {
		return addressIds;
	}

	public Set<ShippingAddressDvo> getShippingAddressDvos() {
		return shippingAddressDvos;
	}

	public void setAddressIds(List<String> addressIds) {
		this.addressIds = addressIds;
	}

	public void setShippingAddressDvos(Set<ShippingAddressDvo> shippingAddressDvos) {
		this.shippingAddressDvos = shippingAddressDvos;
	}

	public String getDefaultShippingAddress() {
		return defaultShippingAddress;
	}

	public void setDefaultShippingAddress(String defaultShippingAddress) {
		this.defaultShippingAddress = defaultShippingAddress;
	}
}
