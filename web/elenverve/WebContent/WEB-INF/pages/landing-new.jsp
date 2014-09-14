<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<body>
	<div class="theme-layout">
	
	<div class="tp-banner-container">
		<div class="tp-banner" >
	
			<ul>
				${model.banner}
			</ul>
		</div>
	</div>

<Section class="block">
	
	<Div class="container">
	<div class="heading1">
		<h2>Featured <i>COLLECTIONS </i></h2>
		<span>BRAND FOR EVERY STYLE. FIND YOURS.</span>
	</div>	
		
	<div id="best-seller1">	
		<c:forEach begin="1" end="2" varStatus="loop" var ="row">
		<div class="row">
			<c:forEach begin="1" end="4" varStatus="loop" var ="column">
			<div class="col-md-3">
				
				<div class="best-seller1 seller9">
					<img class="seller-still" alt="" src="${model.collections.get(row*column).image}">
					<img class="seller-hover" alt="" src="${model.collections.get(row*column).image}">
					<h3>${model.collections.get(row*column).collectionName}</h3>
					
					<ul class="tooltip-btn">
						<li class="cart"><a href="#" title=""><i class="fa fa-heart"></i></a></li>
						<li class="shop"><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
						
						
					</ul>
					<span><i>${counter1}</i>${counter2}</span>
				</div>
			</div>
			</c:forEach>			
		</div>
		</c:forEach>
		
		
	</div>
	</div>
</section>	
<Section class="block">
<div class="heading7">
	<h2><i>SHOP BY OUR EXCLUSIVE CATEGORIES</i></h2>
	<span>Great products on affordable prices for the best shopping experience ever</span>
</div>	
	
	<Div class="container">
		
		<div class="fixed-img sec-bg7"></div>
	
	<div id="best-seller">	
	
		<c:forEach begin="1" end="2" varStatus="loop" var ="row">
		<div class="row">
			<c:forEach begin="1" end="4" varStatus="loop" var ="column">
			<div class="col-md-3">
				
				<div class="best-seller seller2">
					<img class="seller-still" alt="" src="${model.categories.get(row*column).image}">
					<img class="seller-hover" alt="" src="${model.categories.get(row*column).image}">
					<h3>${model.categories.get(row*column).categoryName}</h3>
					
					<ul class="tooltip-btn">
						<li class="cart"><a href="#" title=""><i class="fa fa-heart"></i></a></li>
						<li class="shop"><a href="#" title=""><i class="fa fa-shopping-cart"></i></a></li>
						
						
					</ul>
					<span><i>${counter1}</i>${counter2}</span>
				</div>
			</div>
			</c:forEach>			
		</div>
		</c:forEach>
		
		
	</div>
	</div>
	</section>
	
		<section class="block">
				<div class="container">
					<div class="row">
						
						<div class="latest-deal">
						<h3>
						And there's <i>more !!</i> 
						</h3>
						<p>Find your favorite sale here. We provide you best deals on the products that you love the most  </p>
						
					</div>			
	
					</div>
				</div>
			</section>

	</section>

		<section class="block">
			<div class="container">
				<div class="row">
					
					<div class="col-md-6">
						${model.weeklyDeal}
					</div>
					<div class="col-md-6">
				<div class="heading1">
					<h2><i>What's  </i>Hot</h2>
					<span>BRAND FOR EVERY STYLE.</span>
				</div>
				<a href="#" title=""><img src="<%=request.getContextPath()%>/resources/images/deal-week.jpg"	alt="" />
			</div>
					

				</div>
			</div>
		</section>


