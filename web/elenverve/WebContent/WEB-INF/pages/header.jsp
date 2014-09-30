<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Index</title>
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<meta name="_csrf" content="${_csrf.token}"/>
     <meta name="_csrf_header" content="${_csrf.headerName}"/>
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800|Raleway:400,300,600,700,500|Noto+Sans:400,700|Ubuntu:300,400,500,700'
		rel='stylesheet' type='text/css'>

	<!-- Styles -->
	<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" type="text/css" />
	<!-- Bootstrap -->
	<link rel="stylesheet" href="<c:url value="/resources/font-awesome-4.0.3/css/font-awesome.css"/>" type="text/css" />
	<!-- Font Awesome -->
	<link rel="stylesheet" href="<c:url value="/resources/css/owl.carousel.css"/>" type="text/css" />
	<!-- Owl Carousal -->	
	<link rel="stylesheet" href="<c:url value="/resources/css/animate.css"/>" type="text/css" />
	<!-- Animation -->
	<link rel="stylesheet" href="<c:url value="/resources/css/ion.rangeSlider.css"/>" />
	<!-- Range Slider -->
	<link rel="stylesheet" href="<c:url value="/resources/css/ion.rangeSlider.skinFlat.css"/>" />
	<!-- Range Slider -->	
	<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"	type="text/css" />
	<!-- Style -->
	<link rel="stylesheet" href="<c:url value="/resources/css/revolution.css"/>" media="screen" />
	<!-- Style -->
	<link rel="stylesheet" href="<c:url value="/resources/css/responsive.css"/>" type="text/css" />
	<!-- Responsive -->
	<!--<link rel="alternate stylesheet" type="text/css" href="<c:url value="/resources/css/orange.css"/>" title="orange" />-->
	<!-- Orange -->
	<link rel="stylesheet" type="text/css"	href="<c:url value="/resources/css/setting.css"/>" media="screen" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/mystyle.css"/>" media="screen" />
	<%-- <script type="text/javascript"	src="<c:url value="/resources/js/jquery-1.10.2.js"/>"></script> --%>
	<script type="text/javascript" src="<c:url value="/resources/js/jquery-1.11.0.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/jquery.leanModal.min.js"/>"></script>
	<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" />

