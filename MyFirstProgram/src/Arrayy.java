
public class Arrayy {

	public static void main(String[] args) {
//		String [] cars = {"Camaro","Corvette","Focus","BMW"};
//		
//		cars [0] = "Suzuki";
//		
//		System.out.println(cars[0]);
		
//		String [] cars = new String [3];
//		
//		cars [0] = "Camaro";
//		cars [1] = "Tesla";
//		cars [2] = "Skoda";
//		
//		for (int i = 0; i < cars.length; i++) {
//			System.out.println(cars[i]);
//		}
		
//		2d arrray dvojrozmerne polia
		
//		String [][] cars = new String [3] [3];
		
		String [][] cars = {{"camaro", "fabia","suzuki"},
							{"lambo", "dodge","audi"},
							{"bmw", "mercedes","volvo"}
							};
						
		
		cars [0][0] = "camaro";
		cars [0][1] = "fabia";
		cars [0][2] = "suzuki";
		cars [1][0] = "lambo";
		cars [1][1] = "dodge";
		cars [1][2] = "audi";
		cars [2][0] = "bmw";
		cars [2][1] = "mercedes";
		cars [2][2] = "volvo";
		
		for (int i =1; i < cars.length; i++) {
			System.out.println();
			for (int j =1; j < cars[i].length;j++) {
				System.out.print(cars[i][j] + " ");
			}
		}
		
	
	}

}
