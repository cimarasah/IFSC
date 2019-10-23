import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CalcServer {

	public static void main(String[] args) {
String nameService = "rmi://localhost/CalculadoraService";
		
		try {
			LocateRegistry.createRegistry(1099);
			ICalculadora remote = new CalculadoraImpl();
			Naming.rebind(nameService, remote);
			System.out.println("Calculadora está no ar!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
