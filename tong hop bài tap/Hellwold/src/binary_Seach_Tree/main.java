package binary_Seach_Tree;



public class main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binary_Tree T = new binary_Tree();
		
		T.addNode(20);
		T.addNode(10);
		T.addNode(15);
		T.addNode(8);
		T.printNode();
		Node n= T.seach(25);
		
		
	}

}
