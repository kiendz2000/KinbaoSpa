package model;

public class Dichvu293 {
	private int id;
	private String ten;
	private String theLoai;
	private int donGia;
	private String moTa;

	public Dichvu293(int id, String ten, String theLoai, int donGia, String moTa) {
		super();
		this.id = id;
		this.ten = ten;
		this.theLoai = theLoai;
		this.donGia = donGia;
		this.moTa = moTa;
	}
	public Dichvu293(int id, String ten) {
		super();
		this.id = id;
		this.ten = ten;
	}

	public Dichvu293(String ten, String theLoai, int donGia, String moTa) {
		super();
		this.ten = ten;
		this.theLoai = theLoai;
		this.donGia = donGia;
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

	public String getTheLoai() {
		return theLoai;
	}

	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}

	public int getDonGia() {
		return donGia;
	}

	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id +" "+ ten+" "+theLoai+" "+ donGia+""+ moTa ;
	}
	
	

}
