package ASM2CSDL;

import java.io.BufferedReader;
import java.io.FileReader;

public class Stack {
	private int size;
	private Node head;
	public Stack() {
		super();
		this.head = null;
		this.size = 0;
	}
	
	//add 1 int --> stack
	public void addSatck(int  o) {
		Node n = new Node(o);
		n.next = this.head;
		this.size++;
		head = n;
		
	}
	
	//to add  Node --> Stack
	public void addNodeStack(Product a) {
		Node n = new Node(a);
		n.next = this.head;
		this.size++;
		head = n;
	}
	
	
	//pust stack -->
	
	public Node pust() {
		
		Node n = head;
		this.head = n.next;
		this.size--;
		return n;
		
	}
	
	public void display() {
		
		Node n =head;
		
			while(n != null) {
			System.out.print(pust().a);
			n = n.next;
			}
	}
	
	// display node
	public void displayNode() {
		Node n =head;
		
		while(n != null) {
		System.out.println(pust().toString());
		n = n.next;
		}
	}
	//void read File --> Stack
		public void readFileStackk() {
			
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
					
					addNodeStack(n); // to add object --> Node 
					
					
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
}
