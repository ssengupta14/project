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
<link rel="stylesheet" href="<c:url value="/resources/css/responsive.css"/>" type="text/css" /><!-- Responsive -->	
<link rel="alternate stylesheet" type="text/css" href="<c:url value="/resources/css/orange.css"/>" title="orange" /> <!-- Orange -->




</head>
<body>
<div class="theme-layout">

	<header class="header1">
		<div class="container">
			<div class="top-bar">

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
				<span><i class="fa fa-mobile"></i>24/7 Support: 123-456-7890</span>
			</div>
		</div>
	<nav>	
		<div class="container">
			<!--  This is logo  -->
			<Div class="logo">
				<a href="http://themes.webinane.com/shopping/" title="">
					<img src="<%=request.getContextPath() %>/resources/images/logo.png"  alt="" />
				</a>
			</div>
			<!--  This is the menu  -->
			<div class="menu">
				<ul>
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
							<li><a href="#" title="">Header Styles</a>
								<ul>
									<li><a href="header1.html" title="">Header Style 1</a></li>
									<li><a href="header2.html" title="">Header Style 2</a></li>

								</ul>
							</li>
							<li><a href="boxed.html" title="">Boxed Layout</a></li>
							<li><a href="wide.html" title="">Wide Layout</a></li>
							<li><a href="#" title="">Compare Product</a>
								<ul>
									<li><a href="compare.html" title="">Compare Product </a></li>
									<li><a href="compare2.html" title="">Compare Product 2</a></li>
								</ul>
							</li>
							<li><a href="widgets.html" title="">Widgets</a></li>
							<li><a href="#" title="">Products Page</a>
								<ul>
									<li><a href="product1.html" title="">Masonary Product</a></li>
									<li><a href="product4.html" title="">Masonary Product 2</a></li>
									<li><a href="product3.html" title="">Searchable Products</a></li>
									<li><a href="product2.html" title="">Products Page</a></li>
								</ul>
							</li>
							<li><a href="price-table.html" title="">2 Price Tables</a></li>
						</ul>
					</li>
					<li><a href="#" title="">Pages</a>
						<ul class="mega2">
							<li><a href="#" title="">Cart Pages</a>
								<ul>
									<li><a href="cart.html" title="">Cart</a></li>							
								</ul>	
							</li>
							<li><a href="" title="">Blog Page</a>
								<ul>
									<li><a href="blog.html" title="">Masonary Blog</a></li>
									<li><a href="blog2.html" title="">Blog One Column</a></li>
								</ul>
							</li>

							<li><a href="#" title="">Products Page</a>
								<ul>
									<li><a href="product1.html" title="">Masonary Product</a></li>
									<li><a href="product4.html" title="">Masonary Product 2</a></li>
									<li><a href="product3.html" title="">Searchable Products</a></li>
									<li><a href="product2.html" title="">Products Page</a></li>
								</ul>
							</li>							

							<li><a href="#" title="">Compare Product</a>
								<ul>
									<li><a href="compare.html" title="">Compare Product </a></li>
									<li><a href="compare2.html" title="">Compare Product 2</a></li>
								</ul>
							</li>							
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
				</ul>
			</div>

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
			</ul>
		</div>	
	</header>


	<div class="tp-banner-container">
		<div class="tp-banner" >
			<ul>
				<li data-transition="3dcurtain-vertical" data-slotamount="7" data-masterspeed="500" >

					<!-- <img src="http://placehold.it/1366x533"  alt="slidebg1"  data-bgfit="cover" data-bgposition="left top" data-bgrepeat="no-repeat" /> -->
					<img src="<%=request.getContextPath() %>/resources/images/slide1.jpg"  alt="slidebg1"  data-bgfit="cover" data-bgposition="left top" data-bgrepeat="no-repeat" />
					<!-- 																																																		
					<div class="tp-caption lfl" data-x="-20" data-y="12" data-speed="2000" data-start="800" data-easing="Back.easeOut" data-endspeed="500" data-captionhidden="on" style="font-size:40px; z-index: 4"><span><img src="<%=request.getContextPath() %>/resources/images/boy.png" alt="" /></span></div>

					<div class="tp-caption lfr" data-x="290" data-y="12" data-speed="2000" data-start="800" data-easing="Back.easeOut" data-endspeed="500" data-captionhidden="on" style="font-size:40px; z-index: 4"><span><img  style="z-index:0;" src="<%=request.getContextPath() %>/resources/images/girl1.png" alt="" /></span></div>

					<div class="tp-caption lfb" data-x="150" data-y="12" data-speed="2000" data-start="800" data-easing="Back.easeOut" data-endspeed="500" data-captionhidden="on" style="font-size:40px; z-index: 4"><span><img src="<%=request.getContextPath() %>/resources/images/girl2.png" alt="" /></span></div>

					

					<div class="tp-caption lft" data-x="640" data-y="230" data-speed="2000" data-start="800" data-easing="Back.easeOut" data-endspeed="500" data-captionhidden="on" style="font-size:40px; z-index: 4"><span><img src="<%=request.getContextPath() %>/resources/images/box1.png" alt="" /></span></div>

					<div class="tp-caption lfb" data-x="1045" data-y="400" data-speed="2000" data-start="800" data-easing="Back.easeOut" data-endspeed="500" data-captionhidden="on" style="font-size:40px; z-index: 4"><span><img src="<%=request.getContextPath() %>/resources/images/box2.png" alt="" /></span></div>

					<div class="tp-caption skewfromright" data-x="670" data-y="205" data-speed="2000" data-start="800" data-easing="Back.easeOut" data-endspeed="500" data-captionhidden="on" style=""><h2 class="slide4-text1">More then <i>branding</i> agancy</h2></div>

					<div class="tp-caption skewfromleft" data-x="670" data-y="250" data-speed="2000" data-start="800" data-easing="Back.easeOut" data-endspeed="500" data-captionhidden="on" style="z-index:8;"><h2 class="slide4-text2">Discover more about store Advanced Technology</h2></div>

					<div class="tp-caption skewfromright" data-x="670" data-y="290" data-speed="2000" data-start="800" data-easing="Back.easeOut" data-endspeed="500" data-captionhidden="on" style="z-index:8;"><p class="slide4-text3">Sed eget tellus sapien. Proinupmoso etiamgo velmis dolor amet pPro-<br/>inupmoso  etiamgo velmis dolor amet promo elit.</p></div>

					<div class="tp-caption skewfromright" data-x="670" data-y="360" data-speed="2000" data-start="800" data-easing="Back.easeOut" data-endspeed="500" data-captionhidden="on" style="font-size:40px; z-index: 4"><a href="#" title="" class="slide2-btn">Purchase on Themeforest</a></div>
					-->
				</li><!-- SLIDE 1  -->

				<li data-transition="slotzoom-horizontal" data-slotamount="7" data-masterspeed="500" >
					<!--  <img src="http://placehold.it/1366x533"  alt="slidebg1"  data-bgfit="cover" data-bgposition="left top" data-bgrepeat="no-repeat" /> -->
					<img src="<%=request.getContextPath() %>/resources/images/slide2.jpg"  alt="slidebg1"  data-bgfit="cover" data-bgposition="left top" data-bgrepeat="no-repeat" />
					<!-- 
					<div class="tp-caption skewfromleft" data-x="292" data-y="196" data-speed="1500" data-start="800" data-easing="SlowMo.ease" data-endspeed="500" data-captionhidden="on" style="font-size:40px; z-index: 4"><span class="slide-text1">Shop<i>inn</i></span></div>

					<div class="tp-caption skewfromright" data-x="158" data-y="244" data-speed="1500" data-start="800" data-easing="Sine.easeInOut" data-endspeed="500" data-captionhidden="on" style="font-size:30px; z-index: 4"><span class="slide-text1">More then branding <i>agency</i></span></div>

					<div class="tp-caption fade" data-x="193" data-y="285" data-speed="1500" data-start="800" data-easing="Circ.easeIn" data-endspeed="500" data-captionhidden="on" style="font-size:14px; z-index: 4"><span class="slide-text1"><i>Discover more about store Advanced Technology</i></span></div>

					<div class="tp-caption sfr" data-x="314" data-y="326" data-speed="1000" data-start="800" data-easing="easeInBounce" data-endspeed="500" data-captionhidden="on" style="font-size:14px; z-index: 4"><a class="slide-text1-btn" href="#" title="">VIEW MORE</a></div>

					<div class="tp-caption lfr" data-x="723" data-y="88"  data-speed="1500" data-start="800" data-easing="Back.easeOut" data-endspeed="500" data-captionhidden="on" style="z-index: 4;"><img src="<%=request.getContextPath() %>/resources/images/slide-hand.png"  alt="" /></div>
					-->
				</li><!-- SLIDE 2  -->

				<li data-transition="curtain-2" data-slotamount="7" data-masterspeed="500" >
					<!-- <img src="http://placehold.it/1366x533"  alt="slidebg1"  data-bgfit="cover" data-bgposition="left top" data-bgrepeat="no-repeat" /> -->
					<img src="<%=request.getContextPath() %>/resources/images/slide3.jpg"  alt="slidebg1"  data-bgfit="cover" data-bgposition="left top" data-bgrepeat="no-repeat" />
					<!-- 
					<div class="tp-caption skewfromleft" data-x="2" data-y="141" data-speed="2000" data-start="1200" data-easing="Back.easeOut" data-endspeed="500" data-captionhidden="on" style="z-index: 4"><span><img src="<%=request.getContextPath() %>/resources/images/slide-girl.png"  alt="" /></span></div>

					<div class="tp-caption skewfromright" data-x="650" data-y="162" data-speed="2000" data-start="800" data-easing="Back.easeOut" data-endspeed="500" data-captionhidden="on" style="font-size:40px; z-index: 4; font-size:40px;"><span class="slide2-text1">SHOPPING</span></div>

					<div class="tp-caption skewfromleft" data-x="650" data-y="224" data-speed="2000" data-start="800" data-easing="Back.easeOut" data-endspeed="500" data-captionhidden="on" style="font-size:40px; z-index: 4"><span class="slide2-text2">More then branding agency</span></div>

					<div class="tp-caption skewfromright" data-x="650" data-y="294" data-speed="2000" data-start="800" data-easing="Back.easeOut" data-endspeed="500" data-captionhidden="on" style="font-size:40px; z-index: 4; font-size:30px;"><span class="slide2-text1">More then branding</span></div>

					<div class="tp-caption skewfromleft " data-x="650" data-y="375" data-speed="2000" data-start="800" data-easing="Back.easeOut" data-endspeed="500" data-captionhidden="on" style="font-size:40px; z-index: 4"><a href="#" title="" class="slide2-btn">Purchase on Themeforest</a></div>
					-->
				</li><!-- SLIDE 3  -->

				<li data-transition="boxslide" data-slotamount="7" data-masterspeed="500" >
					<!-- <img src="http://placehold.it/1366x533"  alt="slidebg1"  data-bgfit="cover" data-bgposition="left top" data-bgrepeat="no-repeat" /> -->
					<img src="<%=request.getContextPath() %>/resources/images/slide4.jpg"  alt="slidebg1"  data-bgfit="cover" data-bgposition="left top" data-bgrepeat="no-repeat" /> 
					<!-- 
					<div class="tp-caption lfb" data-x="2" data-y="2" data-speed="2000" data-start="800" data-easing="Power0.easeIn" data-endspeed="500" data-captionhidden="on" style="font-size:40px; z-index: 4"><span><img src="<%=request.getContextPath() %>/resources/images/balloons.png"  alt="" /></span></div>

					<div class="tp-caption skewfromleft" data-x="680" data-y="210" data-speed="2000" data-start="800" data-easing="Back.easeOut" data-endspeed="500" data-captionhidden="on" style="font-size:40px; z-index: 4"><h2 class="slide3-text1"> our most complete <i>WooCommerce</i> theme yet!</h2></div>

					<div class="tp-caption skewfromright" data-x="680" data-y="252" data-speed="2000" data-start="800" data-easing="Back.easeOut" data-endspeed="500" data-captionhidden="on" style="font-size:40px; z-index: 4">
						<ul class="slide3-list">
							<li><i class="fa fa-bitbucket"></i><span>Truly Fantastic Theme For Your Shop Venture</span></li>
							<li><i class="fa fa-shopping-cart"></i><span>Buy It Now! Fantastic Deals</span></li>
							<li><i class="fa fa-thumb-tack"></i><span>For More Information Call +386 40 000 1111 now!</span></li>
							<li><i class="fa fa-lightbulb-o"></i><span>Buy It On Themeforest For Only $55</span></li>
						</ul>
					</div>

					<div class="tp-caption" data-x="-20" data-y="95" data-speed="500" data-start="800" data-easing="Back.easeOut" data-endspeed="500" data-captionhidden="on" style="font-size:40px; z-index: 4"><span><img src="<%=request.getContextPath() %>/resources/images/slide-mobile.png" alt="" /></span></div>
					-->
				</li><!-- SLIDE 4  -->
			</ul>
		</div>
	</div>

