/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jerarquiafigura_ejer01;

/**
 *
 * @author ADMIN
 */
public abstract class FiguraBidimensional extends Figura {
    
   private String Nombre;

    public FiguraBidimensional(String Nombre, String Tipo) {
        super(Tipo);
        this.Nombre = Nombre;
    }

   

    public String getNombre() {
       
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    @Override
    public String toString() {
        return "FiguraBidimensional{" + "nombre=" + Nombre + '}';
    }
    
  
    
}
