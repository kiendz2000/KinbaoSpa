package model;

import java.sql.Date;

public class Hoadonnhap293 {
	private int id;
	private Date ngayTao;
	private String moTa;
	private Nhacungcap293 nhaCungCap;
	private Nhanvien293 nhanVien;

	public Hoadonnhap293(int id, Date ngayTao, String moTa, Nhacungcap293 nhaCungCap,
			Nhanvien293 nhanVien) {
		super();
		this.id = id;
		this.ngayTao = ngayTao;
		this.moTa = moTa;
		this.nhaCungCap = nhaCungCap;
		this.nhanVien = nhanVien;
	}

	public Hoadonnhap293(Date ngayTao, String moTa, Nhacungcap293 nhaCungCap, Nhanvien293 nhanVien) {
		super();
		this.ngayTao = ngayTao;
		this.moTa = moTa;
		this.nhaCungCap = nhaCungCap;
		this.nhanVien = nhanVien;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public Date getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public Nhacungcap293 getNhaCungCap() {
		return nhaCungCap;
	}

	public void setNhaCungCap(Nhacungcap293 nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}

	public Nhanvien293 getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(Nhanvien293 nhanVien) {
		this.nhanVien = nhanVien;
	}

}
