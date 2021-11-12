package hasdTable;

import java.util.ArrayList;

import ASM2CSDL.MyList;

public class hasdTable {
	private final int size = 100;
	
	
	private int hashFunction(int valua) {
		return valua % this.size;
	}
	
	public void hashTable() {
		MyList l = new MyList();
		ArrayList<MyList> a = new ArrayList<MyList>(this.size);
		for (int i = 0 ; i < a.size() ; i++) {
		
			
			
		} 
	}
	
	public void add(int key) {
		int hashTableIndex =  hashFunction(key);
		
	}
}
