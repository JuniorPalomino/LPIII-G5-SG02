/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jerarquiafigura_ejer01;

/**
 *
 * @author ADMIN
 */
public class Cubo extends FiguraTridimensional{
    
    private double lado;

    public Cubo(double lado, String Nombre, String Tipo) {
        super(Nombre, Tipo);
        setLado(lado);
    }

    

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public String toStringVolumen() {
        return "Cubo{" + "Volumen=" + ObtenerVolumen() + '}';
    }
    
    @Override
    public double ObtenerVolumen() {
        return getLado()*getLado()*getLado();
    }

    @Override
    public double ObtenerArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
