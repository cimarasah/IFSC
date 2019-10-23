import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

	public static void main(String[] args) {
		String nameService = "rmi://localhost/HelloService";
		
		try {
			LocateRegistry.createRegistry(1099);
			IHelloWorld remote = new HelloWorldImpl();
			Naming.rebind(nameService, remote);
			System.out.println("ta ok!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
