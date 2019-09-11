import java.net.Socket;

public class AtendimentoRunnable implements Runnable {
	
	private Socket inSoc;
	public AtendimentoRunnable(Socket inSoc) {
		this.inSoc= inSoc;
	}

	@Override
	public void run() {
		HttpRequest request;
		try {
			request = new HttpRequest(inSoc);
			request.process();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
