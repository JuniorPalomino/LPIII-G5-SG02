/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectob_rectangulo;

/**
 *
 * @author ADMIN
 */
public class Rectangulo {
    
    private Coordenada esquina1;
    private Coordenada esquina2;
    private String color;
    static int Contador = 0;

    // Constructor
    public Rectangulo(Coordenada esquina1, Coordenada esquina2) {
        this.esquina1 = esquina1;
        this.esquina2 = esquina2;
        Contador++;
        this.color = tipocolor();
    }

    public Rectangulo(int X, int Y) {
        this.esquina1 = new Coordenada(0, Y);
        this.esquina2 = new Coordenada(X, 0);
        Contador++;
        this.color = tipocolor();
    }

    public String tipocolor() {
        String col = "";
        switch (Contador) {
            case 1:
                col = "Verde";
                break;
            case 2:
                col = "Amarillo";
                break;
            case 3:
                col = "Rojo";
                Contador = 0;
                break;
        }
        return col;
    }
  
    public Coordenada getEsquina1() {
        return esquina1;
    }


    public void setEsquina1(Coordenada C) {
        this.esquina1 = C;
    }
    public Coordenada getEsquina2() {
        return esquina2;
    }
    public void setEsquina2(Coordenada C) {
        this.esquina2 = C;
    }
    public String toString() {
        return ">>>Coordenada 1: " + esquina1 + ", Coordenada 2: " + esquina2+ ", Color : " + color;
    }
    
}
