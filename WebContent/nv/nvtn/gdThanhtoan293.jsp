
<!DOCTYPE html>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="model.Hoadon293"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.Hoadon293DAO"%>
<%@page import="model.Nhanvien293"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="vi">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Thanh toán</title>
<link href="../../style/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

</head>

<%
Nhanvien293 nvtn = (Nhanvien293) session.getAttribute("nhanvienthungan");

if (nvtn == null) {
	response.sendRedirect("../../nd/gdDangnhap293.jsp");
	return;
}
session.setAttribute("nhanvienthungan", nvtn);

Hoadon293DAO hddao = new Hoadon293DAO();
Hoadon293[] listHD = hddao.getHoadonChuathanhtoan();
SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
%>
<body id="bodyy">
	<nav class="navbar navbar-light navbar-color"
		onclick="location.href='./gdNVThungan293.jsp'">
		<span class="navbar-brand mb-0 h1 grid wide">Kinbaos spa</span>
	</nav>

	<div id="xinchao" class=" grid wide">
		<h3 class="username">
			Xin chào
			<%=nvtn.getNguoiDung293().getHoten()%></h3>
	</div>

	<div class="payment-title grid wide">Hoá đơn chưa thanh toán</div>
	<%
	if (listHD.length == 0) {
	%>
	<div id="xinchao" class=" grid wide">
		<h3 class="username"
			style="text-align: center; font-size: 25px; font-style: italic; color: #0984e3">
			Rất tiếc không có hoá đơn chưa thanh toán</h3>
	</div>
	<%
	} else {
	%>
	<div class="payment-content grid wide ">
	<p style="color: red; margin-bottom: 20px; margin-top: 20px" class = "text">${mess}<p>
		<table class="table table-bordered payment-table ">
			<thead class="payment-table__thead" id="tbl2">
				<tr>
					<th scope="col">STT</th>
					<th scope="col">Họ và tên</th>
					<th scope="col">Mã hoá đơn</th>
					<th scope="col">SDT</th>
					<th scope="col">Slot</th>
					<th scope="col">Ngày</th>
				</tr>
			</thead>
			<tbody>
				<%
				int count = 0;
				for (int i = 0; i < listHD.length; i++) {
					count++;
				%>

				<tr class="table__row"
					onclick="location.href=<%="'gdHoadonchitiet293.jsp?hd_id=" + listHD[i].getId() + "'"%>">
					<td class="table__content"><%=count%></td>
					<td class="table__content"><%=listHD[i].getNguoiDungKH().getHoten()%></td>
					<td class="table__content"><%="HD"+listHD[i].getId()%></td>
					<td class="table__content"><%=listHD[i].getNguoiDungKH().getSodienthoai()%></td>
					<td class="table__content"><%=listHD[i].getLichHen().getSlot().getTen()%></td>
					<td class="table__content"><%=formatDate.format(listHD[i].getNgayTao())%></td>
				</tr>
				<%
				}
				%>

			</tbody>
		</table>
	</div>
	<%
	}
	%>




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