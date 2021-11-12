package lap4CSDL;

public class main {

	public static void main(String[] args) {
		String [] a = {"HOA","HA","LAN","NOI","MUA","NAY"};
	    int [] b = {25,17,26,19,23,21};
		// TODO Auto-generated method stub
		linkedList l = new linkedList();
		l.addArray(a, b);
		//person n1 = new person("tinh",23);
		//node p = new node(n1);	
		l.showNode();
	}

}
