package Unittest;


import org.junit.Assert;
import org.junit.Test;

import dao.HoadonNVDichvu293DAO;
import model.HoadonNVDichvu293;

public class TestHoadonNVDichvu293DAO {
	
	HoadonNVDichvu293DAO hddvdao=new HoadonNVDichvu293DAO();

	@Test
	public void testGetDichvucuaHoadon_testchuan1() {
		//hoa don co dich vu
		int hdid=12001;
		HoadonNVDichvu293[] hddv =hddvdao.getNVDichvucuaHoadon(hdid);
		Assert.assertNotNull(hddv);
		
	}
	
	@Test
	public void testGetDichvucuaHoadon_testngoaile1() {
		// hoa don khong ton tai
		int hdid=12100;
		HoadonNVDichvu293[] hddv =hddvdao.getNVDichvucuaHoadon(hdid);
		Assert.assertEquals(0,hddv.length);
		
	}
	
	@Test
	public void testGetDichvucuaHoadon_testngoaile2() {
		// hoa don khong co dich vu
		int hdid=12014;
		HoadonNVDichvu293[] hddv =hddvdao.getNVDichvucuaHoadon(hdid);
		Assert.assertEquals(0,hddv.length);
		
	}

}
