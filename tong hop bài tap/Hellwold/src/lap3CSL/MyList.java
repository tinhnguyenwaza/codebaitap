package lap3CSL;

class MyList
{Node head, tail;
 MyList() {head=tail=null;}
 boolean isEmpty() {return(head==null);}
 
 void addLast(int x)
  {Node q = new Node(x);
   if(isEmpty()) {head=tail=q;return;}
   tail.next=q;
   tail=q;
  }
 void addMany(int [] a)
  {for(int i=0;i<a.length;i++) addLast(a[i]);
  }
 void visit(Node p)
  {System.out.print(p.info + "  ");
  }
 void traverse() 
  {Node p = head;
   while(p!=null)
    {visit(p);
     p=p.next;
    }
  }
 public int seach(int a) {
	 Node p =head;
	 
	 int i = 0;
	 while(p != null) {
		 
		 if (p.info > a ) {
			return  i;
		
		 }
		 p = p.next;
		 i++;
		
	 }
	 return -1;
 }
 
}
