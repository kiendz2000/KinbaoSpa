package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Nhanvien293DAO extends DAO {

	public Nhanvien293DAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int updateTrangthai(int nvid) {
		int count = 0;
		String sql = "UPDATE tblnhanvien293 \r\n" + "SET  dangban = 0 \r\n" + "WHERE tblnguoidung293id = " + nvid;
		try {
			this.con.setAutoCommit(false);
			PreparedStatement prepareStatement = this.con.prepareStatement(sql);
			count = prepareStatement.executeUpdate();

			 this.con.commit();
			return count;

		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
//	public static void main(String[] args) {
//		Nhanvien293DAO nvdao =new Nhanvien293DAO();
//		System.out.println(nvdao.updateTrangthai(2004));
//	}

}
