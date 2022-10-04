/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jerarquiafigura_ejer01;

/**
 *
 * @author ADMIN
 */
public class Circulo extends FiguraBidimensional {
    
    private double radio;

    public Circulo(double radio, String Nombre, String Tipo) {
        super(Nombre, Tipo);
        setRadio(radio);
    }

    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    

    @Override
    public double ObtenerArea()
    {
    
        return 3.1416*(getRadio()*getRadio());
    }

    @Override
    public String toString() {
        return "Circulo{" + "Area" + ObtenerArea() + '}';
    }

    
    
    

    
    
    
}
