import java.net.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * O que servidor irah fazer:
 * (1) deverah aceitar cada conexao (isto estah implementado) ok
 * (2) deverah possuir um pool estatico de threads para atendimento ok
 * (3) devarah delegar cada atendimento para uma thread ok
 */


public class Server {
	
	public static void main(String args[]) throws Exception {
		ExecutorService es = Executors.newCachedThreadPool();

		ServerSocket serverSocket = new ServerSocket(1234);
		boolean cont = true;
		while (cont) {
			Socket inSoc = serverSocket.accept();
			AtendimentoRunnable atendimento = new AtendimentoRunnable(inSoc);
			es.execute(atendimento);
			
		}
		serverSocket.close();
	}
}