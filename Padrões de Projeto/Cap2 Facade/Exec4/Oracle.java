package aulas.padroes.facade.exercicio4;

import java.sql.Connection;

public class Oracle {

	public Connection getOracleDBConnection(){
		return null;
	}

	public void generateOraclePDFReport(String tableName, Connection con){
		System.out.println("generate Oracle PDF Report from table " + tableName);
	}

	public void generateOracleHTMLReport(String tableName, Connection con){
		System.out.println("generate Oracle HTML Report from table " + tableName);
	}

}