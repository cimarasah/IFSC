
public class SistemasFacade {

	SistemaDeAudio audio;
	SistemaDeInput input;
	SistemaDeVideo video;
	
	public void inicializarSubsistemas() {
		audio = new SistemaDeAudio();
	    audio.configurarCanais();
	    audio.configurarFrequencia();
	    audio.configurarVolume();
	 
	    input = new SistemaDeInput();
	    input.configurarTeclado();
	    input.configurarJoystick();
	 
	    video = new SistemaDeVideo();
	    video.configurarCores();
	    video.configurarResolucao();
		
	}

	public void reproduzirAudio(String arquivo) {
		
		audio.reproduzirAudio(arquivo);
	}

	public void renderizarImagem(String imagem) {
		
		video.renderizarImagem(imagem);
	}

	public void lerInput() {
		
		input.lerInput();
	}

	
}
