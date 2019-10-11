package aulas.padroes.state.exercicio3;

public class MainAntes {

	public static void main(String[] args) {
		
		ContaAntiga conta = new ContaAntiga();
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
