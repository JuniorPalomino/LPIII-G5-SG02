/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appmiexcepcion;

/**
 *
 * @author ADMIN
 */
public class AppMiExcepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Actividad 5: 
        validaPropia(5);
        //Actividad 6:
        validaPropia(11);
    }
    
    public static void validaPropia(int n ){
        
        try {
            minimo(n);                                              //llama a la funcion "minimo"
            System.out.println(n+" Es mayor a 10");                 //Muestra el print, si es que no captura un error
            
        } catch (MiExcepcion e) {                                   //Captura el error
            System.out.println("No me sirve ese número");           
        }
     
    }
    
    public static void minimo(int numero) throws MiExcepcion{       //Lanza a la clase MiExcepcion
        
        if(numero <= 10){                                         //Condicional si "numero" es menor igual a 10
            
            throw new MiExcepcion("Necesito un numero mayor a 10"); //Le asigna el mensaje al contrusto de la clase "MiExcepcion" 
        }
    
    }
    
    
}
