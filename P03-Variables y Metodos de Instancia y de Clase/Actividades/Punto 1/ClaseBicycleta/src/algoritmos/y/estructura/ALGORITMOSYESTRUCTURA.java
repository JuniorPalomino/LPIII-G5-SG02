/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmos.y.estructura;

/**
 *
 * @author Alumno
 */
public class ALGORITMOSYESTRUCTURA {

    /**
     * @param args the command line arguments
     */
     public static void  main(String [] args){
        
         contador c1,c2;    //Creacion de dos objetos
        
        System.out.println(contador.acumulador());  //Llama al metodo de clase 
        c1 = new contador (3);          //Asigna valores para este objeto 
        c2 = new contador (10);         //Asigna valores para este objeto 
        c1.inc();                       //Llama al metodo de instancia el objeto c1
        c1.inc();                       //Llama al metodo de instancia el objeto c1
        c2.inc();                       //Llama al metodo de instancia el objeto c2
        System.out.println(c1.getvalor());//Imprime el valor con el metodo get del objeto c1
        System.out.println(c2.getvalor());//Imprime el valor con el metodo get del objeto c2
        System.out.println(contador.acumulador); //Imprime el valor del metodo acumulador
        
    }  
}
