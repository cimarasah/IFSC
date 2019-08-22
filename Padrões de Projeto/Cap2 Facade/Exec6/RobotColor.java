package aulas.padroes.facade.exercicio6;

public class RobotColor{

	private String color;

	public void setColor(String color){
		this.color = color;
		System.out.println("Color is set to: "+ this.color);
	}

	public String getColor() {
		return color;
	}
		
}
