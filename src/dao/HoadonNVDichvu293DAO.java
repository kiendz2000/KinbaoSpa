package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.Dichvu293;
import model.HoadonNVDichvu293;
import model.Nguoidung293;
import model.Nhanvien293;
import model.NhanvienPVDichvu293;

public class HoadonNVDichvu293DAO extends DAO {

	public HoadonNVDichvu293DAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HoadonNVDichvu293[] getNVDichvucuaHoadon(int hoaDonID) {
		String sql = "SELECT dv.id, dv.ten, hddv.giaDV, hddv.soluong, nd.id as \"nhanvienpvid\" FROM tblhoadonnvdichvu293 hddv\r\n"
				+ "inner join tblnhanvienpvdichvu293 nvdv on hddv.tblNhanvienPVDichvu293id=nvdv.id\r\n"
				+ "inner join tbldichvu293 dv on nvdv.tblDichvu293id=dv.id\r\n"
				+ "inner join tblnhanvien293 nv on nvdv.tblNhanvien293PVid=nv.tblNguoidung293id\r\n"
				+ "inner join tblnguoidung293 nd on nv.tblNguoidung293id=nd.id\r\n"
				+ "Where hddv.tblHoadon293id = "
				+ hoaDonID;
		// câu lệnh sql
		ArrayList<HoadonNVDichvu293> listHDDV = new ArrayList<HoadonNVDichvu293>();
		HoadonNVDichvu293[] result;
		ResultSet rs;
		try {
			Statement statement = this.con.createStatement();// dùng để thực thi câu lệnh
			rs = statement.executeQuery(sql);// thực thi không làm thay đổi dữ liệu
			int count = 0;
			while (rs.next()) {// đọc dòng tiếp theo của kết quả
				HoadonNVDichvu293 hddv = new HoadonNVDichvu293(rs.getInt(4), rs.getInt(3),
						new NhanvienPVDichvu293(new Dichvu293(rs.getInt(1), rs.getString(2)), 
								new Nhanvien293(new Nguoidung293(rs.getInt(5)))));
				listHDDV.add(hddv);
				count++;
			}
			result = new HoadonNVDichvu293[count];
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}

		return listHDDV.toArray(result);
	}

//	// test cac ham
//	public static void main(String[] args) {
//		HoadonNVDichvu293DAO hdnldao = new HoadonNVDichvu293DAO();
//		HoadonNVDichvu293[] listHDDV = hdnldao.getNVDichvucuaHoadon(12002);
//		for (HoadonNVDichvu293 hddv : listHDDV) {
//			System.out.println(hddv.getNhanVienPVDichVu().getDichVu().getId() 
//					+ hddv.getNhanVienPVDichVu().getDichVu().getTen()
//					+ hddv.getDonGia()+"soluog"+ hddv.getSoLuong());
//			System.out.println(hddv.getNhanVienPVDichVu().getNhanVienPV().getNguoiDung293().getId());
//		}
//	}

}
