package actividad01;

import java.sql.*;

public class InterfazPreparedStatement {
	public static void main(String args[]){
		try
		{ 
			Class.forName("com.mysql.cj.jdbc.Driver"); 
    		// sono es el nombre de la base de datos, y root es el usuario y contraseña
    		Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/sonoo","root","root"); 
			
			PreparedStatement stmt=con.prepareStatement("insert into Emp2 values(?,?)"); 
			stmt.setInt(1,101);		//1 specifies the first parameter in the query 
			stmt.setString(2,"Ratan"); 
			
			int i=stmt.executeUpdate(); 
			System.out.println(i+" records inserted"); con.close(); 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}	
}
