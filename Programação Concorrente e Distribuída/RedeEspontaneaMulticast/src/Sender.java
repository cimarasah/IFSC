import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Sender {



	public void sender() {
		try {
			int port = 5000;
			String group = "225.4.5.6";
			MulticastSocket ms = new MulticastSocket();
			String str = "Existo";
			InetAddress ip = InetAddress.getByName(group);  

			DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, port);  
			ms.send(dp);  
			ms.close(); 

		}catch(IOException ioex) {

		}
	}

}
