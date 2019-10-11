package aulas.padroes.state.exercicio2;

public class RoboOff implements StateRobo{

	@Override
	public void walk(Robot robo) {
		System.out.println("Walking...");
		robo.status = new RoboOn();
	}

	@Override
	public void cook(Robot robo) {
		System.out.println("Cannot cook at Off state.");
		
	}

	@Override
	public void off(Robot robo) {

		System.out.println("Robot is switched off");
		
	}

}
