
public class Main {
	public static void main(String[] args) {
		FabricaDeCarro fabrica = new FabricaFiat();
		Carro carro = fabrica.criarCarro();
		carro.exibirInfo();

		fabrica = new FabricaWolks();
		carro = fabrica.criarCarro();
		carro.exibirInfo();

		fabrica = new FabricaFord();
		carro = fabrica.criarCarro();
		carro.exibirInfo();

		fabrica = new FabricaChevrolet();
		carro = fabrica.criarCarro();
		carro.exibirInfo();
	}
}
