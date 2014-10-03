<!-- This JSP page displays the links section -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security"%>
<%@ page session="false"%>

<head>
	<meta name="_csrf" content="${_csrf.token}"/>
	<meta name="_csrf_header" content="${_csrf.headerName}"/>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Index</title>
	<meta name="description" content="" />
	<meta name="keywords" content="" />

	<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800|Raleway:400,300,600,700,500|Noto+Sans:400,700|Ubuntu:300,400,500,700"
		rel="stylesheet" type="text/css">
	
	<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" type="text/css" />
	<link rel="stylesheet" href="<c:url value="/resources/font-awesome-4.0.3/css/font-awesome.css"/>" type="text/css" />
	<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"	type="text/css" />			
	<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" />	
	<link rel="stylesheet" href="<c:url value="/resources/css/login.css"/>" type="text/css" media="screen" />	
		
	<script type="text/javascript" src="<c:url value="/resources/js/jquery-1.11.0.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/jquery.leanModal.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/login.js"/>"></script>
</head>
<body>

<section class="block">
				<div class="container">
					<div class="row">
						<Div class="logo">
			<a href="/elenverve/" title="">
				<img src="<%=request.getContextPath()%>/resources/images/elenverve.png"	alt="" />
			</a>
		</div
						
						
					</div>			
	
					</div>
				</div>
			</section>
