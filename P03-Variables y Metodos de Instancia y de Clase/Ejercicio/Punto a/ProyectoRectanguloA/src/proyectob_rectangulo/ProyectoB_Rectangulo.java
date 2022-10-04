/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectob_rectangulo;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class ProyectoB_Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("Introducir Componente del X : ");
        x = sc.nextInt();
        System.out.println("Introducir Componente del Y : ");
        y = sc.nextInt();
        Rectangulo rect = new Rectangulo(x, y);
        System.out.println("Color: " + rect.toString());
        System.out.println("Área: " + Manejador.area(rect));
        System.out.println("Perimetro: " + Manejador.perimetro(rect));
        Manejador.moverX(-5, rect);
        System.out.println("Nueva Area : " + Manejador.area(rect));
        Manejador.moverY(5, rect);
        Manejador.moverX(5, rect);
        System.out.println("Perimetro: " + Manejador.perimetro(rect));
        System.out.println("Nueva Area 2 : " + Manejador.area(rect));
        
        Rectangulo r1 = new Rectangulo(x, y);
        System.out.println(r1.toString());
        Rectangulo r2 = new Rectangulo(x, y);
        System.out.println(r2.toString());
        Rectangulo r3 = new Rectangulo(x, y);
        System.out.println(r3.toString());
        Rectangulo r4 = new Rectangulo(x, y);
        System.out.println(r4.toString());
        Rectangulo r5 = new Rectangulo(x, y);
        System.out.println(r5.toString());
        Rectangulo r6 = new Rectangulo(x, y);
        System.out.println(r6.toString());
        
        Rectangulo utlimoRect = new Rectangulo(new Coordenada(2,3), new Coordenada(7,1));
        System.out.println(utlimoRect.toString());
        Manejador.moverY(10, rect);
        sc.close();
    }
    }
    
