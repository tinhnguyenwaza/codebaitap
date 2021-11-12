package lap5CSdL;

public class main {

	public static void main(String[] args) {
		stack s = new stack();
		int x = 5; 
		
		while(x != 0) {
			int phanDu = x % 2;
			s.addSatck(phanDu);
			x = x/2;
		}
		
		s.display();
	
		
	}
}
