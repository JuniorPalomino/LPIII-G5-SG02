package actividad01;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class InterfazRowSet {
	public static void main(String[] args) throws Exception { 
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		//Crear y Ejecutar RowSet 
		JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
		
		rowSet.setUrl("jdbc:mysql://localhost:3306/sonoo"); 
		rowSet.setUsername("root"); 
		rowSet.setPassword("root"); 
		rowSet.setCommand("select * from emp400"); 
		rowSet.execute();
		
		while (rowSet.next()) { 
			// Generating cursor Moved event 
			System.out.println("Id: " + rowSet.getString(1)); 
			System.out.println("Nombre: " + rowSet.getString(2)); 
			System.out.println("Salario: " + rowSet.getString(3)); 
		} 
		
	}
}
