<%@page import="model.SanPhamTrongGioHang"%>
<%@page import="dao.GioHangDAO"%>
<%@page import="dao.SanPhamDAO"%>
<%@page import="model.SanPham"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Wedding Store A Ecommerce Category Flat Bootstrap
	Responsive Website Template | Single :: w3layouts</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css"
	media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Wedding Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript">
	
	
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 



</script>
<!-- start menu -->
<script src="js/simpleCart.min.js">
	
</script>
<!-- start menu -->
<link href="css/memenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/memenu.js"></script>
<script>
	$(document).ready(function() {
		$(".memenu").memenu();
	});
</script>
<!-- /start menu -->
<link href="css/form.css" rel="stylesheet" type="text/css" media="all" />

</head>
<body>
	<!--header-->
	<div class="top_bg">
		<div class="container">
			<jsp:include page="header/header_top1.jsp"></jsp:include>
			<!---->
		</div>
		<div class="clearfix"></div>
	</div>
	</div>
	<!---->

	<div class="single-sec">
		<div class="container">
			<ol class="breadcrumb">
				<li><a href="index.jsp">Trang Chủ</a></li>
				<li class="active">Các Sản Phẩm</li>
				<li class="active">Sản Phẩm</li>
			</ol>
			<!-- start content -->
			
			

				<div class="col-md-9 det">
					<div class="single_left">
						<div class="flexslider">
							<ul class="slides">

								<li data-thumb="images/${xemsp.getMasanpham()}"><img
									src="images/${xemsp.getHinhanh()}" /></li>


							</ul>
						</div>
						<!-- FlexSlider -->
						<script defer src="js/jquery.flexslider.js"></script>
						<link rel="stylesheet" href="css/flexslider.css" type="text/css"
							media="screen" />

						<script>
							// Can also be used with $(document).ready()
							$(window).load(function() {
								$('.flexslider').flexslider({
									animation : "slide",
									controlNav : "thumbnails"
								});
							});
						</script>
					</div>
					<div class="single-right">

						<h3>${xemsp.getTensanpham() }</h3>


						<div class="cost">
							<div class="item-list">
								<ul>
									<li>${xemsp.getMasanpham() }</li>
									<li>${xemsp.getManhacungcap()}</li>

								</ul>
							</div>
							<div class="prdt-cost">
								<ul>
									<li>Giá bán:</li>
									<li class="active">${xemsp.getGiaban() }</li>
									<a href="XuLyMuaSanPham?maSanPham=${xemsp.getMasanpham() }">Mua
										Ngay</a>
								</ul>
							</div>

							<div class="clearfix"></div>
						</div>

						<!---->
		

			<!---->
			<script type="text/javascript" src="js/jquery-ui.min.js"></script>
			<link rel="stylesheet" type="text/css" href="css/jquery-ui.css">

			<!---->

		</div>
		<div class="clearfix"></div>
	</div>
	</div>
	<div class="shoping">
		<div class="container">
			<div class="shpng-grids">
				<div class="col-md-4 shpng-grid">
					<h3>Free Shipping</h3>
					<p>On Order Over Rs999</p>
				</div>
				<div class="col-md-4 shpng-grid">
					<h3>Order Return</h3>
					<p>Return Within 14days</p>
				</div>
				<div class="col-md-4 shpng-grid">
					<h3>COD</h3>
					<p>Cash On Delivery</p>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!---->
	<div class="footer">
		<div class="container">
			<jsp:include page="footer/footer1.jsp"></jsp:include>
		</div>
	</div>
</body>
</html>