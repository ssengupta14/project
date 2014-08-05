<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Index</title>
<meta name="description" content="" />
<meta name="keywords" content="" />


<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800|Raleway:400,300,600,700,500|Noto+Sans:400,700|Ubuntu:300,400,500,700' rel='stylesheet' type='text/css'>


<!-- Styles -->
<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" type="text/css" /><!-- Bootstrap -->
<link rel="stylesheet" href="<c:url value="/resources/font-awesome-4.0.3/css/font-awesome.css"/>" type="text/css" /><!-- Font Awesome -->
<link rel="stylesheet" href="<c:url value="/resources/css/owl.carousel.css"/>" type="text/css" /><!-- Owl Carousal -->
<link rel="stylesheet" href="<c:url value="/resources/css/animate.css"/>" type="text/css" /><!-- Animation -->

<link rel="stylesheet" href="<c:url value="/resources/css/ion.rangeSlider.css"/>" /><!-- Range Slider -->
<link rel="stylesheet" href="<c:url value="/resources/css/ion.rangeSlider.skinFlat.css"/>" /><!-- Range Slider -->

<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>" type="text/css" /><!-- Style -->
<link rel="stylesheet" href="<c:url value="/resources/css/revolution.css"/>" media="screen" /><!-- Style -->
<link rel="stylesheet" href="<c:url value="/resources/css/responsive.css"/>" type="text/css" /><!-- Responsive -->
<!--<link rel="alternate stylesheet" type="text/css" href="<c:url value="/resources/css/orange.css"/>" title="orange" />--> <!-- Orange -->
<link rel="stylesheet" type="text/css" 	href="<c:url value="/resources/css/setting.css"/>" media="screen" /> 
<link rel="stylesheet" type="text/css" 	href="<c:url value="/resources/css/mystyle.css"/>" media="screen" />
<script type="text/javascript" 	src="<c:url value="/resources/js/jquery-1.10.2.js"/>"></script> <!-- Jquery -->

</head>
<body>
	<div class="theme-layout">

	<header class="header2">
		<div class="container">
			<div class="top-bar">
				
				<ul class="profile bar-dropdown">
					<li><a href="#" title=""><i class="fa fa-user"></i>Sourav</a>
						<ul>
							<li><a href="#" title="">Profile</a></li>
							<li><a href="#" title="">Help</a></li>
							<li><a href="#" title="">Privacy</a></li>
							<li><a href="#" title="">Logout</a></li>
					</ul></li>
				</ul>
			
				<!-- What ever person has shopped, is displayed in the shopping cart-->


					<ul class="shop-cart bar-dropdown">
					<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a>
						<ul>
							<li><span><img src="http://placehold.it/50x50" alt="" /></span>
							<a href="#" title="">Short T-Shirt 2013</a>
							<i>$360.00</i>
								<div class="cart-bar-hover">
								<ul>
									<li><a href="#" title=""><i class="fa fa-cog"></i></a></li>
									<li><a href="#" title=""><i class="fa fa-trash-o"></i></a></li>
								</ul>
								</div>
							</li>
							<li><span><img src="http://placehold.it/50x50" alt="" /></span>
							<a href="#" title="">New Shoes T-Pain</a>
							<i>$560.00</i>
							<div class="cart-bar-hover">
							<ul>
								<li><a href="#" title=""><i class="fa fa-cog"></i></a></li>
								<li><a href="#" title=""><i class="fa fa-trash-o"></i></a></li>
							</ul>
							</div>
							</li>
							
							<li><span><img src="http://placehold.it/50x50" alt="" /></span>
							<a href="#" title="">Cottom Jeans Paint</a>
							<i>$56.00</i>
							<div class="cart-bar-hover">
							<ul>
								<li><a href="#" title=""><i class="fa fa-cog"></i></a></li>
								<li><a href="#" title=""><i class="fa fa-trash-o"></i></a></li>
							</ul>
							</div>
							
							</li>
							<li>
								<h6>Total : $960</h6>
								<a href="#" title="" class="checkout-btn">Checkout</a>
							</li>
						</ul>
					</li>
				</ul>
				<!--  end of shopping cart -->
				
				<!--  Language dropdown -->
				<ul class="language bar-dropdown">
					<li><a href="#" title=""><i class="fa fa-font"></i>English</a>
						<ul>
							<li><a href="#" title="">ENGLISH</a></li>
							<li><a href="#" title="">FRENCH</a></li>
							<li><a href="#" title="">ARABIC</a></li>
						</ul>
					</li>
				</ul>
				
				<!--  end of language dropdown -->
				<!--  Compare button  -->	
				<ul class="compare-btn bar-dropdown">
					<li><a href="#" title=""><i class="fa fa-random"></i>Compare</a></li>
				</ul>
				<!--  end of compare button -->
				
								
				<!--  wishlist button  -->
				<ul class="whishlist-bar bar-dropdown">
					<li><a href="#" title=""><i class="fa fa-heart"></i>Wishlist</a></li>
				</ul>
				<!--  end of wishlist button -->
				
				<!--  Support Phone number  -->
				<ul class="whishlist-bar bar-dropdown">
					<li><a href="#" title=""><i class="fa fa-phone"></i>&nbsp;&nbsp;24/7 Support: 123-456-7890</a></li>
				</ul>
			</div>
		</div>
	
