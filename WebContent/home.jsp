<%@page import="dao.SanPhamDAO"%>
<%@page import="model.SanPham"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Trang Chủ</title>
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
</head>
<body>
	<!--header-->
	<div class="top_bg">
		<div class="container">
			<jsp:include page="header/header_top1.jsp"></jsp:include>
		</div>
	</div>
	<!---->
	<img src="images/fit.jpg" alt="" />

	<!---->
	<div class="welcome">
		<div class="container">
			<div class="col-md-3 welcome-left">
				<h2>Chào mừng đến với chúng tôi</h2>
			</div>
			<div class="col-md-9 welcome-right">
				<h3>Cập nhật thông tin xe mới.</h3>
				<p>Bạn muốn mua xe? Bạn muốn tìm hiểu các sản phẩm? Bạn muốn
					biết giá đề xuất của mỗi dòng xe? Bạn muốn biết giá lăn bánh của
					xe? Bạn muốn so sánh đặc điểm của các xe với nhau? Bạn muốn có
					thông tin cập nhật về các dòng xe mới nhất? Chúng tôi cung cấp cho
					bạn những thông tin đầy đủ và nhanh chóng nhất. Với cách thức đơn
					giản và dễ dàng nhất..</p>
			</div>
		</div>
	</div>
	<!---->
	<div class="bride-grids">
		<div class="container">
			<div class="col-md-4 bride-grid">
				<div class="content-grid l-grids">
					<figure class="effect-bubba">
						<img src="images/fit2.jpg" alt="" />
						<figcaption>
							<h4>Nullam molestie</h4>
							<p>In sit amet sapien eros Integer in tincidunt labore et
								dolore magna aliqua</p>
						</figcaption>
					</figure>
					<div class="clearfix"></div>
					<h3>Gara New</h3>
				</div>
				<div class="content-grid l-grids">
					<figure class="effect-bubba">
						<img src="images/fit3.jpg" alt="" />
						<figcaption>
							<h4>Nullam molestie</h4>
							<p>In sit amet sapien eros Integer in tincidunt labore et
								dolore magna aliqua</p>
						</figcaption>
					</figure>
					<div class="clearfix"></div>
					<h3>Hot Car</h3>
				</div>
			</div>
			<div class="col-md-4 bride-grid">
				<div class="content-grid l-grids">
					<figure class="effect-bubba">
						<img src="images/fit1.jpg" alt="" />
						<figcaption>
							<h4>Nullam molestie</h4>
							<p>In sit amet sapien eros Integer in tincidunt labore et
								dolore magna aliqua</p>
						</figcaption>
					</figure>
					<h3>Fast New</h3>
				</div>
			</div>
			<div class="col-md-4 bride-grid">
				<div class="content-grid l-grids">
					<figure class="effect-bubba">
						<img src="images/fit4.jpg" alt="" />
						<figcaption>
							<h4>Nullam molestie</h4>
							<p>In sit amet sapien eros Integer in tincidunt labore et
								dolore magna aliqua</p>
						</figcaption>
					</figure>
					<div class="clearfix"></div>
					<h3>Event</h3>
				</div>
				<div class="content-grid l-grids">
					<figure class="effect-bubba">
						<img src="images/fit5.jpg" alt="" />
						<figcaption>
							<h4>Nullam molestie</h4>
							<p>In sit amet sapien eros Integer in tincidunt labore et
								dolore magna aliqua</p>
						</figcaption>
					</figure>
					<div class="clearfix"></div>
					<h3>Most Beautiful</h3>
				</div>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<!---->
	<div class="featured">
		<div class="container">
			<div>
			
			</div>
			<h3>Sản Phẩm Nổi Bật</h3>
			<div class="feature-grids">
			<c:forEach items="${listSP}" var="dssanpham">
			
		

				<div class="col-md-3 feature-grid ">
					<a href="XuLyXemSanPham?maSanPham=${dssanpham.getMasanpham()}"><img
						src="images/${dssanpham.getHinhanh()}" alt="" />
						<div class="arrival-info">
							<h4>${dssanpham.getTensanpham()}</h4>
							<p>${dssanpham.getGiaban()}</p>

							<span class="disc">[10% Off]</span>
						</div>
						<div class="viw">
							<a
								href="XuLyXemSanPham?maSanPham=${dssanpham.getMasanpham()}"><span
								class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>Quick
								View</a>
						</div>
						<div class="shrt">
							<a href="XemDanhSachSanPham"><span class="glyphicon glyphicon-star"
								aria-hidden="true"></span>Shortlist</a>
						</div></a>
				</div>
</c:forEach>
			


				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!---->
	<div class="arrivals">
		<div class="container">
			<h3>Xu hướng</h3>
			<div class="arrival-grids">
				<ul id="flexiselDemo1">
					<c:forEach items="${listSP1}" var="dssanpham1">

					<li><a href="XuLyXemSanPham?maSanPham=${dssanpham1.getMasanpham()}"><img
							src="images/${dssanpham1.getHinhanh()}" alt="" />
							<div class="arrival-info">
								<h4>${dssanpham1.getTensanpham()}</h4>
								<p>${dssanpham1.getGiaban()}</p>
							</div>
							<div class="shrt">
								<a href="#"><span class="glyphicon glyphicon-star"
									aria-hidden="true"></span>Shortlist</a>
							</div></a></li>
					</c:forEach>
				</ul>
				<script type="text/javascript">
					$(window).load(function() {
						$("#flexiselDemo1").flexisel({
							visibleItems : 4,
							animationSpeed : 1000,
							autoPlay : true,
							autoPlaySpeed : 3000,
							pauseOnHover : true,
							enableResponsiveBreakpoints : true,
							responsiveBreakpoints : {
								portrait : {
									changePoint : 480,
									visibleItems : 1
								},
								landscape : {
									changePoint : 640,
									visibleItems : 2
								},
								tablet : {
									changePoint : 768,
									visibleItems : 3
								}
							}
						});
					});
				</script>
				<script type="text/javascript" src="js/jquery.flexisel.js"></script>
			</div>
		</div>
	</div>
	<!---->
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