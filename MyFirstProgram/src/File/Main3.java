package File;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main3 {
	public static void main (String[] args) {
		
		try {
			FileReader reader = new FileReader("art.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
