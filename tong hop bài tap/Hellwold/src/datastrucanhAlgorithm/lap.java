package datastrucanhAlgorithm;

import java.util.Scanner;

public class lap {
	
	public static void main(String[] args) {
			lap1();
			
			
		
			
}
	
	// phần 1 lap 1
	public static void lap1() {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[7];
		for (int i =0 ; i <7 ; i++) {
		System.out.println("nhập giá đãy cần sắp xếp ");
		
		a[i] =sc.nextInt();
	}
		int n = a.length;
		for(int i = 0 ; i < n ; i++ ) {
			for (int j = 0 ; j < n - 1 - i ; j++) {
				
				if (a[j] > a[j + 1]) {
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
			for (int k =0 ; k < n; k++) {
				System.out.print(a[k]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
	
	
	
	
	
	
	
}
