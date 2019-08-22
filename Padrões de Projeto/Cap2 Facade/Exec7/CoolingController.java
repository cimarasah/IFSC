
public class CoolingController {
	
    private Radiator radiator = new Radiator();
    private TemperatureSensor temperatureSensor = new TemperatureSensor();

    public void setTemperatureUpperLimit(Integer temperatureUpperLimit) {
    	System.out.println("Setting temperature upper limit to " +temperatureUpperLimit);
    }

    public void run() {
    	System.out.println("Cooling Controller ready!");
        radiator.setSpeed(10);
    }

    public void cool(Integer maxAllowedTemp) {
    	System.out.println("Scheduled cooling with maximum allowed temperature " + maxAllowedTemp);
        temperatureSensor.getTemperature();
        radiator.on();
    }

    public void stop() {
    	System.out.println("Stopping Cooling Controller..");
        radiator.off();
    }
    
}
