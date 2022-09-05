/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectob_rectangulo;

/**
 *
 * @author ADMIN
 */
public class Coordenada {
    private int x;
    private int y;

    // Constructor
    public Coordenada() {
        this.x = 0;
        this.y = 0;
    }

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordenada(Coordenada C) {
        this.x = C.x;
        this.y = C.y;
    }

    
    public int getX() {
        return x;
    }

    
    public void setx(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static double distancia(Coordenada T) {
        double resultado;
        resultado = Math.pow(T.x - 0, 2) + Math.pow(T.y - 0, 2);
        resultado = Math.sqrt(resultado);
        return resultado;
    }

    public static double distancia(Coordenada T1, Coordenada T2) {
        double resultado;
        resultado = Math.pow(T2.x - T1.x, 2) + Math.pow(T2.y - T1.y, 2);
        resultado = Math.sqrt(resultado);
        return resultado;
    }

    public String toString() {
        return ">>>Coordenadas, X:" + x + ", Y: " + y;
    }
    
}
