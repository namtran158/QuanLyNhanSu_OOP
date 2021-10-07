package edu.cybersoft;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.cybersoft.baitapcuoikhoa_opp.CongTy;
import edu.cybersoft.baitapcuoikhoa_opp.GiamDoc;
import edu.cybersoft.baitapcuoikhoa_opp.NhanSu;
import edu.cybersoft.baitapcuoikhoa_opp.NhanVien;
import edu.cybersoft.baitapcuoikhoa_opp.TruongPhong;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<NhanSu> listNS = new ArrayList<NhanSu>();
		List<TruongPhong> listTP = new ArrayList<TruongPhong>();
		List<GiamDoc> listGD = new ArrayList<GiamDoc>();
		List<NhanVien> listNV = new ArrayList<NhanVien>();
		int option;
		do {
			System.out.println("Menu: ");
			System.out.println("1. Nhập thông tin công ty.");
			System.out.println("2. Phân bổ Nhân viên vào Trưởng phòng .");
			System.out.println("3. Thêm, xóa thông tin một nhân sự (có thể là Nhân viên, trưởng phòng hoặc giám đốc). Lưu ý khi xóa trưởng phòng, phải ngắt liên kết với các nhân viên \r\n" + 
					"đang tham chiếu tới.");
			System.out.println("4. Xuất ra thông tin toàn bộ người trong công ty");
			System.out.println("5. Tính và xuất tổng lương cho toàn công ty.");
			System.out.println("6. Tìm Nhân viên thường có lương cao nhất.");
			System.out.println("7. Tìm Trưởng Phòng có số lượng nhân viên dưới quyền nhiều nhất.");
			System.out.println("8. Sắp xếp nhân viên toàn công ty theo thứ tự abc.");
			System.out.println("9. Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần.");
			System.out.println("10. Tìm Giám Đốc có số lượng cổ phần nhiều nhất.");
			System.out.println("11. Tính và Xuất tổng THU NHẬP của từng Giám Đốc.");
			
			System.out.print("Choose option: ");
			option = Integer.parseInt(sc.nextLine());
			
			switch(option) {
				case 1:{
					CongTy congTy = new CongTy();
					congTy.nhap();
					break;
				}
				case 2:{
					
					break;
				}
				case 3:{
					int option3;
					do {
						System.out.println("1. Thêm nhân sự.");
						System.out.println("2. Xóa nhân sự theo mã số.");
						System.out.println("0. Dừng.");
						option3 = Integer.parseInt(sc.nextLine());
						switch(option3) {
							case 1:{
								System.out.println("1. Thêm giám đốc.");
								System.out.println("2. Thêm trưởng phòng.");
								System.out.println("3. Thêm nhân viên.");
								System.out.print("Nhập lựa chọn: ");
								int chon = Integer.parseInt(sc.nextLine());
								NhanSu nhanSu = new NhanVien();
								if(chon == 1) {
									GiamDoc giamDoc = new GiamDoc();
									giamDoc.nhap();
									listGD.add(giamDoc);
									listNS.add(giamDoc);
								} else if(chon == 2) {
									TruongPhong truongPhong = new TruongPhong();
									truongPhong.nhap();
									listTP.add(truongPhong);
									listNS.add(truongPhong);
								} else if(chon == 3) {
									NhanVien nhanVien = new NhanVien();
									nhanVien.nhap();
									listNV.add(nhanVien);
									listNS.add(nhanVien);
								} 
								break;
							}
							case 2:{
								System.out.print("Nhập mã số của nhân sự cần xóa: ");
								String maso = sc.nextLine();
								for(int i = 0; i < listNS.size(); i++) {
									if(maso.equals(listNS.get(i).getMaSo())) {
										listNS.remove(i);
									}
								}
								break;
							}
							case 0:
								System.out.println("Đã dừng thêm or xóa.");
								break;
							default: 
								System.out.println();
								break;
							
						}
					} while(option3 != 0);
					break;
				}
				case 4:{
					System.out.println("Thông tin toàn bộ nhân sự trong công ty: ");
					for(int i = 0; i < listNS.size(); i++) {
						System.out.println(listNS.get(i).toString() + "\t" + listNS.get(i).cachTinhLuong());
					}
					break;
				}
				case 5:{
					int tongLuong = 0;
					for(int i = 0; i < listGD.size(); i++) {
						tongLuong += listGD.get(i).cachTinhLuong();
					}
					for(int i = 0; i < listTP.size(); i++) {
						tongLuong += listTP.get(i).cachTinhLuong();
					}
					for(int i = 0; i < listNV.size(); i++) {
						tongLuong += listNV.get(i).cachTinhLuong();
					}
					System.out.println("Tổng lương của cả công ty trong tháng là: "+ tongLuong);
					break;
				}
				case 6:{
	
					break;
				}
				case 7:{
	
					break;
				}
				case 8:{
	
					break;
				}
				case 9:{
	
					break;
				}
				case 10:{
	
					break;
				}
				case 11:{
					
					break;
				}
				case 0:{
					System.out.println("Đã thoát!");
					break;
				}
				default:{
					System.out.println("");
					break;
				}
			}
		} while(option != 0);
	}
}
