package aulas.padroes.state.exercicio2;

public class RoboOn implements StateRobo{

	@Override
	public void walk(Robot robo) {
		System.out.println("Walking...");
		
	}

	@Override
	public void cook(Robot robo) {		
		System.out.println("Cooking...");
		robo.status = new RoboCook();
		
	}

	@Override
	public void off(Robot robo) {

		System.out.println("Robot is switched off");
		robo.status = new RoboOff();
		
	}

}
