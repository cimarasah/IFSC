
public class Musico {
	
	public boolean isAvailable() {
		return true;
	}
		
	public void bookMusician(){
		System.out.println("Músico Reservado");
	}

	public void setPlayList(String...musics) {
		System.out.println("Músicas selecionadas");
		for (int i = 0; i < musics.length; i++) {
			System.out.println(musics[i]);
		}
	}
}
