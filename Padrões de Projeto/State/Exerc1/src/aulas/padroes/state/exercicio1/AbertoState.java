package aulas.padroes.state.exercicio1;

public class AbertoState implements StatusDoBug{

	@Override
	public void abre(Bug bug) {
		System.out.println("Bug aberto");
	}

	@Override
	public void analisa(Bug bug) {
		bug.status = new VerificandoState();
		System.out.println("Bug em an�lise");
	}

	@Override
	public void fecha(Bug bug) {
		System.out.println("Bug ainda n�o foi analisado");
		
	}

}
