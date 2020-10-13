<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>

<!-- start: Meta -->
<meta charset="utf-8">
<title>Admin Fast Car</title>
<meta name="description" content="Bootstrap Metro Dashboard">
<meta name="author" content="Dennis Ji">
<meta name="keyword"
	content="Metro, Metro UI, Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
<!-- end: Meta -->

<!-- start: Mobile Specific -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- end: Mobile Specific -->

<!-- start: CSS -->
<link id="bootstrap-style" href="css/bootstrap1.min.css"
	rel="stylesheet">
<link href="css/bootstrap-responsive1.min.css" rel="stylesheet">
<link id="base-style" href="css/style1.css" rel="stylesheet">
<link id="base-style-responsive" href="css/style-responsive1.css"
	rel="stylesheet">
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&subset=latin,cyrillic-ext,latin-ext'
	rel='stylesheet' type='text/css'>
<!-- end: CSS -->


<!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
	  	<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<link id="ie-style" href="admin/css/ie.css" rel="stylesheet">
	<![endif]-->

<!--[if IE 9]>
		<link id="ie9style" href="admin/css/ie9.css" rel="stylesheet">
	<![endif]-->

<!-- start: Favicon -->
<link rel="shortcut icon" href="img/favicon.ico">
<!-- end: Favicon -->





</head>

