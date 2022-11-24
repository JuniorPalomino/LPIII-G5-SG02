/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.pkg2;

/**
 *
 * @author Alumno
 */
public class Actividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //App
        
        Persona Juan =new Persona("Juan Quintanilla","Calle K 2","987654321");
        
        OrderedPair PrimerPar= new OrderedPair(2,3);
        OrderedPair SegundoPar= new OrderedPair(2,"Fresa");
        OrderedPair TercerPar= new OrderedPair("Arequipa",Juan);
        
        System.out.println(PrimerPar.toString());
        System.out.println(SegundoPar.toString());
        System.out.println(TercerPar.toString());
    }
    
}
