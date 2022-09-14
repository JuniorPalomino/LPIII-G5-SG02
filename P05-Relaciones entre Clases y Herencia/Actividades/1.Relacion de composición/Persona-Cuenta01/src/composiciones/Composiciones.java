/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composiciones;

/**
 *
 * @author Alumno
 */
public class Composiciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        persona a1= new persona( 222 , "Anthony" , "Rivera" );
        persona a2= new persona( 111 , "Junior" , "Palomino" );
        
        cuenta bbva = new cuenta ( 1000 , 100 );
        cuenta scotiabank = new cuenta( 2000 , 200 );
        
        a1.setCuenta(bbva);
        
        a2.setCuenta(scotiabank);
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        //
 
        
    }
    
}
