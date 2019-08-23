import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras{
	List<Item> listaItens = new ArrayList<Item>();
	
	public void addItem(Item item) {
		listaItens.add(item);
	}
	
}