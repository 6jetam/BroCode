import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		
		ArrayList <ArrayList<String>> groceryList = new ArrayList ();
		
		ArrayList <String> bakeryList = new ArrayList();
		
		bakeryList.add("pasta");
		bakeryList.add("garlic");
		bakeryList.add("sisky");
		
		
		ArrayList <String> vegeList = new ArrayList();
		
		vegeList.add("potatoes");
		vegeList.add("onion");
		vegeList.add("tomato");
		
	
		
		ArrayList <String> drinkList = new ArrayList();
		
		drinkList.add("coffe");
		drinkList.add("cola");
		drinkList.add("wasser");
		
		
		groceryList.add(vegeList);
		groceryList.add(bakeryList);
		groceryList.add(drinkList);
		
		System.out.println(groceryList.get(1).get(0));
		
		
		
//		ArrayList<String> food = new ArrayList <String> ();
//		
//		food.add("pizza");
//		food.add("hotdog");
//		food.add("hamburger");
//		
//		food.set(0, "sushi");
//		food.remove(2);
//		food.clear();
//		
//		for (int i =0;i<food.size();i++) {
//			System.out.println(food.get(i));
//		}

	}

}
