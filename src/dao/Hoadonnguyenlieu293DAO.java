package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.Hoadonnguyenlieu293;
import model.Nguyenlieu293;

public class Hoadonnguyenlieu293DAO extends DAO {

	public Hoadonnguyenlieu293DAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hoadonnguyenlieu293[] getNguyenlieucuaHoadon(int hoaDonID) {
		String sql = "SELECT hdnl.id as 'hdnlid',nl.id, nl.ten, hdnl.dongia, hdnl.soluong FROM tblhoadonnguyenlieu293 hdnl\r\n"
				+ "inner join tblnguyenlieu293 nl on hdnl.tblNguyenlieu293id=nl.id\r\n" + "Where hdnl.tblHoadon293id ="
				+ hoaDonID;
		// câu lệnh sql
		ArrayList<Hoadonnguyenlieu293> listHDNL = new ArrayList<Hoadonnguyenlieu293>();
		Hoadonnguyenlieu293[] result;
		ResultSet rs;
		try {
			Statement statement = this.con.createStatement();// dùng để thực thi câu lệnh
			rs = statement.executeQuery(sql);// thực thi không làm thay đổi dữ liệu
			int count = 0;
			while (rs.next()) {// đọc dòng tiếp theo của kết quả
				Hoadonnguyenlieu293 hdnl = new Hoadonnguyenlieu293(rs.getInt(1),rs.getInt(5), rs.getInt(4),
						new Nguyenlieu293(rs.getInt(2), rs.getString(3)));
				listHDNL.add(hdnl);
				count++;
			}
			result = new Hoadonnguyenlieu293[count];
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}

		return listHDNL.toArray(result);
	}
	// test cac ham
//	public static void main(String[] args) {
//		Hoadonnguyenlieu293DAO hdnldao = new Hoadonnguyenlieu293DAO();
//		Hoadonnguyenlieu293[] listHDNL = hdnldao.getNguyenlieucuaHoadon(12001);
//		for (Hoadonnguyenlieu293 hdnl : listHDNL) {
//			System.out.println(hdnl.getId() 
//					+ hdnl.getNguyenLieu().getTen()
//					+ hdnl.getDonGia()
//					+ hdnl.getSoLuong());
//		}
//	}
}
