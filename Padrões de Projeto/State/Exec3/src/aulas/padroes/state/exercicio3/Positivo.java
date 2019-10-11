package aulas.padroes.state.exercicio3;

public class Positivo implements EstadoConta{

	public void saque(Conta conta, double valor) {

		conta.saldo -= valor;
		System.out.println("Retirado R$"+valor+", saldo atual R$"+conta.saldo);
		if(conta.saldo<0) {
			conta.estadoConta = new Negativo();
		}

	}
	public void deposito(Conta conta, double valor) {
		conta.saldo += valor;
	}
	public String toString() {
		return "Positivo";
	}
}