<section class="block">
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<div class="discount-deal">
					<Div class="discount-desc">
						<h3>DEALS EVERYDAY</h3>
						<h4>SALES <strong>30%</strong> <i>OFF</i></h4>
						<span class="counter-head">TIME LEFT</span>
						<ul class="counter">
							<li><div><span id="h"></span><span class="hours">HRS</span></div></li>
							<li><div><span id="m"></span><span class="minutes">MINTS</span></div></li>
							<li><div><span id="s"></span><span class="seconds">Seconds</span></div></li>
						</ul>
					</div>

					<div class="discount-image">
						<img src="http://placehold.it/270x280" alt="" />
						<span class="flip-default">WE GIVE YOU BEST HOSTING </span>
						<A href="#" title=""><span class="flip-active">SHOP NOW</span></a>
					</div>
				</div>
			</div>

			<div class="col-md-6" id="services-box">
				<Div class="row">
					<Div class="col-md-4">
						<div class="service-box red">
							<Span><i class="fa fa-tag"></i></span>
							<h3>GIVE YOU BEST</h3>
							<p>See ballerina boy for as little as </p>
							<A href="#" title="">READ MORE</a>
							<i class="box-1"></i>
							<i class="box-2"></i>
							<i class="box-3"></i>
							<i class="box-4"></i>
						</div>
					</div>

					<Div class="col-md-4">
						<div class="service-box orange">
							<Span><i class="fa fa-camera"></i></span>
							<h3>GIVE YOU BEST</h3>
							<p>See ballerina boy for as little as </p>
							<A href="#" title="">READ MORE</a>
							<i class="box-1"></i>
							<i class="box-2"></i>
							<i class="box-3"></i>
							<i class="box-4"></i>
						</div>
					</div>

					<Div class="col-md-4">
						<div class="service-box blue">
							<Span><i class="fa fa-picture-o"></i></span>
							<h3>GIVE YOU BEST</h3>
							<p>See ballerina boy for as little as </p>
							<A href="#" title="">READ MORE</a>
							<i class="box-1"></i>
							<i class="box-2"></i>
							<i class="box-3"></i>
							<i class="box-4"></i>
						</div>
					</div>

					<Div class="col-md-4">
						<div class="service-box green">
							<Span><i class="fa fa-leaf"></i></span>
							<h3>GIVE YOU BEST</h3>
							<p>See ballerina boy for as little as </p>
							<A href="#" title="">READ MORE</a>
							<i class="box-1"></i>
							<i class="box-2"></i>
							<i class="box-3"></i>
							<i class="box-4"></i>
						</div>
					</div>

					<Div class="col-md-4">
						<div class="service-box brown">
							<Span><i class="fa fa-github"></i></span>
							<h3>GIVE YOU BEST</h3>
							<p>See ballerina boy for as little as </p>
							<A href="#" title="">READ MORE</a>
							<i class="box-1"></i>
							<i class="box-2"></i>
							<i class="box-3"></i>
							<i class="box-4"></i>
						</div>
					</div>

					<Div class="col-md-4">
						<div class="service-box d-pink">
							<Span><i class="fa fa-coffee"></i></span>
							<h3>GIVE YOU BEST</h3>
							<p>See ballerina boy for as little as </p>
							<A href="#" title="">READ MORE</a>
							<i class="box-1"></i>
							<i class="box-2"></i>
							<i class="box-3"></i>
							<i class="box-4"></i>
						</div>
					</div>
				</div>
			</div>

		</div>
	</div>
