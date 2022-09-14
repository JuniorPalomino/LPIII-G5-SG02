/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automovil.mortor;

/**
 *
 * @author Alumno
 */
public class AutomovilMortor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automovil A1= new Automovil("A7N5",5,"Toyota","Hylux");
        
        Automovil A2= new Automovil("NJ62",3,"Chevrolet","Camaro");
        
        Motor N1500= new Motor(50,1000);
        Motor N3000= new Motor(400,3000);
        
        A1.setMotor(N1500);
        A2.setMotor(N3000);
        
        System.out.println(A1.toString());
        System.out.println(A2.toString());
        //
    }
    
}
