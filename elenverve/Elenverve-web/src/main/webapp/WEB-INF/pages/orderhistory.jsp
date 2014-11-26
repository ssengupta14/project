<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<head>
	<link rel="stylesheet" href="<c:url value="/resources/css/cart.css"/>"	type="text/css" />
	<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800|Raleway:400,300,600,700,500|Noto+Sans:400,700|Ubuntu:300,400,500,700"	rel="stylesheet" type="text/css">
	<link rel="stylesheet"	href="<c:url value="/resources/css/bootstrap.min.css"/>"	type="text/css" />
	<link rel="stylesheet"	href="<c:url value="/resources/font-awesome-4.0.3/css/font-awesome.css"/>"	type="text/css" />
	<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"	type="text/css" />
	<link rel="stylesheet"	href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" />
	<link rel="stylesheet" href="<c:url value="/resources/css/address.css"/>"	type="text/css"  />	
	<link rel="stylesheet" href="<c:url value="/resources/css/login.css"/>"	type="text/css"  />	
	<%-- <script type="text/javascript" src="<c:url value="/resources/js/jquery-1.11.0.min.js"/>"></script> --%>
	<link rel="stylesheet" href="//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
	<link rel="stylesheet" href="<c:url value="/resources/css/address.css"/>"	type="text/css"  />	
	<link rel="stylesheet" href="/resources/demos/style.css"> 	
  	<script src="//code.jquery.com/jquery-1.10.2.js"></script>
  	<script src="//code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
</head>

<html>
	<body>
		<div class="theme-layout">
			<section class="block" id="inner-head">
				<div class="fixed-img sec-bg4"></div>
				<div class="container">	
					<h1>Order History</h1>
				</div>			
			</section>	
			<section class="block">
				<div class="container">
					<div class="row">
						<table style="width:100%">
							  <tr>
							    <th>Order Number</th>
							    <th>Date</th>	
							  </tr>
							  <c:forEach var="purchaseDvo" items="${purchaseDvos}">
							  	 <tr>
							  	 	<td>
									<div class="col-md-3">
										<div class="price-table small">
											<ul>
												<li class="price-head">
													<span>${purchaseDvo.purchaseId}</span>
												</li>												
											</ul>
										</div>
									</div>
									</td>
								 </tr>
								 <tr>
							  	 	<td>
									<div class="col-md-3">
										<div class="price-table small">
											<ul>
												<li class="price-head">
													<span>${purchaseDvo.purchaseId}</span>
												</li>												
											</ul>
										</div>
									</div>
									</td>
								 </tr>
							  </c:forEach>
							  
						</table>
						
					</div>
				</div>
			</section>		
		</div> 	
	</body>
	
</html>
