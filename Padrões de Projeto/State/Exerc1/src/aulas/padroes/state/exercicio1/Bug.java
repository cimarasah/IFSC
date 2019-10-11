package aulas.padroes.state.exercicio1;

public class Bug {

	private Integer id;
	private String descricao;
	public StatusDoBug status;
	
	public Bug(Integer id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.status = new AbertoState();
	}
	public void abre() {
		status.abre(this);
	}
	public void analisa() {		
		status.analisa(this);
	}
	public void fecha() {		
		status.fecha(this);
	}
}
