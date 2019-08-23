public class CalculoImpostoVinte  implements Strategy{

	@Override
	public double calcularSalarioComImposto(double salario) {
		return salario - (salario*0.2);		
	}
	
}