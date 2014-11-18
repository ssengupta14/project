package com.elenverve.dvo;

import java.io.Serializable;
import java.util.Date;

import com.elenverve.dvo.ProductDvo;

public class ShoppingCartItemDvo implements Comparable<ShoppingCartItemDvo>, Serializable {

	private static final long serialVersionUID = 4134652647253355430L;
	
	private String customerId;
	private String shoppingCartId;
	private String invoiceId;
	private String productId;
	private float price;
	private Date purchaseDt;
	private ProductDvo productDvo;
	private ShippingAddressDvo shippingAddressDvo;
	private ShippingTypeDvo shippingTypeDvo;
	private int quantity = 1;
	
	public ShoppingCartItemDvo(ProductDvo product, int quantity) {
		this.productDvo = product;
		this.quantity = quantity;
	}

	public ProductDvo getProduct() {
		return productDvo;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void incrementQuantity() {
		quantity++;
	}

/*	public int getUnitPriceInCents() {
		return product.getPriceInCents();
	}
	
	public String getUnitPriceInDollars() {
		return product.getPriceInDollars();
	}
	
	public int getTotalPriceInCents() {
		return (quantity * getUnitPriceInCents());
	}
	
	public String getTotalPriceInDollars() {
		return Util.getPriceInDollars(getTotalPriceInCents());
	}*/
	
	public ShippingAddressDvo getShippingAddressDvo() {
		return shippingAddressDvo;
	}

	public void setShippingAddressDvo(ShippingAddressDvo shippingAddressDvo) {
		this.shippingAddressDvo = shippingAddressDvo;
	}

	@Override
	public boolean equals(Object o) {
		return o instanceof ShoppingCartItemDvo &&
			productDvo.equals(((ShoppingCartItemDvo) o).productDvo);
	}
	
	@Override
	public int hashCode() {
		return productDvo.hashCode();
	}
	
	//@Override
	public int compareTo(ShoppingCartItemDvo item) {
		return productDvo.compareTo(item.productDvo);
	}
}
