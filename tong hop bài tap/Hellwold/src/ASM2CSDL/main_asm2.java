package ASM2CSDL;



import java.util.Scanner;



public class main_asm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyList p = new MyList();
			Stack s = new Stack();
			Stack s1 = new Stack();
			MyQueue q = new MyQueue();
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\n ---------------------   Quản lý sản phẩm -----------------");
			
			// Menu của chương Trình
		do {
			System.out.println("\n ----------------------------------------------------------");
			System.out.println("\n chọn chức năng của chương trình");
			System.out.println("1 --> Đọc dữ liệu từ File data.txt  vào Lindek list");
			System.out.println("2 --> Nhập thêm Product vào linkedlist");
			System.out.println("3 --> Show linked list ");
			System.out.println("4 --> Lưu linked list vào File data.txt ");
			System.out.println("5 --> Tìm kiếm Product theo Id");
			System.out.println("6 --> Xoá Product theo ID ");
			System.out.println("7 --> Sắp xếp Product theo Id ");
			System.out.println("8 --> Chuyển từ thập phân --> nhị phân");
			System.out.println("9 --> Đọc dữ liệu từ File data.txt --> Stack  ");
			System.out.println("10 --> Đọc dữ liệu từ File data.txt --> Queue ");

			int choose = sc.nextInt();
			//menu
			switch (choose) {
			case 1:
				p.addPucduct();
				p.showMany();
				
				break;
			case 2:
				System.out.println("nhập id: ");
				String id = sc.next();
				System.out.println("nhập title: ");
				String title = sc.next();
				System.out.println("nhập quantity: ");
				int quanTiTy = sc.nextInt();
				System.out.println("nhập price: ");
				double price = sc.nextDouble();
				Product n = new Product(id, title, quanTiTy, price);
				p.add(n);
				p.showMany();
				break;
			case 3:
				System.out.println("ID|Title|Quantity|price");
				p.showMany();
				
				break;	
			case 4:
				
				p.addFile();
				
				break;	
			case 5:
				System.out.println("Nhập id sản phẩm cần tìm kiếm");
				String Id = sc.next();
				System.out.println("ID|Title|Quantity|price");
				int i = p.seachId(Id);
				if (i == -1) {
				System.out.println("Không tìm thấy sản id product");
				}
				
				break;
			case 6:
				System.out.println("Nhập id sản phẩm cần xoá");
				String Id1 = sc.next();
				p.deleta(Id1);
				
				break;		
			case 7:
				p.sort();
				break;
			case 8:
				int x =  p.fistNode();
				while(x != 0) {
					int phanDu = x % 2;
					s.addSatck(phanDu);
					x = x/2;
				}
				System.out.print("Cơ số 10 của " + p.fistNode() +  " là: ");
				s.display();
				
				break;
			case 9:
				s1.readFileStackk();
				System.out.println("ID|Title|Quantity|price");
				s1.displayNode();
				
				break;
			case 10:
				q.readFileQueue();
				System.out.println("ID|Title|Quantity|price");
				q.display();
				break;		
			default:
				break;	
			}
			
			
		}while(true);
		
		
	}
	
}
