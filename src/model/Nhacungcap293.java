package model;

public class Nhacungcap293 {
	private int id;
	private String ten;
	private String diaChi;
	private String soDienThoai;
	private String moTa;
	public Nhacungcap293(int id, String ten, String diaChi, String soDienThoai, String moTa) {
		super();
		this.id = id;
		this.ten = ten;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.moTa = moTa;
	}
	
	public Nhacungcap293(String ten, String diaChi, String soDienThoai, String moTa) {
		super();
		this.ten = ten;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
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

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	
	
	
	

}
