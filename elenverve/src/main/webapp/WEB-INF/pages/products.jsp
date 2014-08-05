<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>
	<div class="theme-layout">
		<section class="block" id="inner-head">
			<div class="fixed-img sec-bg4"></div>
			<div class="container">
				<h1>PRODUCT PAGE</h1>
			</div>
		</section>
		<section class="block">
	<div class="container">
		<div class="row">
			<div class="col-md-9">
				<div class="masonary-post">	
					<div id="masonay-nav">
						<ul>
							<li><a href="" data-filter="*" class="active">All</a></li>
							<li><a href="" data-filter=".cat1">Jacket</a></li>
							<li><a href="" data-filter=".cat2">Shirt</a></li>
							<li><a href="" data-filter=".cat3">Dresses</a></li>
							<li><a href="" data-filter=".cat4">Jewellery</a></li>
						</ul>
					</div>
				
					<!--  <div id="masonary-content" class="row"> -->
						<div class="row">
						<do:forLoop var="i" from ="1" to="3" step="1">
						
						<!-- <div class="cat1 cat3 col-md-4 inner-products"> -->
							<div class="col-md-4 inner-products">
							<c:forEach items="${prodList}" var ="prod"> 
							<div class="best-seller most-sold">
								<div class="sold-thumb">
									<!--  <img alt="" src="http://placehold.it/248x273">-->
									<img src="<%=request.getContextPath() %>${prod.imgUrl}" alt="">
										<c:if test="${prod.detailLinkInd >0}">	
											<a href="single-post.html" title="">VIEW DETAILS</a>
										</c:if>
									<i class="box1"></i>
									<i class="box2"></i>
									<i class="box3"></i>
									<i class="box4"></i>
								</div>
													
								<!--  <h3>BEST KIDS DESIGN 2014</h3> -->
								<h3>${prod.name}</h3>
								
								<ul class="tooltip-btn">
									<!-- 
									<li class="cart"><a href="#" title=""><i class="fa fa-heart"></i></a></li>
									<li class="shop"><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
									-->
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
								<a href="#" title="">DETAILS</a>
								<c:if test="${prod.isNew >0}"> 
									<h6>NEW</h6>
								</c:if>
								<!--  <span><i>$360</i>$460</span> -->
								<span><i>${prod.currInd}${prod.originalPrice}</i>${prod.currInd}${prod.finalPrice}</span>
							</div>
							</c:forEach>
						</div>
						 </do:forLoop>
						 <!--
						<div class="cat1 col-md-4 inner-products">
							<div class="best-seller most-sold">
								<div class="sold-thumb"><img alt="" src="http://placehold.it/248x273"><a href="single-post.html" title="">VIEW DETAILS</a>
									<i class="box1"></i>
									<i class="box2"></i>
									<i class="box3"></i>
									<i class="box4"></i>
								</div>					
								<h3>BEST KIDS DESIGN 2014</h3>
								
								<ul class="tooltip-btn">
									<li class="cart"><a href="#" title=""><i class="fa fa-heart"></i></a></li>
									<li class="shop"><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
								</ul>
								<a href="#" title="">DETAILS</a>
								<span><i>$360</i>$460</span>
							</div>
						</div>
						 
						<div class="cat2 cat3 col-md-4 inner-products">
							<div class="best-seller most-sold">
								<div class="sold-thumb"><img alt="" src="http://placehold.it/248x273"><a href="single-post.html" title="">VIEW DETAILS</a>
									<i class="box1"></i>
									<i class="box2"></i>
									<i class="box3"></i>
									<i class="box4"></i>
								</div>					
								<h3>BEST KIDS DESIGN 2014</h3>
								
								<ul class="tooltip-btn">
									<li class="cart"><a href="#" title=""><i class="fa fa-heart"></i></a></li>
									<li class="shop"><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
								</ul>
								<a href="#" title="">DETAILS</a>
								<span><i>$360</i>$460</span>
							</div>
						</div>
						 
						<div class="cat1 col-md-4 inner-products">
							<div class="best-seller most-sold ">
								<div class="sold-thumb"><img alt="" src="http://placehold.it/248x273"><a href="single-post.html" title="">VIEW DETAILS</a>
									<i class="box1"></i>
									<i class="box2"></i>
									<i class="box3"></i>
									<i class="box4"></i>
								</div>					
								<h3>BEST KIDS DESIGN 2014</h3>
								
								<ul class="tooltip-btn">
									<li class="cart"><a href="#" title=""><i class="fa fa-heart"></i></a></li>
									<li class="shop"><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
								</ul>
								<a href="#" title="">DETAILS</a>
								<span><i>$360</i>$460</span>
							</div>
						</div>
						
						<div class="cat4 col-md-4 inner-products">
							<div class="best-seller most-sold">
								<div class="sold-thumb"><img alt="" src="http://placehold.it/248x273"><a href="single-post.html" title="">VIEW DETAILS</a>
									<i class="box1"></i>
									<i class="box2"></i>
									<i class="box3"></i>
									<i class="box4"></i>
								</div>					
								<h3>BEST KIDS DESIGN 2014</h3>
								
								<ul class="tooltip-btn">
									<li class="cart"><a href="#" title=""><i class="fa fa-heart"></i></a></li>
									<li class="shop"><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
								</ul>
								<a href="#" title="">DETAILS</a>
								<span><i>$360</i>$460</span>
							</div>
						</div>
						
						<div class="cat2 col-md-4 inner-products">
							<div class="best-seller most-sold">
								<div class="sold-thumb"><img alt="" src="http://placehold.it/248x273"><a href="single-post.html" title="">VIEW DETAILS</a>
									<i class="box1"></i>
									<i class="box2"></i>
									<i class="box3"></i>
									<i class="box4"></i>
								</div>					
								<h3>BEST KIDS DESIGN 2014</h3>
								
								<ul class="tooltip-btn">
									<li class="cart"><a href="#" title=""><i class="fa fa-heart"></i></a></li>
									<li class="shop"><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
								</ul>
								<a href="#" title="">DETAILS</a>
								<span><i>$360</i>$460</span>
							</div>
						</div>
						 
						<div class="cat2 cat3 col-md-4 inner-products">
							<div class="best-seller most-sold">
								<div class="sold-thumb"><img alt="" src="http://placehold.it/248x273"><a href="single-post.html" title="">VIEW DETAILS</a>
									<i class="box1"></i>
									<i class="box2"></i>
									<i class="box3"></i>
									<i class="box4"></i>
								</div>					
								<h3>BEST KIDS DESIGN 2014</h3>
								
								<ul class="tooltip-btn">
									<li class="cart"><a href="#" title=""><i class="fa fa-heart"></i></a></li>
									<li class="shop"><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
								</ul>
								<a href="#" title="">DETAILS</a>
								<span><i>$360</i>$460</span>
							</div>
						</div>
						 
						<div class="cat1 col-md-4 inner-products">
							<div class="best-seller most-sold">
								<div class="sold-thumb"><img alt="" src="http://placehold.it/248x273"><a href="single-post.html" title="">VIEW DETAILS</a>
									<i class="box1"></i>
									<i class="box2"></i>
									<i class="box3"></i>
									<i class="box4"></i>
								</div>					
								<h3>BEST KIDS DESIGN 2014</h3>
								
								<ul class="tooltip-btn">
									<li class="cart"><a href="#" title=""><i class="fa fa-heart"></i></a></li>
									<li class="shop"><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
								</ul>
								<a href="#" title="">DETAILS</a>
								<span><i>$360</i>$460</span>
							</div>
						</div>
						 
						<div class="cat4 cat3 col-md-4 inner-products">
							<div class="best-seller most-sold">
								<div class="sold-thumb"><img alt="" src="http://placehold.it/248x273"><a href="single-post.html" title="">VIEW DETAILS</a>
									<i class="box1"></i>
									<i class="box2"></i>
									<i class="box3"></i>
									<i class="box4"></i>
								</div>					
								<h3>BEST KIDS DESIGN 2014</h3>
								
								<ul class="tooltip-btn">
									<li class="cart"><a href="#" title=""><i class="fa fa-heart"></i></a></li>
									<li class="shop"><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
								</ul>
								<a href="#" title="">DETAILS</a>
								<span><i>$360</i>$460</span>
							</div>
						</div>
						-->
					</div>
		
				</div>
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
			
		</div>
	</div>
</section>
	</div>

</body>
</html>