package aulas.padroes.singleton.exercicio1;

public class Main {
	public static void main(String args[]) {

		Singleton object1 = new Singleton().getInstancia();
		object1.display();

		Singleton object2 = new Singleton().getInstancia();
		object1.display();

		if(object1 ==object2)
			System.out.println("Objetos iguais!");
		else
			System.out.println("Objetos diferentes!");
	}
}