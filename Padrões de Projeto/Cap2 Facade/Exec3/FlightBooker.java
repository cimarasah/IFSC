package aulas.padroes.facade.exercicio3;

import java.util.Date;

public class FlightBooker{  
	public void getFlightsFor(String origin, String destination, Date from, Date to)   {    
		System.out.println("Flights found..");

	}

	public void selectFlight() {		
		System.out.println("Selecting flight ..");		
	}
	
	public void payment() {
		System.out.println("Paying Flight...");
		
	}

	public void confirmation() {
		System.out.println("Your flight is confirmed");
		
	}
	
}