/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;
import java.util.*;

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
        boolean flag = true;
        do {
            try {

                System.out.println("Introduzca un numerador entrero: ");
                int numerador = explorador.nextInt();
                System.out.println("Introduzca un denominador entrero: ");
                int denominador = explorador.nextInt();

                int resultado = cociente(numerador, denominador);
                System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, resultado);
                flag = false;
            } catch (InputMismatchException inputMismatchE) {
                System.out.printf("\nExcepcion: %s\n ", inputMismatchE);
                explorador.nextLine();
                System.out.println("Debe introducir enteros unicamente, intente de nuevo");

            } catch (ArithmeticException arithmeticE) {
                System.out.printf("\nExcepcion: %s\n ", arithmeticE);
                explorador.nextLine();
                System.out.println("Cero e un demoninador invalido. intente de nuevo... \n");

            }
        } while (flag);
    }

}
