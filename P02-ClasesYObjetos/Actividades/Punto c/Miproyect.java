/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miproyect;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class Miproyect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        perro fido =new perro("chihuahua", "pekines");
        fido.increEdad(2);
        System.out.println(fido.getRaza());
        System.out.println(fido.getColor());
        System.out.println(fido.getEdad());
 
        perro pelusa =new perro("pequines","blanco");
        pelusa.increEdad(6);
        System.out.println(pelusa.getRaza());
        System.out.println(pelusa.getEdad());
        System.out.println(pelusa.getColor());
        
        //Punto B
        diagnostico Mascotas= new diagnostico();
        Mascotas.aptoVacunaB(pelusa);
        System.out.println("Ingrese la temperatura del perro ");
        Mascotas.aptoVacunaB(fido);
        System.out.println("Ingrese la temperatura del perro "); 
        
        //Punto c
        Scanner sc =new Scanner(System.in); 

        System.out.println("Ingrese la temperatura del perro "); 

        fido.setTemp(sc.nextDouble()); 

        System.out.println("Ingrese la edad del perro "); 

        fido.setEdad(sc.nextInt());
        
        System.out.println("Ingrese el peso del perro "); 

        fido.peso=sc.nextDouble(); 
    }
    
}
