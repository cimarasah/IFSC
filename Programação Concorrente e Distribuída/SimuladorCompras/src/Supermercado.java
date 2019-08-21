import java.util.HashMap;

public class Supermercado {

	static HashMap<String, Double> listaProdutos = new HashMap<String, Double>();
	public static void main(String[] args) {
		carregarEstoque();
		

	}
	private static void carregarEstoque() {
		listaProdutos.put("Arroz", 2.00);
		listaProdutos.put("Feijão", 1.00);
		listaProdutos.put("Farinha", 4.00);
		listaProdutos.put("Batata", 1.00);
		listaProdutos.put("Pimentão", 1.00);
		listaProdutos.put("Margarina", 5.00);
		listaProdutos.put("Detergente", 1.00);
		listaProdutos.put("Sabão", 12.00);
		listaProdutos.put("Amaciante", 7.00);
		listaProdutos.put("Sabonete", 3.00);
	}

}
