package model;

import java.sql.Time;

public class Slot293 {
	private int id;
	private String ten;
	private Time gioBatDau;
	private Time gioKetthuc;

	public Slot293(int id, String ten, Time gioBatDau, Time gioKetthuc) {
		this.id = id;
		this.ten = ten;
		this.gioBatDau = gioBatDau;
		this.gioKetthuc = gioKetthuc;
	}
	
	public Slot293(String ten) {
		this.ten = ten;
	}
	

	public Slot293(String ten, Time gioBatDau, Time gioKetthuc) {
		this.ten = ten;
		this.gioBatDau = gioBatDau;
		this.gioKetthuc = gioKetthuc;
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

	public Time getGioBatDau() {
		return gioBatDau;
	}

	public void setGioBatDau(Time gioBatDau) {
		this.gioBatDau = gioBatDau;
	}

	public Time getGioKetthuc() {
		return gioKetthuc;
	}

	public void setGioKetthuc(Time gioKetthuc) {
		this.gioKetthuc = gioKetthuc;
	}

}
