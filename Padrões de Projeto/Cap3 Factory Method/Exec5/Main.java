
public class Main {
	public static void main(String[] args) {
		Food food;
		FoodFactory factory;

		factory = new JapaneseFoodFactory();
		food = factory.getFood("Sashimi");
		food.description();
		
		food = factory.getFood("Temaki");
		food.description();

		factory = new MexicanFoodFactory();
		food = factory.getFood("Tacos");
		food.description();
		
		food = factory.getFood("Burritos");
		food.description();
		
	}
}
