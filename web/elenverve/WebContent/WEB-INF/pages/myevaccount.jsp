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
					<h1>My Account</h1>
				</div>			
			</section>
			<section class="block">
				<div class="container">
					<div class="row">					
						<div class="col-md-3">
							<div class="price-table small">							
								<ul>
									<li class="price-head"><h6></h6>
										<span>Personal Info</span>
									</li>
									<li class="price-features">Name: ${customerDvo.firstName} ${customerDvo.lastName} </li>
									<li class="price-features">Email: ${customerDvo.emailId}  </li>
									<li class="price-features">Password: ****  </li>
									<li class="price-features">Phone Number: ${customerDvo.phoneNumber}  </li>
									<li class="price-head">
										<span><a href="#" title="">Edit</a></span>									
									</li>		 						
								</ul>
							</div>
						</div>
						
						<div class="col-md-3">
							<div class="price-table small">		
								<ul>
									<li class="price-head"><h6></h6>
										<span>Billing Address</span>
									</li>
									<c:set var="billingFullName" value="${customerDvo.billingAddress.fullName}" />
									<c:if test="${not empty billingFullName}">								
										<li class="price-features">Name: ${customerDvo.billingAddress.fullName} </li>
										<li class="price-features">Unit Name: ${customerDvo.billingAddress.unitName} </li>
										<li class="price-features">Address: ${customerDvo.billingAddress.streetNo}  ${customerDvo.billingAddress.streetName} </li>
										<li class="price-features">City: ${customerDvo.billingAddress.city}  </li>										
										<li class="price-features">State: ${customerDvo.billingAddress.state}  </li>
										<li class="price-features">Zip: ${customerDvo.billingAddress.zip}  </li>
										<li class="price-features">country: ${customerDvo.billingAddress.country}  </li>	
										<li class="price-head">
											<span><a href="#" title="" class="billing_edit_dialog_trigger">Edit</a></span>	
											<div id="billing_edit_dialog" style="display:none;">											
											  	  <h1>Edit billing address</h1>					  
											  
												  <div id="edit_address-form">	
												  	<div class="row">	
														<form name="edit_address_form" action="/elenverve/editbillingaddress" method="POST"> 									
															<div class="col-md-12">
																<ul><i class="fa fa-envelope-o"></i><input value="${customerDvo.billingAddress.fullName}" type="text" placeholder="Full name" id="editFullName" name="editFullName" /></ul>
															</div>	
															<div class="col-md-12">
																<ul><i class="fa fa-lock"></i><input value="${customerDvo.billingAddress.streetNo}"  type="text" placeholder="Street no" id="editStreetNo" name="editStreetNo" /></ul>
															</div>
															<div class="col-md-12">
																<ul><i class="fa fa-lock"></i><input value="${customerDvo.billingAddress.streetName}" type="text" placeholder="Street name" id="editStreetName" name="editStreetName" /></ul>
															</div>
															<div class="col-md-6">
																<ul><i class="fa fa-male"></i><input value="${customerDvo.billingAddress.unitName}" type="text" placeholder="Apt no" id="editAptNo" name="editAptNo" /></ul>
															</div>
															<div class="col-md-6">
																<ul style="margin-left: -25px;">
																	<i class="fa fa-male"></i>
																	<input value="${customerDvo.billingAddress.city}" type="text" placeholder="City" id="editCity" name="editCity" />
																</ul>
															</div>						
															<div class="col-md-6">
																<ul><i class="fa fa-male"></i><input value="${customerDvo.billingAddress.state}" type="text" placeholder="State" id="editState" name="editState" /></ul>
															</div>
															<div class="col-md-6">
																<ul style="margin-left: -25px;">
																	<i class="fa fa-male"></i>
																	<input value="${customerDvo.billingAddress.zip}" type="text" placeholder="Zip" id="editZip" name="editZip" />
																</ul>
															</div>
															<div class="col-md-6">
																<ul><i class="fa fa-male"></i><input value="${customerDvo.billingAddress.country}" type="text" placeholder="Country" id="editCountry" name="editCountry" /></ul>
															</div>
																				
															<div class="col-md-12">
																<div class="submit-form">							
																	<input type="submit" value="Add new address"/>																															
																	<input type="hidden" name="${_csrf.parameterName}" 	value="${_csrf.token}" />
																</div>
															</div>
														</form>
													</div>
												</div>
											</div>								
										</li>						
									</c:if>
									<c:if test="${empty billingFullName}">
										<li class="price-head">
											<span><a href="#" title="" class="billing_add_dialog_trigger">Add New Billing Address</a></span>											
											<div id="billing_add_dialog" style="display:none;">											
											  	  <h1>Add billing address</h1>						  
											  
												  <div id="address-form">	
												  	<div class="row">	
														<form name="new_address_form" action="/elenverve/addbillingaddress" method="POST"> 									
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
																	<input type="submit" value="Add new address"/>	
																														
																	<input type="hidden" name="${_csrf.parameterName}" 	value="${_csrf.token}" />
																</div>
															</div>
														</form>
													</div>
												</div>
											</div>			
										</li>
									</c:if>								
								</ul>
							</div>
						</div>					 
					</div>
				</div>
			</section>
		</div> 	
	</body>
	<script type="text/javascript">
		$(document).ready(function() {
			$( ".billing_add_dialog_trigger" ).click(function() {
		   	 	
		   	 	$( "#billing_add_dialog" ).dialog( 'open' );
		   	 	var tag = $(this).text()+ '('+$(this).children('input[type=hidden]').val() + ')';   	 	
		   	 	
		   	});
		    $("#billing_add_dialog").dialog({
		        autoOpen: false,
		        //position: 'center' ,
		        title: 'Add New Billing Address',
		        draggable: false,
		        width : 600,
		        height : 600, 
		        resizable : true,
		        modal : true,
		    });
		    
			$( ".billing_edit_dialog_trigger" ).click(function() {		   	 	
		   	 	$( "#billing_edit_dialog" ).dialog( 'open' );
		   	 	
		   	});
		    $("#billing_edit_dialog").dialog({
		        autoOpen: false,
		        //position: 'center' ,
		        overlay: { 
            		opacity: 100            		
        		},
		        title: 'Edit Billing Address',
		        draggable: false,
		        width : 600,
		        height : 600, 
		        resizable : true,
		        modal : true,
		    });
		});
		
	</script>
</html>
