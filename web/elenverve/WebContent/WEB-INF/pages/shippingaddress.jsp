<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<head>
	<link rel="stylesheet" href="<c:url value="/resources/css/cart.css"/>"	type="text/css" />
	<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800|Raleway:400,300,600,700,500|Noto+Sans:400,700|Ubuntu:300,400,500,700"	rel="stylesheet" type="text/css">
	<link rel="stylesheet"	href="<c:url value="/resources/css/bootstrap.min.css"/>"	type="text/css" />
	<link rel="stylesheet"	href="<c:url value="/resources/font-awesome-4.0.3/css/font-awesome.css"/>"	type="text/css" />
	<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"	type="text/css" />
	<link rel="stylesheet"	href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" />
	<link rel="stylesheet" href="<c:url value="/resources/css/address.css"/>"	type="text/css"  />	
	<link rel="stylesheet" href="<c:url value="/resources/css/login.css"/>"	type="text/css"  />	
	<script type="text/javascript" src="<c:url value="/resources/js/jquery-1.11.0.min.js"/>"></script>
</head>
<html>
<body>
	<br>
	<br>
		
	<div id="signup" class="shippingaddress" >
		<div class="address-form">
			<div class="row">				
				<p>
					<label for="lblshippingaddress">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Select a shipping address</label> &nbsp;&nbsp;&nbsp;
					<!-- <select name="shippingaddress" onchange="showAddress(this.id)"> -->	
					<select name="shippingaddress" id="showAddress">	
						<option value="select" selected="selected" >Select Address</option>				
						<c:forEach var="shippingAddressIds" items="${modal.getShippingAddressDvos()}">
	    					<option value ="${shippingAddressIds.id}"><c:out value="${shippingAddressIds.id}"/></option>
						</c:forEach>	
						<option value="new_address">Add New Address</option>				
					</select>
				</p>
				<c:forEach var="shippingAddress" items="${modal.getShippingAddressDvos()}">		
					
					<%-- <div id="${shippingAddress.id}" style="display: none;">	 --%>
					<c:choose>
      					<c:when test="${shippingAddress.id==modal.defaultShippingAddress}">
      						<div id="${shippingAddress.id}">
      					</c:when>
      					<c:otherwise>
     						<div id="${shippingAddress.id}" style="display: none;">
     						
      					</c:otherwise>
    				</c:choose>
						
						<form name="sign_up_form_test" action="/elenverve/addshaddress" method="POST"> 									
							<div class="col-md-12">
								<ul><i class="fa fa-envelope-o"></i><input type="text" placeholder="Full name" id="fullName" name="fullName" value="${shippingAddress.fullName}"/></ul>
							</div>	
							<div class="col-md-12">
								<ul><i class="fa fa-lock"></i><input type="text" placeholder="Street no" id="streetNo" name="streetNo" value="${shippingAddress.streetNo}"/></ul>
							</div>
							<div class="col-md-12">
								<ul><i class="fa fa-lock"></i><input type="text" placeholder="Street name" id="streetName" name="streetName" value="${shippingAddress.streetName}"/></ul>
							</div>
							<div class="col-md-6">
								<ul><i class="fa fa-male"></i><input type="text" placeholder="Apt no" id="aptNo" name="aptNo" value="${shippingAddress.unitType}"/></ul>
							</div>
							<div class="col-md-6">
								<ul style="margin-left: -25px;">
									<i class="fa fa-male"></i>
									<input type="text" placeholder="City" id="city" name="city" value="${shippingAddress.city}"/>
								</ul>
							</div>						
							<div class="col-md-6">
								<ul><i class="fa fa-male"></i><input type="text" placeholder="State" id="state" name="state" value="${shippingAddress.state}"/></ul>
							</div>
							<div class="col-md-6">
								<ul style="margin-left: -25px;">
									<i class="fa fa-male"></i>
									<input type="text" placeholder="Zip" id="zip" name="zip" value="${shippingAddress.zip}"/>
								</ul>
							</div>
							<div class="col-md-6">
								<ul><i class="fa fa-male"></i><input type="text" placeholder="Country" id="country" name="country" value="${shippingAddress.country}"/></ul>
							</div>
												
							<div class="col-md-12">
								<div class="submit-form">							
									<input type="submit" value="Ship to this address"/>	
									<input type="hidden" id="addressId" name="addressId" value="${shippingAddress.id}"/>														
									<input type="hidden" name="${_csrf.parameterName}" 	value="${_csrf.token}" />
								</div>
							</div>
						</form>
					</div>	
				</c:forEach>
				<!-- This is for new Address -->
				<div id="new_address" style="display: none;">		
					<form name="sign_up_form_test" action="/elenverve/addshaddress" method="POST"> 									
						<div class="col-md-12">
							<ul><i class="fa fa-envelope-o"></i><input type="text" placeholder="Full name" id="fullName" name="fullName" /></ul>
						</div>	
						<div class="col-md-12">
							<ul><i class="fa fa-lock"></i><input type="text" placeholder="Street no" id="streetNo" name="streetNo" /></ul>
						</div>
						<div class="col-md-12">
							<ul><i class="fa fa-lock"></i><input type="text" placeholder="Street name" id="streetName" name="streetName" /></ul>
						</div>
						<div class="col-md-6">
							<ul><i class="fa fa-male"></i><input type="text" placeholder="Apt no" id="aptNo" name="aptNo" /></ul>
						</div>
						<div class="col-md-6">
							<ul style="margin-left: -25px;">
								<i class="fa fa-male"></i>
								<input type="text" placeholder="City" id="city" name="city" />
							</ul>
						</div>						
						<div class="col-md-6">
							<ul><i class="fa fa-male"></i><input type="text" placeholder="State" id="state" name="state" /></ul>
						</div>
						<div class="col-md-6">
							<ul style="margin-left: -25px;">
								<i class="fa fa-male"></i>
								<input type="text" placeholder="Zip" id="zip" name="zip" />
							</ul>
						</div>
						<div class="col-md-6">
							<ul><i class="fa fa-male"></i><input type="text" placeholder="Country" id="country" name="country" /></ul>
						</div>
											
						<div class="col-md-12">
							<div class="submit-form">							
								<input type="submit" value="Ship to this address"/>	
								<input type="hidden" id="addressId" name="addressId" value="${shippingAddress.id}"/>														
								<input type="hidden" name="${_csrf.parameterName}" 	value="${_csrf.token}" />
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
 <script type="text/javascript">

 $(document).ready(function() {
	    $("#showAddress").change(function() {
	    	selectedvalue = $('option:selected', $(this)).val();
	    	$("#showAddress > option").each(function() {
	    		
	    		$("#"+this.value).hide();
	    	    
	    	});
	    	$("#"+selectedvalue).show();

	    });
	});
</script>
</html>