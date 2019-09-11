import javax.swing.JOptionPane;

/*
 * O que o logger deve fazer:
 * (1) deverah possuir um buffer compartilhado (sugestao: LinkedBlockingQueue)
 * (2) deverah possuir uma thread para gravacao em arquivo (consumidor)
 * (3) para inserir uma mensagem no log, deve-se utilizar o metodo putMessage (produtor)
 * (4) cada mensagem, ao ser gravada em arquivo, deverah conter o numero (contador) e a hora do evento
 * (5) inclua o que for necessario (metodos e atributos)
 */

public class Logger {
	
	private static Logger instance = null;
	private static LoggerThread Log;
	private final static String logFileName = "serverlog.txt";
	
	// incluir campos necessarios
	
	// singleton
	public static synchronized Logger getInstance(){
		
		if(instance == null){
			instance = new Logger();			
		}
		return instance;
	}
	
	private Logger(){
		LoggerThread.getLogger();
	}
	
	public void putMessage(String message){
		Log.putMessage(message);
	}	

}
