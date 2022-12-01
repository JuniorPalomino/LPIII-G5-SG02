package actividad01;


import java.sql.*;

public class Actividad01 {

	public static void main(String[] args) {
    	//Coneccion con la base de datos
		try{ 
    		Class.forName("com.mysql.cj.jdbc.Driver"); 
    		// sono es el nombre de la base de datos, y root es el usuario y contraseña
    		Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/sonoo","root","root"); 
    		Statement stmt=con.createStatement(); 
    		ResultSet rs=stmt.executeQuery("select * from emp"); 
    		while(rs.next()) 
    			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
    		
    		con.close();
    	}catch(Exception e){ 
    		System.out.println(e);
    	}
    }   
}
