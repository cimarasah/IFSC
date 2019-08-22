package aulas.padroes.facade.exercicio4;

public class ComFacade {

	public static void main(String[] args) {
		String tableName="Employee";
		
		//generating MySql HTML report and Oracle PDF report
		DBFacade.generateReport(DBFacade.DBTypes.MYSQL, DBFacade.ReportTypes.HTML, tableName);
		DBFacade.generateReport(DBFacade.DBTypes.ORACLE, DBFacade.ReportTypes.PDF, tableName);
	}

}