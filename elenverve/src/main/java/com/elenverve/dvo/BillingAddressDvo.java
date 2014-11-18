package com.elenverve.dvo;

import java.io.Serializable;

public class BillingAddressDvo extends AddressDvo  implements Serializable {

	public BillingAddressDvo(){
		super.setAddressType(BILLING);
	}
}
