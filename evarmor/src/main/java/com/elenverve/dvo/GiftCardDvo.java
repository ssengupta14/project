package com.elenverve.dvo;

import java.util.Date;

public class GiftCardDvo {
	
	
	private long templateId;
	private String cardNumber;
	private String purchaseDt;
	private String scratchCode;
	private Date purchasedOn; 
	private String buyerName;
	private String redeemerName;	
	private String buyerEmailId;
	private String RedeemerEmailId;
	private String buyerCustomerId;
	private String redeemerCustomerId;
	private double originalBalance;
	private double currentBalance;
	private String currencyCode;
	private String message;
	private boolean isAuthorized;
	
	
	
	public long getTemplateId() {
		return templateId;
	}
	public void setTemplateId(long templateId) {
		this.templateId = templateId;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getPurchaseDt() {
		return purchaseDt;
	}
	public void setPurchaseDt(String purchaseDt) {
		this.purchaseDt = purchaseDt;
	}
	public String getScratchCode() {
		return scratchCode;
	}
	public void setScratchCode(String scratchCode) {
		this.scratchCode = scratchCode;
	}
	public Date getPurchasedOn() {
		return purchasedOn;
	}
	public void setPurchasedOn(Date purchasedOn) {
		this.purchasedOn = purchasedOn;
	}
	public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public String getRedeemerName() {
		return redeemerName;
	}
	public void setRedeemerName(String redeemerName) {
		this.redeemerName = redeemerName;
	}
	public String getBuyerEmailId() {
		return buyerEmailId;
	}
	public void setBuyerEmailId(String buyerEmailId) {
		this.buyerEmailId = buyerEmailId;
	}
	public String getRedeemerEmailId() {
		return RedeemerEmailId;
	}
	public void setRedeemerEmailId(String redeemerEmailId) {
		RedeemerEmailId = redeemerEmailId;
	}
	public String getBuyerCustomerId() {
		return buyerCustomerId;
	}
	public void setBuyerCustomerId(String buyerCustomerId) {
		this.buyerCustomerId = buyerCustomerId;
	}
	public String getRedeemerCustomerId() {
		return redeemerCustomerId;
	}
	public void setRedeemerCustomerId(String redeemerCustomerId) {
		this.redeemerCustomerId = redeemerCustomerId;
	}	
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isAuthorized() {
		return isAuthorized;
	}
	public void setAuthorized(boolean isAuthorized) {
		this.isAuthorized = isAuthorized;
	}
	
	

}
