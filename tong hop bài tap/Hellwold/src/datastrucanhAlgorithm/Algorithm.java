package datastrucanhAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Algorithm {
	private float a[];
	private int leng;

	public float[] getA() {
		return a;
	}

	public void setA(float[] a) {
		this.a = a;
	}

	public int getLeng() {
		return leng;
	}

	public void setLeng(int leng) {
		this.leng = leng;
	}

	// hàm nhập mảng tử bản phím
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhập độ đài của mảng ");
		int length = sc.nextInt();
		float a[] = new float[length];
		int n = a.length;

		// for input each element
		for (int i = 0; i < n; i++) {
			System.out.println("nhập giá của phần tử thứ:  " + i);
			a[i] = sc.nextFloat();
		}

		// write data array to File input.txt
		try {
			FileWriter fw = new FileWriter("input.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			for (double i : a) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
			bw.close();
			fw.close();
		} catch (Exception e) {

		}
		int l = a.length;
		this.leng = l;
	} // for input each element

	// write to Array
	public void fileReader() {
		float a[] = new float[this.leng];
		try {
			FileReader fw = new FileReader("input.txt");
			BufferedReader br = new BufferedReader(fw);
			String line = "";
			int j = 0;
			while (true) {
				
				line = br.readLine();
				if (line == null) {
					break;
				}

				float n = Float.parseFloat(line);
				a[j] = n;
				j++;

			}

		} catch (Exception e) {

		} // of catch

		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k]);
			System.out.print(" ");
		}
		System.out.println(" ");
		this.a = a;

	} // ghi File vào mảng

	// Bubble Sort
	public static void bubbleSort(float a[]) {
		float b[] = new float[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}

		int n = b.length;
		System.out.println("-----------------  Bubble Sort-------------------");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {

				if (b[j] > b[j + 1]) {
					float t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
			for (int k = 0; k < n; k++) {
				System.out.print(b[k]);
				System.out.print("   ");
			}
			System.out.println(" ");
		} // Bubble Sort

		// array to write File input1.txt
		try {
			FileWriter fw = new FileWriter("input1.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			for (double i : b) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
			bw.close();
			fw.close();
		} catch (Exception e) {

		}

	} // Bubble Sort

	// Selection Sort
	public static void selectionSort(float a[]) {

		float b[] = new float[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		int n = b.length;

		// Algorithm Selection Sort
		System.out.println("----------------- selection Sort-------------------");
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (b[min] > b[j]) {
					min = j;
				}
			}
			if (min != i) {
				float t = b[i];
				b[i] = b[min];
				b[min] = t;
			}

			for (int k = 0; k < n; k++) {
				System.out.print(b[k]);
				System.out.print("   ");
			}
			System.out.println(" ");
		}
		// Algorithm Selection Sort

		// array to write File input2.txt
		try {
			FileWriter fw = new FileWriter("input2.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			for (double i : b) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
			bw.close();
			fw.close();
		} catch (Exception e) {

		}

	} // Bubble Sort

	// Insertion Sort
	public static void inserttinonSort(float a[]) {

		float b[] = new float[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		int n = b.length;

		// Algorithm Selection Sort
		System.out.println("-----------------  insert Sort-------------------");
		for (int i = 1; i < n; i++) {
			float min = b[i];
			int j = i - 1;
			while (j >= 0 && b[j] > min) {
				b[j + 1] = b[j];
				j--;
			}
			b[j + 1] = min;
			for (int k = 0; k < n; k++) {
				System.out.print(b[k]);
				System.out.print("   ");
			}
			System.out.println(" ");
		}
		// Algorithm Selection Sort

		// array to write File input2.txt
		try {
			FileWriter fw = new FileWriter("input3.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			for (double i : b) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
			bw.close();
			fw.close();
		} catch (Exception e) {

		}

	} // Insertion Sort

	// Seach by Linear
	public static void seachByLinear(float[] b, float inDx) {
		int x = 0;
		System.out.println("-------------------- Seach by Linear -----------------------------");
		System.out.println(" Input value: " + inDx);
		for (int i = 0; i < b.length; i++) {
			if (inDx == b[i]) {
				System.out.println("Chỉ số của phần tử cần tìm là: " + i);
				x = i;
			}
		} // for Seach Index

		// array to write File input4.txt
		try {
			FileWriter fw = new FileWriter("input4.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(String.valueOf(x));
			bw.newLine();

			bw.close();
			fw.close();
		} catch (Exception e) {

		}

	}// Seach by Linear

	// Search by binary
	public static int seachBybinary(float[] a, int n , float inDx) {

		System.out.println("-------------------- Seach by binary -----------------------------");

		// copy array a --> array b
		float b[] = new float[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		// copy array a --> array b

		// Algorithm Selection Sort
		
		for (int i = 1; i < n; i++) {
			float min = b[i];
			int j = i - 1;
			while (j >= 0 && b[j] > min) {
				b[j + 1] = b[j];
				j--;
			}
			b[j + 1] = min;

		} // Algorithm Selection Sort
		
		// Search by binary
		int l = 0;
		int r = n -1;
		
		while( l <= r) {
			int mid = (l + r ) /2;
			if (inDx == b[mid]) {
				try {
					FileWriter fw = new FileWriter("input5.txt");
					BufferedWriter bw = new BufferedWriter(fw);

					bw.write(String.valueOf(mid));
					bw.newLine();

					bw.close();
					fw.close();
				} catch (Exception e) {

				}
				return mid;
			} else if (inDx > b[mid]) {
				l = mid + 1;
			} else {
				r = mid -1;
			}
		}
		return -1;
		// Search by binary
	}

} // end task
