package aulas.padroes.singleton.exercicio1;

public class Singleton {
	public static Singleton instancia;
	

	public Singleton getInstancia() {
		if(instancia == null) {
			instancia = new Singleton();
		}
		return this.instancia;
	}
	public void display() {
		System.out.println("Helllo Singleton!");
	}
}