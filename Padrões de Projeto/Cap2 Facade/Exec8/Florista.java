
public class Florista {
	
	public boolean isAvailable() {
		return true;
	}
	
	public void bookFlorist() {
		System.out.println("Florista Reservado");
	}
	
	public void setFlowersType(String...flowers) {
		System.out.println("Flores selecionadas");
		for (int i = 0; i < flowers.length; i++) {
			System.out.println(flowers[i]);
		}
	}
	
	

}
