/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectorectangulo;

/**
 *
 * @author ADMIN
 */
public class Coordenada {
    
    private int x;
    private int y;
    
    public Coordenada(){
    }
    public Coordenada(int x, int y){
        
        this.x = x;
        this.y = y;
    }
    public Coordenada(Coordenada c){
        
        //this.Coordenada = Coordenada;
    }

    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    @Override
    
    public String toString() {
        return "CuentaBanco{" + "titular=" + x + ", cantidad=" + y + '}';
    }
    public double Distancia(Coordenada c){
         
         return 0;
     }
    
    public static double Distancia(Coordenada c1, Coordenada c2){
         
         return 0;
     }
}
