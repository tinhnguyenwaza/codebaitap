package lap4CSDL;

public class node {
	person data;
	node next;
	
	public node(person data) {
		super();
		this.data = data;
		
	}
	
	public person getData() {
		return data;
	}
	public void setData(person data) {
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
		return "node [data=" + data.toString() + "]";
	}
	
	
	
}
