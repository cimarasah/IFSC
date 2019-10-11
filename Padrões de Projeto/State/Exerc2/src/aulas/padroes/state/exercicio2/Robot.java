package aulas.padroes.state.exercicio2;

public class Robot {
	public StateRobo status;

	public Robot() {
		super();
		this.status = new RoboOn();
	}

	public void walk() {
		this.status.walk(this);
		
	}

	public void cook() {
		this.status.cook(this);
		
	}

	public void off() {
		this.status.off(this);
		
	}

}
