package model;

public class Hoadonnhapnguyenlieu293 {
	private int id;
	private int donGiaNhap;
	private int soLuong;
	private Nguyenlieu293 nguyenLieu;
	private Hoadonnhap293 hoaDonNhap;

	public Hoadonnhapnguyenlieu293(int id, int donGiaNhap, int soLuong, Nguyenlieu293 nguyenLieu,
			Hoadonnhap293 hoaDonNhap) {
		super();
		this.id = id;
		this.donGiaNhap = donGiaNhap;
		this.soLuong = soLuong;
		this.nguyenLieu = nguyenLieu;
		this.hoaDonNhap = hoaDonNhap;
	}

	public Hoadonnhapnguyenlieu293(int donGiaNhap, int soLuong, Nguyenlieu293 nguyenLieu, Hoadonnhap293 hoaDonNhap) {
		this.donGiaNhap = donGiaNhap;
		this.soLuong = soLuong;
		this.nguyenLieu = nguyenLieu;
		this.hoaDonNhap = hoaDonNhap;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDonGiaNhap() {
		return donGiaNhap;
	}

	public void setDonGiaNhap(int donGiaNhap) {
		this.donGiaNhap = donGiaNhap;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public Nguyenlieu293 getNguyenLieu() {
		return nguyenLieu;
	}

	public void setNguyenLieu(Nguyenlieu293 nguyenLieu) {
		this.nguyenLieu = nguyenLieu;
	}

	public Hoadonnhap293 getHoaDonNhap() {
		return hoaDonNhap;
	}

	public void setHoaDonNhap(Hoadonnhap293 hoaDonNhap) {
		this.hoaDonNhap = hoaDonNhap;
	}

}
