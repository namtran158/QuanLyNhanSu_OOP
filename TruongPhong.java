package edu.cybersoft.baitapcuoikhoa_opp;

public class TruongPhong extends NhanSu {
	private int soLuongNhanVienDuoiQuyen;
	private final int luong1Ngay = 200;
	
	@Override
	public int cachTinhLuong() {
		return this.luongThang = this.luong1Ngay * this.soNgayLamViec + 100*this.soLuongNhanVienDuoiQuyen;
	}
}
