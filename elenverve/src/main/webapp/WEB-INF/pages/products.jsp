<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta name="_csrf" content="${_csrf.token}"/>
<meta name="_csrf_header" content="${_csrf.headerName}"/>

</head>
<body>
	${_csrf.headerName} &nbsp;&nbsp;&nbsp;&nbsp; ${_csrf.token}
	

	<div class="theme-layout">
		<!--
		<section class="block" id="inner-head">
			<div class="fixed-img sec-bg4"></div>
			<div class="container">
				<h1>PRODUCT PAGE</h1>
			</div>
		</section>
			-->
		<section class="block"  style="padding:15px;">
			<div class="container">
					
				<div class="col-md-3">
					<!--<img src="<%=request.getContextPath() %>/images/prod-banner-top.jpg" alt="" style="height:auto; width:auto; max-width:500px; max-height:300px;">-->				
				</div>
				<div class="col-md-8">
					<img src="<%=request.getContextPath() %>/images/prod-banner-top.jpg" alt="" style="height:auto; width:auto; max-width:500px; max-height:300px;">				
				</div>
				
				<div class="col-md-1">
				</div>
				 
			</div>
			</div>
		</section>
	<section class="block" style="padding:0px;">
	
	<div class="product-nav-bar">
	   <div class="row">
		<div class="col-md-2">
			
		</div>
		<div class="col-md-5">
				<ul id="mybreadcrumb">
					<li><a href="#"><i class="fa fa-home"></i></a></li>
					<li><i class="fa fa-chevron-right"></i></li>
					<li><a href="#">Artwork</a></li> 
					<li><i class="fa fa-chevron-right"></i></li> 
       					<li><a href="#">Canvas</a></li>  
					<li><i class="fa fa-chevron-right"></i></li>
        				<li><a href="#" class="current">Canvases</a></li> 
    				</ul> 
		</div>
		<div class="col-md-2">
			<ul id="mybreadcrumb">
				<li>Sort by :</li>
				<li>
					<label> 
						<select>
							<option value="volvo">Relevence</option>
							<option value="volvo">Added recently</option>
							<option value="saab">Popularity</option>
							<option value="mercedes">Price: Low to high</option>
							<option value="audi">Price: High to low</option>
							<option value="audi">Review & Rating</option>
						</select>
					</label>					
				</li>
				
			</ul>
			
			
		</div>
		<div class="col-md-3">
		</div>
		
	   </div>	
		
	</div>		
	</section>	
	<section class="block">
	<div class="container">
		<div class="row">

		<div class="col-md-2">
				<aside>
					<div class="categories-widget widget-body">
						<div class="heading-5">
							<h2>Shop by Category</h2>
						</div>
						<ul class="goo-collapsible">
						
						<c:forEach items="${model.menus}" var="menus">
								<li class="dropdown"><a  href="#" name="activia" id="activia" class="active" > ${menus.displayName}</a>
								<!--<li><a href="#" title="">${menus.displayName}</a> -->
									<ul>
										<c:forEach items="${menus.subMenu}" var="subMenus">
											<li><a href="${subMenus.href}" title="">${subMenus.displayName}</a></li>
										</c:forEach>
									</ul></li>
							</c:forEach>
							<!-- 
							<li class="dropdown"><a  href="#" name="activia" id="activia" class="active" > Tables</a>

								<ul>

									<li><a href="#" >Content</a></li>

									<li><a href="#" style="color:#F0B70C;">Comments</a></li>

									<li><a href="#">Tags</a></li>

								</ul></li>

							<li><a href="#">Folder</a></li>

							<li class="dropdown"><a href="#"> Users</a>

								<ul>

									<li><a href="#">Group</a></li>

									<li><a href="#">User</a></li>

								</ul></li>

							<li><a href="#"> Settings</a></li>
							-->
						</ul>
					
					</div>
					<div class="categories-widget widget-head"></div>
					<div id="masonay-nav" class="categories-widget widget-body">
						<div class="heading-5">
							<h2>Refine Search by</h2>
						</div>
						<div class="featured_services_find">
       							 <h1 class="result_count"></h1>
        						 <div class="featured_list_find" id="service_list"></div>
     						</div>
						
						<ul class="goo-collapsible">

							<li class="dropdown"><a  href="#" name="activia" id="activia" class="active" > Price</a>

								<ul>

									<li><a href="" data-filter=".cat1">Under $50<span class="test"></span></a></li>
									 <input type="hidden" id="price_filter" value="0-50"/>
									<li><a href="" data-filter="*" class="active">$50 to $300</a></li>
									 <input type="hidden" id="price_filter" value="50-300"/>	
									<li><a href="" data-filter=".cat2">$300 and Above</a></li>
									 <input type="hidden" id="price_filter" value="300-10000"/>

								</ul>
							 </li>
							<li class="dropdown"><a  href="#" name="activia" id="activia" class="active" > Features</a>

								<ul>

									<input type="hidden" id="price_filter" value="0-50"/>
									<li><a href="#" >$50 to $300</a></li>
									 <input type="hidden" id="price_filter" value="50-300"/>	
									<li><a href="#">$300 and Above</a></li>
									 <input type="hidden" id="price_filter" value="300-10000"/>

								</ul>
							 </li>

							<li><a href="#">Folder</a></li>

							<li class="dropdown"><a href="#"> Users</a>

								<ul>

									<li><a href="#">Group</a></li>

									<li><a href="#">User</a></li>

								</ul></li>

							<li><a href="#"> Settings</a></li>

						</ul>
						<!-- 
						<ul>
							<li><i></i><a href="#" title="">T-Shirts</a> 
								<span>18</span>
									
							</li>
								
							<li><i></i><a href="#" title="">Jeans Paints </a><span>10</span></li>
							<li><i></i><a href="#" title="">Western Shoes </a><span>16</span></li>
							<li><i></i><a href="#" title="">Kids Special</a> <span>20</span></li>
						</ul>
						-->
					</div>
					<div class="categories-widget widget-head"></div>
					<div class="heading-5">
						<h2>Shop Deals</h2>
					</div>
					<div class="product-tab">	
					  
						<div class="tab-content" id="dealsTabContent">
							<div id="recent" class="tab-pane fade in active">
								<div class="tab-recent" id="tab-deals">
									<ul>
										<li><span>
											<img src="<%=request.getContextPath() %>/images/product-tab.jpg" alt="">	
											<!--<img src="http://placehold.it/85x106" alt="" /> -->
										    </span>
											<h3><a href="#" title="">Envato‚??s Most Wanted: BuddyPress</a></h3>
											<p>Lorem ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>
										
										<li><span>
											<!--<img src="http://placehold.it/85x106" alt="" /> -->
										   <img src="<%=request.getContextPath() %>/images/product-tab2.jpg" alt=""> 
										   </span>
											<h3><a href="#" title="">Envato‚??s Most Wanted: BuddyPress</a></h3>
											<p>Lorem ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>
										
									</ul>
									
									<ul>
										<li><span>
											<!--<img src="http://placehold.it/85x106" alt="" />-->
											<img src="<%=request.getContextPath() %>/images/product-tab3.jpg" alt="">
										</span>
											<h3><a href="#" title="">Envato‚??s Most Wanted: BuddyPress</a></h3>
											<p>Lorem ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>
										
										<li><span>
											<!--<img src="http://placehold.it/85x106" alt="" />-->
											<img src="<%=request.getContextPath() %>/images/product-tab4.jpg" alt="">
										   </span>
											<h3><a href="#" title="">Envato‚??s Most Wanted: BuddyPress</a></h3>
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
					<!-- Left side 3rd party advertisement -->
					<div class="categories-widget widget-head"></div>
					<div class="product-tab">
						 <img src="<%=request.getContextPath() %>/images/adv-vert-1.png" alt="">
					</div>
				</aside>
			</div>
			<div class="col-md-8">
				<div class="masonary-post">	
					
						
						<div id="masonary-content" class="row">
						<c:set var="factor" value="0" scope="page" />
						<c:set var="counter" value="0" scope="page" />
						<c:set var="maxItems" value="${model.maxItems}" scope="page" />	
						<c:if test="model.productDvos.size() < maxItems">
							<c:set var="maxItems" value="model.productDvos.size()" scope="page" />
						</c:if>		
						<c:forEach begin="1" end="${maxItems}" varStatus="loop" var="row">
							<c:if test="${row>1}">
								<c:set var="factor" value="${counter}" scope="page" />
							</c:if>	
							<div class="cat1 cat3 col-md-4 inner-products">
							<c:forEach begin="1" end="3" varStatus="loop" var="column">
							<c:set var="value" value="0" scope="page" />
							<c:choose>
								<c:when test="${row>1}">
									<c:set var="value" value="${column+factor}" scope="page" />
								</c:when>
								<c:otherwise>
									<c:set var="value" value="${column}" scope="page" />
								</c:otherwise>
							</c:choose>
							
							<div class="best-seller most-sold">
								<div class="sold-thumb">
									<!--  <img alt="" src="http://placehold.it/248x273">-->
									
									<img src="<%=request.getContextPath() %>${model.productDvos.get(value-1).details.imageUrls.get(0)}" alt="">
								<c:if test="${model.productDvos.get(value-1).details.newInd == true}"> 
									<div class="new"></div>
								</c:if>
								<c:if test="${model.productDvos.get(value-1).details.inStock == false}"> 
									<div class="outOfStock"></div>
								</c:if>
									<div class="bestSeller"></div>			
									<span>
									<ul class="features-btn">
										<li class="arrival"><i class="fa fa-bolt"></i></li>
										<li class="shipping"><i class="fa fa-truck"></i></li>	
										<li class="rewards"><i class="fa fa-trophy"></i></li>
										<li class="gift"><i class="fa fa-gift"></i></li>
									</ul>
									</span>
									
									
									
									
									<ul class="details">
										<li class="view"><a href="single-post.html" title=""><i class="fa fa-eye"></i>&nbsp;VIEW DETAILS</a></li>
										<li class="view"><a href="single-post.html" title=""><i class="fa fa-shopping-cart"></i>&nbsp;QUICK BUY</a></li>
									</ul>
									<i class="box1"></i>
									<i class="box2"></i>
									<i class="box3"></i>
									<i class="box4"></i>
									<!--  <h3>BEST KIDS DESIGN 2014</h3> -->
									
								</div>
									<span><a href="">Gifts & Decor Artisan Deco Bowl and Ball Centerpiece
								${model.productDvos.get(value-1).details.productName}</a></span>
								

								<ul class="tooltip-btn">
									<!-- 
									<li class="cart"><a href="#" title=""><i class="fa fa-heart"></i></a></li>
									<li class="shop"><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
									-->
								<li class="shop"><a title="" href="#"><i class="fa fa-heart"></i></a></li>
								<li class="cart"><a title="" href="${contextPath}/elenverve/addToCart?productId=${model.productDvos.get(value-1).productId}"><i class="fa fa-shopping-cart"></i></a></li>						
								</ul>
								<ul class="tooltip-btn-left">
									<!-- 
									<li class="cart"><a href="#" title=""><i class="fa fa-heart"></i></a></li>
									<li class="shop"><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
									-->
										
								<span><i>$${model.productDvos.get(value-1).details.initialPrice}</i></span>
								<span>$${model.productDvos.get(value-1).details.finalPrice} USD</span>

								</ul>
								<a href="#" title="">DETAILS</a>
								
								<!--  <span><i>$360</i>$460</span> -->
								
								<ul>
									
								</ul>
							</div>
								<c:set var="counter" value="${counter+1}" scope="page" />
							</c:forEach>
						</div>
						 </c:forEach>
					</div>
		
				</div>
				<div class="custom-pagination">
					<ul>
						<li><a href="#" title=""><i class="fa fa-chevron-left"><span>Previous</span></i></a></li>
						<li><a href="#" title="">1</a></li>
						<li><a href="#" title="">2</a></li>
						<li><a href="#" title=""><span>Next</span> <i class="fa fa-chevron-right"></i></a></li>	
					</ul>
					
					<ul id="mybreadcrumb">
						<li>Show on page :</li>
					<li>
						<label> 
							<select>
								<option value="volvo"> 15 Items</option>
								<option value="volvo">25 Items</option>
								<option value="saab">50 Items</option>
								<option value="mercedes">All Items at once </option>
							</select>
						</label>					
					</li>
				
					</ul>
					
					
				</div>
				
			</div>
			<div class="col-md-2">
				<aside>
					<div class="categories-widget widget-body">
					<div class="heading-5">
						<h2>Shop by Popularity</h2>
					</div>
					<div class="product-tab">	
					  
						<div class="tab-content" id="myTabContent">
							<div id="recent" class="tab-pane fade in active">
								<div class="tab-recent" id="tab-recent">
									<ul>
										<li><span>
											 <!--<img src="http://placehold.it/85x106" alt="" />-->
											<img src="<%=request.getContextPath() %>/images/product-tab.jpg" alt="">
										    </span>
											<h3><a href="#" title="">Envato‚??s Most Wanted: BuddyPress</a></h3>
											<p>Lorem ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>
										
										<li><span>
											<!--<img src="http://placehold.it/85x106" alt="" />-->
											<img src="<%=request.getContextPath() %>/images/product-tab2.jpg" alt="">
										</span>
											<h3><a href="#" title="">Envato‚??s Most Wanted: BuddyPress</a></h3>
											<p>Lorem ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>
										
										
									</ul>
									
									<ul>
										<li><span>
											<!--<img src="http://placehold.it/85x106" alt="" /> -->
										       <img src="<%=request.getContextPath() %>/images/product-tab4.jpg" alt="">
 										   </span>
											<h3><a href="#" title="">Envato‚??s Most Wanted: BuddyPress</a></h3>
											<p>Lorem ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>
										
										<li><span>
											<!--<img src="http://placehold.it/85x106" alt="" />-->
											<img src="<%=request.getContextPath() %>/images/product-tab5.jpg" alt="">
										    </span>
											<h3><a href="#" title="">Envato‚??s Most Wanted: BuddyPress</a></h3>
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
											<h3><a href="#" title="">Envato‚??s Most Wanted: BuddyPress</a></h3>
											<p>Lorem ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>
										
										<li><span><img src="http://placehold.it/85x106" alt="" /></span>
											<h3><a href="#" title="">Envato‚??s Most Wanted: BuddyPress</a></h3>
											<p>Lorem ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>
										
										
									</ul>
									
									<ul>
										<li><span><img src="http://placehold.it/85x106" alt="" /></span>
											<h3><a href="#" title="">Envato‚??s Most Wanted: BuddyPress</a></h3>
											<p>Lor ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>
										
										<li><span><img src="http://placehold.it/85x106" alt="" /></span>
											<h3><a href="#" title="">Envato‚??s Most Wanted: BuddyPress</a></h3>
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
					</div>
					<div class="categories-widget widget-head"></div>					
					<!-- Recent User Search -->
					
					<div class="categories-widget widget-body">
					<div class="heading-5">
						<h2>Recently Viewed</h2>
					</div>
					<div class="product-tab">	
					  
						<div class="tab-content" id="myTabContent">
							<div id="recent" class="tab-pane fade in active">
								<div class="tab-recent" id="tab-recently-viewed">
									<ul>
										<li><span>
											 <!--<img src="http://placehold.it/85x106" alt="" />-->
											<img src="<%=request.getContextPath() %>/images/product-tab.jpg" alt="">
										    </span>
											<h3><a href="#" title="">Envato‚??s Most Wanted: BuddyPress</a></h3>
											<p>Lorem ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>
										
										<li><span>
											<!--<img src="http://placehold.it/85x106" alt="" />-->
											<img src="<%=request.getContextPath() %>/images/product-tab2.jpg" alt="">
										</span>
											<h3><a href="#" title="">Envato‚??s Most Wanted: BuddyPress</a></h3>
											<p>Lorem ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>
										
										
									</ul>
									
									<ul>
										<li><span>
											<!--<img src="http://placehold.it/85x106" alt="" /> -->
										       <img src="<%=request.getContextPath() %>/images/product-tab4.jpg" alt="">
 										   </span>
											<h3><a href="#" title="">Envato‚??s Most Wanted: BuddyPress</a></h3>
											<p>Lorem ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>
										
										<li><span>
											<!--<img src="http://placehold.it/85x106" alt="" />-->
											<img src="<%=request.getContextPath() %>/images/product-tab5.jpg" alt="">
										    </span>
											<h3><a href="#" title="">Envato‚??s Most Wanted: BuddyPress</a></h3>
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
											<h3><a href="#" title="">Envato‚??s Most Wanted: BuddyPress</a></h3>
											<p>Lorem ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>
										
										<li><span><img src="http://placehold.it/85x106" alt="" /></span>
											<h3><a href="#" title="">Envato‚??s Most Wanted: BuddyPress</a></h3>
											<p>Lorem ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>
										
										<li><span><img src="http://placehold.it/85x106" alt="" /></span>
											<h3><a href="#" title="">Envato‚??s Most Wanted: BuddyPress</a></h3>
											<p>Lorem ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>
									</ul>
									
									<ul>
										<li><span><img src="http://placehold.it/85x106" alt="" /></span>
											<h3><a href="#" title="">Envato‚??s Most Wanted: BuddyPress</a></h3>
											<p>Lor ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>
										
										<li><span><img src="http://placehold.it/85x106" alt="" /></span>
											<h3><a href="#" title="">Envato‚??s Most Wanted: BuddyPress</a></h3>
											<p>Lorem ipsum dolor sit ame, consectetur adipiscing</p>
											<ul>
												<li><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title=""><i class="fa fa-heart"></i></a></li>
											</ul>
										</li>
										
										<li><span><img src="http://placehold.it/85x106" alt="" /></span>
											<h3><a href="#" title="">Envato‚??s Most Wanted: BuddyPress</a></h3>
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
					</div> 

					<!-- Right side 3rd party advertisement -->				
					<div class="categories-widget widget-head"></div>
					<div class="product-tab">
						 <img src="<%=request.getContextPath() %>/images/ad-vert-2.png" alt="">
					</div>

					

				</aside>
			</div>

			
		</div>
	</div>
