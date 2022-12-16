/**
 * 
 */
package Unittest;

import java.sql.Savepoint;
import org.junit.Assert;
import org.junit.Test;
import dao.DAO;
import dao.Hoadon293DAO;
import model.Hoadon293;
import model.Nguoidung293;
import model.Nhanvien293;

/**
 * @author Acer
 *
 */
public class TestHoadon293DAO extends DAO {

	Hoadon293DAO hddao = new Hoadon293DAO();

	@Test
	public void testGetHoadonChuathanhtoan_testChuan1() {
		// co hoa don chua thanh toan
		Hoadon293[] listHD = hddao.getHoadonChuathanhtoan();
		Assert.assertNotNull(listHD);

	}

	@Test
	public void testGetHoadonChuathanhtoan_testNgoaile1() {
		// Khong co hoa don chua thanh toan
		
		
		//B1:  xac nhan tat ca hoa don
		int ndnvid = 2004;
		
		Savepoint savepoint = null;
		try {
			this.con.setAutoCommit(false);
			savepoint = con.setSavepoint("Savepoint1");
			
			//lay danh sang hd chua thanh toan va xac nhan
			Hoadon293[] listHDCTT = hddao.getHoadonChuathanhtoan();
			for (Hoadon293 hd : listHDCTT) {
				hd.setNhanVienTN(new Nhanvien293(new Nguoidung293(ndnvid)));
				Hoadon293DAO hddao2 = new Hoadon293DAO();
				boolean xacnhan = hddao2.xacNhanHD(hd);
				Assert.assertTrue(xacnhan);
			}
			
			//B2: lay danh sach hoa don chua thanh toan sau khi xac nhan het
			Hoadon293[] listHDCTT1 = hddao.getHoadonChuathanhtoan();
			Assert.assertNull(listHDCTT1);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {

			try {
				this.con.rollback(savepoint);
				this.con.setAutoCommit(true);
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}

	}

	@Test
	public void testGetHoadonByID_testChuan1() {
		// co hoa don
		int hdid = 12003;
		Hoadon293 hd = hddao.getHoadonByID(hdid);
		Assert.assertNotNull(hd);

	}

	public void testGetHoadonByID_testNgoaile1() {
		// khong ton tai hoa don
		int hdid = 12100;
		Hoadon293 hd = hddao.getHoadonByID(hdid);
		Assert.assertNull(hd);
	}

	@Test
	public void testXacNhanHD_testChuan1() {
		// xac nhan thanh cong 1 hoa don
		int ndnvid = 2004;
		int hdid = 12007;
		String hdtt = "CTT";
		Hoadon293 hd = new Hoadon293(hdid, new Nhanvien293(new Nguoidung293(ndnvid)));
		hd.setTrangThai(hdtt);
		Savepoint savepoint = null;
		try {
			this.con.setAutoCommit(false);
			savepoint = con.setSavepoint("Savepoint1");
			Hoadon293DAO hddao2 = new Hoadon293DAO();
			boolean xacnhan = hddao2.xacNhanHD(hd);
			Assert.assertTrue(xacnhan);
			// lay ra kiem tra
			hd = hddao2.getHoadonByID(hdid);
			Assert.assertEquals("DTT", hd.getTrangThai());
			Assert.assertEquals(ndnvid, hd.getNhanVienTN().getNguoiDung293().getId());

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {

			try {
				this.con.rollback(savepoint);
				this.con.setAutoCommit(true);
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}

	}

	@Test
	public void testXacNhanHD_ngoaiLe1() {
		// hoa don da thanh toan
		int ndnvid = 2004;
		int hdid = 12007;
		String hdtt = "DTT";
		Hoadon293 hd = new Hoadon293(hdid, new Nhanvien293(new Nguoidung293(ndnvid)));
		hd.setTrangThai(hdtt);
		try {
			this.con.setAutoCommit(false);
			boolean xacnhan = hddao.xacNhanHD(hd);
			Assert.assertFalse(xacnhan);

			// lay ra kiem tra

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {

			try {
				this.con.rollback();
				this.con.setAutoCommit(true);
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}

	}

	@Test
	public void testXacNhanHD_ngoaiLe2() {
		// hoa don khong co nvid
		int hdid = 12007;
		int nvid = 0;
		String hdtt = "DTT";
		Hoadon293 hd = new Hoadon293(hdid, new Nhanvien293(new Nguoidung293(nvid)));
		hd.setTrangThai(hdtt);
		try {
			this.con.setAutoCommit(false);
			boolean xacnhan = hddao.xacNhanHD(hd);
			Assert.assertFalse(xacnhan);

			// lay ra kiem tra

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {

			try {
				this.con.rollback();
				this.con.setAutoCommit(true);
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}

	}

}
