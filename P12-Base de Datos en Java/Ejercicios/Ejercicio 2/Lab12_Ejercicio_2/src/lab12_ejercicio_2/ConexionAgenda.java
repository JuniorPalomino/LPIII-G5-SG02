/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab12_ejercicio_2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ADMIN
 */
public class ConexionAgenda {
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    public Integer totalregistros;
    private String sSQL = "";
    
    
    
    public DefaultTableModel mostrar(String Buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"Id", "Name", "LastName", "Email", "PhoneNumber"};

        String[] registro = new String[5]; //indices segun la variable "titulos"

        totalregistros = 0;
        
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select * from agenda";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("Id");
                registro[1] = rs.getString("Fname");
                registro[2] = rs.getString("Lname");
                registro[3] = rs.getString("Email");
                registro[4] = rs.getString("Phone");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }
    public String[] MostrarPorApellido(String buscar) {

        String[] registro = new String[5];
        
        sSQL = "select * from agenda where Lname like '%" + buscar + "%'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("Id");
                registro[1] = rs.getString("Fname");
                registro[2] = rs.getString("Lname");
                registro[3] = rs.getString("Email");
                registro[4] = rs.getString("Phone");
            }
            return registro;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public boolean insertar(Agenda dts) {
        
        sSQL = "insert into Agenda(Id,Fname,Lname,Email,Phone)"
                + "values (null,?,?,?,?)";       //se inserta en persona, base de datos
      
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL); // Insercion  persona
            
            
            pst.setString(1, dts.getFName());
            pst.setString(2, dts.getLName());
            pst.setString(3, dts.getEmail());
            pst.setInt(4, dts.getNumberPhone());
        
            int n = pst.executeUpdate();

            if (n != 0) {
                return true;

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    
    }

}
