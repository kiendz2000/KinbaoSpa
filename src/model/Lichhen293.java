package model;

import java.sql.Date;

public class Lichhen293 {
	private int id;
	private Date ngay;
	private Slot293 slot;
	private Nguoidung293 nguoiDungKH;

	public Lichhen293(int id, Date ngay, Slot293 slot, Nguoidung293 nguoiDungKH) {
		super();
		this.id = id;
		this.ngay = ngay;
		this.slot = slot;
		this.nguoiDungKH = nguoiDungKH;
	}
	public Lichhen293(Slot293 slot) {
		super();
		this.slot = slot;
	}

	public Lichhen293(Date ngay, Slot293 slot, Nguoidung293 nguoiDungKH) {
		super();
		this.ngay = ngay;
		this.slot = slot;
		this.nguoiDungKH = nguoiDungKH;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getNgay() {
		return ngay;
	}

	public void setNgay(Date ngay) {
		this.ngay = ngay;
	}

	public Slot293 getSlot() {
		return slot;
	}

	public void setSlot(Slot293 slot) {
		this.slot = slot;
	}

	public Nguoidung293 getNguoiDungKH() {
		return nguoiDungKH;
	}

	public void setNguoiDungKH(Nguoidung293 nguoiDungKH) {
		this.nguoiDungKH = nguoiDungKH;
	}

}
