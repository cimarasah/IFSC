

import java.util.Date;

public class SemFacade {
	public static void main(String[] args) {
		FlightBooker flightBooker = new FlightBooker();
		flightBooker.getFlightsFor("origin", "destination", new Date(), new Date());
		flightBooker.selectFlight();
		flightBooker.payment();
		flightBooker.confirmation();
		
		HotelBooker hotelBooker = new HotelBooker();
		hotelBooker.getHotelNamesFor("destination", new Date(), new Date());
		hotelBooker.selectHotel();
		hotelBooker.payment();
		hotelBooker.confirmation();
		
	}

}