<nav>	
		<div class="container">
			<!--  This is logo  -->
			<Div class="logo">
				<a href="http://themes.webinane.com/shopping/" title="">
					<img src="<%=request.getContextPath() %>/resources/images/elenverve.png"  alt="" />
				</a>
			</div>
			<!--  This is the menu  -->
			<div class="menu">
				<ul>
				
				<c:forEach items="${home.menus}" var ="menus">
					<li><a href="#" title="">${menus.displayName}</a>
					<ul>
						<c:forEach items="${menus.subMenu}" var ="subMenus">
							<li><a href="${subMenus.href}" title="">${subMenus.displayName}</a></li>
						</c:forEach>
					</ul>
					</li>
				</c:forEach>
				
					<li>
					    <a href="#" id="loginform">Login | Register</a>
    						<div class="login">
      						<div class="arrow-up"></div>
      						<div class="formholder">
        						<div class="randompad">
           							<fieldset>
             								<label type="label" name="email">Email</label>
             								<input type="email" value="example@example.com" />
             								<label type="label" name="password">Password</label>
             								<input type="password" />
             								<input type="submit" value="Login" />
             								
								</fieldset>
        						</div>
      						</div>
    						</div>
    	
  						 
					    
					</li>
					
					
				</ul>
			</div>
			
			`
			<div class="search-header">
				<form><input type="text" placeholder="Search Here" /><a href="#" title=""><i class="fa fa-search"></i></a></form>
			</div>
		</div>
	</nav>	
	</header>
	
	


<!--  end of menu  -->
	<header class="responsive-header">
		<div class="top-bar">
			<ul class="shop-cart bar-dropdown">
				<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a>
					<ul>
						<li><span><img src="http://placehold.it/50x50" alt="" /></span>
						<a href="#" title="">Short T-Shirt 2013</a>
						<i>$360.00</i>
							<div class="cart-bar-hover">
							<ul>
								<li><a href="#" title=""><i class="fa fa-cog"></i></a></li>
								<li><a href="#" title=""><i class="fa fa-trash-o"></i></a></li>
							</ul>
							</div>
						</li>
						<li><span><img src="http://placehold.it/50x50" alt="" /></span>
						<a href="#" title="">New Shoes T-Pain</a>
						<i>$560.00</i>
						<div class="cart-bar-hover">
						<ul>
							<li><a href="#" title=""><i class="fa fa-cog"></i></a></li>
							<li><a href="#" title=""><i class="fa fa-trash-o"></i></a></li>
						</ul>
						</div>
						</li>
						
						<li><span><img src="http://placehold.it/50x50" alt="" /></span>
						<a href="#" title="">Cottom Jeans Paint</a>
						<i>$56.00</i>
						<div class="cart-bar-hover">
						<ul>
							<li><a href="#" title=""><i class="fa fa-cog"></i></a></li>
							<li><a href="#" title=""><i class="fa fa-trash-o"></i></a></li>
						</ul>
						</div>
						
						</li>
						<li>
							<h6>Total : $960</h6>
							<a href="#" title="" class="checkout-btn">Checkout</a>
						</li>
					</ul>
				</li>
			</ul>



				
			<ul class="language bar-dropdown">
				<li><a href="#" title=""><i class="fa fa-font"></i>English</a>
					<ul>
						<li><a href="#" title="">ENGLISH</a></li>
						<li><a href="#" title="">FRENCH</a></li>
						<li><a href="#" title="">ARABIC</a></li>
					</ul>
				</li>
			</ul>


				
			<ul class="compare-btn bar-dropdown">
				<li><a href="#" title=""><i class="fa fa-random"></i>Compare</a></li>
			</ul>
				



			<ul class="whishlist-bar bar-dropdown">
				<li><a href="#" title=""><i class="fa fa-heart"></i>Whishlist</a></li>
			</ul>




		</div>
		



		<Div class="logo">
			<a href="http://themes.webinane.com/shopping/" title="">
				<img src="<%=request.getContextPath() %>/resources/images/logo.png" alt="" />
			</a>
		</div>

		
		<div class="search-header">
			<form><input type="text" placeholder="Search Here" /><a href="#" title=""><i class="fa fa-search"></i></a></form>
		</div>
		



		<div class="responsive-menu">
				<a class="menu-dropdown-btn" title="">MENU <i class="fa fa-align-justify"></i></a>
			<ul>


				<c:forEach items="${home.menus}" var ="menus">
					<li><a href="#" title="">${menus.displayName}</a>
					<ul>
						<c:forEach items="${menus.subMenu}" var ="subMenus">
							<li><a href="${subMenus.href}" title="">${subMenus.displayName}</a></li>
						</c:forEach>
					</ul>
					</li>
				</c:forEach>
				
				<!-- 
				<li><a href="#" title="">Home</a>
					<ul>
						<li><a href="index.html" title="">Home Page 1</a></li>
						<li><a href="index2.html" title="">Home Page 2</a></li>
						<li><a href="index3.html" title="">Home Page 3</a></li>
						<li><a href="index4.html" title="">Tech Home Page 1</a></li>
						<li><a href="index5.html" title="">Tech Home Page 2</a></li>
						<li><a href="index11.html" title="">Tech Home Page 3</a></li>
						<li><a href="index6.html" title="">Home Page 6</a></li>
						<li><a href="index7.html" title="">Music Home Page</a></li>
						<li><a href="index8.html" title="">Home with Sidebar</a></li>
						<li><a href="index9.html" title="">Book Home Page</a></li>
						<li><a href="index12.html" title="">Book Home Page 2</a></li>
						<li><a href="index10.html" title="">Home Page 12</a></li>
					</ul>
				</li>
				
				<li><a href="#" title="">Features</a>
					<ul>
						<li><a href="mega-menu.html" title="">4 Styles Mega Menu</a></li>
						<li><a href="header1.html" title="">Header Style 1</a></li>
						<li><a href="header2.html" title="">Header Style 2</a></li>
						<li><a href="boxed.html" title="">Boxed Layout</a></li>
						<li><a href="wide.html" title="">Wide Layout</a></li>
						<li><a href="compare.html" title="">Compare Product </a></li>
						<li><a href="compare2.html" title="">Compare Product 2</a></li>
						<li><a href="widgets.html" title="">Widgets</a></li>
						<li><a href="product1.html" title="">Masonary Product</a></li>
						<li><a href="product4.html" title="">Masonary Product 2</a></li>
						<li><a href="product3.html" title="">Searchable Products</a></li>
						<li><a href="product2.html" title="">Products Page</a></li>
						<li><a href="price-table.html" title="">2 Price Tables</a></li>
						<li><a href="cart.html" title="">Cart</a></li>	
					</ul>
				</li>
				<li><a href="#" title="">Pages</a>
					<ul>
						<li><a href="blog.html" title="">Masonary Blog</a></li>
						<li><a href="blog2.html" title="">Blog One Column</a></li>
						<li><a href="product1.html" title="">Masonary Product</a></li>
						<li><a href="product4.html" title="">Masonary Product 2</a></li>
						<li><a href="product3.html" title="">Searchable Products</a></li>
						<li><a href="product2.html" title="">Products Page</a></li>						
						<li><a href="compare.html" title="">Compare Product </a></li>
						<li><a href="compare2.html" title="">Compare Product 2</a></li>						
						<li><a href="review.html" title="">Review Page</a></li>
						<li><a href="404.html" title="">404 Error page</a></li>
						<li><a href="faq.html" title="">FAQ Page</a></li>
						<li><a href="single-post.html" title="">Single Product</a></li>
						<li><a title="" href="signin.html">Login/Register</a></li>
					</ul>
				</li>
				<li><a href="#" title="">Shortcode</a>
					<ul>
						<li><a href="price-table.html" title="">Price Box</a></li>
						<li><a href="office.html" title="">Our Offices</a></li>
						<li><a href="skills.html" title="">Our Skills</a></li>
						<li><a href="services.html" title="">Our Services</a></li>
						<li><a href="team.html" title="">Our Team</a></li>
						<li><a href="faq.html" title="">FAQ</a></li>
					</ul>
				</li>
				
				<li><a href="about.html" title="">About </a></li>
				<li><a href="contact.html" title="">Contact</a></li>
				
				
				-->
			</ul>
		</div>	
	</header>
	
	</div>


	<!-- Script -->

	<script src='http://codepen.io/assets/libs/fullpage/jquery.js'></script>
	<script type="text/javascript"
		src="<c:url value="/resources/js/script.js"/>"></script>
	<!-- Common -->
	<script src="<%=request.getContextPath()%>/resources/js/myindex.js"></script>
	<!-- Jquery -->
	<script type="text/javascript"
		src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
	<!-- Bootstrap -->
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/resources/js/modernizr.js"></script>
	<!-- modernizr -->
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/resources/js/owl.carousel.min.js"></script>
	<!-- Owl Carousal -->
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/resources/js/onscreen.js"></script>
	<!-- On Screen -->
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/resources/js/switcher.js"></script>
	<!-- Style Switcher -->

	<script type="text/javascript"
		src="<%=request.getContextPath()%>/resources/js/daterangepicker.js"></script>
	<!-- Date Range Picker -->
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/resources/js/ion.rangeSlider.min.js"></script>
	<!-- Range Slider -->
	<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery.themepunch.plugins.min.js"></script>

	<!-- Range Slider -->
	<script>
		$(document).ready(function() {

			$("#range_1").ionRangeSlider({
				min : 0,
				max : 5000,
				from : 1000,
				to : 4000,
				type : 'double',
				step : 1,
				prefix : "$",
				prettify : true,
				hasGrid : true
			});
		});
	</script>



	<!-- SLIDER REVOLUTION -->
	<script type="text/javascript"
		src="<c:url value="/resources/js/jquery.themepunch.plugins.min.js"/>"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/js/jquery.themepunch.revolution.min.js"/>"></script>

	<script type="text/javascript">
		var revapi;
		jQuery(document).ready(function() {
			revapi = jQuery('.tp-banner').revolution({
				delay : 5000,
				startwidth : 1170,
				startheight : 533,
				autoHeight : "off",
				navigationType : "none",
				hideThumbs : 10,
				fullWidth : "on",
				fullScreen : "off",
				fullScreenOffsetContainer : ""
			});
		});
	</script>

	<script type="text/javascript">
		$(document).ready(function() {
		$("#shop-testimonial").owlCarousel({
			autoPlay: 2000, //Set AutoPlay to 20 seconds
			items : 1,
			itemsDesktop : [1199,1],
			itemsDesktopSmall : [979,1],
			itemsTablet :	[768,1] ,
			itemsMobile :	[479,1],
			pagination:true,
			stopOnHover : true,
			transitionStyle:"goDown",
			paginationNumbers:false,
			autoPlay :true

	});
			$(".tab-photos").owlCarousel({
				autoPlay :true,
				stopOnHover : true,
				navigation:true,
				goToFirstSpeed : 2000,
				slideSpeed:1500,
				singleItem : true,
				autoHeight : true,
				pagination:false,
				transitionStyle:"goDown"
			});
			$(".footer-deal").owlCarousel({
				autoPlay : true,
				stopOnHover : true,
				goToFirstSpeed : 2000,
				slideSpeed : 1500,
				singleItem : true,
				autoHeight : true,
				transitionStyle : "goDown",
				paginationNumbers : true
			});

			$("#tab-recent").owlCarousel({
				autoPlay : true,
				stopOnHover : true,
				navigation : true,
				goToFirstSpeed : 2000,
				slideSpeed : 1500,
				singleItem : true,
				autoHeight : true,
				pagination : false,
				transitionStyle : "goDown"
			});

			$("#tab-popular").owlCarousel({
				autoPlay : true,
				stopOnHover : true,
				navigation : true,
				goToFirstSpeed : 2000,
				slideSpeed : 1500,
				singleItem : true,
				autoHeight : true,
				pagination : false,
				transitionStyle : "goDown"
			});

			var now = new Date();
			var current_year = now.getFullYear();
			var next_year = current_year + 1;

			var target_date = new Date("Jan 1, " + next_year).getTime();

			var days, hours, minutes, seconds;

			var $hours = document.getElementById("h");
			var $minutes = document.getElementById("m");
			var $seconds = document.getElementById("s");

			function update() {
				var current_date = new Date().getTime();
				var seconds_left = (target_date - current_date) / 1000;

				days = parseInt(seconds_left / 86400);
				seconds_left = seconds_left % 86400;

				hours = parseInt(seconds_left / 500);
				seconds_left = seconds_left % 500;

				minutes = parseInt(seconds_left / 60);
				seconds = parseInt(seconds_left % 60);

				$hours.innerHTML = pad(hours, 2);
				$minutes.innerHTML = pad(minutes, 2);
				$seconds.innerHTML = pad(seconds, 2);
			}

			update();

			setInterval(update, 1000);

			function pad(num, size) {
				var s = num + "";
				while (s.length < size)
					s = "0" + s;
				return s;
			}

		});
	</script>

</body>
</html>