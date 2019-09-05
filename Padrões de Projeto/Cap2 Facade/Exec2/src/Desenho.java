
public class Desenho {

	Forma circulo;
	Forma retangulo;
	Forma quadrado;
	Forma trapezio; 
	public Desenho() {
		circulo = new Circulo();
		retangulo = new Retangulo();
		quadrado = new Quadradro();
		trapezio = new Trapezio();
	}
	
	public void desenharCirculo() {
		circulo.desenhar();
		
	}

	public void desenharRetangulo() {
		retangulo.desenhar();
	}

	public void desenharQuadrado() {
		quadrado.desenhar();
		
	}

	public void desenharTrapezio() {
		trapezio.desenhar();
		
	}

}
