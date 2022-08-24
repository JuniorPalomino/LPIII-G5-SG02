/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerproyecto;

/**
 *
 * @author ADMIN
 */
public class PrimerProyecto {

    /**
     * @param args the command line arguments
     */
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
       
    }
    
}
