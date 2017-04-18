<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%--<%@ include file="head.jsp"%>--%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Home</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" media="all" />
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="New Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--fonts-->
<link href='http://fonts.useso.com/css?family=Lato:100,300,400,700,900' rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'><!--//fonts-->
<!-- start menu -->
<link href="${pageContext.request.contextPath}/css/memenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/memenu.js"></script>
<script>$(document).ready(function(){$(".memenu").memenu();});</script>
<script src="${pageContext.request.contextPath}/js/simpleCart.min.js"> </script>
</head>
<body>
<!--header-->
<div class="header">
	<div class="header-top">
		<div class="container">
			<div class="search">
					<form>
						<input type="text" value="Search " onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Search';}">
						<input type="submit" value="Go">
					</form>
			</div>
			<div class="header-left">
					<ul>
						<li><a href="${pageContext.request.contextPath}/uam/locLogin.action" >Login</a></li>
						<li><a href="${pageContext.request.contextPath}/uam/locRegist.action" >Register</a></li>
					</ul>
					<div class="cart box_1">
						<a href="${pageContext.request.contextPath}/checkout.jsp">
						<h3> <div class="total">
							<span class="simpleCart_total"></span> (<span id="simpleCart_quantity" class="simpleCart_quantity"></span> items)</div>
							<img src="${pageContext.request.contextPath}/images/cart.png" alt=""/></h3>
						</a>
						<p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>

					</div>
					<div class="clearfix"> </div>
			</div>
				<div class="clearfix"> </div>
		</div>
		</div>
		<div class="container">
			<div class="head-top">
				<div class="logo">
					<a href="${pageContext.request.contextPath}/index.jsp"><img src="${pageContext.request.contextPath}/images/logo.png" alt=""></a>
				</div>
		  <div class=" h_menu4">
				<ul class="memenu skyblue">
					  <li class="active grid"><a class="color8" href="${pageContext.request.contextPath}/index.jsp">Home</a></li>
				      <li><a class="color1" href="#">Men</a>
				      	<div class="mepanel">
						<div class="row">
							<div class="col1">
								<div class="h_nav">
									<ul>
										<li><a href="${pageContext.request.contextPath}/productDisplayManagement/displayProducts.action?productDto.category=accessories">Accessories</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Bags</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Caps & Hats</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Hoodies & Sweatshirts</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Jackets & Coats</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Jeans</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Jewellery</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Jumpers & Cardigans</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Leather Jackets</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Long Sleeve T-Shirts</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Loungewear</a></li>
									</ul>
								</div>
							</div>
							<div class="col1">
								<div class="h_nav">
									<ul>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Shirts</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Shoes, Boots & Trainers</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Shorts</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Suits & Blazers</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Sunglasses</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Sweatpants</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Swimwear</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Trousers & Chinos</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">T-Shirts</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Underwear & Socks</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Vests</a></li>
									</ul>
								</div>
							</div>
							<div class="col1">
								<div class="h_nav">
									<h4>Popular Brands</h4>
									<ul>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Levis</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Persol</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Nike</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Edwin</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">New Balance</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Jack & Jones</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Paul Smith</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Ray-Ban</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Wood Wood</a></li>
									</ul>
								</div>
							</div>
						  </div>
						</div>
					</li>
				    <li class="grid"><a class="color2" href="#">	Women</a>
					  	<div class="mepanel">
						<div class="row">
							<div class="col1">
								<div class="h_nav">
									<ul>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Accessories</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Bags</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Caps & Hats</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Hoodies & Sweatshirts</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Jackets & Coats</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Jeans</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Jewellery</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Jumpers & Cardigans</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Leather Jackets</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Long Sleeve T-Shirts</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Loungewear</a></li>
									</ul>
								</div>
							</div>
							<div class="col1">
								<div class="h_nav">
									<ul>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Shirts</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Shoes, Boots & Trainers</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Shorts</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Suits & Blazers</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Sunglasses</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Sweatpants</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Swimwear</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Trousers & Chinos</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">T-Shirts</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Underwear & Socks</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Vests</a></li>
									</ul>
								</div>
							</div>
							<div class="col1">
								<div class="h_nav">
									<h4>Popular Brands</h4>
									<ul>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Levis</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Persol</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Nike</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Edwin</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">New Balance</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Jack & Jones</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Paul Smith</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Ray-Ban</a></li>
										<li><a href="${pageContext.request.contextPath}/products.jsp">Wood Wood</a></li>
									</ul>
								</div>
							</div>
						  </div>
						</div>
			    </li>
				<li><a class="color4" href="${pageContext.request.contextPath}/blog.jsp">Blog</a></li>
				<li><a class="color6" href="${pageContext.request.contextPath}/contact.jsp">Conact</a></li>
			  </ul>
			</div>

				<div class="clearfix"> </div>
		</div>
		</div>

	</div>
	<div class="banner">
		<div class="container">
			  <script src="${pageContext.request.contextPath}/js/responsiveslides.min.js"></script>
  <script>
    $(function () {
      $("#slider").responsiveSlides({
      	auto: true,
      	nav: true,
      	speed: 500,
        namespace: "callbacks",
        pager: true,
      });
    });
  </script>
			<div  id="top" class="callbacks_container">
			<ul class="rslides" id="slider">
			    <li>

						<div class="banner-text">
							<h3>Lorem Ipsum is not simply dummy  </h3>
						<p>Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor .</p>
						<a href="${pageContext.request.contextPath}/single.jsp">Learn More</a>
						</div>

				</li>
				<li>

						<div class="banner-text">
							<h3>There are many variations </h3>
						<p>Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor .</p>
												<a href="${pageContext.request.contextPath}/single.jsp">Learn More</a>

						</div>

				</li>
				<li>
						<div class="banner-text">
							<h3>Sed ut perspiciatis unde omnis</h3>
						<p>Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor .</p>
								<a href="${pageContext.request.contextPath}/single.jsp">Learn More</a>

						</div>

				</li>
			</ul>
		</div>

	</div>
	</div>
