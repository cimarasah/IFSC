package aulas.padroes.state.exercicio1;

public class VerificandoState implements StatusDoBug{

	@Override
	public void abre(Bug bug) {
		System.out.println("Bug em an�lise");
		
	}

	@Override
	public void analisa(Bug bug) {
		System.out.println("Bug est� sendo analisado, falta fechar");
		
	}

	@Override
	public void fecha(Bug bug) {
		bug.status =  new FechadoState();
		System.out.println("Bug fechado");
		
	}

}
