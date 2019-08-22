
public class MainAntes {
	public static void main(String[] args) {
		
		FuelInjector fuelInjector = new FuelInjector();
		fuelInjector.on();
		
		AirFlowController airFlowController = new AirFlowController();
		airFlowController.takeAir();
		fuelInjector.on();
		fuelInjector.inject();
		
		Starter starter = new Starter();
		starter.start();
		
		CoolingController coolingController = new CoolingController();
		coolingController.setTemperatureUpperLimit(90);
		coolingController.run();
		
		CatalyticConverter catalyticConverter = new CatalyticConverter();
		catalyticConverter.on();

		System.out.println("========");

		fuelInjector.off();
		catalyticConverter.off();
		coolingController.cool(50);
		coolingController.stop();
		airFlowController.off();


	}

}

