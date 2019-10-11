package aulas.padroes.state.exercicio3;

public class MainDepois {
	
	public static void main(String[] args) {
	
		Conta conta = new Conta();
		conta.saque(5.0);
		conta.saque(100.0);
		conta.saque(5.0);
		conta.deposito(10.0);
		conta.saque(10.0);
		conta.saque(5.0);
		conta.deposito(150.0);
		conta.saque(5.0);
	}

}
