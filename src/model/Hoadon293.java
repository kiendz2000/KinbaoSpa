package model;

import java.sql.Date;

public class Hoadon293 {
	private int id;
	private Date ngayTao;
	private String moTa;
	private String trangThai;
	private Nguoidung293 nguoiDungKH;
	private Nhanvien293 nhanVienTN;
	private Lichhen293 lichHen;

	public Hoadon293(int id, Date ngayTao, String moTa, String trangThai, Nguoidung293 nguoiDungKH,
			Nhanvien293 nhanVienTN, Lichhen293 lichHen) {
		super();
		this.id = id;
		this.ngayTao = ngayTao;
		this.moTa = moTa;
		this.trangThai = trangThai;
		this.nguoiDungKH = nguoiDungKH;
		this.nhanVienTN = nhanVienTN;
		this.lichHen = lichHen;
	}

	public Hoadon293(int id, Nhanvien293 nhanVienTN) {
		super();
		this.id = id;
		this.nhanVienTN = nhanVienTN;
	}

	public Hoadon293(int id, Date ngayTao, Nguoidung293 nguoiDungKH, Lichhen293 lichHen) {
		super();
		this.id = id;
		this.ngayTao = ngayTao;
		this.nguoiDungKH = nguoiDungKH;
		this.lichHen = lichHen;
	}

	public Hoadon293(int id, Date ngayTao, String moTa, String trangThai, Nguoidung293 nguoiDungKH) {
		super();
		this.id = id;
		this.ngayTao = ngayTao;
		this.moTa = moTa;
		this.trangThai = trangThai;
		this.nguoiDungKH = nguoiDungKH;
	}

	public Hoadon293(int id, Nguoidung293 nguoiDungKH, Date ngayTao, String trangThai, Lichhen293 lichHen) {
		super();
		this.id = id;
		this.ngayTao = ngayTao;
		this.nguoiDungKH = nguoiDungKH;
		this.trangThai = trangThai;
		this.lichHen = lichHen;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
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

	public Nguoidung293 getNguoiDungKH() {
		return nguoiDungKH;
	}

	public void setNguoiDungKH(Nguoidung293 nguoiDungKH) {
		this.nguoiDungKH = nguoiDungKH;
	}

	public Nhanvien293 getNhanVienTN() {
		return nhanVienTN;
	}

	public void setNhanVienTN(Nhanvien293 nhanVienTN) {
		this.nhanVienTN = nhanVienTN;
	}

	public Lichhen293 getLichHen() {
		return lichHen;
	}

	public void setLichHen(Lichhen293 lichHen) {
		this.lichHen = lichHen;
	}

}
