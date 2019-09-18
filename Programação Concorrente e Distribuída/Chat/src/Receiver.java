import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

import javax.swing.JTextArea;

public class Receiver implements Runnable{

	private int port = 5555;
	private static DatagramSocket aSocket;	
	JTextArea  textConversa;
	public Receiver(JTextArea  textConversa) {
		this.textConversa = textConversa;
	}
	@Override
	public void run() {
		try {
			aSocket = new DatagramSocket(port);
		} catch (SocketException e1) {
			e1.printStackTrace();
		}
		while(true) {
			try {

				byte buffer[] = new byte[1000];
				DatagramPacket request = new DatagramPacket(buffer, buffer.length);
				aSocket.receive(request);
				String msg = new String(request.getData());
				System.out.println("Mensagem Recebida:"+ msg);
				textConversa.setText(textConversa.getText()+"\n"+msg );
				//msg = msg.substring(0, request.getLength());
				
			} catch (SocketException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
