package aulas.padroes.facade.exercicio4;


import java.sql.Connection;


public class MySql {

	public Connection getMySqlDBConnection(){
		return null;
	}

	public void generateMySqlPDFReport(String tableName, Connection con){
		System.out.println("generate MySql PDF Report from table " + tableName);
	}

	public void generateMySqlHTMLReport(String tableName, Connection con){
		System.out.println("generate MySql HTML Report from table " + tableName);
	}
}