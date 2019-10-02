package Thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

import Buffer.Buffer;
import Model.Produto;

public class CarrinhoThread implements Runnable {

	//private static Random generator = new Random();


	private Random generator = new Random();
	private List<Produto> listaProdutos;
	private List<Produto> produtosEscolhidos;
	private SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
	private Semaphore semaforo;
	


	public CarrinhoThread( Random generator, List<Produto> listaProdutos,
			List<Produto> produtosEscolhidos, Semaphore semaforo) {
		super();
		this.generator = generator;
		this.listaProdutos = listaProdutos;
		this.produtosEscolhidos = produtosEscolhidos;
		this.semaforo = semaforo;
	}


	@Override
	public void run() {

		try {
			semaforo.acquire();
			System.out.println("-Comprador: ["+formato.format(new Date())+"] Iniciando compras.");
			int qtdItensComprados = generator.nextInt((30 - 10) + 1) + 10;
			for (int i = 0; i < qtdItensComprados; i++) {
				Produto prodEscolhido = listaProdutos.get(generator.nextInt(listaProdutos.size()));
				produtosEscolhidos.add(prodEscolhido);			
				System.out.println("-Comprador: ["+formato.format(new Date())+"]  Colocando item "+ prodEscolhido.nome +" no carrinho");
				//Thread.sleep(3000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			semaforo.release();
		}
			
			
			


	}

}
