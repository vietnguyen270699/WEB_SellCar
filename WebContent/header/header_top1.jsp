<%@page import="model.SanPhamTrongGioHang"%>
<%@page import="dao.GioHangDAO"%>
<%@page import="dao.SanPhamDAO"%>
<%@page import="model.SanPham"%>
<%@page import="model.TaiKhoan"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
	<div class="header_top-sec">
		<div class="top_left">
			<ul>
				<%
					TaiKhoan tk = (TaiKhoan) session.getAttribute("user");
				%>
				<%
					if (tk != null) {
				%><li class="top_link">Tài Khoản :<a href="#">
						<li class="top_link"><a href="login.jsp"><%=tk.getTenKhachHang()%></a></li>|
						<li class="top_link"><a href="SulyDangXuat">Đăng Xuất</a></li> <%
 	} else {
 %>
				</a></li>
				<li class="top_link"><a href="login.jsp">Đăng Nhập</a></li>|
				<li class="top_link"><a href="account.jsp">Đăng Ký</a></li>
				<%
					}
				%>
			</ul>
		</div>
		<div class="clearfix"></div>
	</div>
	</div>
	</div>
	<div class="header-top">
		<div class="header-bottom">
			<div class="container">
				<div class="logo">
					<a href="index.jsp"><h1>FAST Car</h1></a>
				</div>
				<!---->

				<div class="top-nav">
					<ul class="memenu skyblue">
						<li class="active"><a href="index.jsp">Trang Chủ</a></li>

						<li class="grid"><a href="XemDanhSachSanPham">Sản Phẩm</a></li>
						<li class="grid"><a href="contact.jsp">Liên Hệ</a></li>
					</ul>
					<div class="clearfix"></div>
				</div>
				<!---->
				<div class="cart box_1">
					<a href="checkout.jsp">
						<h3>
							<%
								ArrayList<SanPhamTrongGioHang> dssanpham4 = new GioHangDAO().getGioHang();
							%>
							<div class="total">
								(<%
								out.print(dssanpham4.size());
							%>) Giỏ hàng
							</div>
							<span class="glyphicon glyphicon-shopping-cart"
								aria-hidden="true"></span>
						</h3>
					</a>
					<p></p>
					<div class="clearfix"></div>
				</div>
				<div class="clearfix"></div>
				<!---->
			</div>
			<div class="clearfix"></div>
</body>
</html>