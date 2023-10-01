import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner vstup = new Scanner (System.in);
		
		String name = "";
		
//		while (name.isBlank()) {
//			System.out.print("Enter your name:");
//			name = vstup.nextLine();
//		}
		
		do {
			System.out.print("Enter your name:");
			name = vstup.nextLine();
		}while (name.isBlank());
//	

		
		System.out.println("Hello " + name);
		
	}

}
