package JavaHelloWould;

import java.util.Iterator;

public class DeMo {

	public static void main(String[] args) {
		int a[] = { 5,6 , 8, 5, 6, 1, 8, 1 };
		int b[] = { 1, 4, 6, 7, 8, 9 };
		// selection(a);
		//insert(a);
		// bubbleSort(a);
		
	}

	// algorithm sort selectinon
	public static void selection(int[] a) {
		int lengthAray = a.length;
		for (int i = 0; i < lengthAray - 1; i++) {
			int mix = i;

			for (int j = i + 1; j < lengthAray; j++) {
				if (a[mix] > a[j]) {
					mix = j;

				}

			}
			if (mix != i) {
				int t = a[i];
				a[i] = a[mix];
				a[mix] = t;
			}
			for (int k = 0; k < lengthAray; k++) {
				System.out.print(a[k]);
			}
			System.out.println(" ");
		}
		for (int k = 0; k < lengthAray; k++) {
			System.out.print(a[k]);
		}
	}

//

// sort insert
	public static void insert(int[] a) {
		int n = a.length;
		for (int i = 1; i < n; i++) {
			int mix = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > mix) {
				a[j + 1] = a[j];

				j--;
			}
			a[j + 1] = mix;
			for (int k = 0; k < n; k++) {
				System.out.print(a[k]);
			}
			System.out.println(" ");
		}
	} // Sort insert
	
	
	// bubblu Sort 
	public static void bubbleSort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}

			}
			for (int k = 0; k < n; k++) {
				System.out.print(a[k]);
			}
			System.out.println(" ");
		}

	}

//binary
	public static void binarySeach(int[] b, int n) {
		int l = 0;
		int r = b.length - 1;

	}

}