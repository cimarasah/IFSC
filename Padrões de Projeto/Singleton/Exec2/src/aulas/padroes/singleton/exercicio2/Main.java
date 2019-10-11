package aulas.padroes.singleton.exercicio2;

public class Main {

	public static void main(String[] args) {
		Sistema sistema1 =  new Sistema().getInstance();
		sistema1.setUsuarioAutenticado("José");
		System.out.println(sistema1.getUsuarioAutenticado());

		Sistema sistema2 =  new Sistema().getInstance();
		sistema2.setUsuarioAutenticado("Pedro");
		System.out.println(sistema2.getUsuarioAutenticado());

		if(sistema1 == sistema2)
			System.out.println("Objetos iguais!");
		else
			System.out.println("Objetos diferentes!");
	}
}