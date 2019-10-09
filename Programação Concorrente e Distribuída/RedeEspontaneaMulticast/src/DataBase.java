import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class DataBase extends AbstractTableModel{

	private List<Acesso> acessos;

	public DataBase() {

		this.acessos = new ArrayList<>();
	}

	public List<Acesso> getConexao() {
		return this.acessos;
	}
	public void inserir(Acesso acesso) {
		if(acessos==null) {
			this.acessos = new ArrayList<>();;
		}
		if(!ipRegistrado(acesso)) {
			acessos.add(acesso);
		}
		
		
	}

	private boolean ipRegistrado(Acesso acesso) {

		for (Acesso acessoReg : acessos) {
			if(acessoReg.getIp().equals(acesso.getIp())) {
				acessoReg.setTtl(acesso.getTtl());
				return true;
			}
		}
		
		return false;
			

	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 2 ;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return acessos.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Acesso ac = acessos.get(rowIndex);
		
		switch (columnIndex) {
		case 0:
			return ac.getIp();
		case 1:
			return ac.getTtl(); 
		
                default:
			return null; 
		}
	}
	@Override
	public String getColumnName(int coluna) {
		
		switch (coluna) {
		case 0:
			return "IP"; 
		case 1:
			return "TTL"; 


		default:
			return ""; 
		}
	}


}
