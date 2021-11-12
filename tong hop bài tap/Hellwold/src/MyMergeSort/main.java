package MyMergeSort;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		preson arr[] = new preson[5];
		preson a = new preson("Tinh", 13);
		preson a1 = new preson("Tinh", 18);
		preson a2= new preson("Tinh", 10);
		preson a3 = new preson("Tinh", 3);
		preson a4 = new preson("Tinh", 3);
		preson a5 = new preson("Tinh", 19);
		
		arr[0] = a;
		arr[1] = a1;
		arr[2] = a2;
		arr[3] = a3;
		arr[4] = a3;
		
		
		MyMergeSort ob = new MyMergeSort();  
		ob.sort(arr, 0, arr.length-1);  
		  
		System.out.println("\nSorted array");  
		for(int i =0; i<arr.length;i++)  
		{  
		    System.out.println(arr[i].toString()+"");  
		}  
		}  
	}


