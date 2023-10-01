package polymorhpism;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Animal animal;
		
		System.out.println("what animal do you want a");
		System.out.println("1 dog and 2 cat");
		
		int choice = scanner.nextInt();
		
		if (choice ==1) {
			animal = new Dog();
			animal.speak();
		}else if(choice==2) {
			animal = new Cat();
			animal.speak();
		}else {
			animal = new Animal();
			System.out.println("invalid choice");
			animal.speak();
		}
		

	}

}
