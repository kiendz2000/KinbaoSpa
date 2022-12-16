package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.Dichvu293;

public class Dichvu293DAO extends DAO {

	public Dichvu293DAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dichvu293[] getAll() {
		String sql = "SELECT * FROM tbldichvu293";// câu lệnh sql
		ArrayList<Dichvu293> listDV = new ArrayList<Dichvu293>();
		Dichvu293[] result;
		ResultSet rs;
		try {
			Statement statement = this.con.createStatement();// dùng để thực thi câu lệnh
			rs = statement.executeQuery(sql);// thực thi không làm thay đổi dữ liệu
			int count = 0;
			while (rs.next()) {// đọc dòng tiếp theo của kết quả
				Dichvu293 dv = new Dichvu293(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
						rs.getString(5));
				listDV.add(dv);
			}
			result = new Dichvu293[count];
		} catch (Exception e) {
			return null;
		}
		return listDV.toArray(result);
	}

	public static void main(String[] args) {
		Dichvu293DAO dvdao = new Dichvu293DAO();
		Dichvu293[] listDV = dvdao.getAll();
		for (Dichvu293 e : listDV)
			System.out.println(e.toString());

	}
}
