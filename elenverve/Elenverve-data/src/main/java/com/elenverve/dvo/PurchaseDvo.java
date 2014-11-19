package com.elenverve.dvo;

import java.util.Date;
import java.util.List;

public class PurchaseDvo {

	private String customerId;
	private String purchaseId;
	private Date purchaseDt;
	private List<ShoppingCartItemDvo> shoppingCartItemDvos;
	private float purchaseTotal;
	private PaymentDvo payment;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(String purchaseId) {
		this.purchaseId = purchaseId;
	}

	public Date getPurchaseDt() {
		return purchaseDt;
	}

	public void setPurchaseDt(Date purchaseDt) {
		this.purchaseDt = purchaseDt;
	}

	public List<ShoppingCartItemDvo> getShoppingCartItemDvos() {
		return shoppingCartItemDvos;
	}

	public void setShoppingCartItemDvos(
			List<ShoppingCartItemDvo> shoppingCartItemDvos) {
		this.shoppingCartItemDvos = shoppingCartItemDvos;
	}

	public float getPurchaseTotal() {
		return purchaseTotal;
	}

	public void setPurchaseTotal(float purchaseTotal) {
		this.purchaseTotal = purchaseTotal;
	}

	public PaymentDvo getPayment() {
		return payment;
	}

	public void setPayment(PaymentDvo payment) {
		this.payment = payment;
	}

}
