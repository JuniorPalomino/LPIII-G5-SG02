/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectob_rectangulo;

/**
 *
 * @author ADMIN
 */
public class Manejador {
    
    public static double area(Rectangulo n) {
        double Area, Altura, Base;
        Coordenada nuevoX, nuevoY;
        nuevoX = n.getEsquina1();
        nuevoY = n.getEsquina2();
        Coordenada inferior = new Coordenada(nuevoX.getX(), nuevoY.getY());
        Altura = Coordenada.distancia(inferior, n.getEsquina1());
        Base = Coordenada.distancia(inferior, n.getEsquina2());
        Area = Altura * Base;
        return Area;
    }

    public static double perimetro(Rectangulo n) {
        double Perimetro, Altura, Base;
        Coordenada nuevoX, nuevoY;
        nuevoX = n.getEsquina1();
        nuevoY = n.getEsquina2();
        Coordenada inferior = new Coordenada(nuevoX.getX(), nuevoY.getY());
        Altura = Coordenada.distancia(inferior, n.getEsquina1());
        Base = Coordenada.distancia(inferior, n.getEsquina2());
        Perimetro = (Altura * 2) + (Base * 2);
        return Perimetro;
    }

    public static void moverX(int numb, Rectangulo n) {
        Coordenada nuevoX, nuevoY;
        nuevoX = n.getEsquina1();
        nuevoY = n.getEsquina2();
        nuevoX.setx(numb + nuevoX.getX());
        nuevoY.setx(numb + nuevoY.getX());
        System.out.println(n.getEsquina1());
        System.out.println(n.getEsquina2());
    }

    public static void moverY(int numb, Rectangulo n) {
        Coordenada nuevoX, nuevoY;
        nuevoX = n.getEsquina1();
        nuevoY = n.getEsquina2();
        nuevoX.setY(numb + nuevoX.getY());
        nuevoY.setY(numb + nuevoY.getY());
        System.out.println(n.getEsquina1());
        System.out.println(n.getEsquina2());
    }
    
}
