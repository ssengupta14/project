<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Administration</title>
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
				
				<c:forEach items="${admin.menus}" var ="menus">
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
					-->
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
							
			<ul class="language bar-dropdown">
				<li><a href="#" title=""><i class="fa fa-font"></i>English</a>
					<ul>
						<li><a href="#" title="">ENGLISH</a></li>
						<li><a href="#" title="">FRENCH</a></li>
						<li><a href="#" title="">ARABIC</a></li>
					</ul>
				</li>
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


				<c:forEach items="${homedpo.menus}" var ="menus">
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

	<header class="responsive-header">
		<div class="top-bar">
				
			<ul class="language bar-dropdown">
				<li><a href="#" title=""><i class="fa fa-font"></i>English</a>
					<ul>
						<li><a href="#" title="">ENGLISH</a></li>
						<li><a href="#" title="">FRENCH</a></li>
						<li><a href="#" title="">ARABIC</a></li>
					</ul>
				</li>
			</ul>
				
		</div>
		
		<Div class="logo">
			<a href="http://themes.webinane.com/shopping/" title="">
				<img src="images/logo.png" alt="" />
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
	
	
<section class="block" id="inner-head">
	<div class="fixed-img sec-bg4"></div>
	<div class="container">	
		<h1>Site Administration</h1>
	</div>
</section>

<section class="block">
	<div class="container">
		<div class="row">
			
				<table width=100%>
				<tr>
				<td width=600px>
				<div class="compare-with">
					<form:form method="post" enctype="multipart/form-data" modelAttribute="uploadedFile" action="/elenverve/upload">
						<label><b>Resources</b></label>
						<input name="resources" type="text" placeholder="" onclick="BrowseClick()" />
						<input type="submit" class="submit" value="Upload"/>						
					</form:form>
					<p>Upload new or modified resources for Menus, submenus, content modifications</p>
				</div>
				<div>"<strong>${fileMessage}</strong>"</div>
				</td>
				<td>
				<div class="compare-with">
					<form >
						<label><b>Products &nbsp; </b></label>
						<input type="text" placeholder="" />
						<input type="submit" class="submit" value="Upload" onclick="BrowseClick()"/>
					</form>
					<p>Upload products.csv for product modifications</p>
				</div>
				</td>
				</tr>
				<tr>
				<td>
								<div class="compare-with">
									<form>
										<label><b>Images &nbsp;&nbsp;&nbsp;&nbsp;</b></label>
										<input type="text" placeholder="" />
										<input type="submit" class="submit" value="Upload" />						
									</form>
									<p>Upload new or modified product, deals, offers or advertisement images</p>
								</div>
				</td>
				<td>
				
				<div class="compare-with">
									<form>
										<label><b>Offers &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </b></label>
										<input type="text" placeholder="" />
										<input type="submit" class="submit" value="Upload" />
									</form>
									<p>Upload new Daily, weeklu, special Deals,discounts or offers  </p>
								</div>
								</td>
				
				</tr>
				</table>
				
			
			

			
		</div>
	</div>
</section>

<section class="block remove-gap">
	<div class="container">
		<div class="row">
			<div class="col-md-4">
			</div>
			<div class="col-md-5">
							<div class="cart-total-box">
								<div class="cart-head">
									<h2 class="cart-product">Compare Elements</h2>
								</div>
								<ul>
									<li class="customlist">		
										<select>
										  <option>Resources</option>
										  <option>Products</option>
										  <option>Menus</option>
										  <option>Submenus</option>
										  <option>Main banner</option>
										  <option>Daily deal</option>
										  <option>Weekly deals</option>
										</select>
									</li>
									<li><a href="#" title="">Compare</a></li>
								</ul>
								
							</div>
			</div>
		</div>
		<div class="row">
		
			<div class="col-md-6">
				<div class="product-details">
					<h1>Existing</h1>
					<ul>
						<li><span>Color</span><p>Skin & White</p></li>
						<li><span>Color</span><p>Skin & White</p></li>
						<li><span>Color</span><p>Skin & White</p></li>
						<li><span>Color</span><p>Skin & White</p></li>
						<li><span>Color</span><p>Skin & White</p></li>
						<li><span>Color</span><p>Skin & White</p></li>
						<li><span>Color</span><p>Skin & White</p></li>
						<li><span>Color</span><p>Skin & White</p></li>
						<li><span>Color</span><p>Skin & White</p></li>
					</ul>
				</div>
			</div>
			
			<div class="col-md-6">
				<div class="product-details">
					<h1>New</h1>
					<ul>
						<li><span>Color</span><p>Skin & White</p></li>
						<li><span>Color</span><p>Skin & White</p></li>
						<li><span>Color</span><p>Skin & White</p></li>
						<li><span>Color</span><p>Skin & White</p></li>
						<li><span>Color</span><p>Skin & White</p></li>
						<li><span>Color</span><p>Skin & White</p></li>
						<li><span>Color</span><p>Skin & White</p></li>
						<li><span>Color</span><p>Skin & White</p></li>
						<li><span>Color</span><p>Skin & White</p></li>
					</ul>
				</div>
			</div>
			
		</div>
	</div>
