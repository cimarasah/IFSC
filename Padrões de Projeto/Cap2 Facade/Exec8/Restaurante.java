
public class Restaurante {
	
	public boolean isAvailable() {
		return true;
	}
	
	public void bookRestaurant() {
		System.out.println("Restaurante Reservado");
	}
	
	public void setMenu(String...foods) {
		System.out.println("Comidas selecionadas");
		for (int i = 0; i < foods.length; i++) {
			System.out.println(foods[i]);
		}
	}

}
