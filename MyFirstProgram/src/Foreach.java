import java.util.ArrayList;

public class Foreach {

	public static void main(String[] args) {
	 	
//		String [] animals = {"cat", "dog","rat","bird"};
		
		ArrayList <String> animals = new ArrayList();
		
		animals.add("cat");
		animals.add("dog");
		animals.add("bird");
		animals.add("rat");
		
		
		for(String i :animals) {
			System.out.println(i);
		}

	}

}
