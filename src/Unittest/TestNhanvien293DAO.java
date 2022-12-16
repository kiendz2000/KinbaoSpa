package Unittest;

import java.sql.Savepoint;
import org.junit.Assert;
import org.junit.Test;
import dao.DAO;
import dao.Nhanvien293DAO;


public class TestNhanvien293DAO extends DAO {
	Nhanvien293DAO nvdao = new Nhanvien293DAO();

	
	@Test
	public void testUpdateTrangthai_testChuan1() {
		// update thanh cong trang thai
		int nvid = 2004;
		Savepoint savepoint = null;
		// tien hanh update
		try {
			this.con.setAutoCommit(false);
			savepoint = con.setSavepoint("Savepoint1");
			int update = nvdao.updateTrangthai(nvid);
			Assert.assertEquals(1,update);
			//lay ra kiem tra : khong co san ham lay ra nen khong lay ra kiem tra

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
	public void testUpdateTrangthai_ngoaiLe1() {
		// nhan vien khong ton tai
		int nvid = 2100;
		Savepoint savepoint = null;
		// tien hanh update
		try {
			this.con.setAutoCommit(false);
			savepoint = con.setSavepoint("Savepoint1");
			int update = nvdao.updateTrangthai(nvid);
			Assert.assertEquals(0,update);

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

}
