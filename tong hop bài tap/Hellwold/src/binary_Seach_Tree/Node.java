package binary_Seach_Tree;

public class Node {
	int data;
	int id;
	Node left, right;
	public Node(int data, int id) {
		super();
		this.data = data;
		this.id = id;
		this.left = null;
		this.right = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	
	// display data
	public void showData() {
	System.out.println( this.id+" "+this.data);
	}
}
