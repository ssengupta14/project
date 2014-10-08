<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<head>
<link rel="stylesheet" href="<c:url value="/resources/css/cart.css"/>"	type="text/css" />
	<!-- Style -->
</head>
<html>

<body>
<div class="theme-layout">
<section class="block" id="inner-head">
	<div class="fixed-img sec-bg4"></div>
	<div class="container">	
		<h1>ADD TO CART</h1>
	</div>
</section>

<section class="block">
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="add-cart-sec">
					<div class="heading6">
						<h2><i>ADD TO </i>CART</h2>
						<span>BRAND FOR EVERY STYLE. FIND YOURS.</span>
					</div>
					<div class="cart-head">
						<h2 class="cart-product">PRODUCT</h2>
						<h2 class="cart-price">PRICE</h2>
						<h2 class="cart-quanity">QUANTITY</h2>
						<h2 class="cart-total">TOTAL</h2>
					</div>
					<ul>
						<c:forEach var="shoppingCart" items="${shoppingCart.getShoppingCartProducts()}">
							<li>
								<div class="cart-product">
									<div class="cart-thumb">
										<img src="http://placehold.it/115x125" alt="" />
										<a href="${contextPath}/elenverve/removeFromCart?productId=${shoppingCart.getProduct().productId}" title=""><i class="fa fa-trash-o"></i></a>
										
									</div>
									<div class="cart-detals">
										<h5>${shoppingCart.getProduct().getDetails().productName}</h5>
										<span><strong>Color:</strong> <i class="red"></i><i class="green"></i><i class="blue"></i></span>
										<p>Type: Cotton</p><p>Type: Cotton</p>
									</div>
									<a href="#" title=""><span>Add to Odder</span></a>
								</div>
								<div class="cart-price">
									<span>${shoppingCart.getProduct().getDetails().initialPrice}</span>
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
								<div class="cart-total">
									<span><i>${shoppingCart.quantity * shoppingCart.getProduct().getDetails().initialPrice}  </i></span>
								</div>
							</li>
						</c:forEach>
					</ul>
				</div>
			</div>
			
			<div class="col-md-4">
				<div class="cart-total-box">
					<div class="cart-head">
						<h2 class="cart-product">CART TOTAL</h2>
					</div>
					<ul id="cart-checkout">
						<li><span>Cart Subtotal</span><i>${shoppingCart.getTotalPriceInDollars()}</i></li>
						<li><span>Shipping</span><i>Free Shipping</i></li>
						<li><span>Order Total</span><i>Free Shipping</i></li>
						<li><a href="${contextPath}/elenverve/chaddress" title="" class="checkout-btn">Proceed to checkout</a></li>
						
					</ul>
				</div>
			</div>
			
			<div class="col-md-5">
				<div class="cart-total-box">
					<div class="cart-head">
						<h2 class="cart-product">CALCULATE SHIPPING</h2>
					</div>
					<ul>
						<li class="customlist">		
							<select>
							  <option>United State</option>
							  <option>02</option>
							  <option>03</option>
							  <option>04</option>
							  <option>05</option>
							</select>	
						</li>
						<li class="customlist">		
							<select>
							  <option>Select State</option>
							  <option>02</option>
							  <option>03</option>
							  <option>04</option>
							  <option>05</option>
							</select>
						</li>
						<li><input type="text" placeholder="Postal Code / Zip Code" /></li>
						<li><a href="#" title="">Update Total</a></li>
					</ul>
					
				</div>
			</div>
			
			
		</div>
	</div>
</section>
</body>
</html>