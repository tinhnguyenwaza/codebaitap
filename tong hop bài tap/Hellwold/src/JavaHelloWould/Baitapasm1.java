package JavaHelloWould;

import java.util.Random;
import java.util.Scanner;

public class Baitapasm1 {
	static int soLanChoi = 0; // biến điếm số lần chơi trong một vòng chơi
	static int tongSoLanChoi = 1; // biến số lần chơi mới
	static int tongSoLanDuDoan = 0; // bién tổng số lần chơi
	static int betsGame = 101;
	public static void main(String[] args) {
		play(); // phương thức của trò chơi
		report(); 
	}

	public static void play() {
		// hàm romdom từ 0 đếbn 100
		Random rd = new Random();
		int numberRanDom = rd.nextInt(101); 
		System.out.println(numberRanDom );
		
		System.out.println("********************************************************");
		System.out.println("|                     Lucky Number                      |");
		System.out.println("********************************************************"); 
		System.out.println("Số may mắn nằm trong khoảng từ 0 đếm 100 ");
		

		do {
			soLanChoi++;
			tongSoLanDuDoan++;
			
			
			if(betsGame > soLanChoi) { //so sanh số lần chơi ít nhất
				betsGame  = soLanChoi;
			}
			 
			System.out.print("Nhập số đự đoán của bạn : ");
			Scanner sc = new Scanner(System.in);
			int soChon = sc.nextInt();
			
			
					if (soChon == numberRanDom) {
						System.out.println("Bạn đã chọn đúng sau " + soLanChoi + " đự đoán" );
						System.out.println("*********************************************************");
						System.out.println("|                 Kết thúc vòng chơi                     |");
						System.out.println("**********************************************************");
						soLanChoi = 0;
					break;
					}	
			
				if (soChon > numberRanDom) {
					System.out.println("Số của bạn lớn hơn số may mắn");
				}	else {
					System.out.println("Số của bạn nhỏ hơn số may nắm");
				}
			
		} while (true);
		
		System.out.println("*********************************************************");
		System.out.println("| Chọn --  Yes | YES | yes | Y | y --> để tiếp tục chơi  |");
		System.out.println("| Chọn các trường hợp khác để kết thức trờ chơi          |");
		System.out.println("**********************************************************");
		
		
		do {
			Scanner sc = new Scanner(System.in);
			String tiepTucChoi = sc.next();
			if (tiepTucChoi.equalsIgnoreCase("yes") || tiepTucChoi.equalsIgnoreCase("y") ) {
				tongSoLanChoi++;
				play();
			} else {
				report();
			}
			
			
		} while (true);
		
	}

	public static void report() {
		System.out.println("*****************************************************");
		System.out.println("|              Kết thúc trò chơi                     |");
		System.out.println("*****************************************************");
		System.out.println("| Thông kế số kết quả đạt được                       |");
		System.out.println("| Tổng số lần chơi: " + tongSoLanChoi    );
		System.out.println("| Tổng số lần đự đoán: " + tongSoLanDuDoan  );
		double trungBinhMoiLuotChoi = tongSoLanDuDoan / tongSoLanChoi;
		System.out.println("| Số dự đoán trung bình mỗi lượt: " +  trungBinhMoiLuotChoi);
		System.out.println("| lần đự đoán ít nhất: " + betsGame);
		System.out.println("\n    --**--	HẸN GẶP LẠI BẠN LẦN SAO	--**-- ");
	}
}
