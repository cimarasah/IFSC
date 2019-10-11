package aulas.padroes.state.exercicio3;

public interface EstadoConta{
    void saque(Conta conta, double valor);
    void deposito(Conta conta, double valor);
    public String toString();
}