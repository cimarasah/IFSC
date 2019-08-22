package aulas.padroes.facade.exercicio6;

public class ComFacade {

	public static void main(String[] args){
		
		RobotFacade robot1 = new RobotFacade();
		robot1.configRobot("Mobile Robot Chassis","Green", "Iron");
		robot1.printRobot();
		
		System.out.println();
		
		RobotFacade robot2 = new RobotFacade();
		robot2.configRobot("Sumo Robot Chassis","Blue", "Steel");
		robot2.printRobot();

	}

}
