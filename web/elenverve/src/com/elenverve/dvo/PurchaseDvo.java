package com.elenverve.dvo;

import java.util.Date;
import java.util.List;

public class PurchaseDvo {

	private String customerId;
	private String invoiceId;
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

	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
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
