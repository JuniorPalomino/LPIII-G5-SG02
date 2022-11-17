/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_01_practica_10;

/**
 *
 * @author ADMIN
 */
public class Ejercicio_01_Practica_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    
        String[] Cadena={"uno","dos","tres","cuatro","cinco","seis","siete","ocho"};
        
        System.out.printf("Array de cadenas contiene:\n");
        
        imprimirArray(Cadena);
       
    }

    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray) {
            System.out.printf("%s ", elemento);
        }
        
    }
    
    public static String imprimirArray(String[] cadena){
        int contador=0;
        for (String elemento : cadena) {
            contador++;
            System.out.printf("%s ", elemento+"\t");
            if (contador == 4){
                System.out.printf("\n");
            }
        }
       System.out.printf("\n Metodo No generico ");
    return "";
    }

}
