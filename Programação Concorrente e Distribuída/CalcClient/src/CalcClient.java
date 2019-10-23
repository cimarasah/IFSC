import java.rmi.Naming;
import java.util.Scanner;

public class CalcClient {

	public static void main(String[] args) {
		String nameService = "rmi://localhost/CalculadoraService";

		try {
			ICalculadora remote = (ICalculadora) Naming.lookup(nameService);
			String op="";
			Scanner s = new Scanner(System.in);
			System.out.println(" _______________________________________________");
			System.out.println("|                                               |");
			System.out.println("|     Operações:                                |");
			System.out.println("|        '+' = SOMAR                            |");
			System.out.println("|        '-' = SUBTRAIR                         |");
			System.out.println("|        '*' = MULTIPLICAR                      |");
			System.out.println("|        '/' = DIVIDIR                          |");
			System.out.println("|        'mmc' = MMC                            |");
			System.out.println("|        'mdc' = MDC                            |");
			System.out.println("|                                               |");
			System.out.println("|     SE QUISER PARAR A CALCULADORA DIGITE      |");
			System.out.println("|              QUALQUER CARACTER                |");
			System.out.println("|_______________________________________________|");
			System.out.println("");
			System.out.println("Digite a operação:");
			op = s.next();
			while (op.equals("+")||op.equals("-")||op.equals("*")||op.equals("/")||op.equals("mmc")||op.equals("mdc")) {

				
				System.out.println("Digite o primeiro valor:");
				int num1 = s.nextInt();

				System.out.println("Digite o segundo valor:");
				int num2 = s.nextInt();
				int result;
				switch (op) {
				case "+":
					result = remote.somar(num1, num2);
					System.out.println("________________");
					System.out.println("");
					System.out.println(num1 + " + " + num2 + " = " + result);
					System.out.println("________________");
					break;

				case "-":
					result = remote.subtrair(num1, num2);
					System.out.println("________________");
					System.out.println("");
					System.out.println(num1 + " - " + num2 + " = " + result);
					System.out.println("________________");
					break;
				case "*":
					result = remote.multiplicar(num1, num2);
					System.out.println("________________");
					System.out.println("");
					System.out.println(num1 + " * " + num2 + " = " + result);
					System.out.println("________________");
					break;
				case "/":
					if(num2==0) {
						System.out.println("Não é possivel dividir por zero");
					}else {
						result = remote.dividir(num1, num2);
						System.out.println("________________");
						System.out.println("");
						System.out.println(num1 + " / " + num2 + " = " + result);
						System.out.println("________________");
					}
					break;
				case "mmc":
					result = remote.mmc(num1, num2);
					System.out.println("________________");
					System.out.println("");
					System.out.println("MMC (" + num1 + ","+ num2 + ")"+ " = " + result);
					System.out.println("________________");
					break;
				case "mdc":
					result = remote.mdc(num1, num2);
					System.out.println("________________");
					System.out.println("");
					System.out.println("MDC (" + num1 + ","+ num2 + ")"+ " = " + result);
					System.out.println("________________");
					break;
				default:
					break;
				}
				System.out.println(" _______________________________________________");
				System.out.println("|                                               |");
				System.out.println("|     SE QUISER PARAR A CALCULADORA DIGITE      |");
				System.out.println("|              QUALQUER CARACTER                |");
				System.out.println("|_______________________________________________|");
				System.out.println("Digite a operação:");
				op = s.next();
				
			}
			System.out.println(" _______________________________________________");
			System.out.println("|                                               |");
			System.out.println("|                 ATE A PROXIMA                 |");
			System.out.println("|_______________________________________________|");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
