package aulas.padroes.state.exercicio2;

public class RoboCook implements StateRobo{

	@Override
	public void walk(Robot robo) {
		System.out.println("Walking...");
		robo.status = new RoboOn();
		
	}

	@Override
	public void cook(Robot robo) {
		System.out.println("Cooking...");
	}

	@Override
	public void off(Robot robo) {
		System.out.println("Cannot switched off while cooking...");
		
	}

}
