package model;

public class Hoadonnguyenlieu293 {
	private int id;
	private int soLuong;
	private int donGia;
	private Hoadon293 hoaDon;
	private Nguyenlieu293 nguyenLieu;

	public Hoadonnguyenlieu293(int id, int soLuong, int donGia, Hoadon293 hoaDon, Nguyenlieu293 nguyenLieu) {
		super();
		this.id = id;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.hoaDon = hoaDon;
		this.nguyenLieu = nguyenLieu;
	}

	public Hoadonnguyenlieu293(int soLuong, int donGia, Hoadon293 hoaDon, Nguyenlieu293 nguyenLieu) {
		super();
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.hoaDon = hoaDon;
		this.nguyenLieu = nguyenLieu;
	}
	
	public Hoadonnguyenlieu293(int id, int soLuong, int donGia, Nguyenlieu293 nguyenLieu) {
		super();
		this.id = id;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.nguyenLieu = nguyenLieu;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public int getDonGia() {
		return donGia;
	}

	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}

	public Hoadon293 getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(Hoadon293 hoaDon) {
		this.hoaDon = hoaDon;
	}

	public Nguyenlieu293 getNguyenLieu() {
		return nguyenLieu;
	}

	public void setNguyenLieu(Nguyenlieu293 nguyenLieu) {
		this.nguyenLieu = nguyenLieu;
	}

}