</head>
<body>
	<div class="theme-layout">
		<header class="header2">
			<div class="container">
				<div class="top-bar">
					<!--  Support Phone number  -->
					<ul class="whishlist-bar bar-dropdown">
						<li><a href="#" title="">
							<i class="fa fa-phone"></i>&nbsp;&nbsp;24/7 Support: 123-456-7890</a>
						</li>
					</ul>
					<ul class="language bar-dropdown">
						<li>|<a href="#" title="">
							<i></i></a>
						</li>
					</ul>
					<!-- What ever person has shopped, is displayed in the shopping cart-->
					<ul class="shop-cart bar-dropdown">
						<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a>
							<c:if test="${shoppingCart.getItemCount() > 0 }">
								<ul>
									<c:forEach var="product" items="${shoppingCart.getShoppingCartProducts()}">
										<li>
											<span>
												<img src="http://placehold.it/50x50" alt="" />
											</span> 
											<a href="#" title="">${product.getProduct().getDetails().productName}</a> 
											<i>${product.getProduct().getDetails().initialPrice}</i>
											<div class="cart-bar-hover">
												<ul>
													<li><a href="#" title=""><i class="fa fa-cog"></i></a></li>
													<li><a href="#" title=""><i class="fa fa-trash-o"></i></a></li>
												</ul>
											</div>
										</li>									
									</c:forEach>
									<li>
										<h6>Total : ${shoppingCart.getTotalPriceInDollars()}</h6> 
										<a href="${contextPath}/elenverve/checkout" title="" class="checkout-btn">Checkout</a>
									</li>
								</ul>
							</c:if>
						</li>
					</ul>
					<!--  end of shopping cart -->
					<ul class="language bar-dropdown">
						<li>|<a href="#" title="">
							<i></i></a>
						</li>
					</ul>
					<!--  Language dropdown -->
					<ul class="language bar-dropdown">
						<li><a href="#" title=""><i class="fa fa-font"></i>English</a>
							<ul>
								<li><a href="#" title="">ENGLISH</a></li>
								<li><a href="#" title="">FRENCH</a></li>
								<li><a href="#" title="">ARABIC</a></li>
							</ul></li>
					</ul>

					<!--  end of language dropdown -->
					<ul class="language bar-dropdown">
						<li>|<a href="#" title="">
							<i></i></a>
						</li>
					</ul>
					<!--  Compare button  -->
					<ul class="compare-btn bar-dropdown">
						<li><a href="#" title=""><i class="fa fa-random"></i>Compare</a></li>
					</ul>
					<!--  end of compare button -->
					<ul class="language bar-dropdown">
						<li>|<a href="#" title="">
							<i></i></a>
						</li>
					</ul>
					<!--  wishlist button  -->
					<ul class="whishlist-bar bar-dropdown">
						<li><a href="#" title=""><i class="fa fa-heart"></i>Wishlist</a></li>
					</ul>
					<!--  end of wishlist button -->
					<ul class="language bar-dropdown">
						<li><a href="#" title="">
							<i></i></a>
						</li>
					</ul>
					<ul class="language bar-dropdown">
						<li><a href="#" title="">
							<i></i></a>
						</li>
					</ul>
					<security:authorize ifAllGranted="ROLE_USER">	
					<ul class="profile bar-dropdown">
						<li>
							<!-- <div id="links"></div> -->	
							<a><font style="font-weight: 600;font-family: open sans;color:#4d8cff;font-size: 14px;color:#898787">Hi!</font> &nbsp;<security:authentication property="principal.username"/></a>
						</li>						
					</ul>
					 </security:authorize>
				</div>
			</div>

			<nav>
				<div class="container">
					<!--  This is logo  -->
					<Div class="logo">
						<a href="/elenverve/" title=""> 
							<img src="<%=request.getContextPath()%>/resources/images/elenverve.png"	alt="" />
						</a>
					</div>
					<!--  This is the menu  -->
					<div class="menu">
						<ul>
							<c:forEach items="${model.menus}" var="menus">
								<li><a href="#" title="">${menus.displayName}</a>
									<ul>
										<c:forEach items="${menus.subMenu}" var="subMenus">
											<li><a href="${subMenus.href}" title="">${subMenus.displayName}</a></li>
										</c:forEach>
									</ul></li>
							</c:forEach>

							<li>			

								<div id="modal" class="popupContainer" style="display: none;"/>
							</li>
						</ul>
					</div>
					<div class="search-header">
						<form class="searchForm">
							<input type="text" placeholder="Search Here" />
							<a href="#" title=""><i class="fa fa-search"></i></a>
						</form>
					</div>
				</div>
			</nav>
		</header>
		<!--  end of menu  -->
		<header class="responsive-header">
			<div class="top-bar">
				<ul class="shop-cart bar-dropdown">
					<li>
						<a href="#" title=""><i class="fa fa-shopping-cart"></i></a>
						<ul>
							<li>
								<span><img src="http://placehold.it/50x50" alt="" /></span>
								<a href="#" title="">Short T-Shirt 2013</a> 
								<i>$360.00</i>
								<div class="cart-bar-hover">
									<ul>
										<li><a href="#" title=""><i class="fa fa-cog"></i></a></li>
										<li><a href="#" title=""><i class="fa fa-trash-o"></i></a></li>
									</ul>
								</div>
							</li>
							<li>
								<span><img src="http://placehold.it/50x50" alt="" /></span>
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
					<li>
						<a href="#" title=""><i class="fa fa-font">
						</i>English</a>
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
					<img src="<%=request.getContextPath()%>/resources/images/logo.png" alt="" />
				</a>
			</div>
			<div class="search-header">
				<form>
					<input type="text" placeholder="Search Here" />
					<a href="#"	title=""><i class="fa fa-search"></i></a>
				</form>
			</div>
			<div class="responsive-menu">
				<a class="menu-dropdown-btn" title="">MENU <i class="fa fa-align-justify"></i></a>
				<ul>
					<c:forEach items="${home.menus}" var="menus">
						<li><a href="#" title="">${menus.displayName}</a>
							<ul>
								<c:forEach items="${menus.subMenu}" var="subMenus">
									<li><a href="${subMenus.href}" title="">${subMenus.displayName}</a></li>
								</c:forEach>
							</ul>
						</li>
					</c:forEach>
				</ul>
			</div>
		</header>
	</div>
	<script type="text/javascript">

		function loadLinks() {
			
			var links = $("#links");
			links.load(
				'<c:url value="/links" />',
				function(responseText, textStatus, xhr) {
					
					if (xhr.status == 200) {
						$("#ajaxLogin").click(function() {
							loadLogin();
						});
					} else {
						links.html('<h4 style="color: #F00">Could not load URL "/links"</h4>');
						links.show();
					}
				});
		}
		 function loadLogin() {
			 $("#modal_trigger").leanModal({
					top : 200,
					overlay : 0.6,
					closeButton : ".modal_close"
				});
			/* $("#login").load(
				'<c:url value="/login" />',
				function(responseText, textStatus, xhr) {
					if (xhr.status == 200) {
						$("#login").dialog('open');
					} else {
						$("#login").html('<h4 style="color: #F00">Could not load URL "/login"</h4>');
					}
				}); */
		}; 
		$(document).ready(function() {
			loadLinks();
		});
	</script>
	<div id="login" style="display: none;" title="Login"></div>
</body>
</html>