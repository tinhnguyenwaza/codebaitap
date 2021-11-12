package ASM2CSDL;

import java.io.BufferedReader;
import java.io.FileReader;

public class MyQueue {
	Node head ,tail;

	public MyQueue() {
		super();
		this.head = tail = null;
		
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}
	
	// isEmpty
	public boolean isEmpty()

    { return(head==null);}
	
	// to add Node --> Queue
	public void enqueue(Product a) {
		Node n =  new Node(a);
		if(isEmpty()) {
			this.head = n;
			this.tail = n;
			return;
		}
		
		this.tail.next = n;
		this.tail = n;
	} // to add Node --> Queue
	
	//to add File --> Stack
	public void readFileQueue() {
		
		try {
			FileReader fw = new FileReader("data.txt");
			BufferedReader br = new BufferedReader(fw);
			String line = "";
			
			while (true) {
				line = br.readLine();
				
				if (line == null) {
					break;
				}
			
				String txt[] = line.split(" +");
				String id =txt[0];
				
				String title = txt[1];
				
				int quanTiTy = Integer.parseInt(txt[2]);
				
				double price = Double.parseDouble(txt[3]);
				
			
				Product n = new Product(id, title, quanTiTy, price);
				
				enqueue(n); // to add object --> Node 
				
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	
	// dequeue
	public Node dequeue() {
		Node n = head;
		this.head = head.next;
		return n;
		
	}  //dequeue
	
	// display
	public void display() {
		Node n = head;
		while (n != null ) {
			System.out.println(n.data.toString());
			n = n.next;
		}
	}
	
}

