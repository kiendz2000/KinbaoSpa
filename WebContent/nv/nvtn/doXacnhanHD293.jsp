<%@page import="java.util.TreeSet"%>
<%@page import="dao.HoadonNVDichvu293DAO"%>
<%@page import="dao.Nhanvien293DAO"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="dao.Hoadon293DAO"%>
<%@page import="model.Hoadon293"%>
<%@page import="model.Nhanvien293"%>
<%@page import="model.HoadonNVDichvu293"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Nhanvien293 nvtn = (Nhanvien293) session.getAttribute("nhanvienthungan");

	if (nvtn == null) {
		response.sendRedirect("../../nd/gdDangnhap293.jsp");
		return;
	}
	session.setAttribute("nhanvienthungan", nvtn);
	Hoadon293 hd = (Hoadon293) session.getAttribute("hoadon");
	Hoadon293DAO hddao = new Hoadon293DAO();
	HoadonNVDichvu293[] listHDDV = (HoadonNVDichvu293[]) session.getAttribute("dsNVdichvu");
	hd.setNhanVienTN(nvtn);
	if (!hddao.xacNhanHD(hd)) {
		request.setAttribute("mess", "Không thể xác nhận hoá đơn");
		request.getRequestDispatcher("gdHoadonchitiet293.jsp?hd_id=" + hd.getId()).forward(request, response);
	} else {
		TreeSet<Integer> listNV = new TreeSet<Integer>();
		for (HoadonNVDichvu293 hdnv : listHDDV) {
			listNV.add(hdnv.getNhanVienPVDichVu().getNhanVienPV().getNguoiDung293().getId());
		}
		Nhanvien293DAO nvdao = new Nhanvien293DAO();
		for (Integer nvid : listNV) {
			nvdao.updateTrangthai(nvid);
		}
		response.sendRedirect("gdThanhtoan293.jsp");
	}
	%>

</body>
</html>