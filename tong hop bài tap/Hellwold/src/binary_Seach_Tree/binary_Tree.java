package binary_Seach_Tree;

public class binary_Tree {
	Node root;
	int size;
	public binary_Tree() {
		super();
		this.root = null;
		this.size = 0;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	// add data --> node
	public void addNode(int data) {
		this.root = addNode(this.root , data);
		
	}
	
	public Node addNode(Node n , int data) {
		if(n == null) {
			this.size++;
			Node N = new Node(data, this.size);
			
			return N;
		}
		
		if ( n.data > data) {
			n.left = addNode(n.left, data);
		}
		if ( n.data < data) {
			n.right = addNode(n.right, data);
		}
		return n;
	}
	
	//Print Node 
	public void printNode() {
		printNode(this.root);
	}
	
	public void printNode(Node n) {
		if(n == null) return;
		
		// L N R  min --> max
		// R N L  max --> min
		if(n.data <25) {
		printNode(n.right);
		n.showData();
		
		printNode(n.left);
		}
	}
	
	// Seach Banary Tree
	public Node seach(int id) {
		return seach(this.root, id );
	}
	
	private Node seach(Node n , int id) {
		if (n == null) return null;
		
		if(n.data < id ) {
			n.showData();
			
		}
		
		if(n.data > id ) {
			return seach(n.left , id);
		} else  {
			return seach(n.right , id);
		}
		
		
	}
}
