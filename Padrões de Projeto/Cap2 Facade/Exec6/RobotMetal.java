package aulas.padroes.facade.exercicio6;

public class RobotMetal{
	
	private String metal;
	
	public void setMetal(String metal) {
		this.metal=metal;
		System.out.println("Metal is set to: "+this.metal);
	}

	public String getMetal() {
		return metal;
	}
	
}
