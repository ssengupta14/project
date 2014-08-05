<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>

<body>
	<div class="theme-layout">
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
									<form:form method="post" enctype="multipart/form-data"
										modelAttribute="uploadedFile" action="/elenverve/upload">
										<label><b>Resources</b></label>
										<input name="resources" type="text" placeholder=""
											onclick="BrowseClick()" />
										<input type="submit" class="submit" value="Upload" />
									</form:form>
									<p>Upload new or modified resources for Menus, submenus,
										content modifications</p>
								</div>
								<div>
									"<strong>${fileMessage}</strong>"
								</div>
							</td>
							<td>
								<div class="compare-with">
									<form>
										<label><b>Products &nbsp; </b></label> <input type="text"
											placeholder="" /> <input type="submit" class="submit"
											value="Upload" onclick="BrowseClick()" />
									</form>
									<p>Upload products.csv for product modifications</p>
								</div>
							</td>
						</tr>
						<tr>
							<td>
								<div class="compare-with">
									<form>
										<label><b>Images &nbsp;&nbsp;&nbsp;&nbsp;</b></label> <input
											type="text" placeholder="" /> <input type="submit"
											class="submit" value="Upload" />
									</form>
									<p>Upload new or modified product, deals, offers or
										advertisement images</p>
								</div>
							</td>
							<td>

								<div class="compare-with">
									<form>
										<label><b>Offers
												&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </b></label> <input type="text"
											placeholder="" /> <input type="submit" class="submit"
											value="Upload" />
									</form>
									<p>Upload new Daily, weeklu, special Deals,discounts or
										offers</p>
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
					<div class="col-md-4"></div>
					<div class="col-md-5">
						<div class="cart-total-box">
							<div class="cart-head">
								<h2 class="cart-product">Compare Elements</h2>
							</div>
							<ul>
								<li class="customlist"><select>
										<option>Resources</option>
										<option>Products</option>
										<option>Menus</option>
										<option>Submenus</option>
										<option>Main banner</option>
										<option>Daily deal</option>
										<option>Weekly deals</option>
								</select></li>
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
								<li><span>Color</span>
								<p>Skin & White</p></li>
								<li><span>Color</span>
								<p>Skin & White</p></li>
								<li><span>Color</span>
								<p>Skin & White</p></li>
								<li><span>Color</span>
								<p>Skin & White</p></li>
								<li><span>Color</span>
								<p>Skin & White</p></li>
								<li><span>Color</span>
								<p>Skin & White</p></li>
								<li><span>Color</span>
								<p>Skin & White</p></li>
								<li><span>Color</span>
								<p>Skin & White</p></li>
								<li><span>Color</span>
								<p>Skin & White</p></li>
							</ul>
						</div>
					</div>

					<div class="col-md-6">
						<div class="product-details">
							<h1>New</h1>
							<ul>
								<li><span>Color</span>
								<p>Skin & White</p></li>
								<li><span>Color</span>
								<p>Skin & White</p></li>
								<li><span>Color</span>
								<p>Skin & White</p></li>
								<li><span>Color</span>
								<p>Skin & White</p></li>
								<li><span>Color</span>
								<p>Skin & White</p></li>
								<li><span>Color</span>
								<p>Skin & White</p></li>
								<li><span>Color</span>
								<p>Skin & White</p></li>
								<li><span>Color</span>
								<p>Skin & White</p></li>
								<li><span>Color</span>
								<p>Skin & White</p></li>
							</ul>
						</div>
					</div>

				</div>
			</div>
		</section>
		<section class="block remove-gap">
			<div class="container">
				<div class="row">
					<div class="col-md-4"></div>
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
									<p>
										<label for=topup>&nbsp;</label>
									</p>
									<p>
										<label for=topup>&nbsp;</label>
									</p>

									<p style="font-size: 10px""color:white">
										<input type="checkbox" id="topup10" class="w-news-letter" />
										<label for=topup10>I agree, as an administrator I
											completely understand the impact of these changes and take
											full responsibility of any potential issues caused due to
											these changes. I am willingly clicking the submit button and
											I am sure I want to continue with these changes and not
											tampering with the system for any personal/professional
											grudge or benefit.Consider this as my sign off to the changes
										</label>
									</p>
									<input type="text" placeholder="confirmation code" />
									<p>
										<input type="submit" class="submit" value="SUBMIT" />
									</p>
									<p>
										<input type="submit" class="submit"
											value="Send Confirmation code" />
									</p>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>

	</div>

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