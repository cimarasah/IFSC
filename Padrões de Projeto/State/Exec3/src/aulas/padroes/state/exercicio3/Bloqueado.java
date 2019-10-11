package aulas.padroes.state.exercicio3;

public class Bloqueado implements EstadoConta{

	public void saque(Conta conta, double valor) {
		System.out.println("Conta bloqueada, saque cancelado, saldo atual R$"+ conta.saldo);
	}
	public void deposito(Conta conta, double valor) {
		conta.saldo += valor;
		if(conta.saldo>-100) {
			conta.estadoConta = new Negativo();
			if(conta.saldo>=0) {
				conta.estadoConta = new Positivo();
			}
		}
		
	}
	public String toString() {
		return "Bloqueado";
	}
}
