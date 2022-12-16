<!DOCTYPE html>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="model.Hoadonnguyenlieu293"%>
<%@page import="dao.Hoadonnguyenlieu293DAO"%>
<%@page import="model.HoadonNVDichvu293"%>
<%@page import="dao.HoadonNVDichvu293DAO"%>
<%@page import="model.NhanvienPVDichvu293"%>
<%@page import="model.Hoadon293"%>
<%@page import="dao.Hoadon293DAO"%>
<%@page import="model.Nhanvien293"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="vi">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Hoá đơn chi tiết</title>
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

SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
int hdid = Integer.parseInt(request.getParameter("hd_id"));

Hoadon293DAO hddao = new Hoadon293DAO();
Hoadon293 hd = hddao.getHoadonByID(hdid);
session.setAttribute("hoadon", hd);
if (hd == null) {
	request.setAttribute("mess", "Hoá đơn không tồn tại");
	request.getRequestDispatcher("gdThanhtoan.jsp").forward(request, response);
}

if (!hd.getTrangThai().equals("CTT")) {
	request.setAttribute("mess", "Không thể xem hoá đơn đã thanh toán");
	request.getRequestDispatcher("gdThanhtoan293.jsp").forward(request, response);
}

HoadonNVDichvu293DAO hddvdao = new HoadonNVDichvu293DAO();
HoadonNVDichvu293[] listHDDV = hddvdao.getNVDichvucuaHoadon(hdid);
session.setAttribute("dsNVdichvu", listHDDV);

Hoadonnguyenlieu293DAO hdnldao = new Hoadonnguyenlieu293DAO();
Hoadonnguyenlieu293[] listHDNL = hdnldao.getNguyenlieucuaHoadon(hdid);
%>

<body id="bodyy">
	<nav class="navbar navbar-light navbar-color"
		onclick="location.href='./gdNVThungan293.jsp'">
		<span class="navbar-brand mb-0 h1 grid wide">Kinbaos spa</span>
	</nav>

	<div class=" grid wide">
		<h3 class="username">
			Xin chào
			<%=nvtn.getNguoiDung293().getHoten()%></h3>
	</div>

	<div class="payment-title grid wide">
		Hoá đơn cho khách hàng
		<%=hd.getNguoiDungKH().getHoten()%></div>
	<div class="bill-detail-content grid wide">
		<div class="row">
			<div class="col-4">
				<div class="bill-detail__info">
					<div class="row">
						<div class="col-6">
							<p class="info-tile">Mã hoá đơn:</p>
							<p class="info-tile">Khách hàng:</p>
							<p class="info-tile">Số điện thoại:</p>
							<p class="info-tile">Email:</p>
							<p class="info-tile">Ngày sinh:</p>
							<p class="info-tile">Ngày sử dụng:</p>
							<p class="info-tile">Slot:</p>

						</div>
						<div class="col-6">
							<p class="info-content"><%="HD" + hd.getId()%></p>
							<p class="info-content"><%=hd.getNguoiDungKH().getHoten()%></p>
							<p class="info-content"><%=hd.getNguoiDungKH().getSodienthoai()%></p>
							<p class="info-content"><%=hd.getNguoiDungKH().getEmail()%></p>
							<p class="info-content"><%=formatDate.format(hd.getNguoiDungKH().getNgaySinh())%></p>
							<p class="info-content"><%=formatDate.format(hd.getNgayTao())%></p>
							<p class="info-content"><%=hd.getLichHen().getSlot().getTen()%></p>
						</div>
					</div>

				</div>

			</div>
			<div class="col-8 bill-detail__table">
				<table class="table table-bordered payment-table ">
					<thead class="payment-table__thead">
						<tr>
							<th scope="col">STT</th>
							<th scope="col">ID</th>
							<th scope="col">Tên</th>
							<th scope="col">Chủng loại</th>
							<th scope="col">Đơn giá</th>
							<th scope="col">Số lượng</th>
							<th scope="col">Thành tiền</th>
						</tr>
					</thead>
					<tbody>
						<%
						int count = 0;
						int tong = 0;
						for (int i = 0; i < listHDDV.length; i++) {
							count++;
							int dongia = listHDDV[i].getDonGia();
							int soluong = listHDDV[i].getSoLuong();
							tong += dongia * soluong;
						%>
						<tr class="table__row">
							<td class="table__content"><%=count%></td>
							<td class="table__content"><%="DV" + listHDDV[i].getNhanVienPVDichVu().getDichVu().getId()%></td>
							<td class="table__content"><%=listHDDV[i].getNhanVienPVDichVu().getDichVu().getTen()%></td>
							<td class="table__content">Dịch vụ</td>
							<td class="table__content"><%=dongia%></td>
							<td class="table__content"><%=soluong%></td>
							<td class="table__content"><%=dongia * soluong%></td>

						</tr>
						<%
						}
						%>

						<%
						for (int i = 0; i < listHDNL.length; i++) {
							count++;
							int dongia = listHDNL[i].getDonGia();
							int soluong = listHDNL[i].getSoLuong();
							tong += dongia * soluong;
						%>
						<tr class="table__row">
							<td class="table__content"><%=count%></td>
							<td class="table__content"><%="NL" + listHDNL[i].getNguyenLieu().getId()%></td>
							<td class="table__content"><%=listHDNL[i].getNguyenLieu().getTen()%></td>
							<td class="table__content">Nguyên liệu</td>
							<td class="table__content"><%=dongia%></td>
							<td class="table__content"><%=soluong%></td>
							<td class="table__content"><%=dongia * soluong%></td>

						</tr>
						<%
						}
						%>
						<tr class="table__row">
							<td colspan="6" class="table__content ">Tổng:</td>

							<td class="table__content"><%=tong%></td>

						</tr>
					</tbody>
				</table>
				<p style="color: red; margin-bottom: 20px" class="text">${mess}
				<p>
					<button id="btn" type="button" class="btn btn-warning btn-payment"
						onclick="dieu_huong()">Xác nhận thanh toán</button>
			</div>
		</div>
	</div>
	<script>
		function dieu_huong() {
			window.open("gdInhoadon293.jsp")
			window.location.assign("doXacnhanHD293.jsp")
		}
	</script>
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