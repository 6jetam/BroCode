import java.util.Scanner;

public class LogicalOp {

	public static void main(String[] args) {
		Scanner vstup = new Scanner (System.in);
		
//		int temp = 25;
//		
//		if (temp > 30) {
//			System.out.println("it is hot");
//		}
//		else if (temp>=20 && temp <=30) {
//			System.out.println("it is warm");
//		}else {
//			System.out.println("it is cold");
//		}
		
//		System.out.println("you are playing a game, so if you want a quit press q or Q.");
//		String response = vstup.next();
//		
//		if(response.equals("q") || response.equals("Q")) {
//			System.out.println("game over");
//		}else {
//			System.out.println("you are still playing the game");
		
//		!!!
			
			
			System.out.println("you are playing a game, so if you want a quit press q or Q.");
			String response = vstup.next();
			
			if(!response.equals("q") || !response.equals("Q")) {
				System.out.println("you are still playing the game");
			}else {
				System.out.println("game over");

		}

	}
		}
		

