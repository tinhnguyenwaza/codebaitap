package lap4CSDL;

public class linkedList {
	
	node head ,tail;
	
	
	public linkedList() {
		super();
	}

	public linkedList(node head, node tail) {
		super();
		this.head = null;
		this.tail = null;
	}
	// add each  class person --> node
	void add(person x) {
		node p = new node(x);
		if(head == null ) {
			head = tail = p;
		} else {
			tail.next = p;
			tail =p;		
		}
	}
	
	//add each element of array --> object person
	void addArray(String[]a, int[]b ) {
		for (int i =0 ;i < a.length; i++) {
			person n = new person(a[i],b[i]);
			add(n);
		}
		
	}
	
	//showw node 
	void showNode() {
		node p = head;
		while (p != null) {
			visit(p);
			p = p.next;
		}
		
	}
	
	 void visit(node p)
	   {System.out.println(p.data.toString() + "  ");
	   
	   }
}
