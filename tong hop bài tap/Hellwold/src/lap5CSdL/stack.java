package lap5CSdL;

public class stack {
	private int size;
	private node head;
	public stack() {
		super();
		this.head = null;
		this.size = 0;
	}
	
	//add 1 node --> stack
	public void addSatck(int  o) {
		node n = new node(o);
		n.next = this.head;
		this.size++;
		head = n;
		
	}
	
	//pust stack -->
	
	public node pust() {
		
		node n = head;
		this.head = n.next;
		this.size--;
		return n;
		
	}
	
	public void display() {
		
		node n =head;
		
			while(n != null) {
			System.out.println(pust());
			n = n.next;
			}
	}
}
