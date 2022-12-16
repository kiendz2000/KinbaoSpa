package model;

public class HoadonNVDichvu293 {
	private int id;
	private int soLuong;
	private int donGia;
	private Hoadon293 hoaDon;
	private NhanvienPVDichvu293 nhanVienPVDichVu;

	public HoadonNVDichvu293(int id, int soLuong, int donGia, Hoadon293 hoaDon, NhanvienPVDichvu293 nhanVienPVDichVu) {
		super();
		this.id = id;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.hoaDon = hoaDon;
		this.nhanVienPVDichVu = nhanVienPVDichVu;
	}

	public HoadonNVDichvu293(int soLuong, int donGia, Hoadon293 hoaDon, NhanvienPVDichvu293 nhanVienPVDichVu) {
		super();
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.hoaDon = hoaDon;
		this.nhanVienPVDichVu = nhanVienPVDichVu;
	}
	public HoadonNVDichvu293(int soLuong, int donGia,NhanvienPVDichvu293 nhanVienPVDichVu) {
		super();
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.nhanVienPVDichVu = nhanVienPVDichVu;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public int getDonGia() {
		return donGia;
	}

	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}

	public Hoadon293 getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(Hoadon293 hoaDon) {
		this.hoaDon = hoaDon;
	}

	public NhanvienPVDichvu293 getNhanVienPVDichVu() {
		return nhanVienPVDichVu;
	}

	public void setNhanVienPVDichVu(NhanvienPVDichvu293 nhanVienPVDichVu) {
		this.nhanVienPVDichVu = nhanVienPVDichVu;
	}

}
