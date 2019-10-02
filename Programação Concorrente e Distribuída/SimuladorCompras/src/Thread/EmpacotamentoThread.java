package Thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Semaphore;

import Buffer.Buffer;
import Model.Produto;

public class EmpacotamentoThread implements Runnable{
	
	
	private Buffer rampaBuffer; 
	private int qtdProd=0;
	private SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
	List<Produto> sacola;
	private Semaphore semaforo;

	
	public EmpacotamentoThread( Buffer rampaBuffer, int qtdProd, List<Produto> sacola, Semaphore semaforo) {
		super();
		this.rampaBuffer = rampaBuffer;
		this.qtdProd = qtdProd;
		this.sacola = sacola;
		this.semaforo = semaforo;
	}


	@Override
	public void run() {
		
		try {
			semaforo.acquire();
			for (int i = 0; i < qtdProd; i++) {
				System.out.println("-Ensacolador: ["+formato.format(new Date())+"]  Acomodando item " + rampaBuffer.get().nome+ " na sacola");
				sacola.add(rampaBuffer.get());
				Thread.sleep(3000);
			}
			System.out.println("-Ensacolador: ["+formato.format(new Date())+"] Fim do empacotamento");
			System.out.println("-Fim da simulação: ["+formato.format(new Date())+"]");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			semaforo.release();
		}
		
	}
}
