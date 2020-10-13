<%@page import="dao.SanPhamDAO"%>
<%@page import="model.SanPham"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Sản Phẩm</title>
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
	<!--header//-->
	<div class="product-model">
		<div class="container">
			<ol class="breadcrumb">
				<li><a href="index.jsp">Trang Chủ</a></li>
				<li class="active">Các Sản Phẩm</li>
			</ol>
			<h2>Các Sản Phẩm</h2>
			<div class="col-md-9 product-model-sec">

			
<c:forEach items="${listds}" var="dssanpham3">
	
				<a
					href="XuLyXemSanPham?maSanPham=${dssanpham3.getMasanpham()}"><div
						class="product-grid love-grid">
						<div class="more-product">
							<span> </span>
						</div>
						<div class="product-img b-link-stripe b-animate-go  ">
							<img src="images/${dssanpham3.getHinhanh()}"
								class="img-responsive" alt="" />
							<div class="b-wrapper">
								<h4 class="b-animate b-from-left  b-delay03">
									<button class="btns">
										<span class="glyphicon glyphicon-zoom-in" aria-hidden="true"></span>Xem
										nhanh
									</button>
								</h4>
							</div>
						</div></a>
				<div class="product-info simpleCart_shelfItem">
					<div class="product-info-cust prt_name">
						<h4>${dssanpham3.getTensanpham()}</h4>
						<span class="item_price">${dssanpham3.getGiaban()}</span>
						<br /> <a
							href="XuLyMuaSanPham?maSanPham=${dssanpham3.getMasanpham()}"><button
								class="item_add items" class="item_add items">Thêm vào
								giỏ</button></a>

					</div>
					<div class="clearfix"></div>
				</div>
			</div>
</c:forEach>
		


		</div>
		<div class="rsidebar span_1_of_left">


			<!---->
			<section class="sky-form">
				<h4>
					<span class="glyphicon glyphicon-minus" aria-hidden="true"></span>Hãng
					Xe
				</h4>
				<div class="row row1 scroll-pane">

					<div class="col col-4">
				<div>
				<a  class="item_add items"  href="XuLyLocXe?maNhaCungCap=NCCAUDI"><i></i>AUDI</a>
				</div>
				<div>
				<a href="XuLyLocXe?maNhaCungCap=NCCHONDA" class="item_add items"><i></i>HONDA</a>
				</div>
				<div>
				<a href="XuLyLocXe?maNhaCungCap=NCCLEXUS"  class="item_add items"><i></i>LEXUS</a>
				</div>
				<div>
				<a href="XuLyLocXe?maNhaCungCap=NCCTOYOTA"  class="item_add items"><i></i>TOYOTA</a>
				</div>
					</div>
				</div>
			</section>
			<section class="sky-form">
				<h4>
					<span class="glyphicon glyphicon-minus" aria-hidden="true"></span>Giá
				</h4>
				<div class="">
					<div class="col col-4">
	
						<a class="item_add items" href="XuLyLocGia?loai=thap" ><i></i>Thấp (<70000$)</a>
						 <a class="item_add items" href="XuLyLocGia?loai=trungbinh"><i></i>Trung Bình (70000$ - 90000$)</a>
						<a class="item_add items" href="XuLyLocGia?loai=cao"><i></i>Cao (>90000)</a>
              
					</div>
				</div>
			</section>
		</div>
	</div>
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