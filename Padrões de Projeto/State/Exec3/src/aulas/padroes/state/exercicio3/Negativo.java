package aulas.padroes.state.exercicio3;

public class Negativo implements EstadoConta{

	public void saque(Conta conta, double valor) {
		conta.saldo -= valor;
		System.out.println("Retirado R$"+valor+", saldo atual R$"+conta.saldo);
		if(conta.saldo<0) {
			conta.estadoConta = new Bloqueado();
		}
	}
	public void deposito(Conta conta, double valor) {
		conta.saldo += valor;
		if(conta.saldo>=0) {
			conta.estadoConta = new Positivo();
		}
	}
	public String toString() {
		return "Negativo";
	}
}
