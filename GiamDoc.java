package edu.cybersoft.baitapcuoikhoa_opp;

public class GiamDoc extends NhanSu { 
	private double coPhan;
	private final int luong1Ngay = 300;
	
	public int getLuong1Ngay() {
		return luong1Ngay;
	}



	@Override
	public int cachTinhLuong() {
		return this.luongThang = this.luong1Ngay * this.soNgayLamViec;
	}
}
