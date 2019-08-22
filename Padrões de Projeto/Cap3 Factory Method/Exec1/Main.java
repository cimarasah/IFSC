
public class Main
{
	public static void main(String[] args) {
		AnimalFactory animalFactory;
		Animal animal;
		
		animalFactory = new AnimaisSelvagensFactory();
		
		animal=animalFactory.GetAnimalType("Pato");
		animal.Speak();
		
		animal=animalFactory.GetAnimalType("Tigre");
		animal.Speak();
		
		animal=animalFactory.GetAnimalType("Leao");
		animal.Speak();
		
		animalFactory = new AnimaisDomesticosFactory();
		
		animal=animalFactory.GetAnimalType("Gato");
		animal.Speak();
		
		animal=animalFactory.GetAnimalType("Cachorro");
		animal.Speak();
		

	}
}
