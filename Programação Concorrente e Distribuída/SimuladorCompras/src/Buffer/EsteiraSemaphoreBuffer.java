package Buffer;

import java.text.SimpleDateFormat;
import java.util.Date;

import Model.Produto;

public class EsteiraSemaphoreBuffer implements Buffer{

	private Produto buffer = null;
	private SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
	@Override
	public void set(Produto prod) {
		
		System.out.println("-Comprador: ["+formato.format(new Date())+"]  Colocando item "+ prod.nome +" no esteira " );
		
		buffer = prod;
	}

	@Override
	public Produto get() {
		
		return buffer;
	}

}
