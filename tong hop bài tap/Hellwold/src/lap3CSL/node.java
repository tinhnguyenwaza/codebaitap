package lap3CSL;

class Node {
 int info;
 Node next;
 Node() {}
 Node(int x, Node p) {info=x;next=p;}
 Node(int x) {this(x,null);}
}
