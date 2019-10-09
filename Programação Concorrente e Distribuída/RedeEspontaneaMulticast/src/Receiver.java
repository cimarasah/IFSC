import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Receiver {

	public String  receiver() {
		try {
			int port = 5000;
			String group = "225.4.5.6";

			MulticastSocket ms = new MulticastSocket(port);
			InetAddress ip = InetAddress.getByName(group);  
			ms.joinGroup(ip);
			
			byte[] buf = new byte[1024];  
		    DatagramPacket dp = new DatagramPacket(buf, 1024);
		    ms.receive(dp);
		    return new String(dp.getData(), 0, dp.getLength());
		    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
}
