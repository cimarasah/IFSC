import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

	public static void main(String[] args) {
		String nameService = "rmi://localhost/HelloService";
		
		try {
			IHelloWorld remote = (IHelloWorld) Naming.lookup(nameService);
			System.out.println(remote.sayHello("Cimara"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		

	}

}
