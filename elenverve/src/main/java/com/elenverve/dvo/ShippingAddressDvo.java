package com.elenverve.dvo;

public class ShippingAddressDvo extends AddressDvo {

	public ShippingAddressDvo(){
		super.setAddressType(SHIPPING);
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof ShippingAddressDvo))
			return false;	
		if (obj == this)
			return true;
		return this.id.equalsIgnoreCase(((ShippingAddressDvo) obj).id);
	}
 
	public int hashCode(){
		return id.length();//for simplicity reason
	}
}
