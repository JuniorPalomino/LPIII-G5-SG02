/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasecontactoejercicio01;

import java.util.Objects;

/**
 *
 * @author ADMIN
 */
public class Contacto {
    private String Nombre;
    private String Telefono;
    private String Direccion;
    
    public Contacto(String Nombre, String Telefono, String Direccion)
    {
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
    } 

    public String getNombre() {
        return Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.Nombre);
        hash = 37 * hash + Objects.hashCode(this.Telefono);
        hash = 37 * hash + Objects.hashCode(this.Direccion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contacto other = (Contacto) obj;
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        if (!Objects.equals(this.Telefono, other.Telefono)) {
            return false;
        }
        return Objects.equals(this.Direccion, other.Direccion);
    }
   
}
