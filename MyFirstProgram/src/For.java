import java.util.Scanner;

public class For {
	//nested loops
	public static void main(String[] args) {
		 Scanner vstup = new Scanner (System.in);
		 
		 int rows;
		 int columns;
		 String symbol = "";
		 
		 System.out.println("Enter number of rows: ");
		 rows = vstup.nextInt();
		 System.out.println("Enter number of columns: ");
		 columns = vstup.nextInt();
		 System.out.println("enter symbol to use");
		 symbol = vstup.next();
		 
		 for( int i =1; i <= rows; i ++ ) {
			 System.out.println();
			 for (int j = 1; j <=  columns; j++) {
				 System.out.print(symbol);
			 }
		 }

	}

}
