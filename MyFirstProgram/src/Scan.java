import java.util.Scanner;
public class Scan {

	public static void main(String[] args) {
		
		Scanner vstup = new Scanner (System.in); 
		
		System.out.println("What is your name?");
		String name = vstup.nextLine();
		System.out.println("How old are you");
		int age = vstup.nextInt();
		vstup.nextLine();
		System.out.println("What is your favorite food?");
		String food = vstup.nextLine();
		
		System.out.println("Hello " + name );
		System.out.println("Your age is " + age + " years old"); 
		System.out.println("Your favorite food is" + food);
		
		

	}

}
