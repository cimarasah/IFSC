import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;


public class Server {

	private static DatagramSocket aSocket;

	public static void main(String[] args) {
		try {


			aSocket = new DatagramSocket(1234);
			byte buffer[] = new byte[1000];
			DatagramPacket request = new DatagramPacket(buffer, buffer.length);
			aSocket.receive(request);

			String msg = new String(request.getData());
			msg = msg.substring(0, request.getLength());
			msg+= "-> OK";
			DatagramPacket reply = new DatagramPacket(msg.getBytes(), msg.getBytes().length, request.getAddress(), request.getPort());
			aSocket.send(reply);


		}catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
