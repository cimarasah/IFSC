import java.util.Date;

public class TravelFacade {

	FlightBooker flightBooker;
	HotelBooker hotelBooker;
	public void findFlightsAndHotels(String origin, String destination, Date from, Date to) {
		// TODO Auto-generated method stub
		flightBooker = new FlightBooker();
		hotelBooker = new HotelBooker();
		flightBooker.getFlightsFor(origin, destination, from, to);
		hotelBooker.getHotelNamesFor(destination, from, to);
	}
	public void select() {
		flightBooker.selectFlight();
		hotelBooker.selectHotel();
		
	}
	public void payment() {
		flightBooker.payment();
		hotelBooker.payment();
		
	}

	public void confirmation() {
		flightBooker.confirmation();
		hotelBooker.confirmation();
		
	}

	

}
