package model;

public class Nhanvien293 {
	private Nguoidung293 nguoiDung293;
	private String viTri;
	private int luongCung;
	private int hoaHong;
	private int dangBan;
	public Nhanvien293(Nguoidung293 nguoiDung293, String viTri, int luongCung, int hoaHong) {
		super();
		this.nguoiDung293 = nguoiDung293;
		this.viTri = viTri;
		this.luongCung = luongCung;
		this.hoaHong = hoaHong;
	}
	
	public Nhanvien293(Nguoidung293 nguoiDung293) {
		this.nguoiDung293 = nguoiDung293;
	}
	
	public Nhanvien293(String viTri, int luongCung, int hoaHong) {
		super();
		this.viTri = viTri;
		this.luongCung = luongCung;
		this.hoaHong = hoaHong;
	}

	public Nguoidung293 getNguoiDung293() {
		return nguoiDung293;
	}

	public void setNguoiDung293(Nguoidung293 nguoiDung293) {
		this.nguoiDung293 = nguoiDung293;
	}

	public String getViTri() {
		return viTri;
	}

	public void setViTri(String viTri) {
		this.viTri = viTri;
	}

	public int getLuongCung() {
		return luongCung;
	}

	public void setLuongCung(int luongCung) {
		this.luongCung = luongCung;
	}

	public int getHoaHong() {
		return hoaHong;
	}

	public void setHoaHong(int hoaHong) {
		this.hoaHong = hoaHong;
	}

	public int getDangBan() {
		return dangBan;
	}

	public void setDangBan(int dangBan) {
		this.dangBan = dangBan;
	}
	
	
	

}
