/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceporpagar.act;

/**
 *
 * @author ADMIN
 */
public class Prestamo implements PorPagar {
    
    private int numeroDeCuotas;
    private double montoDeCuotas;

    public Prestamo(int numeroDeCuotas, double montoDeCuotas) {
        this.numeroDeCuotas = numeroDeCuotas;
        this.montoDeCuotas = montoDeCuotas;
    }

    public int getNumeroDeCuotas() {
        return numeroDeCuotas;
    }

    public void setNumeroDeCuotas(int numeroDeCuotas) {
        this.numeroDeCuotas = numeroDeCuotas;
    }

    public double getMontoDeCuotas() {
        return montoDeCuotas;
    }

    public void setMontoDeCuotas(double montoDeCuotas) {
        this.montoDeCuotas = montoDeCuotas;
    }

    @Override
    public String toString() {
        return """
               
               Prestamo:
                numeroDeCuotas=""" + numeroDeCuotas + "\n montoDeCuotas=" + montoDeCuotas ;
    }
    
    @Override
    public double obtenerMontoPago()
    {
        return numeroDeCuotas*montoDeCuotas;
    }
    
}
