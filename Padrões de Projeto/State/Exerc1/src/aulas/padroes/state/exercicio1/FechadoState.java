package aulas.padroes.state.exercicio1;

public class FechadoState implements StatusDoBug{

	@Override
	public void abre(Bug bug) {
		System.out.println("Bug fechado");
		
	}

	@Override
	public void analisa(Bug bug) {
		System.out.println("Bug fechado");
		
	}

	@Override
	public void fecha(Bug bug) {
		System.out.println("Bug fechado");
		
	}

}
