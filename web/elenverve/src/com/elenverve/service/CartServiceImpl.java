package com.elenverve.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.elenverve.dvo.ProductDvo;

// Commented this out since I want to specify the shippingOptions property in
// the config file.
//@Service("cartService")
public class CartServiceImpl implements CartService {
	
	// This is session-scoped.  I don't like this because (1) I don't think
	// this service bean should be session-aware and (2) this seems like it ties
	// us to Spring.  But anyway.
	private ShoppingCart cart;	
	
	@Autowired
	private ProductService productService;

	public ShoppingCart getShoppingCart() {
		return cart;
	}	
	public void setShoppingCart(ShoppingCart cart) {
		this.cart = cart;
	}	
	public ProductDvo getProduct(String productId) {
		//get it from database 
		return productService.getProduct(productId);
		/*ProductDetailBean bean = new ProductDetailBean();
		bean.setProductId(productId);
		return bean;*/
	}
	
}
