/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jerarquiafigura_ejer01;

/**
 *
 * @author ADMIN
 */
public class Cuadrado extends FiguraBidimensional {
    
    private double Lado;

    public Cuadrado(double Lado, String Nombre, String Tipo) {
        super(Nombre, Tipo);
        setLado(Lado);
    }

    

    
    public double getLado() {
        return Lado;
    }

    public void setLado(double Lado) {
        this.Lado = Lado;
    }
    
    
    @Override
    public double ObtenerArea()
    {
    return getLado()*getLado();
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "Area" + ObtenerArea() + '}';
    }
    
    
}
