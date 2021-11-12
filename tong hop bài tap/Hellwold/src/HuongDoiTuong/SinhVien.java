package HuongDoiTuong;

import java.sql.Date; // thêm thư viện để khai sử đụng kiểu dữ liệu Date
import java.text.SimpleDateFormat;

public class SinhVien {
	private static  int dem = 0; // biến tĩnh đùng để điếm số lần tạo đối tượng 
	private int maSo = ++dem; //khi tạo một đối tượng mới thì sẽ tăng biến đếm lên một
	
	private String hoTen;
	private String queQuan;
	private Date ngaySinh;
	private double[] diem;
	
	
	
	/** 
	 * Phương thức khởi tạo 
	 * @param Ten 
	 * @param queQuan
	 * @param ngaySinh
	 */
	public SinhVien ( String T, String Qq, Date ns ) {
		++dem;
		this.hoTen = T;
		this.queQuan = Qq;
		this.ngaySinh = ns;
		this.diem = null;
	}

	public void hienThi () {
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/YYYY");
		System.out.println("Họ Tên: " + this.hoTen + " Quê Quán: " + this.queQuan + "Ngay Sinh: " + f.format(ngaySinh) );
		if ( diem != null ) {
			System.out.println();
		}
	}

	public static int getDem() {
		return dem;
	}



	public static void setDem(int dem) {
		SinhVien.dem = dem;
	}



	public int getMaSo() {
		return maSo;
	}



	public void setMaSo(int maSo) {
		this.maSo = maSo;
	}



	public String getHoTen() {
		return hoTen;
	}



	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}



	public String getQueQuan() {
		return queQuan;
	}



	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}



	public Date getNgaySinh() {
		return ngaySinh;
	}



	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}



	public double[] getDiem() {
		return diem;
	}



	public void setDiem(double[] diem) {
		this.diem = diem;
	}
	
	
	
}