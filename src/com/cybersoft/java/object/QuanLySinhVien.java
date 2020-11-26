package com.cybersoft.java.object;

import java.util.ArrayList;

public class QuanLySinhVien {
	private ArrayList<SinhVien> danhSachSinhVien;
	
	public ArrayList<SinhVien> getDanhSachSinhVien() {
		return danhSachSinhVien;
	}

	public QuanLySinhVien() {
		danhSachSinhVien = new ArrayList<SinhVien>();
	}
	
	public ArrayList<SinhVien> timDanhSachSinhVienDTBCaoNhat(){
		
		ArrayList<SinhVien> danhSachSinhVienDTBCaoNhat = new ArrayList<SinhVien>();
		SinhVien sinhVienDTBCaoNhat = new SinhVien();
		
		for (SinhVien sinhVienCurrent : danhSachSinhVien) {
			if(sinhVienCurrent.getDiemTrungBinh() > sinhVienDTBCaoNhat.getDiemTrungBinh()) {
				sinhVienDTBCaoNhat = sinhVienCurrent;
			}
		}
		
		for (SinhVien sinhVienCurrent : danhSachSinhVien) {
			if(sinhVienCurrent.getDiemTrungBinh() == sinhVienDTBCaoNhat.getDiemTrungBinh()) {
				danhSachSinhVienDTBCaoNhat.add(sinhVienCurrent);
			}
		}
		return danhSachSinhVienDTBCaoNhat;
	}

	public ArrayList<SinhVien> timDanhSachSinhVienYeu(){
		ArrayList<SinhVien> danhSachSinhVienYeu = new ArrayList<SinhVien>();
		
		for (SinhVien sinhVienCurrent : danhSachSinhVien) {
			if(sinhVienCurrent.getDiemTrungBinh() < 5) {
				danhSachSinhVienYeu.add(sinhVienCurrent);
			}
		}
		return danhSachSinhVienYeu;
	}

	public ArrayList<SinhVien> timDanhSachSinhVienTheoTen(String tenSV){
		ArrayList<SinhVien> tempDanhSachSinhVien = new ArrayList<SinhVien>();
		for (SinhVien sinhVienCurrent : danhSachSinhVien) {
			if (sinhVienCurrent.getTenSV().contains(tenSV)) {
				tempDanhSachSinhVien.add(sinhVienCurrent);
			}
		}
		return tempDanhSachSinhVien;
	}
	
	public SinhVien timSinhVienTheoMa(String maSV){
		SinhVien tempSinhVien = new SinhVien();
		for (SinhVien sinhVienCurrent : danhSachSinhVien) {
			if (sinhVienCurrent.getMaSV().equalsIgnoreCase(maSV)) {
				tempSinhVien = sinhVienCurrent;
			}			
		}
		return tempSinhVien;
		
	}

	public void xoaSinhVienTheoMa(String maSV) {
		for (SinhVien sinhVienCurrent : danhSachSinhVien) {
			if (sinhVienCurrent.getMaSV().equalsIgnoreCase(maSV)) {
				danhSachSinhVien.remove(sinhVienCurrent);
				break;
			}
		}
	}
}