<section class="block remove-gap">
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<div class="heading1">
					<h2><i>IN STORE </i>NOW</h2>
					<span>BRAND FOR EVERY STYLE.</span>
				</div>
				<Div class="row">	
					<div class="col-md-12">
								<div class="instore-deal">
									<!--<img src="http://placehold.it/180x150" alt="" /> -->
									<div class="instore-deals">
										<a href="#" title=""> 
											<img src="<%=request.getContextPath()%>/resources/images/brands1.jpg"
											alt="" /> 
											<span>30% <i>Off</i></span></a> <a href="#" title="">
											<!--<img src="http://placehold.it/85x123" alt="" /> --> 
											<img src="<%=request.getContextPath()%>/resources/images/footer-deal2.jpg"
											alt="" /> <span>Shop <i>Now</i></span>
										</a> <a href="#" title="">
											<!--<img src="http://placehold.it/85x123"
															alt="" />--> <img
											src="<%=request.getContextPath()%>/resources/images/brands2.jpg"
											alt="" /> <span>30% <i>Off</i></span>
										</a> <a href="#" title=""> <!--<img
															src="http://placehold.it/85x123" alt="" /> --> <img
											src="<%=request.getContextPath()%>/resources/images/brands3.jpg"
											alt="" /> <span>30% <i>Off</i></span></a> <a href="#" title="">
											<!--<img src="http://placehold.it/85x123"
															alt="" /> --> <img
											src="<%=request.getContextPath()%>/resources/images/brands4.jpg"
											alt="" /> <span>30% <i>Off</i></span>
										</a> <a href="#" title=""> <!--<img
															src="http://placehold.it/85x123" alt="" /> --> <img
											src="<%=request.getContextPath()%>/resources/images/footer-deal6.jpg"
											alt="" /> <span>30% <i>Off</i></span></a>
									</div>

									<div class="instore-deals">
										<a href="#" title=""> <!--<img src="http://placehold.it/85x123" alt="" /> -->
											<img
											src="<%=request.getContextPath()%>/resources/images/footer-deal.jpg"
											alt="" /> <span>30% <i>Off</i></span></a> <a href="#" title="">
											<!--<img
																						src="http://placehold.it/85x123" alt="" /> --> <img
											src="<%=request.getContextPath()%>/resources/images/footer-deal2.jpg"
											alt="" /> <span>30% <i>Off</i></span>
										</a> <a href="#" title="">
											<!--<img src="http://placehold.it/85x123"
																						alt="" />--> <img
											src="<%=request.getContextPath()%>/resources/images/footer-deal3.jpg"
											alt="" /> <span>30% <i>Off</i></span>
										</a> <a href="#" title=""> <!--<img
																						src="http://placehold.it/85x123" alt="" /> --> <img
											src="<%=request.getContextPath()%>/resources/images/footer-deal4.jpg"
											alt="" /> <span>30% <i>Off</i></span></a> <a href="#" title="">
											<!--<img src="http://placehold.it/85x123"
																						alt="" /> --> <img
											src="<%=request.getContextPath()%>/resources/images/footer-deal5.jpg"
											alt="" /> <span>30% <i>Off</i></span>
										</a> <a href="#" title=""> <!--<img
																						src="http://placehold.it/85x123" alt="" /> --> <img
											src="<%=request.getContextPath()%>/resources/images/footer-deal6.jpg"
											alt="" /> <span>30% <i>Off</i></span></a>
									</div>

									<div class="instore-deals">
										<a href="#" title=""> <!--<img src="http://placehold.it/85x123" alt="" /> -->
											<img
											src="<%=request.getContextPath()%>/resources/images/footer-deal.jpg"
											alt="" /> <span>30% <i>Off</i></span></a> <a href="#" title="">
											<!--<img
																						src="http://placehold.it/85x123" alt="" /> --> <img
											src="<%=request.getContextPath()%>/resources/images/footer-deal2.jpg"
											alt="" /> <span>30% <i>Off</i></span>
										</a> <a href="#" title="">
											<!--<img src="http://placehold.it/85x123"
																						alt="" />--> <img
											src="<%=request.getContextPath()%>/resources/images/footer-deal3.jpg"
											alt="" /> <span>30% <i>Off</i></span>
										</a> <a href="#" title=""> <!--<img
																						src="http://placehold.it/85x123" alt="" /> --> <img
											src="<%=request.getContextPath()%>/resources/images/footer-deal4.jpg"
											alt="" /> <span>30% <i>Off</i></span></a> <a href="#" title="">
											<!--<img src="http://placehold.it/85x123"
																						alt="" /> --> <img
											src="<%=request.getContextPath()%>/resources/images/footer-deal5.jpg"
											alt="" /> <span>30% <i>Off</i></span>
										</a> <a href="#" title=""> <!--<img
																						src="http://placehold.it/85x123" alt="" /> --> <img
											src="<%=request.getContextPath()%>/resources/images/footer-deal6.jpg"
											alt="" /> <span>30% <i>Off</i></span></a>
									</div>
								</div>
							</div>

					
				</div>	
			</div>

		<div class="shop-tabs">

			<div class="col-md-6">
			<div class="heading1">
						<h2><i>SOCIAL  </i>REVIEWS</h2>
						<span>BRAND FOR EVERY STYLE.</span>
		</div>
			  <ul class="nav nav-tabs shop-tab" id="myTab">
				<li class="active"><a data-toggle="tab" href="#tab-photos">Most Popular</a></li>
				<li class=""><a data-toggle="tab" href="#tab-photos">Most Liked</a></li>
				<li class=""><a data-toggle="tab" href="#reviews">Top Reviews</a></li>

			  </ul>
			  <div class="tab-content" id="myTabContent">
				<div id="tab-photos" class="tab-pane fade active in">
					<div class="tab-photos">
						<div class="tab-photo-sec">
							<div class="tab-photo">
								<!--<img src="http://placehold.it/527x281" alt="" /> -->
								<img src="<c:url value="/resources/images/tab-photo1.jpg"/>" alt="" />
								<span>Lv 33/2 Cunningham street</span>
							</div>
							<div class="tab-photo-des">
							<p>Samsung Knox security software is continuously gaining popularity among the corporate businesses. And while the US Department of Defense was considering  </p>
							</div>
						</div>

						<div class="tab-photo-sec">
							<div class="tab-photo">
								<!--<img src="http://placehold.it/527x281" alt="" /> -->
								<img src="<c:url value="/resources/images/tab-photo2.jpg"/>" alt="" />
								<span>Lv 33/2 Cunningham street</span>
							</div>
							<div class="tab-photo-des">
							<p>Samsung Knox security software is continuously gaining popularity among the corporate businesses. And while the US Department of Defense was considering  </p>
							</div>
						</div>

						<div class="tab-photo-sec">
							<div class="tab-photo">
								<img src="<c:url value="/resources/images/tab-photo3.jpg"/>" alt="" />
								<!-- <img src="http://placehold.it/527x281" alt="" /> -->
								<span>Lv 33/2 Cunningham street</span>
							</div>
							<div class="tab-photo-des">
							<p>Samsung Knox security software is continuously gaining popularity among the corporate businesses. And while the US Department of Defense was considering  </p>
							</div>
						</div>
					</div>
				</div>
				<div id="reviews" class="tab-pane fade">
					<div class="tab-reveiws">
						<ul>
							<li><span>
								<img src="<c:url value="/resources/images/reviews1.jpg"/>" alt="" />
								<!--<img src="http://placehold.it/160x101" alt="" /> -->
							    </span>
								<a href="#" title="">Consectetur Adipisicing buy this from own </a>
								<i> Novermber 20,2013</i>
								<p> It turns out company does indeed have monetary in place with phone makers over Windows Phone. He, ever, calls the quoted dollar amounts.</p>
							</li>

							<li><span>
								<img src="<c:url value="/resources/images/reviews2.jpg"/>" alt="" />
								<!--<img src="http://placehold.it/160x101" alt="" /> -->

							</span>
								<a href="#" title="">Consectetur Adipisicing buy this from own </a>
								<i> Novermber 20,2013</i>
								<p> It turns out company does indeed have monetary in place with phone makers over Windows Phone. He, ever, calls the quoted dollar amounts.</p>
							</li>

							<li><span>
								<img src="<c:url value="/resources/images/reviews3.jpg"/>" alt="" />
								<!--<img src="http://placehold.it/160x101" alt="" /> -->
							   </span>
								<a href="#" title="">Consectetur Adipisicing buy this from own </a>
								<i> Novermber 20,2013</i>
								<p> It turns out company does indeed have monetary in place with phone makers over Windows Phone. He, ever, calls the quoted dollar amounts.</p>
							</li>
						</ul>
					</div>
				</div>

				<div id="video" class="tab-pane fade">
					<div class="tab-video">
						<h3>Samsung responds to Knox vulnerability allegations</h3>
						<iframe src="http://player.vimeo.com/video/8118831" height="281"></iframe>
						<p>Samsung Knox security software is continuously gaining popularity among the corporate businesses. And while the US Department of Defense was considering  </p>
					</div>
				</div>


			  </div>
			</div>
		</div>
		</div>
	</div>
