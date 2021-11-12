package BàiTapASM3;

import java.util.Scanner;

public abstract class Staff implements Salary{
	private String maNhanVien;
	private String hoTen;
	private int age;
	private double heSoLuong;
	private String ngayVaoLam;
	private String boPhan;
	private String soNgayNghi;
	
	public Staff() {} // hàm khỏi tạo không tham số cho nhập đữ liệu
	
					/**
					 *  hàm khỏi tạo để gán giá trị cho thuộc tính 
					 * @param maNhanVien
					 * @param hoTen
					 * @param age
					 * @param heSoLuong
					 * @param ngayVaoLam
					 * @param boPhan
					 * @param soNgayNghi
					 */
	
	public Staff(String maNhanVien, String hoTen, int age,double heSoLuong, String ngayVaoLam,String boPhan, String soNgayNghi) {
		this.maNhanVien = maNhanVien;
		this.hoTen = hoTen;
		this.age = age;
		this.heSoLuong = heSoLuong;
		this.ngayVaoLam = ngayVaoLam;
		this.boPhan = boPhan;
		this.soNgayNghi = soNgayNghi;
	}
	
	public abstract void display(); // hàm trù tượng để hiểm thị thông tinh cho các đối tượng 
	
	public void xuatBangLuong() {
		System.out.println("Bộ Phận: " + boPhan +"   Mã Nhân Viên: " +  maNhanVien + "   Họ Tên: " + hoTen + "   Hệ Số Lương " + heSoLuong + " " );
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập mã nhân viên: ");
		this.maNhanVien = sc.nextLine();
		System.out.print("Nhập họ tên nhân viên: ");
		this.hoTen = sc.nextLine();
		System.out.print("Nhập tuổi nhân viên: ");
		this.age = sc.nextInt();  sc.nextLine();
		System.out.print("Nhập hệ số lương nhân viên: ");
		this.heSoLuong = sc.nextDouble();
		System.out.print("Nhập ngày vào làm của nhân viên: ");
		this.ngayVaoLam = sc.next();
		System.out.print("Nhập số ngày nghĩ của nhân viên: ");
		this.soNgayNghi = sc.next(); 
		
	}	

	

	public String getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNgayVaoLam() {
		return ngayVaoLam;
	}

	public void setNgayVaoLam(String ngayVaoLAm) {
		this.ngayVaoLam = ngayVaoLAm;
	}

	public String getSoNgayNghi() {
		return soNgayNghi;
	}

	public void setSoNgayNghi(String soNgayNghi) {
		this.soNgayNghi = soNgayNghi;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public String getBoPhan() {
		return boPhan;
	}

	public void setBoPhan(String boPhan) {
		this.boPhan = boPhan;
	}

	

	
	
	
}
