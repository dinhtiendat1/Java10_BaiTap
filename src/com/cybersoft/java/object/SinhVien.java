package com.cybersoft.java.object;

public class SinhVien {
	private 	String 	maSV;
	private 	String 	tenSV;
	private 	float 	diemToan;
	private	 	float 	diemLy;
	private	 	float 	diemHoa;
	private		float 	diemTrungBinh;
	private		String	xepLoai;
		
	public String getMaSV() {
		return maSV;
	}
	public String getTenSV() {
		return tenSV;
	}
	public float getDiemToan() {
		return diemToan;
	}
	public float getDiemLy() {
		return diemLy;
	}
	public float getDiemHoa() {
		return diemHoa;
	}
			
	//Constructor
	public SinhVien() {
		maSV = "";
		tenSV = "";
		diemToan = 0;
		diemLy = 0;
		diemHoa = 0;
		xepLoai = "";
		diemTrungBinh = 0;
	}
	
	public SinhVien(String maSV, String tenSV, float diemToan, float diemLy, float diemHoa) {
		this.maSV = maSV;
		this.tenSV = tenSV;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
		this.diemTrungBinh=getDiemTrungBinh();
		this.xepLoai=xepLoai();
	}
	
	public String toString() {
		return maSV + "\t" + tenSV + "\t" + diemToan + "\t" + diemLy + "\t" + diemHoa + "\t" +diemTrungBinh+ "\t" +xepLoai;
	}
	
	public float getDiemTrungBinh() {
		
		return (diemToan + diemLy + diemHoa)/3;
	}
	
	public String xepLoai() {
		if (getDiemTrungBinh() >= 9) {
			return "Xuat sac";
		} else if(getDiemTrungBinh() < 9 && getDiemTrungBinh() >= 8) {
			return "Gioi";
		} else if (getDiemTrungBinh() < 8 && getDiemTrungBinh() >=7) {
			return "Kha";
		} else if (getDiemTrungBinh() < 7 && getDiemTrungBinh() >=6) {
			return "Trung binh kha";
		} else if (getDiemTrungBinh() < 6 && getDiemTrungBinh() >=5) {
			return "Trung binh";
		}
		else {
			return "Yeu";			
		}
	}
	

}