package BàiTapASM3;

import java.util.Scanner;

public class Department {
	private String maBoPhan;
	private String tenBoPhan;
	private int soLuongNV;
	
	public  Department() {
		
	}
	
	public Department(String maBoPhan, String tenBoPhan) {
		super();
		this.maBoPhan = maBoPhan;
		this.tenBoPhan = tenBoPhan;
		
	}
	
	public void nhap() {
		Scanner sc= new Scanner(System.in);
		System.out.print(" Nhập mã bộ phận: ");
		this.maBoPhan = sc.nextLine();
		System.out.print(" Nhập tện bộ  phận: ");
		this.tenBoPhan = sc.nextLine();
		
	}
	
	public String toString() {
		
		return "Mã Bộ Phận: "  + maBoPhan + "   Tên Bộ Phận: " + tenBoPhan;
		
	}
	public String getMaBoPhan() {
		return maBoPhan;
	}
	public void setMaBoPhan(String maBoPhan) {
		this.maBoPhan = maBoPhan;
	}
	public String getTenBoPhan() {
		return tenBoPhan;
	}
	public void setTenBoPhan(String tenBoPhan) {
		this.tenBoPhan = tenBoPhan;
	}
	public int getSoLuongNV() {
		return soLuongNV;
	}
	public void setSoLuongNV(int soLuongNV) {
		this.soLuongNV = soLuongNV;
	}
	
	
}
