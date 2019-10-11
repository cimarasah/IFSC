package aulas.padroes.singleton.exercicio2;

public  class Sistema {

	private static Sistema sistema;
	private String usuarioAutenticado;

	public Sistema getInstance() {
		if(sistema == null) {
			sistema = new Sistema();
		}
		return sistema;
	}

	public String getUsuarioAutenticado() {
		return this.usuarioAutenticado;
	}

	public void setUsuarioAutenticado(String usuarioAutenticado) {
		this.usuarioAutenticado = usuarioAutenticado;
	}

}