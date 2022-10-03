/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jerarquiafigura_ejer01;

/**
 *
 * @author ADMIN
 */
public class Triangulo extends FiguraBidimensional {
    
    private double Base;
    private double Altura;

    public Triangulo(double Base, double Altura, String Nombre, String Tipo) {
        super(Nombre, Tipo);
        setBase(Base);
        setAltura(Altura);
    }

    

    public double getBase() {
        return Base;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
    
    
    public double ObtenerArea()
    {
    return (getBase()*getAltura())/2;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "Area="  + ObtenerArea() + '}';
    }
    
    
    
}
