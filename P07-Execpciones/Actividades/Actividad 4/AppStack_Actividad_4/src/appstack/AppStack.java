/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appstack;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class AppStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            metodo1();
        } catch (Exception excepcion) {

            System.out.println("%s\n\n" + excepcion.getMessage());

            StackTraceElement[] itemRastreo = excepcion.getStackTrace();      //StackTraceElement es una clase(represanta un unico amrco de pila)

            System.out.println("\nRastreo de la pila de getStackTrace");    
            System.out.println("Clase\t\t\tArchivo\t\tLinea\tMetodo");

            for (StackTraceElement item : itemRastreo) {

                System.out.printf("%s\t", item.getClassName());
                System.out.printf("%s\t", item.getFileName());
                System.out.printf("%s\t", item.getLineNumber());
                System.out.printf("%s\n", item.getMethodName());
            }
        }
    }
    
    public static void metodo1() throws Exception{
        
        metodo2();
    }
    public static void metodo2() throws Exception{
        
        metodo3();
    }
    
    public static void metodo3() throws Exception{
        
        throw new Exception("La excepcion se lanzo");
    }

}
