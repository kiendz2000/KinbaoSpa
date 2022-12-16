<%@page import="model.Nhanvien293"%>
<%@page import="model.Nguoidung293"%>
<%@page import="dao.Nguoidung293DAO"%>
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
            Nguoidung293DAO dao = new Nguoidung293DAO();
            String tendangnhap = request.getParameter("tendangnhap");

            String matkhau = request.getParameter("matkhau");

            Nguoidung293 nd = dao.check(tendangnhap, matkhau);

            if (nd == null) {
                request.setAttribute("mess", "Sai tên đăng nhập hoặc mật khẩu");
                request.getRequestDispatcher("./gdDangnhap293.jsp").forward(request, response);
            } else {
                session.setAttribute("acc", nd);
                String vaitro = nd.getVaiTro();
                if(vaitro.equals("KH")){
                	Nguoidung293 kh =nd;
                    session.setAttribute("khachhang", kh);
                    response.sendRedirect("../kh/gdKhachhang293.jsp");
                }else if(vaitro.equals("QL")){
                    
                    Nguoidung293 ql = nd;
                    session.setAttribute("quanly", ql);
                    response.sendRedirect("../quanly/gdQuanLy293.jsp");
                }else if(vaitro.equals("NVTN")){
                    Nhanvien293 nvtn = new Nhanvien293(nd);
                    session.setAttribute("nhanvienthungan", nvtn);
                    response.sendRedirect("../nv/nvtn/gdNVThungan293.jsp");
                }
                else if(vaitro.equals("NVPV")){
                	Nhanvien293 nvpv = new Nhanvien293(nd);
                    session.setAttribute("nhanvienphucvu", nvpv);
                    response.sendRedirect("../nv/nvtn/gdNVPhucvu293.jsp");
                }
                else if(vaitro.equals("NVS")){
                	Nhanvien293 nvs = new Nhanvien293(nd);
                    session.setAttribute("nhanviensale", nvs);
                    response.sendRedirect("../nv/nvtn/gdNVSale293.jsp");
                }

            }
        %>

</body>
</html>