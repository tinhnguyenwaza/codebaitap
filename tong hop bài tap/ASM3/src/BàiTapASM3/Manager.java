package BàiTapASM3;

import java.util.Scanner;

public class Manager extends Staff {
	private String chucDanh;

	public	Manager() {
		
	};
	
	public Manager(String maNhanVien, String hoTen, int age, double heSoLuong, String ngayVaoLam, String boPhan,
			String soNgayNghi, String chucDanh) {
		super(maNhanVien, hoTen, age, heSoLuong, ngayVaoLam, boPhan, soNgayNghi);
		this.chucDanh = chucDanh;
	}

@Override
public void nhap() {
	// TODO Auto-generated method stub
	super.nhap();
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhâp chức danh: ");
	System.out.println(" chọn 1 nếu chức danh là Business Leader");
	System.out.println(" chọn 2 nếu chức danh là Project Leader");
	System.out.println(" chọn 3 nếu chức danh là Technical Leaderr");
	int chon = sc.nextInt();
	if (chon ==1 ) {
	this.chucDanh = "Business Leader";
	} else if ( chon == 2 ) {
	this.chucDanh = "Project Leader";	
	} else {
	this.chucDanh = "Technical Leaderr";	
	}
}
	


	
	@Override
	public void display() {
		System.out.println("Bộ Phận:  " + super.getBoPhan() + "   Mã Nhân Viên: " +  super.getMaNhanVien() + "   Họ và Tên: "
	+ super.getHoTen() + "   Tuổi: " + super.getAge() + "   Hệ Số Lương: " +  super.getHeSoLuong() + "   Ngày Vào LÀm: " +
				super.getNgayVaoLam() + "   Số Ngày Nghĩ: " + super.getSoNgayNghi() + "   Chức Danh:  " + chucDanh);
	}
	
	public String getChucDanh() {
		return chucDanh;
	}

	public void setChucDanh(String chucDanh) {
		this.chucDanh = chucDanh;
	}

	@Override
	public double Salary() {
	 double sum = 0;
	 if ( chucDanh == "Business Leader") {
		 sum = getHeSoLuong() * 5000000 + 8000000;
	 } else if (chucDanh == "Project Leader") {
		 sum = getHeSoLuong() * 5000000 + 5000000;
	 } else {
		 sum = getHeSoLuong() * 5000000 + 6000000;
	 }
		return sum;
	}

	@Override 
	public void xuatBangLuong() {
		super.xuatBangLuong();
		System.out.printf("Tổng Lương = %,1.1f" ,Salary());
		System.out.println(" ");
	}
	
	
	
}
