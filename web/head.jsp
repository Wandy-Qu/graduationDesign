<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

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
</body>
</html>
