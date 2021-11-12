package hasdTable;


public class llinkedList {
	private Node head , tail;

	public llinkedList() {
		super();
		this.head = null;
		this.tail = null;
	}
	
	 public void addNode(int a) {
		 Node n = new Node(a);
		 if(this.head == null ) {
			 this.head = this.tail = n;
			 return;
		 }
		 tail.next = n;
		 tail = n;
	 }
	 
	 public void seach(int x) {
		 Node p = head;
			while (p != null) {
				if(p.data == x ) {
					System.out.println(p);
					return;
				}
				p = p.next;
			}
	 }
	 
	 public void deleta(int x) {
			Node p = head;
			Node a = null;
			int counter = 0;
			
			while(p != null) {
				
				if(p.data == x){
					if(counter ==0) {
						this.head = head.next;
						if(head == null) {
							this.tail = null;
						}
					} else if(counter == this.size -1) {
						a.next = null;
						this.tail = a;
					} else {
						a.next = p.next;
					}
				
					
				}
				counter++;
				a =p;
				p = p.next;
			}
			
			
		}
		
}
