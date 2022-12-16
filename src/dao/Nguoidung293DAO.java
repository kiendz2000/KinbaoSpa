package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Nguoidung293;

public class Nguoidung293DAO extends DAO {

	public Nguoidung293DAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Nguoidung293 check(String tendangnhap, String matkhau) {
		String sql = "Select * from tblnguoidung293 " + "WHERE tendangnhap = ? AND matkhau = ?";
		ResultSet rs;
		try {
			PreparedStatement prepareStatement = this.con.prepareStatement(sql);
			prepareStatement.setString(1, tendangnhap);
			prepareStatement.setString(2, matkhau);
			rs = prepareStatement.executeQuery();
			if (rs.next()) {
				Nguoidung293 nd = new Nguoidung293(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getDate(5), rs.getString(6), rs.getString(7), rs.getString(8));
				nd.setId(rs.getInt("id"));
				return nd;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

}
