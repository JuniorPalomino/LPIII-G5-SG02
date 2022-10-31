/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serial5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/**
 *
 * @author ADMIN
 */
public class Serial5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FileOutputStream fos=null;
        ObjectOutputStream salida = null;
        Alumno a;
        Fecha f;
        
        try{
            
            fos = new FileOutputStream("C:/Users/ADMIN/Documents/NetBeansProjects/------Practica09--------/Actividades/Serial5_Actividad_6/src/alumnos.dat");
            salida = new ObjectOutputStream(fos);
            f=new Fecha(5,9,2011);
            a=new Alumno("123445A","Lucas Gonzales",20,f);
            salida.writeObject(a);
            f=new Fecha(7,9,2011);
            a=new Alumno("53425235A","Pedro Ramirez",23,f);
            salida.writeObject(a);
            f=new Fecha(8,9,2011);
            a=new Alumno("977855A","Maria Gonzales",21,f);
            salida.writeObject(a);
            
            
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
        
            try{
                if(fos!=null)fos.close();
                if(salida!=null)salida.close();
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            
            }
            
        }
    }
    
}
