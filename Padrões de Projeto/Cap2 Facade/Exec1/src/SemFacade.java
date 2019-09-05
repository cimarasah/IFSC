

public class SemFacade {
	
	public static void main(String[] args) {
	    System.out.println("##### Configurando subsistemas #####");
	    SistemaDeAudio audio = new SistemaDeAudio();
	    audio.configurarCanais();
	    audio.configurarFrequencia();
	    audio.configurarVolume();
	 
	    SistemaDeInput input = new SistemaDeInput();
	    input.configurarTeclado();
	    input.configurarJoystick();
	 
	    SistemaDeVideo video = new SistemaDeVideo();
	    video.configurarCores();
	    video.configurarResolucao();
	 
	    System.out.println("##### Utilizando subsistemas #####");
	    audio.reproduzirAudio("teste.mp3");
	    input.lerInput();
	    video.renderizarImagem("imagem.png");
	}
	
	

}
