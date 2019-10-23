import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculadora extends Remote{
	
	public int somar(int num1, int num2) throws RemoteException;
	public int subtrair(int num1, int num2) throws RemoteException;
	public int multiplicar(int num1, int num2) throws RemoteException;
	public int dividir(int num1, int num2) throws RemoteException;
	public int mmc(int num1, int num2) throws RemoteException;
	public int mdc(int num1, int num2) throws RemoteException;
}
