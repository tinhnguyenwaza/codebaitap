package JavaHelloWould;

import java.util.Scanner;

public class GradeStudent {

	public static void main(String[] args) {
		begin(); // hiểm thị thông điệp chào mừng
		double diemGiuaKi = midTerm(); // nhập điểm thi giữa kì
		double diemCuoiKi = finalTerm();// nhập điểm thi cuối tuần
		double diemBaiTap =  homework(); // nhập điểm bai tập về nhà
		rePort(diemGiuaKi , diemCuoiKi , diemBaiTap  ); // tính toán điển và hiểm thị kết quả GPA
	}

	public static void begin() { // phần chào hỏi và mô tả chương trình
		System.out.println("*****************************<     CHÀO BẠN      >*****************************");
		System.out.println(
				" \nChương trình này đọc điểm bài kiểm tra bài tập về nhà \nvà báo cáo điểm tổng thể khóa học của bạn ");
				System.out.println("-------------------------------------------------------------------------------");
	}
	
	

	// điểm thi giữa kì
	public static double midTerm() {
		System.out.println("\n****************************    ĐIỂM THI GIỮA KÌ     ***************************");
		System.out.print(" Nhập trọng số điểm giữa kì ?: ");
		Scanner sc = new Scanner(System.in);
		int tiTrongDiem = sc.nextInt(); // tỉ trọng điểm theo
		System.out.print(" Nhập điểm giữa kì ?: ");
		int diemGiuaKi = sc.nextInt(); // điểm thi giữa kì

		System.out.print(" Chọn 1 để nhập điểm cộng || Chọn 2 để bỏ qua phần nhập điểm cộng ");
		int check = sc.nextInt(); // kiểm tra điểm cộng
		int diemCong = 0; // điểm cộng
		if (check == 1) { // check điệu kiển để nhập điểm cộng
			System.out.print(" Nhập điểm cộng của bạn ?: ");
			diemCong = sc.nextInt(); // điểm cộng
		} else {
			diemCong = 0;
		}
		double tongDiem = diemGiuaKi + diemCong;
		if (tongDiem > 100) {
			tongDiem = 100;
		}
		
		double diemTiTrong = (tongDiem / 10) * tiTrongDiem;

		diemTiTrong = (double) Math.round(diemTiTrong * 10) / 100;
		System.out.println("\n * Tổng điểm đạt đươc: " + tongDiem + "/ 100");
		System.out.println(" * Tổng điểm theo thang điểm 100 :  " + diemTiTrong + " /" + tiTrongDiem);
		
		return diemTiTrong; // trà về giá trị 
	}

