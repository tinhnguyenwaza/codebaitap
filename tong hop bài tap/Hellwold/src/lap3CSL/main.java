package lap3CSL;

import java.util.Scanner;

public class main
{public static void main(String [] args) {
  MyList t = new MyList();
   int [] a = {7,2,9,8,6,3};
   t.addMany(a);
   System.out.println("\n Before sorting:"); 
   t.traverse();
   System.out.println("\n Nhập phần tử cần tìm kiếm"); 
  Scanner sc = new Scanner(System.in);
  //int x = sc.nextInt();
  int i = t.seach(8);
  System.out.println(i);
}
}
