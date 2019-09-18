import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Sender {

	private String partner;
	private int port = 5555;
	private DatagramSocket aSocket;	
	InetAddress addr;
	
	public Sender(String partner) {
		this.partner = partner;
		try {
			aSocket = new DatagramSocket();
			addr = InetAddress.getByName(partner);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void enviar(String msg) {
		
			try {
				
				DatagramPacket request = new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr, port);
				aSocket.send(request);
		
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		


	}
	
	
	

}
