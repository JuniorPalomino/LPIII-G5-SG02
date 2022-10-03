/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceporpagar.act;

/**
 *
 * @author ADMIN
 */
public class Factura implements PorPagar {

    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String pieza,String descripcion,int cuenta,double precio){
    
    numeroPieza = pieza;
    descripcionPieza = descripcion;
    setCantidad(cuenta);
    setPrecioPorArticulo(precio);
    
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        this.precioPorArticulo = precioPorArticulo;
    }
    
    
    
    @Override
    public double obtenerMontoPago()
    {
        return getCantidad()*getPrecioPorArticulo();
    }

    @Override
    public String toString() {
        return "\n Factura:" + "\n numeroPieza=" + numeroPieza + "\n descripcionPieza=" + descripcionPieza + "\n cantidad=" + cantidad + "\n precioPorArticulo=" + precioPorArticulo ;
    }
    
    

}
