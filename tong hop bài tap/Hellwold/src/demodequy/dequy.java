package demodequy;

public class dequy

{static int k=1;

//Hàm đệ quy chuyển 
 public static void thapHN(int n, char a, char b, char c)
  {
	 if(n==1)
    {System.out.printf("%5d: %c -> %c\n",k++,a,b);
     return;
    }
   thapHN(n-1,a,c,b);
   thapHN(1,a,b,c);
   thapHN(n-1,c,b,a);
  }
 public static void main(String [] args)
  {
	 int n; char a, b, c;
   n=5;a='A';b='B';c='C';
   thapHN(n,a,b,c);
   System.out.println(); 
  }
}