package edu.cybersoft.baitapcuoikhoa_opp;

public class NhanVien extends NhanSu {
	private final int luong1Ngay = 100;
	
	@Override
	public int cachTinhLuong() {
		return this.luongThang = this.luong1Ngay * this.soNgayLamViec;
	}
}
