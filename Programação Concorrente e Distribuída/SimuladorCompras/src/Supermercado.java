import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import Buffer.Buffer;
import Buffer.EsteiraSemaphoreBuffer;
import Buffer.RampaSemaphoreBuffer;
import Model.Produto;
import Thread.CaixaThread;
import Thread.CarrinhoThread;
import Thread.EmpacotamentoThread;

public class Supermercado {

	static List<Produto> listaProdutos = new ArrayList<Produto>();
	static List<Produto> produtosEscolhidos = new ArrayList<Produto>();
	static List<Produto> sacola = new ArrayList<Produto>();
	private static Random generator = new Random();
	static Buffer esteiraBuffer = new EsteiraSemaphoreBuffer();
	private static SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
	static final int MAX_T = 1;

	static Buffer rampaBuffer = new RampaSemaphoreBuffer();
	static ReentrantLock lock = new ReentrantLock();
	
	private static Semaphore semaforo;

	public static void main(String[] args) {
		semaforo = new Semaphore(2);
		ExecutorService application1 = Executors.newFixedThreadPool(1);
		ExecutorService application2 = Executors.newFixedThreadPool(2);
		carregarEstoque();

		application1.execute(new CarrinhoThread(generator, listaProdutos, produtosEscolhidos, semaforo));
		application2.execute(new CaixaThread(esteiraBuffer, rampaBuffer, produtosEscolhidos, semaforo));
		application2.execute(new EmpacotamentoThread(rampaBuffer, produtosEscolhidos.size(), sacola, semaforo));


	}
	private static void carregarEstoque() {

		Produto produto = new Produto("Arroz", 2.00);
		listaProdutos.add(produto);
		produto = new Produto("Feijão", 1.00);
		listaProdutos.add(produto);
		produto = new Produto("Farinha", 4.00);
		listaProdutos.add(produto);
		produto = new Produto("Batata", 1.00);
		listaProdutos.add(produto);
		produto = new Produto("Pimentão", 1.00);
		listaProdutos.add(produto);
		produto = new Produto("Margarina", 5.00);
		listaProdutos.add(produto);
		produto = new Produto("Detergente", 1.00);
		listaProdutos.add(produto);
		produto = new Produto("Sabão", 12.00);
		listaProdutos.add(produto);
		produto = new Produto("Amaciante", 7.00);
		listaProdutos.add(produto);
		produto = new Produto("Sabonete", 3.00);
		listaProdutos.add(produto);
	}


}
