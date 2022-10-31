/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        String cadena;
        
        try(PrintWriter salida=new PrintWriter("src/archivo.txt")){//try with resources
            System.out.println("Introduce texto. Para acabar introduce la candea FIN.");
            cadena=sc.nextLine();
            while(!cadena.equalsIgnoreCase("FIN")){
                salida.println(cadena);
                cadena=sc.nextLine();
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    
}
