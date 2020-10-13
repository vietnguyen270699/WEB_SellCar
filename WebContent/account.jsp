<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String mesname = request.getAttribute("mesusername") == null
			? ""
			: (String) request.getAttribute("mesusername");
%>
<!DOCTYPE html>
<html>
<head>
<title>Wedding Store A Ecommerce Category Flat Bootstrap
	Responsive Website Template | Account :: w3layouts</title>
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
	<div class="container">
		<ol class="breadcrumb">
			<li><a href="index.jsp">Trang Chủ</a></li>
			<li class="active">Tài khoản</li>
		</ol>
		<div class="registration">
			<div class="registration_left">
				<h2>
					Chưa có tài khoản? <span>Tạo tài khoản</span>
				</h2>
				<!-- [if IE] 
				< link rel='stylesheet' type='text/css' href='ie.css'/>  
			 [endif] -->

				<!-- [if lt IE 7]>  
				< link rel='stylesheet' type='text/css' href='ie6.css'/>  
			 <! [endif] -->
				<script>
					(function() {

						// Create input element for testing
						var inputs = document.createElement('input');

						// Create the supports object
						var supports = {};

						supports.autofocus = 'autofocus' in inputs;
						supports.required = 'required' in inputs;
						supports.placeholder = 'placeholder' in inputs;

						// Fallback for autofocus attribute
						if (!supports.autofocus) {

						}

						// Fallback for required attribute
						if (!supports.required) {

						}

						// Fallback for placeholder attribute
						if (!supports.placeholder) {

						}

						// Change text inside send button on submit
						var send = document.getElementById('register-submit');
						if (send) {
							send.onclick = function() {
								this.innerHTML = '...Sending';
							}
						}

					})();
				</script>
				<div class="registration_form">
					<!-- Form -->
					<form id="registration_form" action="SuLyDangKy" method="post">
						<div>
							<label> <input placeholder="Tên Tài Khoản:" type="text"
								tabindex="1" name="tentaikhoan" required autofocus>
							</label>
							<p style="color: red">
								<%=mesname%>
							</p>
						</div>
						<div>
							<label> <input placeholder="Mật khẩu:" type="password"
								tabindex="2" name="matkhau" required autofocus>
							</label>
						</div>
						<div>
							<label> <input placeholder="Tên người dùng:" type="text"
								tabindex="3" name="tenkhachhang" required>
							</label>
						</div>

						<div class="sky_form1">
							<ul>
								<li><label class="radio left"><input type="radio"
										name="gioitinh" value="Nam" checked><i></i>Nam</label></li>
								<li><label class="radio"><input type="radio"
										name="gioitinh" value="Nữ"><i></i>Nữ</label></li>
								<div class="clearfix"></div>
							</ul>
						</div>
						<div>
							<label> <input placeholder="Số điện thoại:" type="text"
								tabindex="4" name="sodienthoai" required>
							</label>
						</div>
						<div>
							<label> <input placeholder="Địa chỉ:" type="text"
								tabindex="5" name="diachi" required>
							</label>
						</div>
						<div>
							<input type="submit" value="create an account"
								id="register-submit">
						</div>

					</form>
					<!-- /Form -->
				</div>
			</div>

			<!---->

			<!---->
			<div class="footer">
				<div class="container">
					<jsp:include page="footer/footer1.jsp"></jsp:include>
					<div class="clearfix"></div>
				</div>
			</div>
</body>
</html>