package JavaHelloWould;

import java.util.Scanner;

public class HelloWould {
	public static void main(String[] args) {
		System.out.print("ban muon nhan bao nhieu so ?");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(" munber 1: ");
		int fistmunber = sc.nextInt();
		int min = fistmunber;
		int max = fistmunber;	
		
		for ( int i = 2; i <= n ; i++) {
			System.out.println(" munber " + i + " ");
			int munber = sc.nextInt();
			
			if ( munber < min) {
				min = munber ;
			} else if ( munber < max) {
				max = munber;
			}
		}
		System.out.println(" min " + min);
		System.out.println(" max " + max);
	}
}
