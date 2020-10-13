<%@page import="model.SanPhamTrongGioHang"%>
<%@page import="dao.GioHangDAO"%>
<%@page import="dao.SanPhamDAO"%>
<%@page import="model.SanPham"%>
<%@page import="model.TaiKhoan"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
	<!-- start: Header -->
	<div class="navbar">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
				</a> <a class="brand" href="#"><span>Fast Car</span></a>

				<!-- start: Header Menu -->
				<div class="nav-no-collapse header-nav">
					<ul class="nav pull-right">


						<!-- start: User Dropdown -->
						<li class="dropdown"><a class="btn dropdown-toggle"
							data-toggle="dropdown" href="#"> <i
								class="halflings-icon white user"></i>
								<%
									TaiKhoan tk = (TaiKhoan) session.getAttribute("tk");
									if (tk != null) {
										out.print(tk.getTenKhachHang());
									}
								%> <span class="caret"></span>
						</a>
							<ul class="dropdown-menu">
								<li class="dropdown-menu-title"><span>Cài đặt tài
										khoản</span></li>
								
								<li><a href="SulyDangXuat"><i class="halflings-icon off"></i>
										Đăng xuất</a></li>
							</ul></li>
						<!-- end: User Dropdown -->
					</ul>
				</div>
				<!-- end: Header Menu -->

			</div>
		</div>
	</div>
</body>
</html>