import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JTextArea;

public class Sender {

	private String partner;
	private int port = 5000;
	private DatagramSocket aSocket;	
	InetAddress addr;
	
	public Sender(String partner) {
		this.partner = partner;
		try {
			
			aSocket = new DatagramSocket();
			partner = "225.4.5.6";
			addr = InetAddress.getByName(partner);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void enviar( String msg) {
		
			try {
				
				DatagramPacket request = new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr, port);
				aSocket.send(request);
				
		
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		


	}
	
	
	

}