</section>
		<section class="block remove-gap">
			<div class="container">
				<div class="row">
				<div class="col-md-4">
				</div>
					<div class="col-md-5">
					<div class="widget-body">
						<div class="heading-5">
							<h2>
								<i class="fa fa-folder-open"></i>Change Management
							</h2>
						</div>
						<div class="w-news-letter">
							<h3>Elements</h3>
							<form>
								<p>
									<input type="checkbox" id="topup1" class="w-news-letter" /><label
										for=topup1>Menus and Submenus</label>
								</p>
								<p>
									<input type="checkbox" id="topup2" class="w-news-letter" /><label
										for=topup2>Main Banner</label>
								</p>
								<p>
									<input type="checkbox" id="topup3" class="w-news-letter" /><label
										for=topup3>Daily Deals</label>
								</p>
								<p>
									<input type="checkbox" id="topup4" class="w-news-letter" /><label
										for=topup4>Weekly Deals</label>
								</p>
								<p>
									<input type="checkbox" id="topup5" class="w-news-letter" /><label
										for=topup5>Products</label>
								</p>
								<p>	<label 	for=topup>&nbsp;</label></p>
								<p>	<label 	for=topup>&nbsp;</label> </p>
								
								<p style="font-size:10px" "color:white">
									<input type="checkbox" id="topup10" class="w-news-letter" />
									<label for=topup10>I agree, as an administrator I completely understand the impact of these changes and take full responsibility of any potential issues caused due to these changes. I am willingly clicking the submit button and I am sure I want to continue with these changes and not tampering with the system for any personal/professional grudge or benefit.Consider this as my sign off to the changes </label>
								</p>
								<input type="text" placeholder="confirmation code" /> 
								<p>
								<input type="submit" class="submit" value="SUBMIT" />
								</p>
								<p>
								<input type="submit" class="submit" value="Send Confirmation code" />
								</p>	
							</form>
						</div>
					</div>
					</div>
				</div>
			</div>
		</section>


		
<footer class="block">
	<div class="container">
		
	</div>
</footer>

<div class="bottom-line">
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<Div class="payment-accept">
					
				</div>
			</div>
			
			<div class="col-md-6">
				
			</div>
			
		</div>
	</div>
	<span>Supply 2014. Design by  <i>Themes.webinane</i>.</span>
</div>


</div>
	
<!-- Script -->
	<script type="text/javascript"
		src="<c:url value="/resources/js/jquery-1.10.2.js"/>"></script>
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
		src="<%=request.getContextPath()%>/resources/js/tiny-carousal.js"></script>
	<!-- SLIDER REVOLUTION -->	
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/resources/js/jquery.themepunch.plugins.min.js"></script>
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/resources/js/jquery.themepunch.revolution.min.js"></script>
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
	
	$('#compare1').tinycarousel({ axis: 'y'});

	});


</script>

<Script language=JavaScript>


function BrowseClick(){
   var dialog = new ActiveXObject(‘MSComDlg.CommonDialog’);
   dialog.Filter = ‘All files (*.*)|*.*| ‘;
   dialog.MaxFileSize = 260;
   dialog.ShowOpen();
   document.forms[0]['resources'].value = dialog.FileName;
return false;}


</Script>	

</body>
</html>