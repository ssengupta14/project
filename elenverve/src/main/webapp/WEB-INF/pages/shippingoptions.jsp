<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<head>

</head>
<html>	
	<div class="theme-layout">
		<footer class="block">
			<div class="container">
				<div class="row">
					<div class="col-md-3">
						<div class="footer-post">
							<h3><i>Choose your shipping options.</i></h3>
							<p>${modal.fullName} , ${modal.streetNo}, ${modal.streetName}, ${modal.city}, ${modal.state}, ${modal.zip}, ${modal.country}</p>
							<br> <br> <br>
							<c:forEach var="shoppingCart" items="${shoppingCart.getShoppingCartProducts()}">
								<img src="http://placehold.it/115x125" alt="" />
								<a href="${contextPath}/elenverve/removeFromCart?productId=${shoppingCart.getProduct().productId}" title="">
								</a>
								<h5>${shoppingCart.getProduct().getDetails().productName}</h5>
								<span><strong>Color:</strong> </span>
								<p>Type: Cotton</p>
								<span>${shoppingCart.getProduct().getDetails().initialPrice}</span>
							</c:forEach>
						</div>
					</div>
				</div>
			</div>
		</footer>
	</div>
	
	<body>
		
	</body>
</html>