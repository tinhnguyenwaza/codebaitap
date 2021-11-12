package ASM2CSDL;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class addFileIInput {
	
	public void addData(Node a) {
		
		try {
			FileWriter fw = new FileWriter("consolo.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(String.valueOf(a.data));
				
			bw.newLine();

			bw.close();
			fw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	
	}
}