<div class="copyrights">Collect from <a href="http://www.cssmoban.com/" >ç½é¡µæ¨¡æ¿</a></div>
<!--content-->
<div class="content">
	<div class="container">
	<div class="content-top">
		<h1>NEW RELEASED</h1>
		<div class="grid-in">
			<div class="col-md-4 grid-top">
				<a href="${pageContext.request.contextPath}/single.jsp" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="${pageContext.request.contextPath}/images/pi.jpg" alt="">
							<div class="b-wrapper">
									<h3 class="b-animate b-from-left    b-delay03 ">
										<span>T-Shirt</span>
									</h3>
								</div>
				</a>


			<p><a href="${pageContext.request.contextPath}/single.jsp">Contrary to popular</a></p>
			</div>
			<div class="col-md-4 grid-top">
				<a href="${pageContext.request.contextPath}/single.jsp" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="${pageContext.request.contextPath}/images/pi1.jpg" alt="">
					<div class="b-wrapper">
									<h3 class="b-animate b-from-left    b-delay03 ">
										<span>Shoe</span>
									</h3>
								</div>
				</a>
			<p><a href="${pageContext.request.contextPath}/single.jsp">classical Latin</a></p>
			</div>
			<div class="col-md-4 grid-top">
				<a href="${pageContext.request.contextPath}/single.jsp" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="${pageContext.request.contextPath}/images/pi2.jpg" alt="">
					<div class="b-wrapper">
									<h3 class="b-animate b-from-left    b-delay03 ">
										<span>Bag</span>
									</h3>
								</div>
				</a>
			<p><a href="${pageContext.request.contextPath}/single.jsp">undoubtable</a></p>
			</div>
					<div class="clearfix"> </div>
		</div>
		<div class="grid-in">
			<div class="col-md-4 grid-top">
				<a href="${pageContext.request.contextPath}/single.jsp" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="${pageContext.request.contextPath}/images/pi3.jpg" alt="">
					<div class="b-wrapper">
									<h3 class="b-animate b-from-left    b-delay03 ">
										<span>Shirt</span>
									</h3>
								</div>
				</a>
			<p><a href="${pageContext.request.contextPath}/single.jsp">suffered alteration</a></p>
			</div>
			<div class="col-md-4 grid-top">
				<a href="${pageContext.request.contextPath}/single.jsp" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="${pageContext.request.contextPath}/images/pi4.jpg" alt="">
					<div class="b-wrapper">
									<h3 class="b-animate b-from-left    b-delay03 ">
										<span>Bag</span>
									</h3>
								</div>
				</a>
			<p><a href="${pageContext.request.contextPath}/single.jsp">Content here</a></p>
			</div>
			<div class="col-md-4 grid-top">
				<a href="${pageContext.request.contextPath}/single.jsp" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="${pageContext.request.contextPath}/images/pi5.jpg" alt="">
					<div class="b-wrapper">
									<h3 class="b-animate b-from-left    b-delay03 ">
										<span>Shoe</span>
									</h3>
								</div>
				</a>
			<p><a href="${pageContext.request.contextPath}/single.jsp">readable content</a></p>
			</div>
					<div class="clearfix"> </div>
		</div>
	</div>
	<!----->

	<div class="content-top-bottom">
		<h2>Featured Collections</h2>
		<div class="col-md-6 men">
			<a href="${pageContext.request.contextPath}/single.jsp" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="${pageContext.request.contextPath}/images/t1.jpg" alt="">
				<div class="b-wrapper">
									<h3 class="b-animate b-from-top top-in   b-delay03 ">
										<span>Lorem</span>
									</h3>
								</div>
			</a>


		</div>
		<div class="col-md-6">
			<div class="col-md1 ">
				<a href="${pageContext.request.contextPath}/single.jsp" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="${pageContext.request.contextPath}/images/t2.jpg" alt="">
					<div class="b-wrapper">
									<h3 class="b-animate b-from-top top-in1   b-delay03 ">
										<span>Lorem</span>
									</h3>
								</div>
				</a>

			</div>
			<div class="col-md2">
				<div class="col-md-6 men1">
					<a href="${pageContext.request.contextPath}/single.jsp" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="${pageContext.request.contextPath}/images/t3.jpg" alt="">
							<div class="b-wrapper">
									<h3 class="b-animate b-from-top top-in2   b-delay03 ">
										<span>Lorem</span>
									</h3>
								</div>
					</a>

				</div>
				<div class="col-md-6 men2">
					<a href="${pageContext.request.contextPath}/single.jsp" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="${pageContext.request.contextPath}/images/t4.jpg" alt="">
							<div class="b-wrapper">
									<h3 class="b-animate b-from-top top-in2   b-delay03 ">
										<span>Lorem</span>
									</h3>
								</div>
					</a>

				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		<div class="clearfix"> </div>
	</div>
	</div>
	<!---->
	<div class="content-bottom">
		<ul>
			<li><a href="#"><img class="img-responsive" src="${pageContext.request.contextPath}/images/lo.png" alt=""></a></li>
			<li><a href="#"><img class="img-responsive" src="${pageContext.request.contextPath}/images/lo1.png" alt=""></a></li>
			<li><a href="#"><img class="img-responsive" src="${pageContext.request.contextPath}/images/lo2.png" alt=""></a></li>
			<li><a href="#"><img class="img-responsive" src="${pageContext.request.contextPath}/images/lo3.png" alt=""></a></li>
			<li><a href="#"><img class="img-responsive" src="${pageContext.request.contextPath}/images/lo4.png" alt=""></a></li>
			<li><a href="#"><img class="img-responsive" src="${pageContext.request.contextPath}/images/lo5.png" alt=""></a></li>
		<div class="clearfix"> </div>
		</ul>
	</div>
