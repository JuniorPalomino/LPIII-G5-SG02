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
        //////////----PUNTO A----////////
        perro fido = new perro("chihuahua", "marron");
        fido.increEdad(2);
        System.out.println("--------FIDO--------");
        System.out.println(fido.getRaza());
        System.out.println(fido.getColor());
        System.out.println(fido.getEdad());
        System.out.println("--------DATOS COMPLETOS --------");
        System.out.println(fido.toString());

        perro pelusa = new perro("pequines", "blanco");
        System.out.println("--------PELUSA--------");
        pelusa.increEdad(5);
        System.out.println(pelusa.getRaza());
        System.out.println(pelusa.getColor());
        System.out.println(pelusa.getEdad());
        System.out.println("--------DATOS COMPLETOS --------");
        System.out.println(pelusa.toString());
        
        
        //////////----PUNTO B----////////
        
        diagnostico Mascotas= new diagnostico();
        System.out.println("--------DIAGNOSTICO DE FIDO --------");
        Mascotas.aptoVacunaA(fido);
        System.out.println("--------DIAGNOSTICO DE PELUSA --------");
        Mascotas.aptoVacunaA(pelusa);
        
        /*
        //////////----PUNTO C----////////
        
        System.out.println("--------INGRESO DE DATOS PARA EL NUEVO DIAGNOSTICO DE FIDO --------");
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nuevo peso del perro: ");

        fido.peso = sc.nextDouble();

        System.out.println("Ingrese la nueva edad del perro: ");

        fido.setEdad(sc.nextInt());

        System.out.println("Ingrese la nueva temperatura para el perro: ");

        fido.setTemp(sc.nextDouble());

        Mascotas.aptoVacunaB(fido.peso, fido.getEdad(), fido.getTemp());

        System.out.println("--------INGRESO DE DATOS PARA EL NUEVO DIAGNOSTICO DE PELUSA --------");

        System.out.println("Ingrese el nuevo peso del perro: ");

        pelusa.peso = sc.nextDouble();

        System.out.println("Ingrese la nueva edad del perro: ");

        pelusa.setEdad(sc.nextInt());

        System.out.println("Ingrese la nueva temperatura para el perro: ");

        pelusa.setTemp(sc.nextDouble());

        Mascotas.aptoVacunaB(pelusa.peso, pelusa.getEdad(), pelusa.getTemp());
        */

    }

}
