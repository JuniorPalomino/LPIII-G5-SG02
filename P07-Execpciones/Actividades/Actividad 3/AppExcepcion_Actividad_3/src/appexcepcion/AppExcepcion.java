/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appexcepcion;

/**
 *
 * @author ADMIN
 */
public class AppExcepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            metodo1();                                                            //Llamamos al "metodo1()"                               
        } catch (Exception excepcion) {                                           //Capturamos la excepcion 
            System.out.println("La excepcion se manejo en el main");
        }
        metodo2();                                                               //Llamamos al "metodo2()"
    }

    public static void metodo1() throws Exception {                              //Esta funcion Propaga una excepcion de la Clase "Exception"
        try {
            System.out.println("Metodo1 ");
            throw new Exception();                                               // Lanza una excepcion 
        } catch (Exception excepcion) {                                          // Captura la excepcion 
            System.out.println("La excepcion se manejo en el metodo 1");
            throw excepcion;                                                    //Lanzamos la excepcion de la funcion principal
        } finally {                                                             //Liberamos recursos para continuar en el programa
            System.out.println("Se ejecuto finnally en metodo 1");
        }

    }

    public static void metodo2() {                                              //Funcion metodo2
        try {
            System.out.println("Metodo metodo 2");
            
        } catch (Exception excepcion) {                                         //Captura la excepcion 
            System.out.println(excepcion);                                      

        } finally {                                                             //Liberamos recursos para continuar con el programa
            System.out.println("Se ejecuto finally en el metodo 2");
        }
        System.out.println("Fin del metodo 2");
    }
}


