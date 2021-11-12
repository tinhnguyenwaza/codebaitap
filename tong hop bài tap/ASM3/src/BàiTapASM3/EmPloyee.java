package BàiTapASM3;

import java.util.Scanner;

public class EmPloyee  extends Staff {
	private double gioLamThem;
	
	public EmPloyee() {
		// TODO Auto-generated constructor stub
	};
	
	// tính lương nhân viên
	@Override
	public double Salary() {
		return  getHeSoLuong()*3000000 +getGioLamThem()*200000 ;
	}
	
	@Override 
	public void xuatBangLuong() {
		super.xuatBangLuong();
		System.out.printf("Tổng Lương = %,1.1f" ,Salary());
		System.out.println(" ");
	}
	
	public EmPloyee(String maNhanVien, String hoTen, int age, double heSoLuong, String ngayVaoLam, String boPhan,
			String soNgayNghi, double gioLamThem) {
		super(maNhanVien, hoTen, age, heSoLuong, ngayVaoLam, boPhan, soNgayNghi);
		this.gioLamThem = gioLamThem;
	}
	

	@Override
	public void nhap() {
		// TODO Auto-generated method stub
		super.nhap();
		System.out.print("Nhập giờ làm thêm của nhân viên: ");
		Scanner sc = new Scanner(System.in);
		this.gioLamThem = sc.nextDouble();
	}
	
	
	@Override
	public void display() {
		System.out.println("Bộ Phận:  " + super.getBoPhan() + "   Mã Nhân Viên: " +  super.getMaNhanVien() + "   Họ và Tên: "
	+ super.getHoTen() + "   Tuổi: " + super.getAge() + "   Hệ Số Lương: " +  super.getHeSoLuong() + "   Ngày Vào LÀm: " +
				super.getNgayVaoLam() + "   So Ngày Nghĩ: " + super.getSoNgayNghi() + "   Giờ Làm Thêm:  " + gioLamThem);
	}
	
	
	public double getGioLamThem() {
		return gioLamThem;
	}



	public void setGioLamThem(int gioLamThem) {
		this.gioLamThem = gioLamThem;
	}

	
	
}