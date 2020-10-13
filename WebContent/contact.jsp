<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Wedding Store A Ecommerce Category Flat Bootstrap Responsive Website Template | Contact :: w3layouts</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Wedding Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- start menu -->
<script src="js/simpleCart.min.js"> </script>
<!-- start menu -->
<link href="css/memenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/memenu.js"></script>
<script>$(document).ready(function(){$(".memenu").memenu();});</script>	
<!-- /start menu -->
</head>
<body> 
<!--header-->	
<div class="top_bg">
	<div class="container">
		<jsp:include page="header/header_top1.jsp"></jsp:include>
			
			 <!---->			 
			 </div>
			<div class="clearfix"> </div>
	  </div>
</div>
<!---->
<div class="contact">
	  <div class="container">
		 <ol class="breadcrumb">
		  <li><a href="index.jsp">Trang Chủ</a></li>
		  <li class="active">Liên hệ</li>
		 </ol>
			<!---start-contact---->
			<h3>Liên hệ với chúng tôi</h3>
		  <div class="section group">				
				<div class="col-md-6 span_1_of_3">
					
      			<div class="company_address">
				     	<h4>Thông tin công ty :</h4>
						    	<p>Tịnh_Việt_Thông</p>
						   		<p>Đại học Nông Lâm TPHCM</p>
						   		<p>Việt Nam</p>
				   		<p>SĐT: (+84) 999 999 999</p>
				 	 	<p>Email: <a href="mailto:info@example.com">info@mycompany.com</a></p>
				   </div>
				</div>				
				<div class="col-md-6 span_2_of_3">
				  <div class="contact-form">
					    <form action="contactservlet" method=post>
					    	<div>
						    	<span><label>Tên người dùng</label></span>
						    	<span><input name="name" type="text" class="textbox"></span>
						    </div>
						    <div>
						    	<span><label>E-MAIL</label></span>
						    	<span><input name="email" type="text" class="textbox"></span>
						    </div>
						    <div>
						     	<span><label>Số điện thoại</label></span>
						    	<span><input name="mobile" type="text" class="textbox"></span>
						    </div>
						    <div>
						    	<span><label>Góp ý- Ý kiến</label></span>
						    	<span><textarea name="content"> </textarea></span>
						    </div>
						   <div>
						   		<span><input type="submit" class="mybutton" value="Submit"></span>
						  </div>
					    </form>

				    </div>
  				</div>				
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