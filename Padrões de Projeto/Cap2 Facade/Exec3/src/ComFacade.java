


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComFacade{   
	public static void main(String[] args) throws ParseException   {      
		TravelFacade facade = new TravelFacade();
		facade.findFlightsAndHotels("ORIGEM","DESTINO",new Date(),new Date());
		facade.select();
		facade.payment();
		facade.confirmation();
	}
}