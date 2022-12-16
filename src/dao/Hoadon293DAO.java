package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import model.Hoadon293;
import model.Lichhen293;
import model.Nguoidung293;
import model.Nhanvien293;
import model.Slot293;

public class Hoadon293DAO extends DAO {

	public Hoadon293DAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hoadon293[] getHoadonChuathanhtoan() {
		String sql = "SELECT hd.*,kh.hoten, kh.sodienthoai, sl.ten FROM tblhoadon293 hd\r\n"
				+ "inner join tblnguoidung293 kh on hd.tblNguoidung293KHid = kh.id  \r\n"
				+ "inner join tbllichhen293 lh on hd.tblLichhen293id = lh.id  \r\n"
				+ " inner join tblslot293 sl on sl.id = lh.tblSlot293id  \r\n" + "Where hd.trangthai ='CTT'";
		// câu lệnh sql
		ArrayList<Hoadon293> listHD = new ArrayList<Hoadon293>();
		Hoadon293[] result;
		ResultSet rs;
		try {
			Statement statement = this.con.createStatement();// dùng để thực thi câu lệnh
			rs = statement.executeQuery(sql);// thực thi không làm thay đổi dữ liệu
			int count = 0;
			while (rs.next()) {// đọc dòng tiếp theo của kết quả
				Hoadon293 hd = new Hoadon293(rs.getInt(1), rs.getDate(2),
						new Nguoidung293(rs.getString(8), rs.getString(9)),
						new Lichhen293(new Slot293(rs.getString(10))));
				listHD.add(hd);
				count++;
			}
			result = new Hoadon293[count];
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}

		return listHD.toArray(result);
	}

	public Hoadon293 getHoadonByID	(int Hoadon293id) {
		String sql = "SELECT  hd.id, kh.hoten, kh.sodienthoai,kh.email,kh.ngaysinh, hd.ngaytao,hd.trangthai, sl.ten FROM tblhoadon293 hd\r\n"
				+ "inner join tblnguoidung293 kh on hd.tblNguoidung293KHid = kh.id\r\n"
				+ "inner join tbllichhen293 lh on hd.tblLichhen293id = lh.id \r\n"
				+ "inner join tblslot293 sl on lh.tblSlot293id = sl.id\r\n"
				+ "Where hd.id =" + Hoadon293id;
		ResultSet rs;
		try {
			Statement statement = this.con.createStatement();
			rs = statement.executeQuery(sql);
			if (rs.next()) {
				Hoadon293 hd = new Hoadon293(rs.getInt(1),
						new Nguoidung293(rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5)),
						rs.getDate(6), rs.getString(7),
						new Lichhen293(new Slot293(rs.getString(8))));
				if (hd != null)
					return hd;
			}
			return null;
		} catch (Exception e) {
			return null;
		}
	}

	public boolean xacNhanHD(Hoadon293 hd) {
		if (!hd.getTrangThai().equals("CTT"))
			return false;
		if(hd.getNhanVienTN().getNguoiDung293().getId()==0 )
			return false;
		String sql = "UPDATE tblhoadon293 \r\n" + "SET trangthai = 'DTT' , tblNhanvien293TNid = ? \r\n" + "WHERE id = "
				+ hd.getId();
		try {
			this.con.setAutoCommit(false);

			PreparedStatement prepareStatement = this.con.prepareStatement(sql);
			prepareStatement.setInt(1, hd.getNhanVienTN().getNguoiDung293().getId());
			prepareStatement.executeUpdate();
			
			//
			this.con.commit();
			
			return true;

		} catch (SQLException e) {

			e.printStackTrace();
			return false;
		}
	}

	// test cac ham
//	public static void main(String[] args) {
//		SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
//
//		Hoadon293DAO hddao = new Hoadon293DAO();
//		Hoadon293[] listHD = hddao.getHoadonChuathanhtoan();
//		for (Hoadon293 hd : listHD) {
//			System.out.println(hd.getNguoiDungKH().getHoten() + hd.getNguoiDungKH().getSodienthoai()
//					+ hd.getLichHen().getSlot().getTen() + "Nawm" + formatDate.format(hd.getNgayTao()));
//		}
//
//		System.out.println("getbyID: ");
//		Hoadon293 hd = hddao.getHoadonByID(12004);
//		System.out.println("metmoi" + hd.getNgayTao().toString() + hd.getNguoiDungKH().getHoten()
//				+ hd.getNguoiDungKH().getSodienthoai());
//		int ndnvid = 12100;
//		int hdid = 12100;
//		Hoadon293 hd1 = new Hoadon293(hdid, new Nhanvien293(new Nguoidung293(ndnvid)));
//		if (hddao.xacNhanHD(hd1))
//			System.out.println("okok");
//		else {
//			System.out.println("giz ma");
//		}
//
//	}

}