</section>

<section class="block remove-gap">
	<div class="container">
		<div class="row">
			<div class="col-md-3">
				<aside>
					<div class="product-tab">
					  <ul class="nav nav-tabs" id="myTab">
						<li class="active"><a data-toggle="tab" href="#recent">Recent</a></li>
						<li><a data-toggle="tab" href="#popular">Popular</a></li>
					  </ul>
						<div class="tab-content" id="myTabContent">
							<div id="recent" class="tab-pane fade in active">
								<div class="tab-recent" id="tab-recent">
									<ul>
										<li><span><img src="http://placehold.it/85x106" alt="" /></span>
											<h3><a href="#" title="">Envato’s Most Wanted: BuddyPress</a></h3>
											<p>Lorem ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>

										<li><span><img src="http://placehold.it/85x106" alt="" /></span>
											<h3><a href="#" title="">Envato’s Most Wanted: BuddyPress</a></h3>
											<p>Lorem ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>

										<li><span><img src="http://placehold.it/85x106" alt="" /></span>
											<h3><a href="#" title="">Envato’s Most Wanted: BuddyPress</a></h3>
											<p>Lorem ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>
									</ul>

									<ul>
										<li><span><img src="http://placehold.it/85x106" alt="" /></span>
											<h3><a href="#" title="">Envato’s Most Wanted: BuddyPress</a></h3>
											<p>Lorem ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>

										<li><span><img src="http://placehold.it/85x106" alt="" /></span>
											<h3><a href="#" title="">Envato’s Most Wanted: BuddyPress</a></h3>
											<p>Lorem ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>

										<li><span><img src="http://placehold.it/85x106" alt="" /></span>
											<h3><a href="#" title="">Envato’s Most Wanted: BuddyPress</a></h3>
											<p>Lorem ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>
									</ul>

								</div>
							</div>
							<div id="popular" class="tab-pane fade">
							  <div id="recent2" class="tab-pane fade in active">
								<div class="tab-recent" id="tab-popular">
									<ul>
										<li><span><img src="http://placehold.it/85x106" alt="" /></span>
											<h3><a href="#" title="">Envato’s Most Wanted: BuddyPress</a></h3>
											<p>Lorem ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>

										<li><span><img src="http://placehold.it/85x106" alt="" /></span>
											<h3><a href="#" title="">Envato’s Most Wanted: BuddyPress</a></h3>
											<p>Lorem ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>

										<li><span><img src="http://placehold.it/85x106" alt="" /></span>
											<h3><a href="#" title="">Envato’s Most Wanted: BuddyPress</a></h3>
											<p>Lorem ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>
									</ul>

									<ul>
										<li><span><img src="http://placehold.it/85x106" alt="" /></span>
											<h3><a href="#" title="">Envato’s Most Wanted: BuddyPress</a></h3>
											<p>Lor ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>

										<li><span><img src="http://placehold.it/85x106" alt="" /></span>
											<h3><a href="#" title="">Envato’s Most Wanted: BuddyPress</a></h3>
											<p>Lorem ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>

										<li><span><img src="http://placehold.it/85x106" alt="" /></span>
											<h3><a href="#" title="">Envato’s Most Wanted: BuddyPress</a></h3>
											<p>Lorem ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>
									</ul>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="categories-widget widget-body">
						<div class="heading-5">
							<h2><i class="fa fa-folder-open"></i>CATEGORIES</h2>
						</div>

						<ul>
							<li><i></i><a href="#" title="">T-Shirts</a> <span>18</span></li>
							<li><i></i><a href="#" title="">Jeans Paints </a><span>10</span></li>
							<li><i></i><a href="#" title="">Western Shoes </a><span>16</span></li>
							<li><i></i><a href="#" title="">Kids Special</a> <span>20</span></li>
						</ul>
					</div>

					<div class="widget-body range-slider">
						<div class="heading-5">
							<h2><i class="fa fa-folder-open"></i>PRICE RANGE</h2>
						</div>
						<div class="demo demo_left">
							<input id="range_1" type="text" name="range_2" value="" /><!-- Range 1 -->	
						</div>
					</div>

					<div class="widget-body">
						<div class="heading-5">
							<h2><i class="fa fa-folder-open"></i>DISCOUNT PRODUCT</h2>
						</div>

						<div class="w-discount">
							<img alt="" src="http://placehold.it/368x286">
							<div class="w-discount-des">
								<h3>WEBINANE.COM</h3>
								<i>20% OFF</i>
								<p>ODDER OVER $80</p>
								<a title="" href="#">SHOP NOW</a>
							</div>
						</div>
					</div>

				</aside>
			</div>

			<div class="col-md-9">
				<div class="row">
				<do:forLoop var="i" from ="1" to="3" step="1">
					<div class="col-md-4 inner-products">

						<c:forEach items="${prodList}" var ="prod"> 
						<div class="best-seller most-sold">
							<div class="sold-thumb"><img src="<%=request.getContextPath() %>${prod.imgUrl}" alt="">
									<c:if test="${prod.detailLinkInd >0}">
										<a title="" href="single-post.html">VIEW DETAILS</a>
									</c:if>
								<i class="box1"></i>
								<i class="box2"></i>
								<i class="box3"></i>
								<i class="box4"></i>
							</div>					
							<h3>${prod.name}</h3>

							<ul class="tooltip-btn">
								<c:if test="${prod.cartInd >0}"> 
								<li class="cart"><a title="" href="#"><i class="fa fa-heart"></i></a></li>
								</c:if>
								<c:if test="${prod.favInd >0}">
								<li class="shop"><a title="" href="#"><i class="fa fa-shopping-cart"></i></a></li>
								</c:if>
								<c:if test="${prod.giftInd >0}">
								<li class="shop"><a title="" href="#"><i class="fa fa-shopping-cart"></i></a></li>
								</c:if>

							</ul>
							<a title="" href="#">DETAILS</a>
							<c:if test="${prod.isNew >0}"> 
							<h6>NEW</h6>
							</c:if>
							<span><i>${prod.currInd}${prod.originalPrice}</i>${prod.currInd}${prod.finalPrice}</span>
						</div>
					 </c:forEach>
					</div>
					</do:forLoop>
					<!-- 
					<div class="col-md-4 inner-products">
						<div class="best-seller most-sold">
							<div class="sold-thumb"><img src="http://placehold.it/248x409" alt=""><a title="" href="single-post.html">VIEW DETAILS</a>
								<i class="box1"></i>
								<i class="box2"></i>
								<i class="box3"></i>
								<i class="box4"></i>
							</div>					
							<h3>BEST KIDS DESIGN 2014</h3>
							
							<ul class="tooltip-btn">
								<li class="cart"><a title="" href="#"><i class="fa fa-heart"></i></a></li>
								<li class="shop"><a title="" href="#"><i class="fa fa-shopping-cart"></i></a></li>
							</ul>
							<a title="" href="#">DETAILS</a>
							<span><i>$360</i>$460</span>
						</div>
						
						<div class="best-seller most-sold">
							<div class="sold-thumb"><img src="http://placehold.it/248x273" alt=""><a title="" href="single-post.html">VIEW DETAILS</a>
								<i class="box1"></i>
								<i class="box2"></i>
								<i class="box3"></i>
								<i class="box4"></i>
							</div>					
							<h3>BEST KIDS DESIGN 2014</h3>
							
							<ul class="tooltip-btn">
								<li class="cart"><a title="" href="#"><i class="fa fa-heart"></i></a></li>
								<li class="shop"><a title="" href="#"><i class="fa fa-shopping-cart"></i></a></li>
							</ul>
							<a title="" href="#">DETAILS</a>
							<span><i>$360</i>$460</span>
						</div>
						
						<div class="best-seller most-sold">
							<div class="sold-thumb"><img src="http://placehold.it/248x273" alt=""><a title="" href="single-post.html">VIEW DETAILS</a>
								<i class="box1"></i>
								<i class="box2"></i>
								<i class="box3"></i>
								<i class="box4"></i>
							</div>					
							<h3>BEST KIDS DESIGN 2014</h3>
							
							<ul class="tooltip-btn">
								<li class="cart"><a title="" href="#"><i class="fa fa-heart"></i></a></li>
								<li class="shop"><a title="" href="#"><i class="fa fa-shopping-cart"></i></a></li>
							</ul>
							<a title="" href="#">DETAILS</a>
							<h6>NEW</h6>
							<span><i>$360</i>$460</span>
						</div>
						
					</div>
					
					<div class="col-md-4 inner-products">
						<div class="best-seller most-sold">
							<div class="sold-thumb"><img src="http://placehold.it/248x273" alt=""><a title="" href="single-post.html">VIEW DETAILS</a>
								<i class="box1"></i>
								<i class="box2"></i>
								<i class="box3"></i>
								<i class="box4"></i>
							</div>					
							<h3>BEST KIDS DESIGN 2014</h3>
							
							<ul class="tooltip-btn">
								<li class="cart"><a title="" href="#"><i class="fa fa-heart"></i></a></li>
								<li class="shop"><a title="" href="#"><i class="fa fa-shopping-cart"></i></a></li>
							</ul>
							<a title="" href="#">DETAILS</a>
							<h6>NEW</h6>
							<span><i>$360</i>$460</span>
						</div>
						
						<div class="best-seller most-sold">
							<div class="sold-thumb"><img src="http://placehold.it/248x273" alt=""><a title="" href="single-post.html">VIEW DETAILS</a>
								<i class="box1"></i>
								<i class="box2"></i>
								<i class="box3"></i>
								<i class="box4"></i>
							</div>					
							<h3>BEST KIDS DESIGN 2014</h3>
							
							<ul class="tooltip-btn">
								<li class="cart"><a title="" href="#"><i class="fa fa-heart"></i></a></li>
								<li class="shop"><a title="" href="#"><i class="fa fa-shopping-cart"></i></a></li>
							</ul>
							<a title="" href="#">DETAILS</a>
							<span><i>$360</i>$460</span>
						</div>
						
						<div class="best-seller most-sold">
							<div class="sold-thumb"><img src="http://placehold.it/248x409" alt=""><a title="" href="single-post.html">VIEW DETAILS</a>
								<i class="box1"></i>
								<i class="box2"></i>
								<i class="box3"></i>
								<i class="box4"></i>
							</div>					
							<h3>BEST KIDS DESIGN 2014</h3>
							
							<ul class="tooltip-btn">
								<li class="cart"><a title="" href="#"><i class="fa fa-heart"></i></a></li>
								<li class="shop"><a title="" href="#"><i class="fa fa-shopping-cart"></i></a></li>
							</ul>
							<a title="" href="#">DETAILS</a>
							<span><i>$360</i>$460</span>
						</div>
						
					</div>
					-->
				</div>
				<!-- This is pagination  -->

					<div class="custom-pagination">
						<ul>
							<li><a href="#" title="">1</a></li>
							<li><a href="#" title="">2</a></li>
							<li><a href="#" title="">3</a></li>
						</ul>
						<span><i>Pages 1 of 2</i></span>
						<a href="#" title=""><span>Next Page</span></a>
						<a href="#" title=""><span>Previous</span></a>
					</div>				
			</div>


		</div>
	</div>
