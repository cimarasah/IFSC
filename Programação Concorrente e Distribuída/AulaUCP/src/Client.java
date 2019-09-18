import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Client {

	private static DatagramSocket aSocket;

	public static void main(String[] args) {
		try {
			aSocket = new DatagramSocket();
			String msg = "Olah eu sou o cliente!";
			int port = 1234;
			InetAddress addr = InetAddress.getByName("localhost");
			DatagramPacket request = new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr, port);
			aSocket.send(request);
			byte buffer[] = new byte[1000];
			DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
			aSocket.receive(reply);
			String str = new String(reply.getData());
			System.out.println("Servidor retornou mensagem recebida: "+str);
		}catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
