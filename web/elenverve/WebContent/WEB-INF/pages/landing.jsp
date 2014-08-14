<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<body>
	<div class="theme-layout">

		<div class="tp-banner-container">
			<div class="tp-banner">

				<ul>${model.banner}
				</ul>
			</div>
		</div>

		<section class="block">
			<div class="container">
				<div class="row">
					<div class="col-md-6">
						<div class="heading1">
							<h2>
								<i>EVERYDAY </i>DEALS
							</h2>
							<span>BRAND FOR EVERY STYLE.</span>
						</div>
						<div class="discount-deal">
							<Div class="discount-desc">
								<h3>ENDING SOON</h3>
								<h4>
									SALES <strong>30%</strong> <i>OFF</i>
								</h4>
								<span class="counter-head">TIME LEFT</span>
								<ul class="counter">
									<li><div>
											<span id="h"></span><span class="hours">HRS</span>
										</div></li>
									<li><div>
											<span id="m"></span><span class="minutes">MINTS</span>
										</div></li>
									<li><div>
											<span id="s"></span><span class="seconds">Seconds</span>
										</div></li>
								</ul>
							</div>

							<div class="discount-image">
								<!--<img src="http://placehold.it/270x280" alt="" />-->
								<img
									src="<%=request.getContextPath()%>/resources/images/discount.jpg"
									alt="" /> <span class="flip-default">WE GIVE YOU BEST
									HOSTING </span> <A href="#" title=""><span class="flip-active">SHOP
										NOW</span></a>
							</div>
						</div>
					</div>

					<div class="col-md-6">
						<div class="deal-week-sec">
							<div class="heading1">
								<h2>
									<i>DEAL OF THE </i>WEEK
								</h2>
								<span>BRAND FOR EVERY STYLE.</span>
							</div>

							<div class="deal-week">
								<!-- <img src="http://placehold.it/599x290" alt="" /> -->
								<img
									src="<%=request.getContextPath()%>/resources/images/deal-week.jpg"
									alt="" />
								<h2>
									BUY OFER EVERY OFFER YOU GET <span><i>UP TO</i>25%<i
										id="discount">DISCOUNT</i></span>
								</h2>
							</div>

							<div class="deal-of-weak">
								<!--<p>The other week I picked up a pillow as a complete impulse buy. It was bright and into colorful and only five dollars</p> -->
								<a href="#" title=""><i class="fa fa-shopping-cart"></i>Purchase
									From Here</a>
							</div>

						</div>
					</div>

				</div>
			</div>
		</section>

		<section class="block remove-gap">
			<div class="container">
				<div class="row">
					<div class="col-md-6">
						<div class="heading1">
							<h2>
								<i>IN STORE </i>NOW
							</h2>
							<span>BRAND FOR EVERY STYLE.</span>
						</div>
						<Div class="row">
							<div class="col-md-6">
								<div class="best-seller most-sold">
									<div class="sold-thumb">
										<!-- <img src="<c:url value="/resources/images/up-coming9.jpg"/>" alt="" /> -->
										<img
											src="<c:url value="/resources/images/Product1/DSC_1334.jpg"/>"
											alt="" />
										<!-- <img alt="" src="http://placehold.it/248x273"> -->
										<a href="single-post.html" title="">VIEW DETAILS</a> <i
											class="box1"></i> <i class="box2"></i> <i class="box3"></i> <i
											class="box4"></i>
									</div>
									<h3>BEST KIDS DESIGN 2014</h3>

									<ul class="tooltip-btn">
										<li class="cart"><a href="#" title=""><i
												class="fa fa-heart"></i></a></li>
										<li class="shop"><a href="#" title=""><i
												class="fa fa-shopping-cart"></i></a></li>
									</ul>
									<a href="#" title="">DETAILS</a> <span><i>$360</i>$460</span>
								</div>
							</div>

							<div class="col-md-6">
								<div class="best-seller most-sold">
									<div class="sold-thumb">
										<!-- <img src="<c:url value="/resources/images/up-coming10.jpg"/>" alt="" /> -->
										<img
											src="<c:url value="/resources/images/Product1/DSC_1335.jpg"/>"
											alt="" />
										<!--<img alt="" src="http://placehold.it/248x273">-->
										<a href="single-post.html" title="">VIEW DETAILS</a> <i
											class="box1"></i> <i class="box2"></i> <i class="box3"></i> <i
											class="box4"></i>
									</div>
									<h3>BEST KIDS DESIGN 2014</h3>

									<ul class="tooltip-btn">
										<li class="cart"><a href="#" title=""><i
												class="fa fa-heart"></i></a></li>
										<li class="shop"><a href="#" title=""><i
												class="fa fa-shopping-cart"></i></a></li>
									</ul>
									<a href="#" title="">DETAILS</a> <span><i>$360</i>$460</span>
								</div>
							</div>

						</div>
					</div>

					<div class="shop-tabs">

						<div class="col-md-6">
							<div class="heading1">
								<h2>
									<i>SOCIAL </i>REVIEWS
								</h2>
								<span>BRAND FOR EVERY STYLE.</span>
							</div>
							<ul class="nav nav-tabs shop-tab" id="myTab">
								<li class="active"><a data-toggle="tab" href="#tab-photos">Most
										Popular</a></li>
								<li class=""><a data-toggle="tab" href="#tab-photos">Most
										Liked</a></li>
								<li class=""><a data-toggle="tab" href="#reviews">Top
										Reviews</a></li>

							</ul>
							<div class="tab-content" id="myTabContent">
								<div id="tab-photos" class="tab-pane fade active in">
									<div class="tab-photos">
										<div class="tab-photo-sec">
											<div class="tab-photo">
												<!--<img src="http://placehold.it/527x281" alt="" /> -->
												<img src="<c:url value="/resources/images/tab-photo1.jpg"/>"
													alt="" /> <span>Lv 33/2 Cunningham street</span>
											</div>
											<div class="tab-photo-des">
												<p>Samsung Knox security software is continuously
													gaining popularity among the corporate businesses. And
													while the US Department of Defense was considering</p>
											</div>
										</div>

										<div class="tab-photo-sec">
											<div class="tab-photo">
												<!--<img src="http://placehold.it/527x281" alt="" /> -->
												<img src="<c:url value="/resources/images/tab-photo2.jpg"/>"
													alt="" /> <span>Lv 33/2 Cunningham street</span>
											</div>
											<div class="tab-photo-des">
												<p>Samsung Knox security software is continuously
													gaining popularity among the corporate businesses. And
													while the US Department of Defense was considering</p>
											</div>
										</div>

										<div class="tab-photo-sec">
											<div class="tab-photo">
												<img src="<c:url value="/resources/images/tab-photo3.jpg"/>"
													alt="" />
												<!-- <img src="http://placehold.it/527x281" alt="" /> -->
												<span>Lv 33/2 Cunningham street</span>
											</div>
											<div class="tab-photo-des">
												<p>Samsung Knox security software is continuously
													gaining popularity among the corporate businesses. And
													while the US Department of Defense was considering</p>
											</div>
										</div>
									</div>
								</div>
								<div id="reviews" class="tab-pane fade">
									<div class="tab-reveiws">
										<ul>
											<li><span> <img
													src="<c:url value="/resources/images/reviews1.jpg"/>"
													alt="" /> <!--<img src="http://placehold.it/160x101" alt="" /> -->
											</span> <a href="#" title="">Consectetur Adipisicing buy this
													from own </a> <i> Novermber 20,2013</i>
												<p>It turns out company does indeed have monetary in
													place with phone makers over Windows Phone. He, ever, calls
													the quoted dollar amounts.</p></li>

											<li><span> <img
													src="<c:url value="/resources/images/reviews2.jpg"/>"
													alt="" /> <!--<img src="http://placehold.it/160x101" alt="" /> -->

											</span> <a href="#" title="">Consectetur Adipisicing buy this
													from own </a> <i> Novermber 20,2013</i>
												<p>It turns out company does indeed have monetary in
													place with phone makers over Windows Phone. He, ever, calls
													the quoted dollar amounts.</p></li>

											<li><span> <img
													src="<c:url value="/resources/images/reviews3.jpg"/>"
													alt="" /> <!--<img src="http://placehold.it/160x101" alt="" /> -->
											</span> <a href="#" title="">Consectetur Adipisicing buy this
													from own </a> <i> Novermber 20,2013</i>
												<p>It turns out company does indeed have monetary in
													place with phone makers over Windows Phone. He, ever, calls
													the quoted dollar amounts.</p></li>
										</ul>
									</div>
								</div>

								<div id="video" class="tab-pane fade">
									<div class="tab-video">
										<h3>Samsung responds to Knox vulnerability allegations</h3>
										<iframe src="http://player.vimeo.com/video/8118831"
											height="281"></iframe>
										<p>Samsung Knox security software is continuously gaining
											popularity among the corporate businesses. And while the US
											Department of Defense was considering</p>
									</div>
								</div>


							</div>
						</div>
					</div>
				</div>
			</div>
		</section>

		<section class="block">
			<div class="container">
				<div class="heading1">
					<h2>
						<i>COLLECTIONS </i>
					</h2>
					<span>BRAND FOR EVERY STYLE. FIND YOURS.</span>
				</div>
				<div class="shoping-categories">
					<div class="row">
						<div class="col-md-4">
							<div class="shop-categories-sec">
								<!-- <img src="<%=request.getContextPath()%>/resources/images/recent-products.jpg" alt="" /> -->
								<img
									src="<%=request.getContextPath()%>/resources/images/Collection/DSC_1336.jpg"
									alt="" />
								<!--<img src="http://placehold.it/367x360" alt="" />-->
								<div class="shop-categories">
									<h2>ELEMENTS</h2>
									<a href="#" title="">VIEW ALL</a> <span><i
										class="fa fa-heart"></i>Great Offer 30% </span> <span><i
										class="fa fa-th"></i>(300) items</span>
								</div>
							</div>
						</div>

						<div class="col-md-4">
							<div class="shop-categories-sec">
								<!-- <img src="<%=request.getContextPath()%>/resources/images/recent-products2.jpg" alt="" /> -->
								<img
									src="<%=request.getContextPath()%>/resources/images/Collection/DSC_1335.jpg"
									alt="" />
								<!--<img src="http://placehold.it/367x360" alt="" />-->
								<div class="shop-categories">
									<h2>CONTINENTS</h2>
									<a href="#" title="">VIEW ALL</a> <span><i
										class="fa fa-heart"></i>Great Offer 30% </span> <span><i
										class="fa fa-th"></i>(300) items</span>
								</div>
							</div>
						</div>

						<div class="col-md-4">
							<div class="shop-categories-sec">
								<!-- <img src="<%=request.getContextPath()%>/resources/images/recent-products3.jpg" alt="" /> -->
								<img
									src="<%=request.getContextPath()%>/resources/images/Collection/DSC_1337.jpg"
									alt="" />
								<!--<img src="http://placehold.it/367x360" alt="" /> -->
								<div class="shop-categories">
									<h2>SPECTRUM</h2>
									<a href="#" title="">VIEW ALL</a> <span><i
										class="fa fa-heart"></i>Great Offer 30% </span> <span><i
										class="fa fa-th"></i>(300) items</span>
								</div>
							</div>
						</div>

					</div>
				</div>
			</div>
		</section>

		<section class="block remove-gap" id="shop-recent-product">
			<div class="container">
				<div class="heading1">
					<h2>
						<i>CATEGORIES</i>
					</h2>
					<span>BRAND FOR EVERY STYLE. FIND YOURS.</span>
				</div>
				<a href="#" title="" class="sec-view-all"><i>VIEW ALL</i></a>
				<div class="row">
					<div class="col-md-4">
						<div class="shop-recent-product">
							<!--<img src="http://placehold.it/368x381" alt="" /> -->
							<!-- <img src="<%=request.getContextPath()%>/resources/images/recent-products.jpg" alt="" /> -->
							<img
								src="<%=request.getContextPath()%>/resources/images/Category/DSC_1334.jpg"
								alt="" /> <span><i>$30</i></span>
							<p>HOME DECOR</p>
							<ul>
								<li><a href="#" title="">Add To Cart</a></li>
								<li><a href="#" title="">DETAIL</a></li>
							</ul>
						</div>
					</div>
					<div class="col-md-4">
						<div class="shop-recent-product">
							<!--<img src="http://placehold.it/368x381" alt="" /> -->
							<!--  <img src="<%=request.getContextPath()%>/resources/images/recent-products3.jpg" alt="" /> -->
							<img
								src="<%=request.getContextPath()%>/resources/images/Category/DSC_1335.jpg"
								alt="" /> <span><i>$30</i></span>
							<p>ART AND PAINTINGS</p>
							<ul>
								<li><a href="#" title="">Add To Cart</a></li>
								<li><a href="#" title="">DETAIL</a></li>
							</ul>
						</div>
					</div>

					<div class="col-md-4">
						<div class="shop-recent-product">
							<!--<img src="http://placehold.it/368x381" alt="" /> -->
							<!-- <img src="<%=request.getContextPath()%>/resources/images/recent-products3.jpg" 	alt="" /> -->
							<img
								src="<%=request.getContextPath()%>/resources/images/Category/DSC_1336.jpg"
								alt="" /> <span><i>$30</i></span>
							<p>FASHION ACCESORIES</p>
							<ul>
								<li><a href="#" title="">Add To Cart</a></li>
								<li><a href="#" title="">DETAIL</a></li>
							</ul>
						</div>
					</div>

					<div class="col-md-4">
						<div class="shop-recent-product">
							<!--<img src="http://placehold.it/368x381" alt="" /> -->
							<!--  <img src="<%=request.getContextPath()%>/resources/images/recent-products3.jpg"	alt="" /> -->
							<img
								src="<%=request.getContextPath()%>/resources/images/Category/DSC_1337.jpg"
								alt="" /> <span><i>$30</i></span>
							<p>LAMP SHADES</p>
							<ul>
								<li><a href="#" title="">Add To Cart</a></li>
								<li><a href="#" title="">DETAIL</a></li>
							</ul>
						</div>
					</div>

					<div class="col-md-4">
						<div class="shop-recent-product">
							<!--<img src="http://placehold.it/368x381" alt="" /> -->
							<!--  <img src="<%=request.getContextPath()%>/resources/images/recent-products3.jpg" 	alt="" /> -->
							<img
								src="<%=request.getContextPath()%>/resources/images/Category/DSC_1335.jpg"
								alt="" /> <span><i>$30</i></span>
							<p>HAND CRAFTED</p>
							<ul>
								<li><a href="#" title="">Add To Cart</a></li>
								<li><a href="#" title="">DETAIL</a></li>
							</ul>
						</div>
					</div>

					<div class="col-md-4">
						<div class="shop-recent-product">
							<!--<img src="http://placehold.it/368x381" alt="" />-->
							<!-- <img src="<%=request.getContextPath()%>/resources/images/recent-products2.jpg" 	alt="" /> -->
							<img
								src="<%=request.getContextPath()%>/resources/images/Category/DSC_1336.jpg"
								alt="" /> <span><i>$30</i></span>
							<p>LIFESTYLE</p>
							<ul>
								<li><a href="#" title="">Add To Cart</a></li>
								<li><a href="#" title="">DETAIL</a></li>
							</ul>
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
		<section class="block remove-gap">
			<div class="container">
				<div class="row">
					<div class="col-md-6">
						<div class="heading1">
							<h2>
								<i>HAPPY </i>CUSTOMERS
							</h2>
							<span>BRAND FOR EVERY STYLE.</span>
						</div>
						<div id="shop-testimonial">
							<div class="w-ceo">
								<img
									src="<%=request.getContextPath()%>/resources/images/our-ceo1.jpg"
									alt="" />
								<!--<img alt="" src="http://placehold.it/110x105"> -->
								<h5>Nick Roach</h5>
								<p>Vestibulum vel posuere ante. Etiam viverra, odio sit amet
									consequat rhoncus, lacus dolor sodales diam, aliquet fermentum
									lectus enim id lacus.</p>
							</div>
							<div class="w-ceo">
								<!--<img alt="" src="http://placehold.it/110x105"> -->
								<img
									src="<%=request.getContextPath()%>/resources/images/our-ceo2.jpg"
									alt="" />
								<h5>Nick Roach</h5>
								<p>Vestibulum vel posuere ante. Etiam viverra, odio sit amet
									consequat rhoncus, lacus dolor sodales diam, aliquet fermentum
									lectus enim id lacus.</p>
							</div>
							<div class="w-ceo">
								<!--<img alt="" src="http://placehold.it/110x105"> -->
								<img
									src="<%=request.getContextPath()%>/resources/images/our-ceo3.jpg"
									alt="" />
								<h5>Nick Roach</h5>
								<p>Vestibulum vel posuere ante. Etiam viverra, odio sit amet
									consequat rhoncus, lacus dolor sodales diam, aliquet fermentum
									lectus enim id lacus.</p>
							</div>
							<div class="w-ceo">
								<img
									src="<%=request.getContextPath()%>/resources/images/our-ceo1.jpg"
									alt="" />
								<!--<img alt="" src="http://placehold.it/110x105"> -->
								<h5>Nick Roach</h5>
								<p>Vestibulum vel posuere ante. Etiam viverra, odio sit amet
									consequat rhoncus, lacus dolor sodales diam, aliquet fermentum
									lectus enim id lacus.</p>
							</div>

						</div>
					</div>

					<div class="col-md-6">
						<div class="heading1">
							<h2>
								<i>TOP </i>BRANDS
							</h2>
							<span>BRAND FOR EVERY STYLE.</span>
						</div>

						<div class="row">
							<div class="col-md-4">
								<div class="shop-top-brand">
									<a href="#" title=""><img
										src="<%=request.getContextPath()%>/resources/images/shop-brands1.jpg"
										alt="" />
									<!--<img src="http://placehold.it/170x97" alt="" />--> </a>

								</div>
							</div>
							<div class="col-md-4">
								<div class="shop-top-brand">
									<a href="#" title=""><img
										src="<%=request.getContextPath()%>/resources/images/shop-brands2.jpg"
										alt="" />
									<!--<img src="http://placehold.it/170x97" alt="" />--> </a>
								</div>
							</div>
							<div class="col-md-4">
								<div class="shop-top-brand">
									<a href="#" title=""><img
										src="<%=request.getContextPath()%>/resources/images/shop-brands3.jpg"
										alt="" />
									<!--<img src="http://placehold.it/170x97" alt="" />--> </a>
								</div>
							</div>
							<div class="col-md-4">
								<div class="shop-top-brand">
									<a href="#" title=""><img
										src="<%=request.getContextPath()%>/resources/images/shop-brands4.jpg"
										alt="" />
									<!--<img src="http://placehold.it/170x97" alt="" />--> </a>
								</div>
							</div>
							<div class="col-md-4">
								<div class="shop-top-brand">
									<a href="#" title=""><img
										src="<%=request.getContextPath()%>/resources/images/shop-brands5.jpg"
										alt="" />
									<!--<img src="http://placehold.it/170x97" alt="" />--> </a>
								</div>
							</div>
							<div class="col-md-4">
								<div class="shop-top-brand">
									<a href="#" title=""><img
										src="<%=request.getContextPath()%>/resources/images/shop-brands5.jpg"
										alt="" />
									<!--<img src="http://placehold.it/170x97" alt="" />--> </a>
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