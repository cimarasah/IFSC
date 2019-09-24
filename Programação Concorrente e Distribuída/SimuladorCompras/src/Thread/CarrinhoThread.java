package Thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import Buffer.Buffer;
import Model.Produto;

public class CarrinhoThread implements Runnable {

	//private static Random generator = new Random();
	
	private Buffer sharedLocation; 
	private Random generator = new Random();
	private List<Produto> listaProdutos;
	private List<Produto> produtosEscolhidos;
	private SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");

	
	public CarrinhoThread(Buffer sharedLocation, Random generator, List<Produto> listaProdutos,
			List<Produto> produtosEscolhidos) {
		super();
		this.sharedLocation = sharedLocation;
		this.generator = generator;
		this.listaProdutos = listaProdutos;
		this.produtosEscolhidos = produtosEscolhidos;
	}



	

	
	@Override
	public void run() {
		System.out.println("-Comprador: ["+formato.format(new Date())+"] Iniciando compras.");
		int qtdItensComprados = generator.nextInt((10 - 30) + 1) + 10;
		for (int i = 0; i < qtdItensComprados; i++) {
			Produto prodEscolhido = listaProdutos.get(generator.nextInt(listaProdutos.size()));
			produtosEscolhidos.add(prodEscolhido);
			System.out.println("-Comprador: ["+formato.format(new Date())+"]  Colocando item "+ (i+1) +" no carrinho : " + prodEscolhido.nome);
		}
	}

}
