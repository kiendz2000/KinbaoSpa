package model;

import java.sql.Date;

public class Nguoidung293 {
	private int id;
	private String tenDangNhap;
	private String matkhau;
	private String hoten;
	private Date ngaySinh;
	private String email;
	private String sodienthoai;
	private String vaiTro;
	private String ghiChu;

	public Nguoidung293(int id, String tenDangNhap, String matkhau, String hoten, Date ngaySinh, String email,
			String sodienthoai, String vaiTro) {
		super();
		this.id = id;
		this.tenDangNhap = tenDangNhap;
		this.matkhau = matkhau;
		this.hoten = hoten;
		this.ngaySinh = ngaySinh;
		this.email = email;
		this.sodienthoai = sodienthoai;
		this.vaiTro = vaiTro;
	}

	public Nguoidung293(int id, String hoten, String sodienthoai, String email, Date ngaySinh) {
		super();
		this.hoten = hoten;
		this.ngaySinh = ngaySinh;
		this.email = email;
		this.sodienthoai = sodienthoai;
	}

	public Nguoidung293(int id) {
		super();
		this.id = id;
	}

	public Nguoidung293(String hoten, String sodienthoai) {
		super();
		this.hoten = hoten;
		this.sodienthoai = sodienthoai;
	}

	public Nguoidung293(String tenDangNhap, String matkhau, String hoten, Date ngaySinh, String email,
			String sodienthoai, String vaiTro) {
		super();
		this.tenDangNhap = tenDangNhap;
		this.matkhau = matkhau;
		this.hoten = hoten;
		this.ngaySinh = ngaySinh;
		this.email = email;
		this.sodienthoai = sodienthoai;
		this.vaiTro = vaiTro;
	}

	public Nguoidung293(String hoten, String sodienthoai, String email, Date ngaySinh) {
		super();
		this.hoten = hoten;
		this.ngaySinh = ngaySinh;
		this.email = email;
		this.sodienthoai = sodienthoai;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenDangNhap() {
		return tenDangNhap;
	}

	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}

	public String getMatkhau() {
		return matkhau;
	}

	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSodienthoai() {
		return sodienthoai;
	}

	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}

	public String getVaiTro() {
		return vaiTro;
	}

	public void setVaiTro(String vaiTro) {
		this.vaiTro = vaiTro;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

}
