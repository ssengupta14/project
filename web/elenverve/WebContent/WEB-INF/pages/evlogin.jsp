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
	<div style="position: absolute;left: 10%;top: 25%;">	
		<div class="ev-login-sec-left">			
			<div class="tab-content" id="myTabContent">
			  <!-- <div id="signin" class="tab-pane fade in active"> -->
			  <div id="signin">
				<div class="register-form">
					<div class="row">										
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
			  </div> <!-- signin  -->
			  <!-- <div id="signup" class="tab-pane fade"> -->
			  <div id="signup" style="display:none">
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
			</div><!-- myTabContent -->
			
		</div>   <!-- login-sec -->
		<div class="ev-login-sec-right" >
			<div class="tab-content" >
				<form>
					<div id="register" class="tab-pane fade in active">
					<h3>Register with Elen Verve</h3>
					<input type="submit" value="Complete Sign-Up" id="showRegister"/>
					</div>
				</form>
			</div>
		</div>
	</div>
	<script type="text/javascript">
	$(function() {
		// Calling Login Form
		$("#showRegister").click(function() {
			alert("hi");
			$("#signin").hide();
			$("#signup").show();
			
		    
			return true;
		});
	});
	</script>
</body>