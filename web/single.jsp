<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Single</title>
    <link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet" type="text/css" media="all"/>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <!-- Custom Theme files -->
    <!--theme-style-->
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" media="all"/>
    <!--//theme-style-->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="keywords" content="New Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design"/>
    <script type="application/x-javascript"> addEventListener("load", function () {
        setTimeout(hideURLbar, 0);
    }, false);
    function hideURLbar() {
        window.scrollTo(0, 1);
    } </script>
    <!--fonts-->
    <link href='http://fonts.useso.com/css?family=Lato:100,300,400,700,900' rel='stylesheet' type='text/css'>
    <link href='http://fonts.useso.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>
    <!--//fonts-->
    <!-- start menu -->
    <link href="${pageContext.request.contextPath}/css/memenu.css" rel="stylesheet" type="text/css" media="all"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/memenu.js"></script>
    <script>$(document).ready(function () {
        $(".memenu").memenu();
    });</script>


    <script src="${pageContext.request.contextPath}/js/main.js"></script>
    <script src="${pageContext.request.contextPath}/js/simpleCart.min.js"></script>
</head>
<body>
<!--header-->
<div class="header">
    <div class="header-top">
        <div class="container">
            <div class="search">
                <form>
                    <input type="text" value="Search " onfocus="this.value = '';"
                           onblur="if (this.value == '') {this.value = 'Search';}">
                    <input type="submit" value="Go">
                </form>
            </div>
            <div class="header-left">
                <ul>
                    <li><a href="${pageContext.request.contextPath}/uam/locLogin.action">Login</a></li>
                    <li><a href="${pageContext.request.contextPath}/uam/locRegist.action">Register</a></li>
                    <li></li>
                </ul>
                <div class="cart box_1">
                    <a href="${pageContext.request.contextPath}/checkout.jsp">
                        <h3>
                            <div class="total">
                                <span class="simpleCart_total"></span> (<span id="simpleCart_quantity"
                                                                              class="simpleCart_quantity"></span> items)
                            </div>
                            <img src="${pageContext.request.contextPath}/images/cart.png" alt=""/></h3>
                    </a>
                    <p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>

                </div>
                <div class="clearfix"></div>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
    <div class="container">
        <div class="head-top">
            <div class="logo">
                <a href="${pageContext.request.contextPath}/index.jsp"><img
                        src="${pageContext.request.contextPath}/images/logo.png" alt=""></a>
            </div>
            <div class=" h_menu4">
                <ul class="memenu skyblue">
                    <li class="active grid"><a class="color8"
                                               href="${pageContext.request.contextPath}/index.jsp">Home</a></li>
                    <li><a class="color1" href="#">Shop</a>
                        <div class="mepanel">
                            <div class="row">
                                <div class="col1">
                                    <div class="h_nav">
                                        <ul>
                                            <li>
                                                <a href="${pageContext.request.contextPath}/products.jsp">Accessories</a>
                                            </li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Bags</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Caps &
                                                Hats</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Hoodies &
                                                Sweatshirts</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Jackets &
                                                Coats</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Jeans</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Jewellery</a>
                                            </li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Jumpers &
                                                Cardigans</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Leather
                                                Jackets</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Long Sleeve
                                                T-Shirts</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Loungewear</a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="col1">
                                    <div class="h_nav">
                                        <ul>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Shirts</a>
                                            </li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Shoes, Boots &
                                                Trainers</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Shorts</a>
                                            </li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Suits &
                                                Blazers</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Sunglasses</a>
                                            </li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Sweatpants</a>
                                            </li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Swimwear</a>
                                            </li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Trousers &
                                                Chinos</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">T-Shirts</a>
                                            </li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Underwear &
                                                Socks</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Vests</a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="col1">
                                    <div class="h_nav">
                                        <h4>Popular Brands</h4>
                                        <ul>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Levis</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Persol</a>
                                            </li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Nike</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Edwin</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">New
                                                Balance</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Jack &
                                                Jones</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Paul Smith</a>
                                            </li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Ray-Ban</a>
                                            </li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Wood Wood</a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </li>
                    <li class="grid"><a class="color2" href="#"> Lookbook</a>
                        <div class="mepanel">
                            <div class="row">
                                <div class="col1">
                                    <div class="h_nav">
                                        <ul>
                                            <li>
                                                <a href="${pageContext.request.contextPath}/products.jsp">Accessories</a>
                                            </li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Bags</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Caps &
                                                Hats</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Hoodies &
                                                Sweatshirts</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Jackets &
                                                Coats</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Jeans</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Jewellery</a>
                                            </li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Jumpers &
                                                Cardigans</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Leather
                                                Jackets</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Long Sleeve
                                                T-Shirts</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Loungewear</a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="col1">
                                    <div class="h_nav">
                                        <ul>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Shirts</a>
                                            </li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Shoes, Boots &
                                                Trainers</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Shorts</a>
                                            </li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Suits &
                                                Blazers</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Sunglasses</a>
                                            </li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Sweatpants</a>
                                            </li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Swimwear</a>
                                            </li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Trousers &
                                                Chinos</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">T-Shirts</a>
                                            </li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Underwear &
                                                Socks</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Vests</a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="col1">
                                    <div class="h_nav">
                                        <h4>Popular Brands</h4>
                                        <ul>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Levis</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Persol</a>
                                            </li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Nike</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Edwin</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">New
                                                Balance</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Jack &
                                                Jones</a></li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Paul Smith</a>
                                            </li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Ray-Ban</a>
                                            </li>
                                            <li><a href="${pageContext.request.contextPath}/products.jsp">Wood Wood</a>
                                            </li>
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

            <div class="clearfix"></div>
        </div>
    </div>

