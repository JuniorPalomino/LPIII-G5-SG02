package actividad01;

import java.sql.*;


public class Operaciones {
	public static void main(String[] args) {
    	//Coneccion con la base de datos
		try{ 
    		Class.forName("com.mysql.cj.jdbc.Driver"); 
    		// sono es el nombre de la base de datos, y root es el usuario y contraseña
    		Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/sonoo","root","root"); 

    		// Insertar
			
    		String sql = "INSERT INTO emp (id, name, age) VALUES (?, ?, ?)";
    		PreparedStatement statement = con.prepareStatement(sql);
    		statement.setString(1, "5");
    		statement.setString(2, "Marcos");
    		statement.setString(3, "18");
    		 
    		int rowsInserted = statement.executeUpdate();
    		if (rowsInserted > 0) {
    		    System.out.println("¡Se inserto un nuevo registro con exito!");
    		}
/*
    		// Actualizar
    		
    		String sql2 = "UPDATE emp SET name=?, age=? WHERE id=?";
    		 
    		PreparedStatement statement2 = con.prepareStatement(sql2);
    		statement2.setString(1, "diana");
    		statement2.setString(2, "35");
			statement2.setString(3, "5");
    		 
    		int rowsUpdated = statement2.executeUpdate();
    		if (rowsUpdated > 0) { 
    		    System.out.println("¡Un registro existente ha sido actualizado con exito!");
    		}

			// Recuperar Select
    		String sql3 = "SELECT * FROM emp";
    		 
    		Statement statement3 = con.createStatement();
    		ResultSet result = statement3.executeQuery(sql3);
    		 
    		while (result.next()){
    		    String id = result.getString(1);
    		    String name = result.getString("name");
    		    String age = result.getString(3);

    		 
    		    String output = "Registro: %s - %s - %s";
    		    System.out.println(String.format(output, id, name, age));
    		}

    		// Borrar
    		String sql4 = "DELETE FROM emp WHERE name=?";
    		 	
    		PreparedStatement statement4 = con.prepareStatement(sql4);
    		statement4.setString(1, "luis");
    		 
    		int rowsDeleted = statement4.executeUpdate();
    		if (rowsDeleted > 0) {
    		    System.out.println("¡El registro ha sido eliminado con exito!");
    		}
*/
    		con.close();

    	}catch(Exception e){ 
    		System.out.println(e);	
    	}
    }   
}
