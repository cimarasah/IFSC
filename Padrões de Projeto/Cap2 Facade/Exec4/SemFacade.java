package aulas.padroes.facade.exercicio4;

import java.sql.Connection;

public class SemFacade {

	public static void main(String[] args) {
		String tableName="Employee";
		
		MySql mySql = new MySql();
		Connection con = mySql.getMySqlDBConnection();
		mySql.generateMySqlHTMLReport(tableName, con);
		
		Oracle oracle = new Oracle();
		Connection con1 = oracle.getOracleDBConnection();
		oracle.generateOraclePDFReport(tableName, con1);
	
	}

}