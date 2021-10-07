package edu.cybersoft.baitapcuoikhoa_opp;

import java.util.Scanner;

public class CongTy {
	protected String tenCongTy;
	protected String maSoThue;
	protected int doanhThuThang;
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập tên công ty: ");
		this.tenCongTy = sc.nextLine();
		
		System.out.print("Nhập mã số thuế: ");
		this.maSoThue = sc.nextLine();
		
		System.out.print("Nhập doanh thu tháng: ");
		this.doanhThuThang = Integer.parseInt(sc.nextLine());
	}
}
