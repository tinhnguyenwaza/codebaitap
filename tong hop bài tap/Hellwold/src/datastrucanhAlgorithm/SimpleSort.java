package datastrucanhAlgorithm;

import java.util.Scanner;

public class SimpleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = input(); // láy giá trị của mẩng

		// các chức năng chính của chương trình

		do {
			System.out.println("chọn chức năng của chương trình ");
			System.out.println("chọn 1 --> selectionSort ");
			System.out.println("chọn 2 --> InsertSort");
			System.out.println("chọn 3 --> Seach");

			int choose = sc.nextInt();

			switch (choose) {
			case 1:
				System.out.println("1");
				int arraySort[] = selectionSort(array);
				
				for (int k =0 ; k < arraySort.length; k++) {
					System.out.print(arraySort[k]);
					System.out.print(" ");
				}
				System.out.println(" ");
				break;
			case 2:
				System.out.println("2");
				int arraySort2[] = selectionSort(array);
				
				for (int k =0 ; k < arraySort2.length; k++) {
					System.out.print(arraySort2[k]);
					System.out.print(" ");
				}
				System.out.println(" ");
				break;
			case 3:
				System.out.println("nhập giá trị cần tìm kiếm");
				int seachIndex = sc.nextInt();
				for (int i : array) {
					if (i == seachIndex) {
						System.out.println("phần tử tìm kiếm là  " + i);
					
					}
					
				}
				
				break;

			}
		} while (true);

	}

	// hàm lấy dữ liệu vào mảng
	public static int[] input() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhập độ đài của mảng ");
		int length = sc.nextInt();
		int a[] = new int[length];
		int n = a.length;

		for (int i = 0; i < n; i++) {
			System.out.println("nhập giá của phần tử thứ:  " + i);

			a[i] = sc.nextInt();

		}
		return a;
	}

	// hàm selectionSort
	public static int[] selectionSort(int[] b) {
		int n = b.length;
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (b[min] > b[j]) {
					min = j;
				}
			}
			if ( min != i) {
				int t = b[i];
				b[i] = b[min];
				b[min] = t;
			}
		}

		return b;
	}

	
	public static int[] insertSort(int[] c) {
		int n = c.length;
	for (int i = 1  ; i < n ; i++) {
		int min = c[i];
		int j = i -1;
		while (j >= 0 && c[j] > min ) {
			c[j+1] = c[j];
			j--;
		}
		c[j+1] = min;
	}
		

		return c;
	}
	
	
	
	
}
