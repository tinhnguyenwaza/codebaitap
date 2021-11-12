package BàiTapASM3;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import javax.naming.CommunicationException;

public class HumanResources {

	public static  void main(String[] args) {
		ArrayList<Staff> nv = new ArrayList<Staff>(); // danh quản lý nhân viên

		ArrayList<Department> bophan = new ArrayList<Department>(); // danh sách bộ phận
		Department boPhanCTy1 = new Department("1" , "Quản Lý");
		bophan.add(boPhanCTy1);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***************  CHƯƠNG TRÌNH QUANY LÝ NHÂN VIÊN ******************"); // mở đàu chương trình
		// nhập bộ phận công ty
		do {
			
			System.out.println("\n - Nhập bộ phận công ty ");
			System.out.print("chọn 1 để nhập danh sách bộ phân -- chọn 0 để kết thức nhập bộ phận: ");
			int chon1 = sc.nextInt(); // biến để chọn menu
			if (chon1 == 0) {
				break;
			}
			switch (chon1) {
				case 1:
			
		System.out.println("Nhập danh sách bộ phận công ty: ");
		Department boPhanCTy = new Department();
		boPhanCTy.nhap();
		bophan.add(boPhanCTy);
		System.out.println("--------------------------------------");
		break;
			}
		} while (true);
		
		
		
		

		// vòng lặp Menu

		do {
			System.out.println("---------------------------------------------------------");
			System.out.println("\n---------------------   MENU      ---------------------");
			System.out.println("chọn 1 -->  để Thêm nhân viên là nhân viên thường");
			System.out.println("chọn 2 -->  để Thêm nhân viên là cấp quản lý");
			System.out.println("chọn 3 -->  để  Xuất danh sách nhân viên ");
			System.out.println("chọn 4 -->  để  Xuất bộ phận của công ty");
			System.out.println("chọn 5 -->  để  Tìm kiếm thông tin nhân viên");
			System.out.println("chọn 6 -->  để  Tìm kiếm thông tin nhân viên theo bộ phận");
			System.out.println("chọn 7 -->  để  Xuất bảng lương của nhân viên");
			System.out.println("chọn 8 -->  để  Xuất bảng lương theo thứ tự tăng dần");
			System.out.println("chọn 0 -->  để  kết thúc chương trình");
			System.out.println("\n---------------------------------------- ");
			System.out.print("Nhập giá trị để chọn chức năng -->  ");
			int chon = sc.nextInt(); // biến để chọn menu
			if (chon == 0) {
				break;

			}

			switch (chon) {
			case 1: // nhập danh sách nhân viên thường

				for (int i = 1; i < bophan.size(); i++) {
					System.out.println("Chọn bộ phận công ty");
					System.out.print("Chọn " + i + " để  nhập bộ phận là: ");
					System.out.println(bophan.get(i).getTenBoPhan());
					System.out.println(" ");
				}
				
				EmPloyee nhanvien = new EmPloyee();

				int chonBoPhan = sc.nextInt();
				String bp = bophan.get(chonBoPhan).getTenBoPhan();
				nhanvien.setBoPhan(bp);
				nhanvien.nhap();
				nv.add(nhanvien);
				break;
			case 2: // nhập danh sách nhân viên cấp quản lý
				
				
				Manager quanly = new Manager();
				quanly.setBoPhan("Quản Lý");
				quanly.nhap();
				nv.add(quanly);
				break;

			case 3: // hiện thị danh sách nhân viên
				System.out.println("---------------------------------------------------------------------------------------");
				System.out.println(" Danh sách nhân viên công ty");
				for (int i = 0; i < nv.size(); i++) {
					nv.get(i).display();
					System.out.println(" ");
				}
				break;
			case 4: // hiển thị danh sách bộ phận công ty
				System.out.println("---------------------------------------------------------------------------------------");
				System.out.println(" Danh sách bộ phận công ty");
				for (int i = 0; i < bophan.size(); i++) {

					System.out.println(bophan.get(i).toString());
				}
				break;
				
			case 5: // tìm kiếm nhân viên theo mã hoặc tên
				System.out.println("---------------------------------------------------------------------------------------");
				System.out.println("Nhập mã nhân viên  cần tìm kiến:  ");
				String chonTk = sc.next();
				
				for (int i = 0; i< nv.size() ; i++ ) {
					if (nv.get(i).getMaNhanVien().equalsIgnoreCase(chonTk)) {
						System.out.println("Thông tin nhân viên: ");
						nv.get(i).display();
						
					} else {
						System.out.println("Không tìm thấy thông tin nhân viên");
					}
				}
				
				
				break;
				
			case 6: // tìm kiếm nhân viên theo bộ phận
				System.out.println("---------------------------------------------------------------------------------------");
				System.out.println("Nhập chọn bộ phần cần xuất: ");
				for (int i = 0; i < bophan.size(); i++) {
					System.out.println("Chọn bộ phận công ty");
					System.out.print("chọn " + i + " để  nhập bộ phận là: ");
					System.out.println(bophan.get(i).getTenBoPhan());
					System.out.println(" ");
				}
				
				int soChon = sc.nextInt();
				System.out.println("Danh sách nhân viên theo bộ phận");
				String seachBoPhan = bophan.get(soChon).getTenBoPhan();
				
				for (int i = 0; i < nv.size(); i++) {

					if (nv.get(i).getBoPhan().equalsIgnoreCase(seachBoPhan)) {
						nv.get(i).display();
					} else {
					System.out.println(" ");
				}
				
			}
				break;
			case 7: // hiển thị bảng lương của công ty
				System.out.println("---------------------------------------------------------------------------------------");
				System.out.println("Bảng lương của toàn thể nhân viên ");
				for (int i = 0; i < nv.size(); i++) {
					nv.get(i).xuatBangLuong();
					
				}
				break;
			case 8: // hiển thị bảng lương theo thứ tự tâng đần
				System.out.println("---------------------------------------------------------------------------------------");
				System.out.println("Bảng lương theo thứ tự tâng dần");
				Collections.sort(nv, (a, b) -> (int)(a.Salary() - b.Salary()) );
				for (int i = 0; i < nv.size(); i++) {
					nv.get(i).xuatBangLuong();
					
				}
				
				break;	
				
			case 9: // hiển thị bảng lương theo thứ tự tâng đần
				System.out.println("---------------------------------------------------------------------------------------");
				System.out.println("Bảng lương theo thứ tự giảm dần");
				Collections.sort(nv, (a, b) -> (int)(b.Salary() - a.Salary()) );
				for (int i = 0; i < nv.size(); i++) {
					nv.get(i).xuatBangLuong();
					
				}
				
				break;		
			}
		} while (true);

	}

}