</div>
<div class="footer">
				<div class="container">
			<div class="footer-top-at">

				<div class="col-md-4 amet-sed">
				<h4>MORE INFO</h4>
				<ul class="nav-bottom">
						<li><a href="#">How to order</a></li>
						<li><a href="#">FAQ</a></li>
						<li><a href="${pageContext.request.contextPath}/contact.jsp">Location</a></li>
						<li><a href="#">Shipping</a></li>
						<li><a href="#">Membership</a></li>
					</ul>
				</div>
				<div class="col-md-4 amet-sed ">
				<h4>CONTACT US</h4>
					<p>Contrary to popular belief</p>
					<p>The standard chunk</p>
					<p>office:  +12 34 995 0792</p>
					<ul class="social">
						<li><a href="#"><i> </i></a></li>
						<li><a href="#"><i class="twitter"> </i></a></li>
						<li><a href="#"><i class="rss"> </i></a></li>
						<li><a href="#"><i class="gmail"> </i></a></li>

					</ul>
				</div>
				<div class="col-md-4 amet-sed">
					<h4>Newsletter</h4>
					<p>Sign Up to get all news update and promo</p>
					<form>
						<input type="text" value="" onFocus="this.value='';" onBlur="if (this.value == '') {this.value ='';}">
						<input type="submit" value="Sign up">
					</form>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		<div class="footer-class">
		<p >Copyright &copy; 2015.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="æ¨¡æ¿ä¹å®¶">æ¨¡æ¿ä¹å®¶</a> - Collect from <a href="http://www.cssmoban.com/" title="ç½é¡µæ¨¡æ¿" target="_blank">ç½é¡µæ¨¡æ¿</a></p>
		</div>
		</div>
</body>
</html>
			