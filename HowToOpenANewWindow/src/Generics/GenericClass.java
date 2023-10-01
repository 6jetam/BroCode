package Generics;

public class GenericClass {

	public static void main(String[] args) {
		MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
		MyGenericClass<Double> myDouble = new MyGenericClass<>(3.14);
		
		System.out.println(myInt.getClass());
	

	}

}
