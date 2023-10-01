
public class Printf {
	public static void main(String[] args) {
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Bro";
		int myInt = 50;
		double myDouble = 1000;
		
		//conversion-character
//		System.out.printf("%b", myBoolean);
//		System.out.printf("%c", myChar);
//		System.out.printf("%s", myString);
//		System.out.printf("%d", myInt);
//		System.out.printf("%f", myDouble);
		
		//widdth 
		System.out.printf("Hello %10s", myString);
		
		///precision
		System.out.println("You have this much money %.2f", myDouble);
	}
	

}
