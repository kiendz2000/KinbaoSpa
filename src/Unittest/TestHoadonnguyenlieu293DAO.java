package Unittest;

import org.junit.Assert;
import org.junit.Test;

import dao.Hoadonnguyenlieu293DAO;
import model.Hoadonnguyenlieu293;

public class TestHoadonnguyenlieu293DAO {

	Hoadonnguyenlieu293DAO hdnldao=new Hoadonnguyenlieu293DAO();

	@Test
	public void testGetNguyenlieucuaHoadon_testchuan1() {
		// hoa don co nguyen lieu
		int hdid=12001;
		Hoadonnguyenlieu293[] hdnl =hdnldao.getNguyenlieucuaHoadon(hdid);
		Assert.assertNotNull(hdnl);
		
	}
	
	@Test
	public void testGetDichvucuaHoadon_testngoaile1() {
		// hoa don khong ton tai
		int hdid=12100;
		Hoadonnguyenlieu293[] hdnl =hdnldao.getNguyenlieucuaHoadon(hdid);
		Assert.assertEquals(0,hdnl.length);
		
	}
	
	@Test
	public void testGetDichvucuaHoadon_testngoaile2() {
		// hoa don khong co nguyen lieu
		int hdid=12014;
		Hoadonnguyenlieu293[] hdnl =hdnldao.getNguyenlieucuaHoadon(hdid);
		Assert.assertEquals(0,hdnl.length);
		
	}

}
