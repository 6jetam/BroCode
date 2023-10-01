package Generics;

public class GenericsMain {

	public static void main(String[] args) {

		Integer[] intArray = {1,2,34};
		Double [] doubleArray = {5.5,4.4,3.3,2.2};
		Character[] charArray = {'H','Y','A'};
		String[] stringArray = {"B","O","Z"};
		
//		displayArray(charArray);
//		displayArray(doubleArray);
//		displayArray(intArray);

		System.out.println(getFirst(intArray));
		System.out.println(getFirst(charArray));
		System.out.println(getFirst(doubleArray));
		System.out.println(getFirst(stringArray));
		
	}
	
	public static <DatovyTyp> void displayArray (DatovyTyp[] array) {
		for (DatovyTyp x:array) {
			System.out.println(x + " ");
		}
		System.out.println();
	}
	
	public static <Thing> Thing getFirst(Thing[] array) {
		return array[0];
	}
}
