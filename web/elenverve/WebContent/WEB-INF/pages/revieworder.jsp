<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<head>
	<link rel="stylesheet" href="<c:url value="/resources/css/cart.css"/>"	type="text/css" />
</head>
<html>	
	<body>
		<form name="revieworder" action="/elenverve/payment"   method="POST">
			<div class="theme-layout">
				<section class="block" id="inner-head">	
					<div class="container">						
						<div class="row">							
							<div class="col-md-8">
								<div class="add-cart-sec">
									<div class="heading4">										
										<h4><img src="<%=request.getContextPath() %>/images/shopping-cart-icon.png" alt=""> Review your Order </h4>
									</div>
									<div class="cart-head">
										<h4 class="cart-total-header">Total (${shoppingCart.getItemCount() } Items) :</h4>
										<h4 class="cart-total-price">$${shoppingCart.getTotalPriceInDollars()} USD</h4>
									</div>									
									<ul>
										<c:forEach var="shoppingCart" items="${shoppingCart.getShoppingCartProducts()}">
											<li>
												<div class="cart-product">
													<div class="cart-thumb">
														<img src="<%=request.getContextPath() %>${shoppingCart.getProduct().details.imageUrls.get(0)}" alt="" style="max-width: 115px;max-height: 125px;">
														<a href="${contextPath}/elenverve/removeFromCart?productId=${shoppingCart.getProduct().productId}" title=""><i class="fa fa-trash-o"></i></a>
														
													</div>
													<div class="cart-detals">
														<h5>${shoppingCart.getProduct().getDetails().productName} </h5>
														<p>This is a short description about the product  </p>
														<span><strong>Color:</strong> <i class="red"></i><i class="green"></i><i class="blue"></i></span>
														
														<p>In Stock</p>
														
														<p><i class="fa fa-truck"></i>Eligible for FREE Shipping</p>
														<p><i class="fa fa-heart"></i><a href="#" title="">Add to Wishlist</a></p>
														<p>
														<form action="#" method="POST">
														<input type="checkbox" name="option1" value="Milk">Send as a Gift <a href="#" title="">Learn more</a>
														</form>
														</p>
													</div>													
												</div>
												<div class="cart-price">
													<span>$${shoppingCart.getProduct().getDetails().finalPrice} USD</span>
													<span class="discount-head"> Your saving :</span>
													<span class="discount">$${shoppingCart.getProduct().getDetails().initialPrice} USD (40%)</span>
												</div>
												<div class="cart-quanity">
													<div class="decrements">
														<form action="#" method="POST">
															<input type="button" field="quantity" class="qtyminus" value="-">
															<input type="text" class="qty" value="${shoppingCart.quantity}" name="quantity">
															<input type="button" field="quantity" class="qtyplus" value="+">
														</form>
													</div>
												</div>												
											</li>
										</c:forEach>
									</ul>
								</div>
							</div>
							
							<div class="col-md-4">
								<div class="heading6">
									<h3></h3>
								</div>
								<div class="cart-total-box">									
									<div class="cart-head">
										<h4 class="cart-total-header-checkout">Total (${shoppingCart.getItemCount() } Items) :</h4>
										<h4 class="cart-total-price-checkout">$${shoppingCart.getTotalPriceInDollars()} USD</h4>
									</div>
									<ul class="cart-checklist">
										Your shopping bag has:
										<li class="validated"><i class="fa fa-check"></i>Item with FREE shipping <a href="#">Restrictions applied</a></li>
			   							<li class="validated"><i class="fa fa-check"></i>Item as a gift</li>
										<li><i class="fa fa-warning"></i>Out of stock item</li>
																
									</ul>
									<ul class="cart-checklist">
										<span>Calculate shipping & tax</span>		
									</ul>
									<ul class="cart-checklist">
										Your Order summary:
										<li class="validated"><i class="fa fa-check"></i>Total :$${shoppingCart.getTotalPriceInDollars()} USD</a></li>
									   	<li class="validated"><i class="fa fa-check"></i>FREE shipping</li>
									   	<li class="validated"><i class="fa fa-check"></i>As a gift </li>		
																						
									</ul>
									<ul class="cart-checkout" id="cart-checkout">
										Note: You can either select individual items as a gift here or you can also select the whole shopping bag as a gift
										as well as redeem Elen Verve <a href="#">gift card</a>/<a href="#">coupons</a> and/or <a href="#">reward points</a> in the review page
										<li>
											<input type="submit" value="Proceed to Checkout" class="checkout-btn" id="checkout" name="checkout"/>
											<input type="submit" value="Edit Cart" class="checkout-btn" id="edit" name="edit"/>
										</li>
									</ul>
								</div>
							</div>				
						</div>
					</div>				
				</section>			
			</div>
		</form>
	</body>
</html>