</section>

<footer class="block">
	<div class="container">
		<div class="row">
			<div class="col-md-3">
				<div class="footer-about">
					<h3><i>ABOUT</i> US</h3>
					<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s ext ever since the 1500s  1500s ext ever since the 1500s  industry's standard dummy text ever.</p>
					<ul>
						<li><span><i class="fa fa-mobile"></i></span><p>Phone:   + 98392039330</p><p>Fax:        + 98392039330</p></li>
						<li><span><i class="fa fa-envelope-o"></i></span><p>Email:       meinto@tolee.com</p><p>Address:   Excel Tower OPG Rpad</p></li>
					</ul>
				</div>
			</div>

			<div class="col-md-3">
				<div class="footer-product">
					<h3><i>RECENT</i> PRODUCT</h3>
					<span><img src="http://placehold.it/145x256" alt="" /></span>
					<h4><a href="#" title="">Best Offer Seller This Dress</a></h4>
					<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry inprinting.</p>
					<ul>
						<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
						<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
					</ul>
				</div>
			</div>

			<div class="col-md-3">
				<div class="footer-post">
				<h3><i>BLOG</i> POST</h3>
					<ul>
						<li><a href="#" title="">Consectetur Adipisicing</a><i>Novermber 20,2013</i></li>
						<li><a href="#" title="">Consectetur Adipisicing</a><i>Novermber 20,2013</i></li>
						<li><a href="#" title="">Consectetur Adipisicing</a><i>Novermber 20,2013</i></li>
						<li><a href="#" title="">Consectetur Adipisicing</a><i>Novermber 20,2013</i></li>
					</ul>
				</div>
			</div>

			<div class="col-md-3">
				<h3><i>HOT</i> DEALS</h3>
				<div class="footer-deal">
					<div class="footer-deals">
						<a href="#" title=""><img src="http://placehold.it/85x123" alt="" /><span>30% <i>Off</i></span></a>
						<a href="#" title=""><img src="http://placehold.it/85x123" alt="" /><span>30% <i>Off</i></span></a>
						<a href="#" title=""><img src="http://placehold.it/85x123" alt="" /><span>30% <i>Off</i></span></a>
						<a href="#" title=""><img src="http://placehold.it/85x123" alt="" /><span>30% <i>Off</i></span></a>
						<a href="#" title=""><img src="http://placehold.it/85x123" alt="" /><span>30% <i>Off</i></span></a>
						<a href="#" title=""><img src="http://placehold.it/85x123" alt="" /><span>30% <i>Off</i></span></a>
					</div>

					<div class="footer-deals">
						<a href="#" title=""><img src="http://placehold.it/85x123" alt="" /><span>30% <i>Off</i></span></a>
						<a href="#" title=""><img src="http://placehold.it/85x123" alt="" /><span>30% <i>Off</i></span></a>
						<a href="#" title=""><img src="http://placehold.it/85x123" alt="" /><span>30% <i>Off</i></span></a>
						<a href="#" title=""><img src="http://placehold.it/85x123" alt="" /><span>30% <i>Off</i></span></a>
						<a href="#" title=""><img src="http://placehold.it/85x123" alt="" /><span>30% <i>Off</i></span></a>
						<a href="#" title=""><img src="http://placehold.it/85x123" alt="" /><span>30% <i>Off</i></span></a>
					</div>

					<div class="footer-deals">
						<a href="#" title=""><img src="http://placehold.it/85x123" alt="" /><span>30% <i>Off</i></span></a>
						<a href="#" title=""><img src="http://placehold.it/85x123" alt="" /><span>30% <i>Off</i></span></a>
						<a href="#" title=""><img src="http://placehold.it/85x123" alt="" /><span>30% <i>Off</i></span></a>
						<a href="#" title=""><img src="http://placehold.it/85x123" alt="" /><span>30% <i>Off</i></span></a>
						<a href="#" title=""><img src="http://placehold.it/85x123" alt="" /><span>30% <i>Off</i></span></a>
						<a href="#" title=""><img src="http://placehold.it/85x123" alt="" /><span>30% <i>Off</i></span></a>
					</div>
				</div>
			</div>

		</div>
	</div>
