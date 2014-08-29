package com.elenverve.dvo;

import java.util.Date;


public class PurchaseDvo {

		private String purchaseId;
		private Date purchaseDt;
		private CustomerDvo customer;
		private ShoppingCartDvo shoppingcart;
		private PaymentDvo payment;
		
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
		public CustomerDvo getCustomer() {
			return customer;
		}
		public void setCustomer(CustomerDvo customer) {
			this.customer = customer;
		}
		public ShoppingCartDvo getShoppingcart() {
			return shoppingcart;
		}
		public void setShoppingcart(ShoppingCartDvo shoppingcart) {
			this.shoppingcart = shoppingcart;
		}
		public PaymentDvo getPayment() {
			return payment;
		}
		public void setPayment(PaymentDvo payment) {
			this.payment = payment;
		}
		
	
	
}
