package model;

import java.sql.Date;

public class Phieuluong293 {
	private int id;
	private Date ngayTinh;
	private Date ngayTra;
	private String moTa;
	private Nhanvien293 nhanVien;

	public Phieuluong293(int id, Date ngayTinh, Date ngayTra, String moTa, Nhanvien293 nhanVien) {
		super();
		this.id = id;
		this.ngayTinh = ngayTinh;
		this.ngayTra = ngayTra;
		this.moTa = moTa;
		this.nhanVien = nhanVien;
	}

	public Phieuluong293(Date ngayTinh, Date ngayTra, String moTa, Nhanvien293 nhanVien) {
		super();
		this.ngayTinh = ngayTinh;
		this.ngayTra = ngayTra;
		this.moTa = moTa;
		this.nhanVien = nhanVien;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getNgayTinh() {
		return ngayTinh;
	}

	public void setNgayTinh(Date ngayTinh) {
		this.ngayTinh = ngayTinh;
	}

	public Date getNgayTra() {
		return ngayTra;
	}

	public void setNgayTra(Date ngayTra) {
		this.ngayTra = ngayTra;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public Nhanvien293 getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(Nhanvien293 nhanVien) {
		this.nhanVien = nhanVien;
	}

}
