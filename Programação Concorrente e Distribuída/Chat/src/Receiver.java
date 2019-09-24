import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

import javax.swing.JTextArea;

public class Receiver implements Runnable{

	private int portSala1 = 5000;
	private int portSala2 = 5001;
	private MulticastSocket aSocket;	
	JTextArea  textConversa;
	String partner = "225.4.5.6";
	InetAddress ipGrupo = null;
	public Receiver(JTextArea  textConversa) {
		this.textConversa = textConversa;
	}
	@Override
	public void run() {
		try {
			ipGrupo = InetAddress.getByName(partner);

			aSocket = new MulticastSocket(portSala1);
			aSocket.setBroadcast(true);
			aSocket.joinGroup(ipGrupo);
		} catch (SocketException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
