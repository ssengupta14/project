package com.elenverve.dvo;

import java.io.Serializable;
import java.util.Date;

public class DiscountCouponDvo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4680820044274240110L;
	private long hiddenKey;
	private String couponCode;
	private Date effectiveFrom;
	private Date effectiveTill;
	private OfferDvo offer;
}
