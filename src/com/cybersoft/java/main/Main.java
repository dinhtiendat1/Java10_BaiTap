package com.cybersoft.java.main;

import java.util.Random;
import java.util.Scanner;

import com.cybersoft.java.object.QuanLySinhVien;
import com.cybersoft.java.object.SinhVien;

public class Main {

	public static void main(String[] args) {
		
		QuanLySinhVien qLSV = new QuanLySinhVien();
		SinhVien sinhVien;
		Random random = new Random();
		Scanner scanner = new Scanner(System.in); 
		
		//Ham tao du lieu gia
		for (int i = 0; i < 10; i++) {
			sinhVien = new SinhVien("SV"+(i+1), "Dat"+(i+1), (float)random.nextInt(10), (float)random.nextInt(10), (float)random.nextInt(10));
			qLSV.getDanhSachSinhVien().add(sinhVien);
		}
		
		//Tinh diem trung binh tung sinh vien
		System.out.println("Diem trung binh tung sinh vien: ");
		for (SinhVien sinhVienCurrent : qLSV.getDanhSachSinhVien()) {
			System.out.println(sinhVienCurrent.getTenSV() +" "+ sinhVienCurrent.getDiemTrungBinh());
		}
		System.out.println();
		
		//Xep loai tung sinh vien
		System.out.println("Xep loai tung sinh vien: ");
		for (SinhVien sinhVienCurrent : qLSV.getDanhSachSinhVien()) {
			System.out.println(sinhVienCurrent.getTenSV() + "\t" + sinhVienCurrent.getDiemTrungBinh() + "\t" + sinhVienCurrent.xepLoai());
		}
		System.out.println();
		
		//Tim sinh vien co diem trung binh cao nhat. In ra danh sach
		System.out.println("Sinh vien co diem trung binh cao nhat");
		System.out.println(qLSV.timDanhSachSinhVienDTBCaoNhat().toString());
		System.out.println();
		
		//In danh sach sinh vien kem
		System.out.println("Sinh vien xep loai yeu: ");
		System.out.println(qLSV.timDanhSachSinhVienYeu().toString());
		System.out.println();
		
		//Tim sinh vien theo ten
		System.out.println("Nhap ten SV can tim: ");
		String tenSV = scanner.nextLine();
		if(qLSV.timDanhSachSinhVienTheoTen(tenSV).isEmpty()) {
			System.out.println("Khong co sinh vien nao co ten vua nhap");
		}
		else {
			System.out.println(qLSV.timDanhSachSinhVienTheoTen(tenSV));
		}
		System.out.println();
		
		//Tim sinh vien theo ma
		System.out.println("Nhap ma SV can tim: ");
		String maSV = scanner.nextLine();
		if (qLSV.timSinhVienTheoMa(maSV).getMaSV().equals("")) {
			System.out.println("Khong co sinh vien nao co ma vua nhap");
		}
		else {
			System.out.println(qLSV.timSinhVienTheoMa(maSV));
		}
		System.out.println();
		
		//Xoa sinh vien theo ma
		System.out.println("Nhap ma SV can xoa: ");
		String maSVXoa = scanner.nextLine();
		qLSV.xoaSinhVienTheoMa(maSVXoa);
		System.out.println(qLSV.getDanhSachSinhVien().toString());
		System.out.println();
	}
}
