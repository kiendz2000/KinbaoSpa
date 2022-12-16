package model;

public class Nguyenlieu293 {
	private int id;
	private String ten;
	private int soLuong;
	private int donGiaBan;
	private String moTa;

	public Nguyenlieu293(int id, String ten, int soLuong, int donGiaBan, String moTa) {
		super();
		this.id = id;
		this.ten = ten;
		this.soLuong = soLuong;
		this.donGiaBan = donGiaBan;
		this.moTa = moTa;
	}
	public Nguyenlieu293(int id, String ten) {
		super();
		this.id = id;
		this.ten = ten;
	}

	public Nguyenlieu293(String ten, int soLuong, int donGiaBan, String moTa) {
		super();
		this.ten = ten;
		this.soLuong = soLuong;
		this.donGiaBan = donGiaBan;
		this.moTa = moTa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public int getDonGiaBan() {
		return donGiaBan;
	}

	public void setDonGiaBan(int donGiaBan) {
		this.donGiaBan = donGiaBan;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

}
