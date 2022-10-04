/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jerarquiafigura_ejer01;

/**
 *
 * @author ADMIN
 */
public class Esfera extends FiguraTridimensional{
    
    private double radio;

    public Esfera(double radio, String Nombre, String Tipo) {
        super(Nombre, Tipo);
        setRadio(radio);
    }
    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String toStringVolumen() {
        return "Esfera{" + "Volumen=" + ObtenerVolumen() + '}';
    }
    
    
    
    @Override
    public double ObtenerVolumen() {
        return 4/3*3.16*(getRadio()*getRadio()*getRadio());
    }

    @Override
    public double ObtenerArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
