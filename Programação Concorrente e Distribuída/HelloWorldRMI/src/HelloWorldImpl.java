import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloWorldImpl extends UnicastRemoteObject implements IHelloWorld {

	
	
	public HelloWorldImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sayHello(String who) throws RemoteException {
		// TODO Auto-generated method stub
		return "Hello " + who;
	}

	

}
