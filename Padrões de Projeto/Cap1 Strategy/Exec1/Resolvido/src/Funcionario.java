
public class Funcionario{
	public static final int DESENVOLVEDOR = 1;
	public static final int GERENTE = 2;
	
	Strategy calculoImposto;
	public int cargo;
	public double salario;
	
	public Funcionario (int cargo, double salario) {
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public double calcularSalarioComImposto() {
		// TODO Auto-generated method stub
		if(cargo == Funcionario.DESENVOLVEDOR) {
			if(salario>2000) {
				calculoImposto = new CalculoImpostoQuinze();
			}else {
				calculoImposto = new CalculoImpostoDez();
			}
		}else {
			if(salario>3500) {
				calculoImposto = new CalculoImpostoVinte();
			}else {
				calculoImposto = new CalculoImpostoQuinze();
			}
		}
		return calculoImposto.calcularSalarioComImposto(salario);
	}

}
