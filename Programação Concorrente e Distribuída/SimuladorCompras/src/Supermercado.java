import java.util.HashMap;

public class Supermercado {

	static HashMap<String, Double> listaProdutos = new HashMap<String, Double>();
	public static void main(String[] args) {
		carregarEstoque();
		

	}
	private static void carregarEstoque() {
		listaProdutos.put("Arroz", 2.00);
		listaProdutos.put("Feij�o", 1.00);
		listaProdutos.put("Farinha", 4.00);
		listaProdutos.put("Batata", 1.00);
		listaProdutos.put("Piment�o", 1.00);
		listaProdutos.put("Margarina", 5.00);
		listaProdutos.put("Detergente", 1.00);
		listaProdutos.put("Sab�o", 12.00);
		listaProdutos.put("Amaciante", 7.00);
		listaProdutos.put("Sabonete", 3.00);
	}

}
