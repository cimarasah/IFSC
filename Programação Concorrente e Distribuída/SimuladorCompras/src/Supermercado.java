import java.util.ArrayList;
import java.util.List;

import Model.Produto;

public class Supermercado {
	
	static List<Produto> listaProdutos = new ArrayList<Produto>();
	static List<Produto> produtosEscolhidos = new ArrayList<Produto>();
	public static void main(String[] args) {
		carregarEstoque();
		

	}
	private static void carregarEstoque() {
		
		Produto produto = new Produto("Arroz", 2.00);
		listaProdutos.add(produto);
		produto = new Produto("Feij�o", 1.00);
		listaProdutos.add(produto);
		produto = new Produto("Farinha", 4.00);
		listaProdutos.add(produto);
		produto = new Produto("Batata", 1.00);
		listaProdutos.add(produto);
		produto = new Produto("Piment�o", 1.00);
		listaProdutos.add(produto);
		produto = new Produto("Margarina", 5.00);
		listaProdutos.add(produto);
		produto = new Produto("Detergente", 1.00);
		listaProdutos.add(produto);
		produto = new Produto("Sab�o", 12.00);
		listaProdutos.add(produto);
		produto = new Produto("Amaciante", 7.00);
		listaProdutos.add(produto);
		produto = new Produto("Sabonete", 3.00);
		listaProdutos.add(produto);
	}

	
}