</footer>

<div class="bottom-line">
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<Div class="payment-accept">
					<span>Payments We Accpet</span>
					<ul>
						<li><a href="#" title=""><img src="<c:url value="/resources/images/payment1.png"/>" alt="" /></a></li>
						<li><a href="#" title=""><img src="<c:url value="/resources/images/payment2.png"/>" alt="" /></a></li>
						<li><a href="#" title=""><img src="<c:url value="/resources/images/payment3.png"/>" alt="" /></a></li>
						<li><a href="#" title=""><img src="<c:url value="/resources/images/payment4.png"/>" alt="" /></a></li>
						<li><a href="#" title=""><img src="<c:url value="/resources/images/payment5.png"/>" alt="" /></a></li>
					</ul>
				</div>
			</div>

			<div class="col-md-6">
				<ul class="bottom-menu">
					<li><a href="#" title="">Shopping Cart</a></li>
					<li><a href="#" title="">Checkout</a></li>
					<li><a href="#" title="">My Account</a></li>
					<li><a href="#" title="">Contact Us</a></li>
				</ul>
			</div>

		</div>
	</div>
		<span>Supply 2014. Design by  <i>Themes.webinane</i>.</span>
</div>

</div>


<!-- Script -->

<script src="<%=request.getContextPath() %>/resources/js/jquery-1.10.2.js"></script><!-- Jquery -->
<script src="<%=request.getContextPath() %>/resources/js/script.js" ></script><!-- Common -->
<script type="text/javascript"  src= "<%=request.getContextPath() %>/resources/js/bootstrap.min.js"></script><!-- Bootstrap -->
<script type="text/javascript"  src= "<%=request.getContextPath() %>/resources/js/modernizr.js" ></script><!-- modernizr -->
<script type="text/javascript"  src= "<%=request.getContextPath() %>/resources/js/owl.carousel.min.js"></script><!-- Owl Carousal -->
<script type="text/javascript"  src= "<%=request.getContextPath() %>/resources/js/onscreen.js"></script><!-- On Screen -->