</section>





		

		





		<section class="block" id="latest-deal">
			<div class="fixed-img sec-bg1"></div>
			
			<div class="container">
				<div class="latest-deal">
					<h3>
						100 Kindle Books for <i>$2.99</i> or less
					</h3>
					<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
						Nulla ornare porttitor diam, a accumsan justo laoreet suscipit.
						Maecenas at bibendum nunc</p>
				</div>
			</div>
		</section>
		
		<Section class="block">
			
		 <div class="container">
		</div>
		</section>

		<section class="block remove-gap">
			<div class="container">
				<div class="row">
					<div class="col-md-6">
						<div class="heading1">
							<h2><i>HAPPY </i>CUSTOMERS</h2>
							<span>BRAND FOR EVERY STYLE.</span>
						</div>
						<div id="shop-testimonial">
							<div class="w-ceo">
								<img src="<%=request.getContextPath()%>/resources/images/our-ceo1.jpg" 	alt="" />
								<!--<img alt="" src="http://placehold.it/110x105"> -->
								<h5>Nick Roach</h5>
								<p>Vestibulum vel posuere ante. Etiam viverra, odio sit amet consequat rhoncus, lacus dolor sodales diam, aliquet fermentum lectus enim id lacus.</p>
							</div>
							<div class="w-ceo">
								<!--<img alt="" src="http://placehold.it/110x105"> -->
								<img src="<%=request.getContextPath()%>/resources/images/our-ceo2.jpg" 	alt="" />
								<h5>Nick Roach</h5>
								<p>Vestibulum vel posuere ante. Etiam viverra, odio sit amet consequat rhoncus, lacus dolor sodales diam, aliquet fermentum lectus enim id lacus. </p>
							</div>
							<div class="w-ceo">
								<!--<img alt="" src="http://placehold.it/110x105"> -->
								<img src="<%=request.getContextPath()%>/resources/images/our-ceo3.jpg" 	alt="" />
								<h5>Nick Roach</h5>
								<p>Vestibulum vel posuere ante. Etiam viverra, odio sit amet consequat rhoncus, lacus dolor sodales diam, aliquet fermentum lectus enim id lacus. </p>
							</div>
							<div class="w-ceo">
								<img src="<%=request.getContextPath()%>/resources/images/our-ceo1.jpg" 	alt="" />
								<!--<img alt="" src="http://placehold.it/110x105"> -->
								<h5>Nick Roach</h5>
								<p>Vestibulum vel posuere ante. Etiam viverra, odio sit amet consequat rhoncus, lacus dolor sodales diam, aliquet fermentum lectus enim id lacus.</p>
							</div>

						</div>
					</div>

					<div class="col-md-6">
						<div class="heading1">
							<h2><i>TOP </i>BRANDS</h2>
							<span>BRAND FOR EVERY STYLE.</span>
						</div>

						<div class="row">
							<div class="col-md-4">
								<div class="shop-top-brand">
									<a href="#" title=""><img src="<%=request.getContextPath()%>/resources/images/shop-brands1.jpg" alt="" /><!--<img src="http://placehold.it/170x97" alt="" />--> </a>

								</div>
							</div>
							<div class="col-md-4">
								<div class="shop-top-brand">
									<a href="#" title=""><img src="<%=request.getContextPath()%>/resources/images/shop-brands2.jpg" alt="" /><!--<img src="http://placehold.it/170x97" alt="" />--> </a>
								</div>
							</div>
							<div class="col-md-4">
								<div class="shop-top-brand">
									<a href="#" title=""><img src="<%=request.getContextPath()%>/resources/images/shop-brands3.jpg" alt="" /><!--<img src="http://placehold.it/170x97" alt="" />--> </a>
								</div>
							</div>
							<div class="col-md-4">
								<div class="shop-top-brand">
									<a href="#" title=""><img src="<%=request.getContextPath()%>/resources/images/shop-brands4.jpg" alt="" /><!--<img src="http://placehold.it/170x97" alt="" />--> </a>
								</div>
							</div>
							<div class="col-md-4">
								<div class="shop-top-brand">
									<a href="#" title=""><img src="<%=request.getContextPath()%>/resources/images/shop-brands5.jpg" alt="" /><!--<img src="http://placehold.it/170x97" alt="" />--> </a>
								</div>
							</div>
							<div class="col-md-4">
								<div class="shop-top-brand">
									<a href="#" title=""><img src="<%=request.getContextPath()%>/resources/images/shop-brands5.jpg" alt="" /><!--<img src="http://placehold.it/170x97" alt="" />--> </a>
								</div>
							</div>

						</div>
					</div>
				</div>
			</div>
</section>

</div>

</body>
</html>