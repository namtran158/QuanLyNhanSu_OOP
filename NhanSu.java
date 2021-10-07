package edu.cybersoft.baitapcuoikhoa_opp;

import java.util.Scanner;

public class NhanSu extends CongTy {
	protected String maSo;
	protected String hoTen;
	protected String sDT;
	protected int soNgayLamViec;
	protected int luongThang;
	
	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public int cachTinhLuong() {	
		return this.luongThang = 0;
	}
	
	
	@Override
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập mã số: ");
		this.maSo = sc.nextLine();
		
		System.out.print("Nhập họ tên: ");
		this.hoTen = sc.nextLine();
		
		System.out.print("Nhập sđt: ");
		this.sDT = sc.nextLine();
		
		System.out.print("Nhập số ngày làm việc: ");
		this.soNgayLamViec = Integer.parseInt(sc.nextLine());
		
				
	}

	@Override
	public String toString() {
		return maSo + "\t" + hoTen + "\t" + sDT + "\t" + soNgayLamViec;
	}
	
}
