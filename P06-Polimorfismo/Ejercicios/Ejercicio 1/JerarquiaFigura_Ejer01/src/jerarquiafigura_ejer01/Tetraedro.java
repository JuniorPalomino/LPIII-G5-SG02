/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jerarquiafigura_ejer01;

/**
 *
 * @author ADMIN
 */
public class Tetraedro extends FiguraTridimensional{

    private double areaBase;
    private double altura;

    public Tetraedro(double areaBase, double altura, String Nombre, String Tipo) {
        super(Nombre, Tipo);
        setAreaBase(areaBase);
        setAltura(altura);
    }
    
    

    public double getAreaBase() {
        return areaBase;
    }

    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String toStringVolumen() {
        return "Tetraedro{" + "Volumen=" + ObtenerVolumen() + '}';
    }
    
    
    
    @Override
    public double ObtenerVolumen() {
        return getAreaBase()*getAltura()/3;
    }

    @Override
    public double ObtenerArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
