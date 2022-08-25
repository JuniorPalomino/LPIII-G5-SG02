/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerproyecto;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class PrimerProyecto {

    /**
     * @param args the command line arguments
     */
    //Punto A
    public static void main(String[] args) {
        Perro fido =new Perro("chihuahua", "pekines");
        fido.increEdad(2);
        
        System.out.println(fido.getRaza());
        System.out.println(fido.getColor());
        System.out.println(fido.getEdad());
 
        Perro pelusa =new Perro("pequines","blanco");
        pelusa.increEdad(6);
        System.out.println(pelusa.getRaza());
        System.out.println(pelusa.getColor());
        System.out.println(pelusa.getEdad());
        
        System.out.println(fido.toString());
        System.out.println(pelusa.toString());
        //Punto B
        Diagnostico Mascotas= new Diagnostico();
        Mascotas.aptoVacunaB(pelusa);
        System.out.println("Ingrese la temperatura del perro ");
        Mascotas.aptoVacunaB(fido);
        
        //Punto c
        Scanner sc =new Scanner(System.in); 

        System.out.println("Ingrese la temperatura del perro "); 

        fido.setTemp(sc.nextDouble()); 

        System.out.println("Ingrese la edad del perro "); 

        fido.setEdad(sc.nextInt());
        
       

        System.out.println("Ingrese el peso del perro "); 

        fido.peso=sc.nextDouble(); 

        Diagnostico d=new Diagnostico(); 

        d.aptoVacunaB(fido); 

        
        
         
     
        
        
    }
    
}

//NuevaSubida

