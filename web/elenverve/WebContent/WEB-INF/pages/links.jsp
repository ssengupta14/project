<!-- This JSP page displays the links section -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security"%>
<%@ page session="false"%>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Index</title>
	<meta name="description" content="" />
	<meta name="keywords" content="" />

	<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800|Raleway:400,300,600,700,500|Noto+Sans:400,700|Ubuntu:300,400,500,700"
		rel="stylesheet" type="text/css">
	<!-- Styles -->
	<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" type="text/css" />
	<!-- Bootstrap -->
	<link rel="stylesheet" href="<c:url value="/resources/font-awesome-4.0.3/css/font-awesome.css"/>" type="text/css" />
	<!-- Font Awesome -->	
	<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"	type="text/css" />	
	<link rel="stylesheet" type="text/css"	href="<c:url value="/resources/css/setting.css"/>" media="screen" />
	<%-- <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/mystyle.css"/>" media="screen" /> --%>	
	<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" />	
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/login.css"/>" media="screen" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/form-style-ie.css"/>" media="screen" />
	<%-- <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/form-style.css"/>" media="screen" /> --%>
	
	<script type="text/javascript" src="<c:url value="/resources/js/jquery-1.11.0.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/jquery.leanModal.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/login.js"/>"></script>
		

</head>
<body>
<!-- If not logged in, display login & ajax login links -->

<security:authorize ifNotGranted="ROLE_USER">
	
	<div class="fa fa-user">
		<font color="#898787">Hi! &nbsp;</font>
		<ul class="profile bar-dropdown">

			<li>	
				<a id="modal_trigger" href="#modal" style="color:#4d8cff;font-weight: 300;font-family: open sans;font-size: 12px;">Sign in or Register</a>		
							
			</li> 						
		</ul>
	</div>	
</security:authorize>

<!-- If logged in, display secure and logout link -->
<security:authorize ifAllGranted="ROLE_USER">	 
	 <%-- <a href="<c:url value="/j_spring_security_logout" />"><security:authentication property="principal.username"/> Logout</a> --%>	
	 
	<div class="fa fa-user">
		<ul class="profile bar-dropdown">
			<li>	
				<a><font style="font-weight: 600;font-family: open sans;color:#4d8cff;font-size: 14px;color:#898787">Hi!</font> &nbsp;<security:authentication property="principal.username"/></a>			
				<%-- <a href="<c:url value="/j_spring_security_logout" />">Hi! &nbsp;<security:authentication property="principal.username"/> Logout</a> --%> 
				<ul>
					<li><a href="#" title="">Profile</a></li>
					<li><a href="#" title="">Help</a></li>
					<li><a href="#" title="">Privacy</a></li>
					<li><a href="<c:url value="/j_spring_security_logout" />" title="">Logout</a></li>
				</ul>				
			</li> 						
		</ul>
	</div>
