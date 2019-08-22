package aulas.padroes.facade.exercicio6;

public class SemFacade {
	
	public static void main(String[] args){
		
		RobotColor rc1 = new RobotColor();
		RobotMetal rm1 = new RobotMetal();
		RobotBody rb1 = new RobotBody();
		
		System.out.println("Configuring the Robot");
		rc1.setColor("Green");
		rm1.setMetal("Iron");
		rb1.setBody("Mobile Robot Chassis");
		
		System.out.println("The Robot Information");
		System.out.println("Color: " + rc1.getColor());
		System.out.println("Metal: " + rm1.getMetal());
		System.out.println("Body: " + rb1.getBody());
		
		System.out.println();		
		
		RobotColor rc2 = new RobotColor();
		RobotMetal rm2 = new RobotMetal();
		RobotBody rb2 = new RobotBody();
		
		System.out.println("Configuring the Robot");
		rc2.setColor("Blue");
		rm2.setMetal("Steel");
		rb2.setBody("Sumo Robot Chassis");
		
		System.out.println("The Robot Information");
		System.out.println("Color: " + rc2.getColor());
		System.out.println("Metal: " + rm2.getMetal());
		System.out.println("Body: " + rb2.getBody());

	}
	
}
