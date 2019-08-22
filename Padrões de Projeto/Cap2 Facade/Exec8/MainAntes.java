
public class MainAntes {
	public static void main(String[] args) {

		Hotel hotel  = new Hotel();
		Florista florista = new Florista();
		Restaurante restaurante = new Restaurante();
		Musico musico = new Musico();

		if(hotel.isAvailable())
			hotel.bookHotel();
		
		if(florista.isAvailable())
			florista.bookFlorist();
		
		if(musico.isAvailable())
			musico.bookMusician();
		
		if(restaurante.isAvailable())
			restaurante.bookRestaurant();

		florista.setFlowersType("Amarílis","Amor-perfeito","Azaléia");
		restaurante.setMenu("Chinesa","Japonesa");
		musico.setPlayList("Musica1", "Musica2", "Musica3", "Musica4");
		
		
	}


}
