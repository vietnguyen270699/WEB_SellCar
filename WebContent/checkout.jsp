<%@page import="model.SanPhamTrongGioHang"%>
<%@page import="dao.GioHangDAO"%>
<%@page import="dao.SanPhamDAO"%>
<%@page import="model.SanPham"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Wedding Store A Ecommerce Category Flat Bootstrap
	Responsive Website Template | Cart :: w3layouts</title>
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
			<!---->
		</div>
		<div class="clearfix"></div>
	</div>
	</div>
	<!---->
	<div class="checkout">
		<div class="container">
			<ol class="breadcrumb">
				<li><a href="index.jsp">Trang Chủ</a></li>
				<li class="active">Giỏ hàng</li>
			</ol>
			<div class="col-md-9 product-price1">
				<div class="check-out">
					<div class=" cart-items">

						<div class="in-check">
							<ul class="unit">
								<li><span>Sản Phẩm</span></li>
								<li><span>Tên Sản Phẩm</span></li>
								<li></li>
								<li><span>Giá Sản Phẩm</span></li>
								<li><span>Số Lượng <span></li>
								<div class="clearfix"></div>
							</ul>
							<%
								ArrayList<SanPhamTrongGioHang> dssanpham4 = new GioHangDAO().getGioHang();
								for (int i = 0; i < dssanpham4.size(); i++) {
							%>
							<ul class="cart-header">
								<li class="ring-in"><a href="single.jsp"><img
										src="images/<%=dssanpham4.get(i).getSanPham().getHinhanh()%>"
										class="img-responsive" alt=""></a></li>
								<li><span><%=dssanpham4.get(i).getSanPham().getTensanpham()%></span></li>
								<li><span><%=dssanpham4.get(i).getSanPham().getGiaban()%></span></li>
								<li><span><%=dssanpham4.get(i).getSoLuong()%></span></li>
								<li><a href="XuLyXoaSanPhamTrongGio?maSanPham=<%=dssanpham4.get(i).getSanPham().getMasanpham() %>" class="add-cart cart-check">Xóa</a></li>
								<div class="clearfix"></div>
							</ul>
							<%
								}
							%>

						</div>
					</div>
				</div>
			</div>
			<div class="col-md-3 cart-total">
				<a class="continue" href="XemDanhSachSanPham">Tiếp tục mua sắm</a>

				<h4 class="last-price">Tổng Giá :</h4>
				<span class="total final"><%for(int i=0;i<dssanpham4.size();i++) %></span>
				<div class="clearfix"></div>
				<a class="order" href="#">Thanh toán</a>

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