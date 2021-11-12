package ASM2CSDL;

public class Node {
	Product data;
	Node next;
	int a;
	
	//conntruction
	
	public Node(Product data) {
		super();
		this.data = data;
		// TODO Auto-generated constructor stub
	}
	
	

	public Node(int a) {
		super();
		this.a = a;
		this.data =null;
		this.next = null;
	}



	public Node() {
		super();
	}

	//set and get
	public Product getData() {
		return data;
	}


	public void setData(Product data) {
		this.data = data;
	}


	public Node getNext() {
		return next;
	}


	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return this.data.toString() +"";
	}
	
	

	
}
