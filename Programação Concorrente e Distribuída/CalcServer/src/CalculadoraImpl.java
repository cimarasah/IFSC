import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraImpl extends UnicastRemoteObject implements ICalculadora {
	

	protected CalculadoraImpl() throws RemoteException {
		super();
	}

	@Override
	public int somar(int num1, int num2) throws RemoteException {
		
		return num1+num2;
	}

	@Override
	public int subtrair(int num1, int num2) throws RemoteException {
		
		return  num1-num2;
	}

	@Override
	public int multiplicar(int num1, int num2) throws RemoteException {
		
		return  num1*num2;
	}

	@Override
	public int dividir(int num1, int num2) throws RemoteException {
		
		return  num1/num2;
	}

	@Override
	public int mmc(int num1, int num2) throws RemoteException {
		return num1 * (num2 / mdc(num1, num2));
	}

	@Override
	public int mdc(int num1, int num2) throws RemoteException {
		while(num2 != 0){
            int r = num1 % num2;
            num1 = num2;
            num2 = r;
        }
        return num1;
	}

	

}