</div>


<!--content-->
<!---->
<div class="product">
    <div class="container">
        <div class="col-md-3 product-price">

            <div class=" rsidebar span_1_of_left">
                <div class="of-left">
                    <h3 class="cate">Categories</h3>
                </div>
                <ul class="menu">
                    <li class="item1"><a href="#">Men </a>
                        <ul class="cute">
                            <li class="subitem1"><a href="#">Cute Kittens </a></li>
                            <li class="subitem2"><a href="#">Strange Stuff </a></li>
                            <li class="subitem3"><a href="#">Automatic Fails </a></li>
                        </ul>
                    </li>
                    <li class="item2"><a href="#">Women </a>
                        <ul class="cute">
                            <li class="subitem1"><a href="#">Cute Kittens </a></li>
                            <li class="subitem2"><a href="#">Strange Stuff </a></li>
                            <li class="subitem3"><a href="#">Automatic Fails </a></li>
                        </ul>
                    </li>
                    <li class="item3"><a href="#">Kids</a>
                        <ul class="cute">
                            <li class="subitem1"><a href="#">Cute Kittens </a></li>
                            <li class="subitem2"><a href="#">Strange Stuff </a></li>
                            <li class="subitem3"><a href="#">Automatic Fails</a></li>
                        </ul>
                    </li>
                    <li class="item4"><a href="#">Accesories</a>
                        <ul class="cute">
                            <li class="subitem1"><a href="#">Cute Kittens </a></li>
                            <li class="subitem2"><a href="#">Strange Stuff </a></li>
                            <li class="subitem3"><a href="#">Automatic Fails</a></li>
                        </ul>
                    </li>

                    <li class="item4"><a href="#">Shoes</a>
                        <ul class="cute">
                            <li class="subitem1"><a href="#">Cute Kittens </a></li>
                            <li class="subitem2"><a href="#">Strange Stuff </a></li>
                            <li class="subitem3"><a href="${pageContext.request.contextPath}/product.jsp">Automatic
                                Fails </a></li>
                        </ul>
                    </li>
                </ul>
            </div>
            <!--initiate accordion-->
            <script type="text/javascript">
                $(function () {
                    var menu_ul = $('.menu > li > ul'),
                        menu_a = $('.menu > li > a');
                    menu_ul.hide();
                    menu_a.click(function (e) {
                        e.preventDefault();
                        if (!$(this).hasClass('active')) {
                            menu_a.removeClass('active');
                            menu_ul.filter(':visible').slideUp('normal');
                            $(this).addClass('active').next().stop(true, true).slideDown('normal');
                        } else {
                            $(this).removeClass('active');
                            $(this).next().stop(true, true).slideUp('normal');
                        }
                    });

                });
            </script>
            <!---->
            <div class="product-middle">

                <div class="fit-top">
                    <h6 class="shop-top">Lorem Ipsum</h6>
                    <a href="#" class="shop-now">SHOP NOW</a>
                    <div class="clearfix"></div>
                </div>
            </div>
            <div class="sellers">
                <div class="of-left-in">
                    <h3 class="tag">Tags</h3>
                </div>
                <div class="tags">
                    <ul>
                        <li><a href="#">design</a></li>
                        <li><a href="#">fashion</a></li>
                        <li><a href="#">lorem</a></li>
                        <li><a href="#">dress</a></li>
                        <li><a href="#">fashion</a></li>
                        <li><a href="#">dress</a></li>
                        <li><a href="#">design</a></li>
                        <li><a href="#">dress</a></li>
                        <li><a href="#">design</a></li>
                        <li><a href="#">fashion</a></li>
                        <li><a href="#">lorem</a></li>
                        <li><a href="#">dress</a></li>

                        <div class="clearfix"></div>
                    </ul>

                </div>

            </div>
            <!---->
            <div class="product-bottom">
                <div class="of-left-in">
                    <h3 class="best">Best Sellers</h3>
                </div>
                <div class="product-go">
                    <div class=" fashion-grid">
                        <a href="#"><img class="img-responsive " src="${pageContext.request.contextPath}/images/p1.jpg"
                                         alt=""></a>

                    </div>
                    <div class=" fashion-grid1">
                        <h6 class="best2"><a href="#">Lorem ipsum dolor sit
                            amet consectetuer </a></h6>

                        <span class=" price-in1"> $40.00</span>
                    </div>

                    <div class="clearfix"></div>
                </div>
                <div class="product-go">
                    <div class=" fashion-grid">
                        <a href="#"><img class="img-responsive " src="${pageContext.request.contextPath}/images/p2.jpg"
                                         alt=""></a>

                    </div>
                    <div class="fashion-grid1">
                        <h6 class="best2"><a href="#">Lorem ipsum dolor sit
                            amet consectetuer </a></h6>

                        <span class=" price-in1"> $40.00</span>
                    </div>

                    <div class="clearfix"></div>
                </div>

            </div>
            <div class=" per1">
                <a href="#"><img class="img-responsive" src="${pageContext.request.contextPath}/images/pro.jpg" alt="">
                    <div class="six1">
                        <h4>DISCOUNT</h4>
                        <p>Up to</p>
                        <span>60%</span>
                    </div>
                </a>
            </div>
        </div>
        <div class="col-md-9 product-price1">
            <div class="col-md-5 single-top">
                <div class="flexslider">
                    <ul class="slides">
                        <li data-thumb="${pageContext.request.contextPath}/images/si.jpg">
                            <img src="${pageContext.request.contextPath}/images/si.jpg"/>
                        </li>
                        <li data-thumb="${pageContext.request.contextPath}/images/si1.jpg">
                            <img src="${pageContext.request.contextPath}/images/si1.jpg"/>
                        </li>
                        <li data-thumb="${pageContext.request.contextPath}/images/si2.jpg">
                            <img src="${pageContext.request.contextPath}/images/si2.jpg"/>
                        </li>
                        <li data-thumb="${pageContext.request.contextPath}/images/si.jpg">
                            <img src="${pageContext.request.contextPath}/images/si.jpg"/>
                        </li>
                    </ul>
                </div>
                <!-- FlexSlider -->
                <script defer src="${pageContext.request.contextPath}/js/jquery.flexslider.js"></script>
                <link rel="stylesheet" href="${pageContext.request.contextPath}/css/flexslider.css" type="text/css"
                      media="screen"/>

                <script>
                    // Can also be used with $(document).ready()
                    $(window).load(function () {
                        $('.flexslider').flexslider({
                            animation: "slide",
                            controlNav: "thumbnails"
                        });
                    });
                </script>
            </div>
            <div class="col-md-7 single-top-in simpleCart_shelfItem">
                <div class="single-para ">
                    <h4>Lorem Ipsum</h4>
                    <div class="star-on">
                        <ul class="star-footer">
                            <li><a href="#"><i> </i></a></li>
                            <li><a href="#"><i> </i></a></li>
                            <li><a href="#"><i> </i></a></li>
                            <li><a href="#"><i> </i></a></li>
                            <li><a href="#"><i> </i></a></li>
                        </ul>
                        <div class="review">
                            <a href="#"> 1 customer review </a>

                        </div>
                        <div class="clearfix"></div>
                    </div>

                    <h5 class="item_price">$ ${productDto.productUnitPrice}</h5>
                    <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed
                        diam nonummy nibh euismod tincidunt ut laoreet dolore
                        magna aliquam erat </p>
                    <div class="available">
                        <ul>
                            <li>Color
                                <select>
                                    <option>Silver</option>
                                    <option>Black</option>
                                    <option>Dark Black</option>
                                    <option>Red</option>
                                </select></li>
                            <li class="size-in">Size<select>
                                <option>Large</option>
                                <option>Medium</option>
                                <option>small</option>
                                <option>Large</option>
                                <option>small</option>
                            </select></li>
                            <div class="clearfix"></div>
                        </ul>
                    </div>
                    <ul class="tag-men">
                        <li><span>TAG</span>
                            <span class="women1">: Women,</span></li>
                        <li><span>SKU</span>
                            <span class="women1">: CK09</span></li>
                    </ul>
                    <a href="${pageContext.request.contextPath}/cart/addToCart.action?productDto.productId=${productDto.productId}" class="add-cart item_add">ADD TO CART</a>

                </div>
            </div>
            <div class="clearfix"></div>
            <!---->
            <div class="cd-tabs">
                <nav>
                    <ul class="cd-tabs-navigation">
                        <li><a data-content="fashion" href="#0">Description </a></li>
                        <li><a data-content="cinema" href="#0">Addtional Informatioan</a></li>
                        <li><a data-content="television" href="#0" class="selected ">Reviews (1)</a></li>

                    </ul>
                </nav>
                <ul class="cd-tabs-content">
                    <li data-content="fashion">
                        <div class="facts">
                            <p> There are many variations of passages of Lorem Ipsum available, but the majority have
                                suffered alteration in some form, by injected humour, or randomised words which don't
                                look even slightly believable. If you are going to use a passage of Lorem Ipsum, you
                                need to be sure there isn't anything embarrassing hidden in the middle of text. All the
                                Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary,
                                making this the first true generator on the Internet. It uses a dictionary of over 200
                                Latin words, combined </p>
                            <ul>
                                <li>Research</li>
                                <li>Design and Development</li>
                                <li>Porting and Optimization</li>
                                <li>System integration</li>
                                <li>Verification, Validation and Testing</li>
                                <li>Maintenance and Support</li>
                            </ul>
                        </div>

                    </li>
                    <li data-content="cinema">
                        <div class="facts1">

                            <div class="color"><p>Color</p>
                                <span>Blue, Black, Red</span>
                                <div class="clearfix"></div>
                            </div>
                            <div class="color">
                                <p>Size</p>
                                <span>S, M, L, XL</span>
                                <div class="clearfix"></div>
                            </div>

                        </div>

                    </li>
                    <li data-content="television" class="selected">
                        <div class="comments-top-top">
                            <div class="top-comment-left">
                                <img class="img-responsive" src="${pageContext.request.contextPath}/images/co.png"
                                     alt="">
                            </div>
                            <div class="top-comment-right">
                                <h6><a href="#">Hendri</a> - September 3, 2014</h6>
                                <ul class="star-footer">
                                    <li><a href="#"><i> </i></a></li>
                                    <li><a href="#"><i> </i></a></li>
                                    <li><a href="#"><i> </i></a></li>
                                    <li><a href="#"><i> </i></a></li>
                                    <li><a href="#"><i> </i></a></li>
                                </ul>
                                <p>Wow nice!</p>
                            </div>
                            <div class="clearfix"></div>
                            <a class="add-re" href="#">ADD REVIEW</a>
                        </div>

                    </li>
                    <div class="clearfix"></div>
                </ul>
            </div>
            <div class=" bottom-product">
                <div class="col-md-4 bottom-cd simpleCart_shelfItem">
                    <div class="product-at ">
                        <a href="#"><img class="img-responsive" src="${pageContext.request.contextPath}/images/pi3.jpg"
                                         alt="">
                            <div class="pro-grid">
                                <span class="buy-in">Buy Now</span>
                            </div>
                        </a>
                    </div>
                    <p class="tun">It is a long established fact that a reader</p>
                    <a href="#" class="item_add"><p class="number item_price"><i> </i>$500.00</p></a>
                </div>
                <div class="col-md-4 bottom-cd simpleCart_shelfItem">
                    <div class="product-at ">
                        <a href="#"><img class="img-responsive" src="${pageContext.request.contextPath}/images/pi1.jpg"
                                         alt="">
                            <div class="pro-grid">
                                <span class="buy-in">Buy Now</span>
                            </div>
                        </a>
                    </div>
                    <p class="tun">It is a long established fact that a reader</p>
                    <a href="#" class="item_add"><p class="number item_price"><i> </i>$500.00</p></a></div>
                <div class="col-md-4 bottom-cd simpleCart_shelfItem">
                    <div class="product-at ">
                        <a href="#"><img class="img-responsive" src="${pageContext.request.contextPath}/images/pi4.jpg"
                                         alt="">
                            <div class="pro-grid">
                                <span class="buy-in">Buy Now</span>
                            </div>
                        </a>
                    </div>
                    <p class="tun">It is a long established fact that a reader</p>
                    <a href="#" class="item_add"><p class="number item_price"><i> </i>$500.00</p></a></div>
                <div class="clearfix"></div>
            </div>
        </div>

        <div class="clearfix"></div>
    </div>
</div>
<!--//content-->
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

                <p>
                    Contrary to popular belief</p>
                <p>The standard chunk</p>
                <p>office: +12 34 995 0792</p>
                <ul class="social">
                    <li><a href="#"><i> </i></a></li>
                    <li><a href="#"><i class="twitter"> </i></a></li>
                    <li><a href="#"><i class="rss"> </i></a></li>
                    <li><a href="#"><i class="gmail"> </i></a></li>

                </ul>
            </div>
            <div class="col-md-4 amet-sed">
                <h4>Newsletter</h4>
                <p>Sign Up to get all news update
                    and promo</p>
                <form>
                    <input type="text" value="" onfocus="this.value='';"
                           onblur="if (this.value == '') {this.value ='';}">
                    <input type="submit" value="Sign up">
                </form>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
    <div class="footer-class">
        <p>Copyright &copy; 2015.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/"
                                                                                    target="_blank"
                                                                                    title="模板之家">模板之家</a> - Collect from
            <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
    </div>
</div>
</body>
</html>
			