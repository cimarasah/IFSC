

import javax.swing.JPanel;
import javax.swing.JTable;

public class MinhaTela {

	public static void main(String[] args) {


		DataBase db = new DataBase();
		db.getConexao();

		JPanel painel = new JPanel();
		painel.setLayout(null);     
		String [] colunas = {"IP", "TTL"};
		JTable table = new JTable(db);
		



	}

}
