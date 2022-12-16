
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html lang="vi">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Đăng nhập</title>
<link href="../style/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>

<body>
	<%
	session.setAttribute("acc", null);
	session.setAttribute("khachhang", null);
	session.setAttribute("quanly", null);
	session.setAttribute("nhanvienthungan", null);
	session.setAttribute("nhanvienphucvu", null);
	session.setAttribute("nhanviensale", null);
	%>
	<nav class="navbar navbar-light navbar-color">
		<span class="navbar-brand mb-0 h1 grid wide">Kinbaos spa</span>
	</nav>


	<div class="login-form">
		<form action="doDangnhap293.jsp" method="post">
			<h1>Đăng nhập</h1>
			<div class="input-box">
				<i></i> <input name="tendangnhap" type="text"
					placeholder="Nhập tên đăng nhập">
			</div>
			<div class="input-box">
				<i></i> <input name="matkhau" type="password"
					placeholder="Nhập mật khẩu">
			</div>
			<p style="color: red; margin-bottom: 20px" class = "text">${mess}<p>
			<div class="btn-box">
				<button type="submit">Đăng nhập</button>
			</div>
		</form>
	</div>



</body>
<!-- Site footer -->
<footer class="site-footer" style="border-top: 2px solid rgb(1, 1, 1);">
	<span class="navbar-brand mb-0 h1 grid wide"
		style="margin-left: 645px;">Kinbaos spa</span>
	<div class="container" style="margin-top: 30px;">
		<div class="row">
			<div class="col-sm-12 col-md-6">
				<h6>Thông tin</h6>
				<span style="font-style: normal; font-size: 16px;"><strong>Địa
						chỉ: </strong>15/12-15/14 và 15/18-15/20<strong> </strong>Nguyễn Thiện
					Thuật, phường Lộc Thọ, thành phố Nha Trang, tỉnh Khánh Hòa<br /> <strong>Mã
						số thuế: 4201647147 </strong><br /> <strong>Ngày cấp: 09/06/2015</strong>
				</span>
			</div>

			<div class="col-xs-6 col-md-3">
				<h6>Hệ thống cửa hàng</h6>
				<p>
					<span style="font-size: 16px;"><strong><span><u>KinbaoSpa:</u></span><br />
							<span>1.</span></strong><span> <strong>KinbaoSpa Beauty
								Skincare</strong> <br /> <strong>2.</strong> <strong>KinbaoSpa
								Healthy Spa & Eva</strong><br /> <strong>3. KinbaoSpa Beauty
								Salon </strong></span><br /> <strong>Address:</strong> 15/12-15/14 và
						15/18-15/20 Nguyễn Thiện Thuật, Nha Trang</span>
				</p>
			</div>

			<div class="col-xs-6 col-md-3">
				<h6>Liên hệ</h6>
				<p>
					<span style="font-size: 16px;"><strong>Điện thoại</strong>:
						<span></span>
				</p>
				<p>
					<span style="font-size: 16px;"> <span
						style="font-size: 16px;"> <span><strong>
									032 6713939</strong></span>
				</p>
				<p>
					<span style="font-size: 16px;"> <span
						style="font-size: 16px;"> <span><strong>
									093 5826179</strong></span>
				</p>
			</div>
		</div>
		<hr>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-md-8 col-sm-6 col-xs-12">
				<p class="copyright-text">Copyright &copy; 2022 All Rights
					Reserved by KinbaoSpa</p>
			</div>


		</div>
	</div>
</footer>

</html>