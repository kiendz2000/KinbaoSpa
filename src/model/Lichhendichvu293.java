package model;

public class Lichhendichvu293 {
	private int id;
	private Lichhen293 lichHen;
	private Dichvu293 dichVu;

	public Lichhendichvu293(int id, Lichhen293 lichHen, Dichvu293 dichVu) {
		super();
		this.id = id;
		this.lichHen = lichHen;
		this.dichVu = dichVu;
	}

	public Lichhendichvu293(Lichhen293 lichHen, Dichvu293 dichVu) {
		super();
		this.lichHen = lichHen;
		this.dichVu = dichVu;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Lichhen293 getLichHen() {
		return lichHen;
	}

	public void setLichHen(Lichhen293 lichHen) {
		this.lichHen = lichHen;
	}

	public Dichvu293 getDichVu() {
		return dichVu;
	}

	public void setDichVu(Dichvu293 dichVu) {
		this.dichVu = dichVu;
	}

}
