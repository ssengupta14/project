package com.elenverve.dvo;

public class PaymentDvo {
	
	private int paymentType;
	private String paymentConfirmationNo;
	private String authId;
	private int network;
	
	public int getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentConfirmationNo() {
		return paymentConfirmationNo;
	}
	public void setPaymentConfirmationNo(String paymentConfirmationNo) {
		this.paymentConfirmationNo = paymentConfirmationNo;
	}
	public String getAuthId() {
		return authId;
	}
	public void setAuthId(String authId) {
		this.authId = authId;
	}
	public int getNetwork() {
		return network;
	}
	public void setNetwork(int network) {
		this.network = network;
	} 

}
