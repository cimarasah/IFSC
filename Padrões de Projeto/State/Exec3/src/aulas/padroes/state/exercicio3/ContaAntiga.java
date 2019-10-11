package aulas.padroes.state.exercicio3;


public class ContaAntiga{

	public Double saldo;
	public EstadosDaConta estadoConta; 

	public ContaAntiga()
	{
		this.saldo = 0.0;
		this.estadoConta = EstadosDaConta.saldoPositivo;
	}

	public ContaAntiga(Double valor)
	{
		this.deposito(valor);
	}

	public void saque(Double valor){
		switch (estadoConta)		{
		case saldoPositivo:
			this.saldo -= valor;
			System.out.println("Retirado R$"+valor+", saldo atual R$"+this.saldo);
			if (this.saldo < 0)
				this.estadoConta = EstadosDaConta.saldoNegativo;
			break;
		case saldoNegativo:
			this.saldo -= valor;
			System.out.println("Retirado R$"+valor+", saldo atual R$"+this.saldo);
			if (this.saldo < -100.00)
				this.estadoConta = EstadosDaConta.bloqueado;
			break;
		case bloqueado:
			System.out.println("Conta bloqueada, saque cancelado, saldo atual R$"+ this.saldo);
			break;
		}
		System.out.println("Estado da conta: "+this.estadoConta.toString());
	}

	public void deposito(Double valor){
		this.saldo += valor;
		if (this.saldo <= -100.00)
			this.estadoConta = EstadosDaConta.bloqueado;
		else if (this.saldo >= 0)
			this.estadoConta = EstadosDaConta.saldoPositivo;
		else
			this.estadoConta = EstadosDaConta.saldoNegativo;

		System.out.println("Foi depositado R$"+ valor+ ", saldo atual R$"+ this.saldo);
		System.out.println("Estado da conta: "+this.estadoConta.toString());
	}
	
	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public EstadosDaConta getMeuEstado() {
		return estadoConta;
	}

	public void setMeuEstado(EstadosDaConta meuEstado) {
		this.estadoConta = meuEstado;
	}
	
	
}