/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11_actividad.pkg1;

/**
 *
 * @author Alumno
 */
public class Persona {
    
    private String nombres;
    private String direccion;
    private String telefono;

    public Persona(String nombres, String direccion, String telefono) {
        this.nombres = nombres;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
     public Persona(String nombres) {
        this.nombres = nombres;
        
    }
    public Persona() {
        
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombres=" + nombres + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    
    
}