<div class="fixed-img sec-bg7"></div>	
<section class="block">	
	
	<div style="position: absolute;left: 10%;top: 15%;">	
		<div class="ev-login-sec-left">			
			<div class="tab-content" id="myTabContent">
			  <!-- <div id="signin" class="tab-pane fade in active"> -->
			  <div id="signin" class="ev_user_login">
				<div class="register-form">
					<div class="row">										
						<h6>Sign-In to your account</h6>
						<h7>&nbsp;</h7>
						<form name='f' action="<c:url value='j_spring_security_check' />"   method='POST'>
						<div class="col-md-12">
							<ul>
								<i class="fa fa-envelope-o"></i><input type="text" placeholder="Your Email Address" id="j_username" name="j_username"/> 
							</ul>
						</div>
						
						<div class="col-md-12">
							<ul>
								<i class="fa fa-lock"></i><input type="password" placeholder="Your Password" id="j_password" name="j_password"/> 
							</ul>
						</div>
						
						<div class="col-md-12">
							<div class="submit-form">
								<p>By submitting you comfirm that <b>you are atleast 18 years old</b> and you agree with our <a>Terms & Conditions</a> and <a>Privacy Policy</a> </p>
								<p></p>
								<input type="submit" value="Secure Sign-In" id="loginButton"/>
								<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
								
							</div>
								
						</div>
						<div class="col-md-12">
							<div class="col-md-6">
								<a class="forgotten-password-link" href="#">Forgot your email or Password ?</a>
								
							</div>
							<div class="col-md-6">
								<a class="forgotten-password-link" href="#">Need help with your account ?</a>
							</div>	
						</div>
						</form>
						
						<div class="forgotten-password-box" style="position:absolute;top:300px;  width:400px; left:00px;">
		        			<form class="input-form" id="forgotten-password-form" action="">
		         				 <span class="ie-placeholders">Email:</span><input type="text" id="ipt-fp-email" class="forgotten-password-email" placeholder="E-mail" />
		          				<input type="submit" class="btn-orange" value="Send" /><br /><br />
		         				 We'll send you e-mail with password reset.
		       				 </form>
		    			</div>
					</div>
						
					<div class="row">	
						<div class="col-md-11">
							<h6></h6>				
							<h6>or Sign-In using</h6>
						</div>
					</div>
					<div class="col-md-3">
						<ul>
						<a class="forgotten-password-link" href="#"><i class="fa fa-facebook-square" style="font-size:48px; color:#7A7A7A;"></i>Facebook</a>
						</ul>
							
					</div>	
					<div class="col-md-3">
						<ul>
						<a class="forgotten-password-link" href="#"><i class="fa fa-twitter-square" style="font-size:48px; color:#7A7A7A;"></i>Twitter</a>
						</ul>
							
					</div>	
					<div class="col-md-3">
						<ul>
						<a class="forgotten-password-link" href="#"><i class="fa fa-google-plus-square" style="font-size:48px; color:#7A7A7A;"></i>Google+</a>
						</ul>
							
					</div>	
					<div class="col-md-3">
						<ul>
						<a class="forgotten-password-link" href="#"><i class="fa fa-pinterest-square" style="font-size:48px; color:#7A7A7A;"></i>Pinterest</a>
						</ul>
							
					</div>
				</div>
				
			  </div> <!-- signin  -->
			 
			  <div id="signup" style="display:none" class="ev_user_register">
				<div class="register-form">
					<div class="row">
						<h6>Get started with Elen Verve</h6>
						<h7>&nbsp;</h7>
						<form>
						<div class="col-md-12">
							<ul>
								<i class="fa fa-envelope-o"></i><input type="text" placeholder="Your Email Address" id="regEmail" name="regEmail"/> 
							</ul>
						</div>
						
						<div class="col-md-12">
							<ul>
								<i class="fa fa-lock"></i><input type="password" placeholder="Create a Password" id="regPassword" name="regPassword"/> 
							</ul>
						</div>
						<div class="col-md-12">
							<ul>
								<i class="fa fa-lock"></i><input type="password" placeholder="Retype your Password" id="regRePassword" name="regRePassword"/> 
							</ul>
						</div>
						<div class="col-md-6">
							<ul>
								<i class="fa fa-male"></i><input type="text" placeholder="First Name" id="regFirstfName" name="regFirstfName"/> 
							</ul>
						</div>
						<div class="col-md-6">
							<ul style="margin-left:-25px;">
								<i class="fa fa-male"></i><input type="text" placeholder="Last Name" id="regLastfName" name="regLastfName" /> 
							</ul>
						</div>
						<div class="col-md-12">
							
							<div class="submit-form">
								<p>By registering you comfirm that <b>you are atleast 18 years old</b> and you agree with our <a>Terms & Conditions</a> and <a>Privacy Policy</a> </p>
								<p></p>
								<input type="submit" value="Complete Sign-Up" id="registerButton"/>
								<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
									
								
								
							</div>
						</div>
						</form>
						
					</div>
				</div>
			<!-- Signup Form -->
			  </div>
	
			  <div id="error-box" class="error-box nocolor" style="top:50px;">
				<span class="error-message">Incorrect login or password.</span>
			   </div>
					
			</div><!-- myTabContent -->

		</div>   <!-- login-sec -->
		<div class="ev-login-sec-right" >
			<div class="tab-content" >
				<form>
					<div id="register" class="tab-pane fade in active" class="ev-register-form">
						<div class="register-form">
							
							<!-- <input type="submit" value="Complete Sign-Up" id="showRegister"/> -->
							<div class="signup_button_div">	
								<h6>New to Elen Verve ?</h6>
								<h7>Sign-Up to recieve exciting discounts & offers and for faster checkout experience</h7>						
								<input type="button" value="Sign Up" class="ev_button_signup" id="sigh_up"style="margin-top:45px;"/>							
							</div>	
							<div class="signin_button_div" style="display:none">
								<h6>Already have an account ?</h6>
								<h7>Sign-In to your account for faster checkout experience and other features</h7>	
								<input type="button" value="Sign In" class="ev_button_signup" id="sigh_in" style="margin-top:45px;"/>	
							</div>		
							<div style="position: absolute;left: 65%;top: 40%;">
							
							<div class="signup_button_div" style="position: absolute;left: 85%;top: 25%;">	
							<h6>- or - </h6>						
								<input type="button" value="Continue as guest" class="ev_button_guest" id="sigh_up"/>							
							</div>
							
							</div>							
						</div>	
					</div>
					
				</form>
			</div>
		</div>
	</div>
</section>	
	<script type="text/javascript">
	$(document).ready(function(){
		
		$("#sigh_up").click(function() {
			$(".ev_user_login").hide();
			$(".ev_user_register").show();
			$(".signup_button_div").hide();
			$(".signin_button_div").show();	
			$(".error-box").hide();
			$(".ev_user_register").reload();	
			return false;
		});
		$("#sigh_in").click(function() {
			$(".ev_user_login").show();
			$(".ev_user_register").hide();
			$(".signup_button_div").show();
			$(".signin_button_div").hide();	
			$(".error-box").hide();	
			$(".ev_user_login").reload();		
			return false;
		});
		
	});
	
	function performLogin(form) {			
		$.post(
			'<c:url value="/login" />',
			form.serialize(),
			function (data, textStatus) {
				//var modal_id = $(this).attr("#modal");	
				
				if (data.status) {
					//window.location.reload(true);				
					//$(document).off('keydown.leanModal');
					//loadLinks();
					alert("successfully login ");
					
				} else {
					 $('.error-box').slideDown('slow').removeClass('green').addClass('red');
				     $(".error-message").text("Incorrect login or password.");
					/* var err = form.find(".error");
					err.html("Login Failed [" + data.error + "]");
					err.show(); */
				}
			}, "json");
	};
	</script>
</body>