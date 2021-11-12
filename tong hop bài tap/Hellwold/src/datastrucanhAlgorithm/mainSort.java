package datastrucanhAlgorithm;

import java.util.Scanner;

public class mainSort {
	public static void main(String[] args) {
		Algorithm data = new Algorithm(); // create object class Algorithm
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(" choose");
			System.out.println(" 1. input");
			System.out.println(" 2. read --> Array");
			System.out.println(" 3. Bubble sort");
			System.out.println(" 4. Selection Sort");
			System.out.println(" 5. Insert Sort ");
			System.out.println(" 6. Seach -> value ");
			System.out.println(" 7. Seach -> value ");
			int choose = sc.nextInt();

			switch (choose) {

			case 1:
				data.nhap(); // methor take information

				break;
			case 2:
				data.fileReader();

				break;
			case 3:

				data.bubbleSort(data.getA());
				break;
			case 4:
				data.selectionSort(data.getA());
				break;
			case 5:
				data.inserttinonSort(data.getA());
				break;
			case 6:
				System.out.println("nhập giá trị cần tìm kiếm ");
				float seachInDx = sc.nextFloat();
				data.seachByLinear(data.getA(), seachInDx);
				break;
			case 7:
				System.out.println("nhập giá trị cần tìm kiếm ");
				float b[] = data.getA();
				int n = b.length;
				float seachInDx2 = sc.nextFloat();
				int result =  data.seachBybinary(b, n, seachInDx2);
				
				if (result != -1) {
					System.out.println(" Input value: " + seachInDx2);
					System.out.println(" ndext of fist element: " + result);
				} 
				break;
			}

		} while (true);

	}

}
