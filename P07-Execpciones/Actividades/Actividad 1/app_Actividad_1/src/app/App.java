/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class App {

    public static int cociente(int numerador, int denominador) {
        return numerador / denominador;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner explorador = new Scanner(System.in);

        System.out.println("Introduzca un numerador entero: ");
        int numerador = explorador.nextInt();
        System.out.println("Introduzca un denominador entero: ");
        int denominador = explorador.nextInt();
        
        int resultado = cociente(numerador, denominador);
        System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, resultado);
    }

}
