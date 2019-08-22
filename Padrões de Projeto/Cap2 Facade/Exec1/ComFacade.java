package aulas.padroes.facade.exercicio1;



public class ComFacade {
	public static void main(String[] args) {
		System.out.println("##### Configurando subsistemas #####");
		SistemasFacade fachada = new SistemasFacade();
		fachada.inicializarSubsistemas();

		System.out.println("##### Utilizando subsistemas #####");
		fachada.reproduzirAudio("teste.mp3");
		fachada.lerInput();
		fachada.renderizarImagem("imagem.png");
		
		
	}
}
