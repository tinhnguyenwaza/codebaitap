package lap5CSdL;

public class node {

	 int data;
	 node next;
	
	public node(int data) {
		super();
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public node getNext() {
		return next;
	}

	public void setNext(node next) {
		this.next = next;
	}
	
	

	@Override
	public String toString() {
		return " "+ data;
	}
	
	
	
	
}
