package model;

public class NhanvienPVDichvu293 {
	private int id;
	private Dichvu293 dichVu;
	private Nhanvien293 nhanVienPV;

	public NhanvienPVDichvu293(int id, Dichvu293 dichVu, Nhanvien293 nhanVienPV) {
		super();
		this.id = id;
		this.dichVu = dichVu;
		this.nhanVienPV = nhanVienPV;
	}

	public NhanvienPVDichvu293(Dichvu293 dichVu, Nhanvien293 nhanVienPV) {
		super();
		this.dichVu = dichVu;
		this.nhanVienPV = nhanVienPV;
	}

	public NhanvienPVDichvu293(Dichvu293 dichVu) {
		super();
		this.dichVu = dichVu;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Dichvu293 getDichVu() {
		return dichVu;
	}

	public void setDichVu(Dichvu293 dichVu) {
		this.dichVu = dichVu;
	}

	public Nhanvien293 getNhanVienPV() {
		return nhanVienPV;
	}

	public void setNhanVienPV(Nhanvien293 nhanVienPV) {
		this.nhanVienPV = nhanVienPV;
	}

}
