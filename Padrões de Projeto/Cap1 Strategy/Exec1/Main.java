
public class Main {
	public static void main(String[] args) {
		Funcionario Funcionario1 = new Funcionario(Funcionario.DESENVOLVEDOR,2100);
		System.out.println(Funcionario1.calcularSalarioComImposto());
		
		Funcionario Funcionario2 = new Funcionario(Funcionario.DESENVOLVEDOR,1700);
		System.out.println(Funcionario2.calcularSalarioComImposto());
		
		Funcionario Funcionario3 = new Funcionario(Funcionario.GERENTE,3600);
		System.out.println(Funcionario3.calcularSalarioComImposto());
		
		Funcionario Funcionario4 = new Funcionario(Funcionario.GERENTE,3000);
		System.out.println(Funcionario4.calcularSalarioComImposto());
		
		
	}
}
