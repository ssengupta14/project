<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<head>
<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"	type="text/css" />
<script type="text/javascript" src="<c:url value="/resources/js/jquery-1.11.0.min.js"/>"></script>
	<!-- Style -->
</head>
<html>

<body class="popup-cart-layout">

<div class="theme-layout">
<section class="block" id="inner-head">
	
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					
					<div class="add-popup-cart-sec">
						<div class="popup-cart-head">
							<h4 class="popup-cart-total-header">Items selected here will be shipped to</h4>
							<p>1111 ABCDEF Road#0 ABC,  MD   11002 USAPhone: 898-979-730</p>
							<!-- 
							<ul class="popup-cart-checkout" id="cart-checkout">
								<input type="submit" value="Select" class="ship-prod-btn" id="abc"/>								
							</ul>
							-->
							
							
						</div>
						
						<ul>
							<form>
							
							<c:forEach var="shoppingCart" items="${shoppingCart.getShoppingCartProducts()}">
								
								<li>
									<input type="hidden" id ="abc" value="hidden value"/>
									<div class="popup-cart-quanity">
										<%-- <input type="checkbox" field="quantity" class="prod-ship-select" id="productCheckbox" value="${shoppingCart.getProduct().getDetails().productName}"> --%>
										<input type="checkbox" field="quantity" class="prod-ship-select" name="productCheckbox" id="productCheckbox" value="${shoppingCart.getProduct().productId}">
									</div>
									<div class="popup-cart-quanity">
									
									</div>
									<div class="popup-cart-product">
										<div class="popup-cart-thumb-icon">
											<img src="<%=request.getContextPath() %>${shoppingCart.getProduct().details.imageUrls.get(0)}" alt="" >
											<a href="${contextPath}/elenverve/removeFromCart?productId=${shoppingCart.getProduct().productId}" title="">
												<i class="fa fa-trash-o"></i>
											</a>
										</div>
										<div class="popup-cart-detals">
											<h5>${shoppingCart.getProduct().getDetails().productName}</h5>
											<p>This is a short description about the product  </p>
											
										</div>
										<div class="popup-cart-price">
												<span>$${shoppingCart.getProduct().getDetails().initialPrice} USD</span>
										</div>
									</div>
									
									
								</li>
								
							</c:forEach>
								<div class="col-md-12">
		<div class="submit-form">
			<input type="submit" value="Submit" id="submitButton"/>
		</div>
	</div>
							</form>
						</ul>
						<!-- 
						<input type="submit" value="Send all items" class="ship-all-prod-btn"/></li>
						<input type="submit" value="Select" class="ship-prod-btn" id="abc1" /></li>
						<input type="hidden" value="this is test" class="ship-prod-btn" id="abc1" /></li>
						 -->
						</li>
					</div>
				</div>
				
			</div>
			
	</div>


</section>

</body>
<script>
	$(function() {
		$("#submitButton").click(function() {
			
			setProduct($("form"));
			
			
		});
		
		function setProduct(form) {	
			
			$.post(
				'<c:url value="/addproducttoshipping" />',
				form.serialize(),
				function (data, textStatus) {
					//var modal_id = $(this).attr("#modal");					
					if (data.status) {
						//window.location.reload(true);				
						//$(document).off('keydown.leanModal');
						alert("success");
						
					} else {
						 $('.error-box').slideDown('slow').removeClass('green').addClass('red');
					     $(".error-message").text("Incorrect login or password.");
						/* var err = form.find(".error");
						err.html("Login Failed [" + data.error + "]");
						err.show(); */
					}
				}, "json");
		};
	});
</script>



</html>