<script src= "<%=request.getContextPath() %>/resources/js/daterangepicker.js" ></script><!-- Date Range Picker -->
<script src= "<%=request.getContextPath() %>/resources/js/ion.rangeSlider.min.js"></script><!-- Range Slider -->


<!-- Range Slider -->	
<script>
    $(document).ready(function(){

        $("#range_1").ionRangeSlider({
            min: 0,
            max: 5000,
            from: 1000,
            to: 4000,
            type: 'double',
            step: 1,
            prefix: "$",
            prettify: true,
            hasGrid: true
        });
    });
</script>



<!-- SLIDER REVOLUTION -->
<script type="text/javascript" src= "<%=request.getContextPath() %>/resources/js/jquery.themepunch.plugins.min.js" ></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/resources/js/jquery.themepunch.revolution.min.js" ></script>


<script type="text/javascript">
	var revapi;
	jQuery(document).ready(function() {
	revapi = jQuery('.tp-banner').revolution(
	{
	delay:10000,
	startwidth:1170,
	startheight:533,
	autoHeight:"off",
	navigationType:"none",
	hideThumbs:10,
	fullWidth:"on",
	fullScreen:"off",
	fullScreenOffsetContainer: ""
	});
	});	
</script>

<script type="text/javascript">

	$(document).ready(function() {


	$(".footer-deal").owlCarousel({
	autoPlay :true,
	stopOnHover : true,
	goToFirstSpeed : 2000,
	slideSpeed:1500,
	singleItem : true,
	autoHeight : true,
	transitionStyle:"goDown",
	paginationNumbers:true
	});	

	$("#tab-recent").owlCarousel({
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

	$("#tab-popular").owlCarousel({
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
	var s = num+"";
	while (s.length < size) s = "0" + s;
	return s;
	}		


	});


</script>	

</body>
</html>