<body>
	<!--header-->
	<div class="top_bg">
		<div class="container">
			<jsp:include page="header/headeradmin.jsp"></jsp:include>
		</div>
	</div>
	<!---->
	<!-- start: Header -->

	<div class="container-fluid-full">
		<div class="row-fluid">

			<!-- start: Main Menu -->
			<div id="sidebar-left" class="span2">
				<div class="nav-collapse sidebar-nav">
					<ul class="nav nav-tabs nav-stacked main-menu">
						
						<li><a href="XuLyXemTaiKhoan"><i
								class="icon-align-justify"></i><span class="hidden-tablet">
									Quản lý tài khoản</span></a></li>
						<li><a href="AdminXuLyXemDanhSachSanPham"><i
								class="icon-align-justify"></i><span class="hidden-tablet">
									Quản lý xe</span></a></li>
						<li><a href="adminlogin.jsp"><i class="icon-lock"></i><span
								class="hidden-tablet"> Đăng nhập Page</span></a></li>
					</ul>
				</div>
			</div>
			<!-- end: Main Menu -->

			<noscript>
				<div class="alert alert-block span10">
					<h4 class="alert-heading">Warning!</h4>
					<p>
						You need to have <a href="http://en.wikipedia.org/wiki/JavaScript"
							target="_blank">JavaScript</a> enabled to use this site.
					</p>
				</div>
			</noscript>

			<!-- start: Content -->
			<div id="content" class="span10">


				<ul class="breadcrumb">
					<li><i class="icon-home"></i> <a href="index.html">Trang
							chủ</a> <i class="icon-angle-right"></i></li>
					<li><i class="icon-edit"></i> <a href="#">Forms</a></li>
				</ul>


				<div class="row-fluid sortable">
					<div class="box span12">
						<div class="box-header" data-original-title>
							<h2>
								<i class="halflings-icon white edit"></i><span class="break"></span>Sửa
								sản phẩm
							</h2>
							<div class="box-icon">
								<a href="#" class="btn-setting"><i
									class="halflings-icon white wrench"></i></a> <a href="#"
									class="btn-minimize"><i
									class="halflings-icon white chevron-up"></i></a> <a href="#"
									class="btn-close"><i class="halflings-icon white remove"></i></a>
							</div>
						</div>
					
						<div class="box-content">

							<form class="form-horizontal" action="XuLySuaTaiKhoan" method="post">
								<fieldset>
									<div class="control-group">
										<label class="control-label" for="focusedInput"  >Tên tài khoản</label>
										<div class="controls">
											<input class="input-xlarge focused" id="focusedInput"
												type="text" name="tentaikhoan" value="${xemtk.getTenTaiKhoan() }"  >
										</div>
									</div>
									<div class="control-group">
										<label class="control-label" for="focusedInput"  >Mật khẩu mới</label>
										<div class="controls">
											<input class="input-xlarge focused" id="focusedInput"
												type="password" value="${xemtk.getMatKhau()}" name="matkhau" >
										</div>
									</div>
									<div class="control-group">
										<label class="control-label" for="focusedInput" >Tên khách hàng</label>
										<div class="controls">
											<input class="input-xlarge focused" id="focusedInput"
												type="text" value="${xemtk.getTenKhachHang()}" name="tenkhachhang" >
										</div>
									</div>
									<div class="control-group">
										<label class="control-label" for="focusedInput" >Giới tính</label>
										<div class="controls">
											<input class="input-xlarge focused" id="focusedInput"
												type="text" value="${xemtk.getGioiTinh()}" name="gioitinh" >
										</div>
									</div>
									<div class="control-group">
										<label class="control-label" for="focusedInput" >Số điện thoại</label>
										<div class="controls">
											<input class="input-xlarge focused" id="focusedInput"
												type="text" value="${xemtk.getSoDienThoai()}" name="sodienthoai" >
										</div>
									</div>
									<div class="control-group">
										<label class="control-label" for="focusedInput" >Địa chỉ</label>
										<div class="controls">
											<input class="input-xlarge focused" id="focusedInput"
												type="text" value="${xemtk.getDiaChi()}" name="diachi" >
										</div>
									</div>
								<div class="control-group">
										<label class="control-label" for="focusedInput" >Role</label>
										<div class="controls">
											<input class="input-xlarge focused" id="focusedInput"
												type="text" value="${xemtk.getRole()}" name="role" >
										</div>
									</div>
									
									<div class="form-actions">
										<button type="submit" class="btn btn-primary" id="register-submit">Lưu</button>
										<a class="btn" href="XuLyXemTaiKhoan">Hủy</a>
									</div>
								</fieldset>
							</form>

						</div>
					</div>
					<!--/span-->

				</div>
				<!--/row-->



			</div>
			<!--/.fluid-container-->

			<!-- end: Content -->
		</div>
		<!--/#content.span10-->

	<!--/fluid-row-->

	<div class="modal hide fade" id="myModal">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal">×</button>
			<h3>Settings</h3>
		</div>
		<div class="modal-body">
			<p>Here settings can be configured...</p>
		</div>
		<div class="modal-footer">
			<a href="#" class="btn" data-dismiss="modal">Close</a> <a href="#"
				class="btn btn-primary">Save changes</a>
		</div>
	</div>

	<div class="clearfix"></div>

	<footer>

		<p>
			<span style="text-align: left; float: left">&copy; 2019 <a
				href="http://themifycloud.com/downloads/janux-free-responsive-admin-dashboard-template/"
				alt="Bootstrap_Metro_Dashboard">Fast Car</a></span>

		</p>

	</footer>

	<!-- start: JavaScript-->

	<script src="js/jquery-1.9.1.min.js"></script>
	<script src="js/jquery-migrate-1.0.0.min.js"></script>

	<script src="js/jquery-ui-1.10.0.custom.min.js"></script>

	<script src="js/jquery.ui.touch-punch.js"></script>

	<script src="js/modernizr.js"></script>

	<script src="js/bootstrap.min.js"></script>

	<script src="js/jquery.cookie.js"></script>

	<script src='js/fullcalendar.min.js'></script>

	<script src='js/jquery.dataTables.min.js'></script>

	<script src="js/excanvas.js"></script>
	<script src="js/jquery.flot.js"></script>
	<script src="js/jquery.flot.pie.js"></script>
	<script src="js/jquery.flot.stack.js"></script>
	<script src="js/jquery.flot.resize.min.js"></script>

	<script src="js/jquery.chosen.min.js"></script>

	<script src="js/jquery.uniform.min.js"></script>

	<script src="js/jquery.cleditor.min.js"></script>

	<script src="js/jquery.noty.js"></script>

	<script src="js/jquery.elfinder.min.js"></script>

	<script src="js/jquery.raty.min.js"></script>

	<script src="js/jquery.iphone.toggle.js"></script>

	<script src="js/jquery.uploadify-3.1.min.js"></script>

	<script src="js/jquery.gritter.min.js"></script>

	<script src="js/jquery.imagesloaded.js"></script>

	<script src="js/jquery.masonry.min.js"></script>

	<script src="js/jquery.knob.modified.js"></script>

	<script src="js/jquery.sparkline.min.js"></script>

	<script src="js/counter.js"></script>

	<script src="js/retina.js"></script>

	<script src="js/custom.js"></script>
	<!-- end: JavaScript-->

</body>
</html>
