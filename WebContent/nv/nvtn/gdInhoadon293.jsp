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
<title>In hoá đơn</title>
<link href="../../style/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

</head>
<%
Hoadon293 hoadon = (Hoadon293) session.getAttribute("hoadon");

SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
int hdid = hoadon.getId();

Hoadon293DAO hddao = new Hoadon293DAO();
Hoadon293 hd = hddao.getHoadonByID(hdid);
HoadonNVDichvu293DAO hddvdao = new HoadonNVDichvu293DAO();
HoadonNVDichvu293[] listHDDV = hddvdao.getNVDichvucuaHoadon(hdid);

Hoadonnguyenlieu293DAO hdnldao = new Hoadonnguyenlieu293DAO();
Hoadonnguyenlieu293[] listHDNL = hdnldao.getNguyenlieucuaHoadon(hdid);
%>

<body id="bodyy">
	<nav class="navbar navbar-light navbar-color"
		onclick="location.href='./gdNVThungan293.jsp'">
		<span class="navbar-brand mb-0 h1 grid wide">Kinbaos spa</span>
	</nav>

	<div class=" grid wide">
		<h3 class="bill-title">Hóa đơn bán hàng</h3>
	</div>

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
					<button id="btnin" type="button"
						class="btn btn-warning btn-payment" onclick="window.print()">In
						hoá đơn</button>
				</div>
			</div>
		</div>
</body>



</html>