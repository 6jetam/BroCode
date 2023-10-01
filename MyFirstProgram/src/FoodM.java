
public class FoodM {

	public static void main(String[] args) {
Food [] refrigerator = new Food [3];
		
		Food food1 = new Food("ham");
		Food food2 = new Food ("bacon");
		Food food3 = new Food ("pizza");
		
		refrigerator[0] = food1;
		refrigerator[1] = food2;
		refrigerator[2] = food3;
		
		//iny zapis
		
//		Food[] refrigerator = {food1,food2,food3};
		
		System.out.println(refrigerator[1].name);
	}

}
