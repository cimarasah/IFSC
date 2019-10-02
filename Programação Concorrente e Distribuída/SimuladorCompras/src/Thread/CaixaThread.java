package Thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Semaphore;

import Buffer.Buffer;
import Model.Produto;

public class CaixaThread implements Runnable{

	private Buffer esteiraBuffer; 
	private Buffer rampaBuffer; 
	private List<Produto> produtosEscolhidos;
	private SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
	private Semaphore semaforo;

	
	public CaixaThread(Buffer esteiraBuffer, Buffer rampaBuffer, List<Produto> produtosEscolhidos, Semaphore semaforo) {
		super();
		this.esteiraBuffer = esteiraBuffer;
		this.rampaBuffer = rampaBuffer;
		this.produtosEscolhidos = produtosEscolhidos;
		this.semaforo = semaforo;
	}


	@Override
	public void run() {
		
		double totalConta = 0;
		try {
			semaforo.acquire();
		
			for (int i = 0; i < produtosEscolhidos.size(); i++) {
				esteiraBuffer.set(produtosEscolhidos.get(i));
				System.out.println("-Caixa: ["+formato.format(new Date())+"] Passando o item: ");
				System.out.println("  -------------    " + esteiraBuffer.get().nome+ "      "+ esteiraBuffer.get().valor);
				totalConta+=esteiraBuffer.get().valor;
				System.out.println("-Caixa: ["+formato.format(new Date())+"] Valor parcial: " + totalConta);
				rampaBuffer.set(esteiraBuffer.get());
				
				Thread.sleep(3000);
			}
			System.out.println("-Caixa: ["+formato.format(new Date())+"] Valor total: " + totalConta);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			semaforo.release();
		}
		
	}
}
