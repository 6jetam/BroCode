package File;

import java.io.FileWriter;
import java.io.IOException;


public class Main2 {
	public static void main (String[] args) {
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Roses are red \nViolets are blue \nBooty Booty");
			writer.append("ross");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
