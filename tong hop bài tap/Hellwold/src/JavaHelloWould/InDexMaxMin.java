package JavaHelloWould;

import java.util.Scanner;

public class InDexMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smallestLargest();
	}
	
	public static void smallestLargest() {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("How many numbers do you want to enter? ");
	    int number = sc.nextInt();
	    System.out.print("Number 1: ");
	    int firstNum = sc.nextInt();
	    int min = firstNum;
	    int max = firstNum;
	    
	    for (int i = 2; i <= number; i++) {
	        System.out.print("Number " + i + ": ");
	        int num = sc.nextInt();
	        if (num < min) {
	            min = num;
	        } else if (num > max) {
	            max = num;
	        }
	    }
	    
	    System.out.printf("Smallest = %d\n", min);
	    System.out.printf("Largest = %d\n", max);
	}
}