	// điểm thi cuối kì
	public static double finalTerm() {
		System.out.println("\n******************************   ĐIỂM THI CUỐI KÌ   *****************************");
		System.out.print(" Nhập trọng số điểm cuối kì ?: ");
		Scanner sc = new Scanner(System.in);
		int tiTrongDiem = sc.nextInt(); // tỉ trọng điểm theo
		System.out.print(" Nhập điểm giữa kì ?: ");
		int diemGiuaKi = sc.nextInt(); // điểm thi giữa kì

		System.out.print(" Chọn 1 để nhập điểm cộng || Chọn 2 để bỏ qua phần nhập điểm cộng: ");
		int check = sc.nextInt(); // kiểm tra điểm cộng
		int diemCong = 0; // khởi tạo biến điểm cộng
		if (check == 1) { // check điệu kiển để nhập điểm cộng
			System.out.print(" Nhập điểm cộng của bạn ?: ");
			diemCong = sc.nextInt(); // lấy điểm công từ học sinh
		} else {
			diemCong = 0;
		}
		double tongDiem = diemGiuaKi + diemCong; // lấy điểm tổng
		if (tongDiem > 100) {	// đảm bảo để tổng điểm không hơn 100 điểm
			tongDiem = 100;
		}
		double diemTiTrong = (tongDiem / 10) * tiTrongDiem; // tính điểm tỉ trọng theo thang điểm 

		diemTiTrong = (double) Math.round(diemTiTrong * 10) / 100; // in ra kết qur cho học sinh
		System.out.println("\n * Tổng điểm đạt đươc: " + tongDiem + "/ 100");
		System.out.println(" * Tổng điểm theo thang điểm 100 :  " + diemTiTrong + " /" + tiTrongDiem);
		return diemTiTrong; // trả về giá trị
	}

	
	// Điểm phần bài tập về nhà 
	public static double homework() {
		System.out.println("\n*************************     ĐIỂM BÀI TẬP VỀ NHÀ      **************************"); 
		System.out.print(" Nhập tỉ trọng bài tập về nhà: ");
		Scanner sc = new Scanner(System.in);                 
		int tiTrongDiem = sc.nextInt();        // Tỉ trọng điểm bài tập về nhà
		System.out.print(" Có bao nhiêu bài tập  về nhà: ");
		
		int soBaiTap = sc.nextInt();            // biến- sô bài tập về nhà
		int diemBaiTap = 0;                   // Biến tổng điểm bài tập
		double diemToiDa = 0 ;                   // Biến tông điểm tối da của bài tập
		for ( int i = 0 ; i != soBaiTap; i++) { 
			System.out.print(" Nhập điểm bài tập" + (i + 1 )  + ":  ");
			int diemBaiTap1 = sc.nextInt();
			diemBaiTap += diemBaiTap1;        
			System.out.print(" Nhập điểm tối da của bài tập " + (i + 1 ) + ":  ");
			int diemToiDa1 = sc.nextInt();
			System.out.println("\n*******************************************");
			
			diemToiDa += diemToiDa1;
		}
		
		if (diemBaiTap > 150) { // đảm bảo điểm nhỏ hơn 150
			diemBaiTap = 150;
		}
		
		if (diemToiDa > 150) {  // đảm bảo điểm tối da nhỏ hơn 150
			diemToiDa = 150;
		}

		System.out.print(" Nhập vào số buổi đi học của bản: ");  //  Tính điểm chuyên cần của Sin viên
		int soNgayCC = sc.nextInt(); 
		int diemCC = soNgayCC * 5;
		if ( diemCC > 30 ) {  // đảm bảo điểm cộng ko hơn 30 điểm
			diemCC = 30;
		}
		double tongDiem = diemBaiTap + diemCC;
		diemToiDa += 30;
		double diemTiTrong = (tongDiem / diemToiDa )* tiTrongDiem ;
		diemTiTrong = (double) Math.round(diemTiTrong * 10) / 10; // làm tròn số thập phân
		System.out.println(" * Tổng điểm theo thang điểm 100 :  " + diemTiTrong);
		return diemTiTrong; //trả về giá trị
	}

	
	// phần tính điểm tổng và hiển thị kết quả
	public static void rePort( double diemGiuaKi, double diemCuoiKi , double diemBaiTap ) {
		double tongDiem = diemGiuaKi + diemCuoiKi + diemBaiTap;
		System.out.println("\n*************************     KÉT QUẢ GPA CỦA BẠN    **************************");
		System.out.println(" Tổng điểm sinh viên đạt được của 3 môn: " + tongDiem);
		double grade = 0.0;
		
		// phần tính điểm greda
		if (tongDiem >= 85 ) {
			grade = 3.0 ;
		} else if (tongDiem < 84.99 && tongDiem >= 75 ) {
			grade = 2.0;
		} else  if (tongDiem < 74.99 && tongDiem >= 60){
			grade = 0.7;
		} else {
			grade = 0.0;
		}
		System.out.println(" Điểm GPA của bạn  là " + grade );
		
		// lời nhận xét 
		if ( grade == 3.0) {
			System.out.println(" Lời nhận xét: Bạn thật xuất sắc " );
		} else if ( grade == 2.0 ) {
			System.out.println(" Lời nhận xét: Bạn thật là giỏi nhưng vẫn cần cố gắng thêm " );
		} else if ( grade == 0.7 ) {
			System.out.println(" Lời nhận xét: Điểm của bạn đang ở mức trung binh, hãy cố gắng để có kết quả tốt hơn " );
		} else {
			System.out.println(" Lời nhận xét: Điểm của bạn quá thấp, bạn cần nổ lực và chăm chỉ để cải thiện điểm của Mình!! " );
		}
		
	}
	
	
}
