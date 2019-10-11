package aulas.padroes.state.exercicio3;

public class Conta {
	public Double saldo;
	public EstadoConta estadoConta; 

	public Conta()
	{
		this.saldo = 0.0;
		this.estadoConta = new Positivo();
	}


	public void saque(double d) {
		estadoConta.saque(this,d);
		System.out.println("Estado da conta: "+this.estadoConta.toString());
		
	}

	public void deposito(double d) {
		estadoConta.deposito(this, d);
		System.out.println("Foi depositado R$"+ d+ ", saldo atual R$"+ this.saldo);
		System.out.println("Estado da conta: "+this.estadoConta.toString());
		
	}

}
