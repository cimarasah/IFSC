package aulas.padroes.state.exercicio1;

public class VerificandoState implements StatusDoBug{

	@Override
	public void abre(Bug bug) {
		System.out.println("Bug em análise");
		
	}

	@Override
	public void analisa(Bug bug) {
		System.out.println("Bug está sendo analisado, falta fechar");
		
	}

	@Override
	public void fecha(Bug bug) {
		bug.status =  new FechadoState();
		System.out.println("Bug fechado");
		
	}

}