</section>
	</div>

</body>
<script type="text/javascript">
	$("#toggle").click(function() {$(this).toggleClass( "active")});
</script>
	
<script type="text/javascript">
	$(function () {
    /*-------------------- EXPANDABLE PANELS ----------------------*/
    var panelspeed = 500; //panel animate speed in milliseconds
    var totalpanels = 3; //total number of collapsible panels   
    var defaultopenpanel = 1; //leave 0 for no panel open   
    var accordian = false; //set panels to behave like an accordian, with one panel only ever open at once      

    var panelheight = new Array();
    var currentpanel = defaultopenpanel;
    var iconheight = parseInt($('.icon-close-open').css('height'));

    //Side navigation
	function navMenu() {
		$("*[name='activia']").removeClass("active");
		$("*[name='activia']").next("ul").slideDown(350);
		
    	}
	window.onload = navMenu;
	$(".goo-collapsible > li > a").on("click", function(e) {
			//if submenu is hidden, does not have active class 

			if (!$(this).hasClass("active")) {
				// hide any open menus and remove active classes
				$(".goo-collapsible li ul").slideUp(350);
				$(".goo-collapsible li a").removeClass("active");
				// open submenu and add the active class
				$(this).next("ul").slideDown(350);
				$(this).addClass("active");
				//if submenu is visible   
			} else if ($(this).hasClass("active")) {
				//hide submenu and remove active class
				$(this).removeClass("active");
				$(this).next("ul").slideUp(350);
			}
		});

		//Initialise collapsible panels
		function panelinit() {
			for (var i = 1; i <= totalpanels; i++) {
				panelheight[i] = parseInt($('#cp-' + i).find(
						'.expandable-panel-content').css('height'));
				$('#cp-' + i).find('.expandable-panel-content').css(
						'margin-top', -panelheight[i]);
				if (defaultopenpanel == i) {
					$('#cp-' + i).find('.icon-close-open').css(
							'background-position', '0px -' + iconheight + 'px');
					$('#cp-' + i).find('.expandable-panel-content').css(
							'margin-top', 0);
				}
			}
		}

		$('.expandable-panel-heading')
				.click(
						function() {
							var obj = $(this).next();
							var objid = parseInt($(this).parent().attr('ID')
									.substr(3, 2));
							currentpanel = objid;
							if (accordian == true) {
								resetpanels();
							}

							if (parseInt(obj.css('margin-top')) <= (panelheight[objid] * -1)) {
								obj.clearQueue();
								obj.stop();
								obj.prev().find('.icon-close-open').css(
										'background-position',
										'0px -' + iconheight + 'px');
								obj.animate({
									'margin-top' : 0
								}, panelspeed);
							} else {
								obj.clearQueue();
								obj.stop();
								obj.prev().find('.icon-close-open').css(
										'background-position', '0px 0px');
								obj.animate({
									'margin-top' : (panelheight[objid] * -1)
								}, panelspeed);
							}
						});

		function resetpanels() {
			for (var i = 1; i <= totalpanels; i++) {
				if (currentpanel != i) {
					$('#cp-' + i).find('.icon-close-open').css(
							'background-position', '0px 0px');
					$('#cp-' + i).find('.expandable-panel-content').animate({
						'margin-top' : -panelheight[i]
					}, panelspeed);
				}
			}
		}

		// run once window has loaded    
		panelinit();

	});
</script>
</html>
