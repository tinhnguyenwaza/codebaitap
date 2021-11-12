package ASM2CSDL;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import lap4CSDL.node;
import lap4CSDL.person;

public class MyList {
	private Node head, tail;
	private int size;
	
	public MyList() {
		super();
		this.size =0;
	}

	public MyList(node head, node tail) {
		super();
		this.head = null;
		this.tail = null;
	}
	
	//head = null
	 boolean isEmpty() {return(head==null);}
	
	// add each  class person --> node
	void add(Product x) {
		this.size++;
		Node p = new Node(x);
		if(head == null ) {
			head = tail = p;
		} else {
			tail.next = p;
			tail = p;		
		}
	}
	
	//void read File --> linkedlist
	public void addPucduct() {
		
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
				
				add(n); // to add object --> Node 
				
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	
	//showw node 
	void showMany() {
			Node p = head;
			
			while (p != null) {
				showOne(p);
				addData(p);
				p = p.next;
			}
			
		}
	//showw node 	
	void showOne(Node p)
		   {System.out.println(p.data + "  ");
		   
		   }//showw node 
	
	//to add MyList --> File data1.txt
	void addFile() {
		try {
			FileWriter fw = new FileWriter("data.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			Node p = head;
			while (p != null) {
				System.out.println(p.data);
				bw.write(String.valueOf(p.data));
				
				bw.newLine();
				p = p.next;
			}
			bw.close();
			fw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	// seach to Id
	public int seachId(String id) {
		Node p = head;
		
		while (p != null) {
			
			String j = p.data.getId();
			if( j.equalsIgnoreCase(id)) {
				System.out.println(p.data.toString());
				
				addData(p);
				return 0;
			} 
			p = p.next;
		}
		return -1;
		
	}
	
	//delate node in linked list
	public void deleta(String id) {
		Node p = head;
		Node a = null;
		int counter = 0;
		
		while(p != null) {
			String j = p.data.getId();
			if(j.equalsIgnoreCase(id)){
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
	
	// Sort
	void sort(){
	   {Node pi,pj;
	    Product t;
	    pi=head;
	    
	    while(pi!=null)
	     {pj=pi.next;
	      while(pj!=null)
	    	  
	       {if(pj.data.getId().compareTo(pi.data.getId()) <= -1) {
	         t =pi.data;
	         pi.data=pj.data;
	         pj.data= t;
	         }
	        pj=pj.next;
	       }
	      pi=pi.next;
	     }
	   }
	 }
	
	// fist out Node
	public int  fistNode() {

		Node n = head;
		return n.data.getQuanTiTy(); 
	}
	
	public void addData(Node a) {
		
		try {
			FileWriter fw = new FileWriter("consolo.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(String.valueOf(a.data));
				
			bw.newLine();

			bw.close();
			fw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	
	}
	
	
	
} //end class 