</security:authorize>

	
		
	<div id="modal" class="container" style="display: none;">
		<div class="login-sec">
			<ul class="nav nav-tabs" id="myTab">
			  <li class="active"><a data-toggle="tab" href="#signin">LOG IN</a></li>
			  <li><a data-toggle="tab" href="#signup">REGISTER</a></li>
			</ul>
			<div class="tab-content" id="myTabContent">
			  <div id="signin" class="tab-pane fade in active">
				<div class="register-form">
					<div class="row">
						<h3>Sign In using</h3>	
						<div class="col-md-2">	
							<a class="fb-button" href="#"><i class="fa fa-facebook-square" style="font-size:48px; color:#7A7A7A;"/>Facebook</a>
						</div>
						<div class="col-md-2">	
							<a href="#"><i class="fa fa-twitter-square" style="font-size:48px;color:#7A7A7A;"/>Twitter</a>	
						</div>	
						<div class="col-md-2">	
							<a href="#"><i class="fa  fa-google-plus-square" style="font-size:48px;color:#7A7A7A;"/>Google+</a>
						</div>	
						<div class="col-md-2">	
							<a href="#"><i class="fa  fa-pinterest-square" style="font-size:48px;color:#7A7A7A;"/>Pinterest</a>
						</div>
						<div class="col-md-2">	
							<a href="#"><i class="fa  fa-linkedin-square" style="font-size:48px;color:#7A7A7A;"/>LinkedIn</a>
						</div>
						<div class="col-md-2">	
							<a href="#"><i class="fa  fa-instagram" style="font-size:48px;color:#7A7A7A;"/>Instagram</a>
						</div>													
						<div class="col-md-12">
							<h3></h3>
						</div>
						<div class="col-md-12">
						<h3> OR </h3>
						</div>
						
						<h3>Login to your account</h3>
						<form>
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
								<input type="submit" value="Sign-In" id="loginButton"/>
								<p>By submitting you comfirm that you agree with our <i>Term & Condition</i> and <i>Privacy Policy</i> </p>
							</div>
							<div class="col-md-6">
								<a class="forgotten-password-link" href="#">Forgot your email or Password ?</a>
							</div>
							<div class="col-md-6">
								<a class="forgotten-password-link" href="#">Need help with your account ?</a>
							</div>	
						</div>
						
						</form>
						<div class="error-box red" style="position:absolute;top:600px;  width:500px; margin-left:25px;font-family: open sans;font-size: 25px;">
        						<span class="error-message">Incorrect login or password.</span>
    						</div>
						<div class="forgotten-password-box" style="position:absolute;top:300px;  width:400px; left:00px;">
			        			<form class="input-form" id="forgotten-password-form" action="">
			         				 <span class="ie-placeholders">Email:</span><input type="text" id="ipt-fp-email" class="forgotten-password-email" placeholder="E-mail" />
			          				<input type="submit" class="btn-orange" value="Send" /><br /><br />
			         				 We'll send you e-mail with password reset.
			       				 </form>
			    			</div>
					</div>
				</div>
			  </div>
			  <div id="signup" class="tab-pane fade">
				<div class="register-form">
					<div class="row">
						<h3>Please Complete Your Details</h3>
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
							<ul>
								<i class="fa fa-male"></i><input type="text" placeholder="Last Name" id="regLastfName" name="regLastfName"/> 
							</ul>
						</div>
						<div class="col-md-12">
							<div class="submit-form">
								<input type="submit" value="Complete Sign-Up" id="registerButton"/>
								<p>By registering you comfirm that you agree with our <i>Term & Condition</i> and <i>Privacy Policy</i> </p>
							</div>
						</div>
						</form>
						
					</div>
				</div>
			<!-- Signup Form -->
			  </div>
			</div><!-- Tab-End -->
		</div>
	</div>
		
	


	<script type="text/javascript">
			
		$("#modal_trigger").leanModal({
			top : 200,
			overlay : 0.6,
			closeButton : ".modal_close"
		});
			
		$(function() {
			// Calling Login Form
			$("#login_form").click(function() {
				$(".social_login").hide();
				$(".user_login").show();
				$('.error-box').hide();
			    
				return false;
			});
		
			// Calling Register Form
			$("#register_form").click(function() {
				$(".social_login").hide();
				$(".user_register").show();
				$(".header_title").text('Register');
				$('.error-box').hide();
			    
				return false;
			});
		
			// Going back to Social Forms
			$(".back_btn").click(function() {
				$(".user_login").hide();
				$(".user_register").hide();
				$(".social_login").show();
				$(".header_title").text('Login');
				$('.error-box').hide();
			    
				return false;
			});
			
			/* $("#loginButton").click(function() {			
				performLogin($("form"));
				return false;
			}); */
			
			$("#registerButton").click(function() {
				register($("form"));
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
						loadLinks();
						
					} else {
						 $('.error-box').slideDown('slow').removeClass('green').addClass('red');
					     $(".error-message").text("Incorrect login or password.");
						/* var err = form.find(".error");
						err.html("Login Failed [" + data.error + "]");
						err.show(); */
					}
				}, "json");
		};
	
		function register(form) {	
			
			$.post(
				'<c:url value="/register" />',
				form.serialize(),
				function (data, textStatus) {
					
					var modal_id = $(this).attr("#modal");			
					if (data.status) {
						window.location.reload(true);				
						//$(document).off('keydown.leanModal');
						loadLinks();						
					} else {
						var err = form.find(".error");						
						$('.error-box').slideDown('slow').removeClass('green').addClass('red');
					    $(".error-message").text("Login Failed [" + data.error + "]");
					}
				}, "json");
		};
	</script>
</body>